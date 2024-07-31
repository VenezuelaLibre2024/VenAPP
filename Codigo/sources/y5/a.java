package y5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import b6.e;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.m;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import z5.d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0529a f31653b = new C0529a(null);

    /* renamed from: a, reason: collision with root package name */
    private e f31654a;

    /* renamed from: y5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0529a {
        private C0529a() {
        }

        public /* synthetic */ C0529a(g gVar) {
            this();
        }

        public final a a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29) {
                return new z5.a();
            }
            if (i10 == 29) {
                return new z5.b();
            }
            if (30 <= i10 && i10 < 33) {
                return new z5.c();
            }
            if (i10 == 33) {
                return new d();
            }
            if (34 <= i10 && i10 < Integer.MAX_VALUE) {
                return new z5.e();
            }
            throw new UnsupportedOperationException("This sdk version is not supported yet.");
        }
    }

    private final String c() {
        String simpleName = getClass().getSimpleName();
        n.d(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final boolean i(Context context, String str) {
        boolean p10;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = Build.VERSION.SDK_INT;
        PackageManager packageManager = context.getPackageManager();
        String str2 = applicationInfo.packageName;
        String[] requestedPermissions = (i10 >= 33 ? packageManager.getPackageInfo(str2, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(str2, RecognitionOptions.AZTEC)).requestedPermissions;
        n.d(requestedPermissions, "requestedPermissions");
        p10 = m.p(requestedPermissions, str);
        return p10;
    }

    public abstract v5.c a(Application application, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final e b() {
        return this.f31654a;
    }

    public void d(c permissionsUtils, Context context, String[] permissions, int[] grantResults, List<String> needToRequestPermissionsList, List<String> deniedPermissionsList, List<String> grantedPermissionsList, int i10) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n.e(permissions, "permissions");
        n.e(grantResults, "grantResults");
        n.e(needToRequestPermissionsList, "needToRequestPermissionsList");
        n.e(deniedPermissionsList, "deniedPermissionsList");
        n.e(grantedPermissionsList, "grantedPermissionsList");
        throw new UnsupportedOperationException("handlePermissionResult is not implemented, please implement it in your delegate.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(Context context, String... permissions) {
        n.e(context, "context");
        n.e(permissions, "permissions");
        for (String str : permissions) {
            if (h(context, str)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean f(Context context);

    public final boolean g(Context context, String permission) {
        n.e(context, "context");
        n.e(permission, "permission");
        return i(context, permission) && h(context, permission);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean h(Context context, String permission) {
        n.e(context, "context");
        n.e(permission, "permission");
        return androidx.core.content.a.checkSelfPermission(context, permission) == 0;
    }

    public final boolean j(Context context, String... permission) {
        List e02;
        n.e(context, "context");
        n.e(permission, "permission");
        int length = permission.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            if (!g(context, permission[i10])) {
                break;
            }
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(c());
        sb2.append("] havePermissions: ");
        e02 = m.e0(permission);
        sb2.append(e02);
        sb2.append(", result: ");
        sb2.append(z10);
        b6.a.a(sb2.toString());
        return z10;
    }

    public boolean k() {
        return false;
    }

    public void l(c permissionsUtils, Application context, int i10, e resultHandler) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(context, "context");
        n.e(resultHandler, "resultHandler");
        b6.a.a('[' + c() + "] presentLimited is not implemented");
        resultHandler.g(null);
    }

    public abstract void m(c cVar, Context context, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(c permissionsUtils, List<String> permission) {
        n.e(permissionsUtils, "permissionsUtils");
        n.e(permission, "permission");
        Activity b10 = permissionsUtils.b();
        if (b10 == null) {
            throw new NullPointerException("Activity for the permission request is not exist.");
        }
        permissionsUtils.k(permission);
        androidx.core.app.b.g(b10, (String[]) permission.toArray(new String[0]), AdError.MEDIATION_ERROR_CODE);
        b6.a.a("requestPermission: " + permission + " for code 3001");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(e eVar) {
        this.f31654a = eVar;
    }
}
