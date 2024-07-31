package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.f */
/* loaded from: classes.dex */
public final class C0865f {

    /* renamed from: androidx.core.content.pm.f$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static Signature[] m4391a(SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        /* renamed from: b */
        static long m4392b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        /* renamed from: c */
        static Signature[] m4393c(SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        /* renamed from: d */
        static boolean m4394d(SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        /* renamed from: e */
        static boolean m4395e(PackageManager packageManager, String str, byte[] bArr, int i10) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i10);
            return hasSigningCertificate;
        }
    }

    /* renamed from: a */
    public static long m4390a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.m4392b(packageInfo) : packageInfo.versionCode;
    }
}
