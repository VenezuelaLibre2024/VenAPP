package na;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.core.util.C0980d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import la.C9471p;

/* renamed from: na.d */
/* loaded from: classes.dex */
public class C9695d {

    /* renamed from: a */
    protected final Context f23856a;

    public C9695d(Context context) {
        this.f23856a = context;
    }

    /* renamed from: a */
    public int m29072a(String str) {
        return this.f23856a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public int m29073b(String str, String str2) {
        return this.f23856a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: c */
    public ApplicationInfo m29074c(String str, int i10) {
        return this.f23856a.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: d */
    public CharSequence m29075d(String str) {
        return this.f23856a.getPackageManager().getApplicationLabel(this.f23856a.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: e */
    public C0980d<CharSequence, Drawable> m29076e(String str) {
        ApplicationInfo applicationInfo = this.f23856a.getPackageManager().getApplicationInfo(str, 0);
        return C0980d.m4819a(this.f23856a.getPackageManager().getApplicationLabel(applicationInfo), this.f23856a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: f */
    public PackageInfo m29077f(String str, int i10) {
        return this.f23856a.getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: g */
    public boolean m29078g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C9693b.m29070a(this.f23856a);
        }
        if (!C9471p.m28172i() || (nameForUid = this.f23856a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f23856a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    /* renamed from: h */
    public final boolean m29079h(int i10, String str) {
        if (C9471p.m28167d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f23856a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f23856a.getPackageManager().getPackagesForUid(i10);
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
