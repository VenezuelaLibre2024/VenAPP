package p005a3;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p455y2.C12585c;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;

/* renamed from: a3.b */
/* loaded from: classes.dex */
public class C0027b implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private Activity f59a;

    /* renamed from: b */
    private InterfaceC12583a f60b;

    /* renamed from: c */
    private InterfaceC0028c f61c;

    /* renamed from: b */
    private static List<String> m93b(Context context) {
        boolean m101b = C0029d.m101b(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean m101b2 = C0029d.m101b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!m101b && !m101b2) {
            throw new C12585c();
        }
        ArrayList arrayList = new ArrayList();
        if (m101b) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (m101b2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    /* renamed from: c */
    private boolean m94c(String[] strArr, int[] iArr) {
        int m95e = m95e(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return m95e >= 0 && iArr[m95e] == 0;
    }

    /* renamed from: e */
    private static <T> int m95e(T[] tArr, T t10) {
        return Arrays.asList(tArr).indexOf(t10);
    }

    /* renamed from: a */
    public EnumC0026a m96a(Context context) {
        char c10;
        Iterator<String> it = m93b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                c10 = 65535;
                break;
            }
            if (C0854a.checkSelfPermission(context, it.next()) == 0) {
                c10 = 0;
                break;
            }
        }
        if (c10 == 65535) {
            return EnumC0026a.denied;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return EnumC0026a.always;
        }
        if (C0029d.m101b(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && C0854a.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return EnumC0026a.always;
        }
        return EnumC0026a.whileInUse;
    }

    /* renamed from: d */
    public boolean m97d(Context context) {
        EnumC0026a m96a = m96a(context);
        return m96a == EnumC0026a.whileInUse || m96a == EnumC0026a.always;
    }

    /* renamed from: f */
    public void m98f(Activity activity, InterfaceC0028c interfaceC0028c, InterfaceC12583a interfaceC12583a) {
        if (activity == null) {
            interfaceC12583a.mo10589a(EnumC12584b.activityMissing);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        List<String> m93b = m93b(activity);
        if (i10 >= 29 && C0029d.m101b(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && m96a(activity) == EnumC0026a.whileInUse) {
            m93b.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f60b = interfaceC12583a;
        this.f61c = interfaceC0028c;
        this.f59a = activity;
        C0777b.m3916g(activity, (String[]) m93b.toArray(new String[0]), 109);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 109) {
            return false;
        }
        Activity activity = this.f59a;
        if (activity == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            InterfaceC12583a interfaceC12583a = this.f60b;
            if (interfaceC12583a != null) {
                interfaceC12583a.mo10589a(EnumC12584b.activityMissing);
            }
            return false;
        }
        try {
            List<String> m93b = m93b(activity);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            EnumC0026a enumC0026a = EnumC0026a.denied;
            char c10 = 65535;
            boolean z10 = false;
            boolean z11 = false;
            for (String str : m93b) {
                int m95e = m95e(strArr, str);
                if (m95e >= 0) {
                    z10 = true;
                }
                if (iArr[m95e] == 0) {
                    c10 = 0;
                }
                if (C0777b.m3919j(this.f59a, str)) {
                    z11 = true;
                }
            }
            if (!z10) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c10 == 0) {
                enumC0026a = (Build.VERSION.SDK_INT < 29 || m94c(strArr, iArr)) ? EnumC0026a.always : EnumC0026a.whileInUse;
            } else if (!z11) {
                enumC0026a = EnumC0026a.deniedForever;
            }
            InterfaceC0028c interfaceC0028c = this.f61c;
            if (interfaceC0028c != null) {
                interfaceC0028c.mo99a(enumC0026a);
            }
            return true;
        } catch (C12585c unused) {
            InterfaceC12583a interfaceC12583a2 = this.f60b;
            if (interfaceC12583a2 != null) {
                interfaceC12583a2.mo10589a(EnumC12584b.permissionDefinitionsNotFound);
            }
            return false;
        }
    }
}
