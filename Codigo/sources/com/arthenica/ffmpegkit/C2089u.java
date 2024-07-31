package com.arthenica.ffmpegkit;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.arthenica.ffmpegkit.u */
/* loaded from: classes.dex */
public class C2089u {

    /* renamed from: a */
    static final String[] f8228a = {"avutil", "swscale", "swresample", "avcodec", "avformat", "avfilter", "avdevice"};

    /* renamed from: b */
    static final String[] f8229b = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", "zimg", "libilbc"};

    /* renamed from: a */
    static String m10534a() {
        return "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.m10439c(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.m10439c(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.m10439c(Build.SUPPORTED_64_BIT_ABIS);
    }

    /* renamed from: b */
    static boolean m10535b() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m10536c() {
        return m10535b() ? AbiDetect.m10413a() : EnumC2066a.ABI_X86_64.m10470h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m10537d() {
        return m10535b() ? FFmpegKitConfig.m10456t() : new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m10538e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10539f(boolean r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L33
            java.lang.String r3 = "arm-v7a"
            java.lang.String r1 = m10544k()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L33
            r3 = 1
            java.lang.String r1 = "ffmpegkit_armv7a_neon"
            m10542i(r1)     // Catch: java.lang.Error -> L1d
            com.arthenica.ffmpegkit.AbiDetect.m10414b()     // Catch: java.lang.Error -> L1a
            r0 = r3
            goto L33
        L1a:
            r1 = move-exception
            r2 = r3
            goto L1f
        L1d:
            r1 = move-exception
            r2 = r0
        L1f:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = p372u2.C11302a.m35304a(r1)
            r3[r0] = r1
            java.lang.String r0 = "NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            java.lang.String r0 = "ffmpeg-kit"
            android.util.Log.i(r0, r3)
            r0 = r2
        L33:
            if (r0 != 0) goto L3a
            java.lang.String r3 = "ffmpegkit"
            m10542i(r3)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.C2089u.m10539f(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m10540g() {
        m10542i("ffmpegkit_abidetect");
    }

    /* renamed from: h */
    static boolean m10541h() {
        if (m10535b()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    /* renamed from: i */
    private static void m10542i(String str) {
        if (m10535b()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", m10534a()), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m10543j() {
        return m10535b() ? FFmpegKitConfig.getNativeLogLevel() : EnumC2081m.AV_LOG_DEBUG.m10521i();
    }

    /* renamed from: k */
    private static String m10544k() {
        return m10535b() ? AbiDetect.getNativeAbi() : EnumC2066a.ABI_X86_64.m10470h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static String m10545l() {
        return m10535b() ? C2090v.m10548b() : "test";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static String m10546m() {
        return m10535b() ? FFmpegKitConfig.m10426L() : m10541h() ? String.format("%s-lts", "6.0") : "6.0";
    }
}
