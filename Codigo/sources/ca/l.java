package ca;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    private static l f6989c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6990a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f6991b;

    public l(Context context) {
        this.f6990a = context.getApplicationContext();
    }

    public static l a(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        synchronized (l.class) {
            if (f6989c == null) {
                c0.d(context);
                f6989c = new l(context);
            }
        }
        return f6989c;
    }

    static final y d(PackageInfo packageInfo, y... yVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        z zVar = new z(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            if (yVarArr[i10].equals(zVar)) {
                return yVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? d(packageInfo, b0.f6946a) : d(packageInfo, b0.f6946a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final m0 f(String str, boolean z10, boolean z11) {
        m0 m0Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return m0.c("null pkg");
        }
        if (str.equals(this.f6991b)) {
            return m0.b();
        }
        if (c0.e()) {
            m0Var = c0.b(str, k.f(this.f6990a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f6990a.getPackageManager().getPackageInfo(str, 64);
                boolean f10 = k.f(this.f6990a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        z zVar = new z(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        m0 a10 = c0.a(str3, zVar, f10, false);
                        if (!a10.f6994a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !c0.a(str3, zVar, false, true).f6994a) {
                            m0Var = a10;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                m0Var = m0.c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return m0.d("no pkg ".concat(str), e10);
            }
        }
        if (m0Var.f6994a) {
            this.f6991b = str;
        }
        return m0Var;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (k.f(this.f6990a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        m0 c10;
        int length;
        String[] packagesForUid = this.f6990a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    com.google.android.gms.common.internal.s.j(c10);
                    break;
                }
                c10 = f(packagesForUid[i11], false, false);
                if (c10.f6994a) {
                    break;
                }
                i11++;
            }
        } else {
            c10 = m0.c("no pkgs");
        }
        c10.e();
        return c10.f6994a;
    }
}
