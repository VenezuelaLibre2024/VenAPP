package a3;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    private Activity f59a;

    /* renamed from: b, reason: collision with root package name */
    private y2.a f60b;

    /* renamed from: c, reason: collision with root package name */
    private c f61c;

    private static List<String> b(Context context) {
        boolean b10 = d.b(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean b11 = d.b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!b10 && !b11) {
            throw new y2.c();
        }
        ArrayList arrayList = new ArrayList();
        if (b10) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (b11) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    private boolean c(String[] strArr, int[] iArr) {
        int e10 = e(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return e10 >= 0 && iArr[e10] == 0;
    }

    private static <T> int e(T[] tArr, T t10) {
        return Arrays.asList(tArr).indexOf(t10);
    }

    public a a(Context context) {
        char c10;
        Iterator<String> it = b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                c10 = 65535;
                break;
            }
            if (androidx.core.content.a.checkSelfPermission(context, it.next()) == 0) {
                c10 = 0;
                break;
            }
        }
        if (c10 == 65535) {
            return a.denied;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return a.always;
        }
        if (d.b(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && androidx.core.content.a.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return a.always;
        }
        return a.whileInUse;
    }

    public boolean d(Context context) {
        a a10 = a(context);
        return a10 == a.whileInUse || a10 == a.always;
    }

    public void f(Activity activity, c cVar, y2.a aVar) {
        if (activity == null) {
            aVar.a(y2.b.activityMissing);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        List<String> b10 = b(activity);
        if (i10 >= 29 && d.b(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(activity) == a.whileInUse) {
            b10.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f60b = aVar;
        this.f61c = cVar;
        this.f59a = activity;
        androidx.core.app.b.g(activity, (String[]) b10.toArray(new String[0]), 109);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 109) {
            return false;
        }
        Activity activity = this.f59a;
        if (activity == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            y2.a aVar = this.f60b;
            if (aVar != null) {
                aVar.a(y2.b.activityMissing);
            }
            return false;
        }
        try {
            List<String> b10 = b(activity);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            a aVar2 = a.denied;
            char c10 = 65535;
            boolean z10 = false;
            boolean z11 = false;
            for (String str : b10) {
                int e10 = e(strArr, str);
                if (e10 >= 0) {
                    z10 = true;
                }
                if (iArr[e10] == 0) {
                    c10 = 0;
                }
                if (androidx.core.app.b.j(this.f59a, str)) {
                    z11 = true;
                }
            }
            if (!z10) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c10 == 0) {
                aVar2 = (Build.VERSION.SDK_INT < 29 || c(strArr, iArr)) ? a.always : a.whileInUse;
            } else if (!z11) {
                aVar2 = a.deniedForever;
            }
            c cVar = this.f61c;
            if (cVar != null) {
                cVar.a(aVar2);
            }
            return true;
        } catch (y2.c unused) {
            y2.a aVar3 = this.f60b;
            if (aVar3 != null) {
                aVar3.a(y2.b.permissionDefinitionsNotFound);
            }
            return false;
        }
    }
}
