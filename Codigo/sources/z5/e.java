package z5;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;

/* loaded from: classes.dex */
public final class e extends y5.a {

    /* renamed from: c */
    public static final a f32326c = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32327a;

        static {
            int[] iArr = new int[v5.c.values().length];
            try {
                iArr[v5.c.Denied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v5.c.Authorized.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v5.c.Limited.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32327a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [v5.c, T] */
    private static final void p(x<v5.c> xVar, v5.c cVar) {
        T t10;
        v5.c cVar2 = xVar.f20759a;
        if (cVar2 == v5.c.NotDetermined) {
            xVar.f20759a = cVar;
            return;
        }
        int i10 = b.f32327a[cVar2.ordinal()];
        if (i10 == 1) {
            v5.c cVar3 = v5.c.Limited;
            t10 = cVar3;
            if (cVar != cVar3) {
                t10 = cVar3;
                if (cVar != v5.c.Authorized) {
                    return;
                }
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            xVar.f20759a = v5.c.Limited;
            return;
        } else {
            v5.c cVar4 = v5.c.Limited;
            t10 = cVar4;
            if (cVar != cVar4) {
                t10 = cVar4;
                if (cVar != v5.c.Denied) {
                    return;
                }
            }
        }
        xVar.f20759a = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [v5.c, T] */
    @Override // y5.a
    public v5.c a(Application context, int i10, boolean z10) {
        n.e(context, "context");
        x xVar = new x();
        xVar.f20759a = v5.c.NotDetermined;
        x5.g gVar = x5.g.f30426a;
        boolean c10 = gVar.c(i10);
        boolean d10 = gVar.d(i10);
        if (gVar.b(i10)) {
            p(xVar, j(context, "android.permission.READ_MEDIA_AUDIO") ? v5.c.Authorized : v5.c.Denied);
        }
        if (d10) {
            p(xVar, j(context, "android.permission.READ_MEDIA_VIDEO") ? v5.c.Authorized : h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") ? v5.c.Limited : v5.c.Denied);
        }
        if (c10) {
            p(xVar, j(context, "android.permission.READ_MEDIA_IMAGES") ? v5.c.Authorized : h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") ? v5.c.Limited : v5.c.Denied);
        }
        return (v5.c) xVar.f20759a;
    }

    @Override // y5.a
    public void d(y5.c permissionsUtils, Context context, String[] permissions, int[] grantResults, List<String> needToRequestPermissionsList, List<String> deniedPermissionsList, List<String> grantedPermissionsList, int i10) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n.e(permissions, "permissions");
        n.e(grantResults, "grantResults");
        n.e(needToRequestPermissionsList, "needToRequestPermissionsList");
        n.e(deniedPermissionsList, "deniedPermissionsList");
        n.e(grantedPermissionsList, "grantedPermissionsList");
        if (i10 == 3002) {
            b6.e b10 = b();
            if (b10 == null) {
                return;
            }
            o(null);
            b10.g(1);
            return;
        }
        boolean contains = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_IMAGES");
        boolean contains2 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VIDEO");
        boolean contains3 = needToRequestPermissionsList.contains("android.permission.READ_MEDIA_AUDIO");
        boolean contains4 = needToRequestPermissionsList.contains("android.permission.ACCESS_MEDIA_LOCATION");
        boolean e10 = (contains || contains2 || needToRequestPermissionsList.contains("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) ? e(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO") : true;
        if (contains3) {
            e10 = e10 && g(context, "android.permission.READ_MEDIA_AUDIO");
        }
        if (contains4) {
            e10 = e10 && h(context, "android.permission.ACCESS_MEDIA_LOCATION");
        }
        y5.b e11 = permissionsUtils.e();
        if (e11 == null) {
            return;
        }
        if (e10) {
            e11.a(needToRequestPermissionsList);
        } else {
            e11.b(deniedPermissionsList, grantedPermissionsList, needToRequestPermissionsList);
        }
    }

    @Override // y5.a
    public boolean f(Context context) {
        n.e(context, "context");
        return g(context, "android.permission.ACCESS_MEDIA_LOCATION");
    }

    @Override // y5.a
    public boolean k() {
        return true;
    }

    @Override // y5.a
    public void l(y5.c permissionsUtils, Application context, int i10, b6.e resultHandler) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n.e(resultHandler, "resultHandler");
        o(resultHandler);
        x5.g gVar = x5.g.f30426a;
        boolean c10 = gVar.c(i10);
        boolean d10 = gVar.d(i10);
        ArrayList arrayList = new ArrayList();
        if (d10 || c10) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if (d10) {
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        }
        if (c10) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        }
        n(permissionsUtils, arrayList);
    }

    @Override // y5.a
    public void m(y5.c permissionsUtils, Context context, int i10, boolean z10) {
        boolean h10;
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        b6.a.a("requestPermission");
        x5.g gVar = x5.g.f30426a;
        boolean c10 = gVar.c(i10);
        boolean d10 = gVar.d(i10);
        boolean b10 = gVar.b(i10);
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        if (d10 || c10) {
            arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            h10 = h(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
            if (z10) {
                arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                h10 = h10 && g(context, "android.permission.ACCESS_MEDIA_LOCATION");
            }
            if (d10) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (c10) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
        } else {
            h10 = true;
        }
        if (b10) {
            arrayList.add("android.permission.READ_MEDIA_AUDIO");
            if (h10 && g(context, "android.permission.READ_MEDIA_AUDIO")) {
                z11 = true;
            }
            h10 = z11;
        }
        b6.a.a("Current permissions: " + arrayList);
        b6.a.a("havePermission: " + h10);
        if (!h10) {
            n(permissionsUtils, arrayList);
            return;
        }
        y5.b e10 = permissionsUtils.e();
        if (e10 != null) {
            e10.a(arrayList);
        }
    }
}
