package na;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import la.p;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    protected final Context f21923a;

    public d(Context context) {
        this.f21923a = context;
    }

    public int a(String str) {
        return this.f21923a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public int b(String str, String str2) {
        return this.f21923a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo c(String str, int i10) {
        return this.f21923a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        return this.f21923a.getPackageManager().getApplicationLabel(this.f21923a.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public androidx.core.util.d<CharSequence, Drawable> e(String str) {
        ApplicationInfo applicationInfo = this.f21923a.getPackageManager().getApplicationInfo(str, 0);
        return androidx.core.util.d.a(this.f21923a.getPackageManager().getApplicationLabel(applicationInfo), this.f21923a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo f(String str, int i10) {
        return this.f21923a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f21923a);
        }
        if (!p.i() || (nameForUid = this.f21923a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f21923a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public final boolean h(int i10, String str) {
        if (p.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f21923a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f21923a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
