package p458y5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7021m;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p024b6.C1662a;
import p024b6.C1666e;
import p395v5.EnumC11629c;
import p480z5.C12802a;
import p480z5.C12803b;
import p480z5.C12804c;
import p480z5.C12805d;
import p480z5.C12806e;

/* renamed from: y5.a */
/* loaded from: classes.dex */
public abstract class AbstractC12603a {

    /* renamed from: b */
    public static final a f34189b = new a(null);

    /* renamed from: a */
    private C1666e f34190a;

    /* renamed from: y5.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12603a m41457a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29) {
                return new C12802a();
            }
            if (i10 == 29) {
                return new C12803b();
            }
            if (30 <= i10 && i10 < 33) {
                return new C12804c();
            }
            if (i10 == 33) {
                return new C12805d();
            }
            if (34 <= i10 && i10 < Integer.MAX_VALUE) {
                return new C12806e();
            }
            throw new UnsupportedOperationException("This sdk version is not supported yet.");
        }
    }

    /* renamed from: c */
    private final String m41442c() {
        String simpleName = getClass().getSimpleName();
        C9322n.m27780d(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* renamed from: i */
    private final boolean m41443i(Context context, String str) {
        boolean m20488p;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = Build.VERSION.SDK_INT;
        PackageManager packageManager = context.getPackageManager();
        String str2 = applicationInfo.packageName;
        String[] requestedPermissions = (i10 >= 33 ? packageManager.getPackageInfo(str2, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(str2, RecognitionOptions.AZTEC)).requestedPermissions;
        C9322n.m27780d(requestedPermissions, "requestedPermissions");
        m20488p = C7021m.m20488p(requestedPermissions, str);
        return m20488p;
    }

    /* renamed from: a */
    public abstract EnumC11629c mo41444a(Application application, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C1666e m41445b() {
        return this.f34190a;
    }

    /* renamed from: d */
    public void mo41446d(C12605c permissionsUtils, Context context, String[] permissions, int[] grantResults, List<String> needToRequestPermissionsList, List<String> deniedPermissionsList, List<String> grantedPermissionsList, int i10) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        C9322n.m27781e(needToRequestPermissionsList, "needToRequestPermissionsList");
        C9322n.m27781e(deniedPermissionsList, "deniedPermissionsList");
        C9322n.m27781e(grantedPermissionsList, "grantedPermissionsList");
        throw new UnsupportedOperationException("handlePermissionResult is not implemented, please implement it in your delegate.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean m41447e(Context context, String... permissions) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permissions, "permissions");
        for (String str : permissions) {
            if (m41450h(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo41448f(Context context);

    /* renamed from: g */
    public final boolean m41449g(Context context, String permission) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permission, "permission");
        return m41443i(context, permission) && m41450h(context, permission);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m41450h(Context context, String permission) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permission, "permission");
        return C0854a.checkSelfPermission(context, permission) == 0;
    }

    /* renamed from: j */
    public final boolean m41451j(Context context, String... permission) {
        List m20478e0;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(permission, "permission");
        int length = permission.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            if (!m41449g(context, permission[i10])) {
                break;
            }
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(m41442c());
        sb2.append("] havePermissions: ");
        m20478e0 = C7021m.m20478e0(permission);
        sb2.append(m20478e0);
        sb2.append(", result: ");
        sb2.append(z10);
        C1662a.m9132a(sb2.toString());
        return z10;
    }

    /* renamed from: k */
    public boolean mo41452k() {
        return false;
    }

    /* renamed from: l */
    public void mo41453l(C12605c permissionsUtils, Application context, int i10, C1666e resultHandler) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(context, "context");
        C9322n.m27781e(resultHandler, "resultHandler");
        C1662a.m9132a('[' + m41442c() + "] presentLimited is not implemented");
        resultHandler.m9148g(null);
    }

    /* renamed from: m */
    public abstract void mo41454m(C12605c c12605c, Context context, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m41455n(C12605c permissionsUtils, List<String> permission) {
        C9322n.m27781e(permissionsUtils, "permissionsUtils");
        C9322n.m27781e(permission, "permission");
        Activity m41460b = permissionsUtils.m41460b();
        if (m41460b == null) {
            throw new NullPointerException("Activity for the permission request is not exist.");
        }
        permissionsUtils.m41468k(permission);
        C0777b.m3916g(m41460b, (String[]) permission.toArray(new String[0]), AdError.MEDIATION_ERROR_CODE);
        C1662a.m9132a("requestPermission: " + permission + " for code 3001");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m41456o(C1666e c1666e) {
        this.f34190a = c1666e;
    }
}
