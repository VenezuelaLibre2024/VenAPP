package ca;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.C5233d1;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import la.C9465j;
import la.C9471p;
import la.C9476u;
import la.C9478w;
import na.C9696e;

/* renamed from: ca.k */
/* loaded from: classes.dex */
public class C1912k {

    /* renamed from: a */
    @Deprecated
    public static final int f7932a = 12451000;

    /* renamed from: c */
    private static boolean f7934c = false;

    /* renamed from: d */
    static boolean f7935d = false;

    /* renamed from: b */
    @Deprecated
    static final AtomicBoolean f7933b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f7936e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m10095a(Context context, int i10) {
        int mo10072h = C1904g.m10086f().mo10072h(context, i10);
        if (mo10072h != 0) {
            Intent mo10068b = C1904g.m10086f().mo10068b(context, mo10072h, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + mo10072h);
            if (mo10068b != null) {
                throw new C1908i(mo10072h, "Google Play Services not available", mo10068b);
            }
            throw new C1906h(mo10072h);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m10096b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m10097c(int i10) {
        return C1894b.m10049z1(i10);
    }

    /* renamed from: d */
    public static Context m10098d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m10099e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m10100f(Context context) {
        try {
            if (!f7935d) {
                try {
                    PackageInfo m29077f = C9696e.m29080a(context).m29077f("com.google.android.gms", 64);
                    C1914l.m10108a(context);
                    if (m29077f == null || C1914l.m10110e(m29077f, false) || !C1914l.m10110e(m29077f, true)) {
                        f7934c = false;
                    } else {
                        f7934c = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
            }
            return f7934c || !C9465j.m28147e();
        } finally {
            f7935d = true;
        }
    }

    @Deprecated
    /* renamed from: g */
    public static int m10101g(Context context, int i10) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C1916m.f7941a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f7936e.get()) {
            int m13229a = C5233d1.m13229a(context);
            if (m13229a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (m13229a != f7932a) {
                throw new GooglePlayServicesIncorrectManifestValueException(m13229a);
            }
        }
        boolean z10 = (C9465j.m28149g(context) || C9465j.m28151i(context)) ? false : true;
        C5276s.m13315a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1914l.m10108a(context);
            if (C1914l.m10110e(packageInfo2, true)) {
                if (z10) {
                    C5276s.m13324j(packageInfo);
                    if (!C1914l.m10110e(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (C9478w.m28188a(packageInfo2.versionCode) >= C9478w.m28188a(i10)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            Log.w("GooglePlayServicesUtil", valueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m10102h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m10106l(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m10103i(Context context) {
        if (!C9471p.m28166c()) {
            return false;
        }
        Object systemService = context.getSystemService(Constants.USER);
        C5276s.m13324j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m10104j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m10105k(Context context, int i10, String str) {
        return C9476u.m28182b(context, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static boolean m10106l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C9471p.m28169f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m10103i(context);
    }
}
