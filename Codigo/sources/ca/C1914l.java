package ca;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: ca.l */
/* loaded from: classes.dex */
public class C1914l {

    /* renamed from: c */
    private static C1914l f7938c;

    /* renamed from: a */
    private final Context f7939a;

    /* renamed from: b */
    private volatile String f7940b;

    public C1914l(Context context) {
        this.f7939a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1914l m10108a(Context context) {
        C5276s.m13324j(context);
        synchronized (C1914l.class) {
            if (f7938c == null) {
                C1897c0.m10059d(context);
                f7938c = new C1914l(context);
            }
        }
        return f7938c;
    }

    /* renamed from: d */
    static final AbstractBinderC1930y m10109d(PackageInfo packageInfo, AbstractBinderC1930y... abstractBinderC1930yArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC1931z binderC1931z = new BinderC1931z(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC1930yArr.length; i10++) {
            if (abstractBinderC1930yArr[i10].equals(binderC1931z)) {
                return abstractBinderC1930yArr[i10];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m10110e(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? m10109d(packageInfo, C1895b0.f7895a) : m10109d(packageInfo, C1895b0.f7895a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C1917m0 m10111f(String str, boolean z10, boolean z11) {
        C1917m0 c1917m0;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C1917m0.m10115c("null pkg");
        }
        if (str.equals(this.f7940b)) {
            return C1917m0.m10114b();
        }
        if (C1897c0.m10060e()) {
            c1917m0 = C1897c0.m10057b(str, C1912k.m10100f(this.f7939a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f7939a.getPackageManager().getPackageInfo(str, 64);
                boolean m10100f = C1912k.m10100f(this.f7939a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        BinderC1931z binderC1931z = new BinderC1931z(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C1917m0 m10056a = C1897c0.m10056a(str3, binderC1931z, m10100f, false);
                        if (!m10056a.f7943a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C1897c0.m10056a(str3, binderC1931z, false, true).f7943a) {
                            c1917m0 = m10056a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                c1917m0 = C1917m0.m10115c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return C1917m0.m10116d("no pkg ".concat(str), e10);
            }
        }
        if (c1917m0.f7943a) {
            this.f7940b = str;
        }
        return c1917m0;
    }

    /* renamed from: b */
    public boolean m10112b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m10110e(packageInfo, false)) {
            return true;
        }
        if (m10110e(packageInfo, true)) {
            if (C1912k.m10100f(this.f7939a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m10113c(int i10) {
        C1917m0 m10115c;
        int length;
        String[] packagesForUid = this.f7939a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m10115c = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C5276s.m13324j(m10115c);
                    break;
                }
                m10115c = m10111f(packagesForUid[i11], false, false);
                if (m10115c.f7943a) {
                    break;
                }
                i11++;
            }
        } else {
            m10115c = C1917m0.m10115c("no pkgs");
        }
        m10115c.m10119e();
        return m10115c.f7943a;
    }
}
