package com.arthenica.ffmpegkit;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    static final String[] f7276a = {"avutil", "swscale", "swresample", "avcodec", "avformat", "avfilter", "avdevice"};

    /* renamed from: b */
    static final String[] f7277b = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", "zimg", "libilbc"};

    static String a() {
        return "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.c(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.c(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.c(Build.SUPPORTED_64_BIT_ABIS);
    }

    static boolean b() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    public static String c() {
        return b() ? AbiDetect.a() : a.ABI_X86_64.h();
    }

    public static String d() {
        return b() ? FFmpegKitConfig.t() : new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    public static boolean e() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(boolean r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L33
            java.lang.String r3 = "arm-v7a"
            java.lang.String r1 = k()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L33
            r3 = 1
            java.lang.String r1 = "ffmpegkit_armv7a_neon"
            i(r1)     // Catch: java.lang.Error -> L1d
            com.arthenica.ffmpegkit.AbiDetect.b()     // Catch: java.lang.Error -> L1a
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
            java.lang.String r1 = u2.a.a(r1)
            r3[r0] = r1
            java.lang.String r0 = "NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            java.lang.String r0 = "ffmpeg-kit"
            android.util.Log.i(r0, r3)
            r0 = r2
        L33:
            if (r0 != 0) goto L3a
            java.lang.String r3 = "ffmpegkit"
            i(r3)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.u.f(boolean):void");
    }

    public static void g() {
        i("ffmpegkit_abidetect");
    }

    static boolean h() {
        if (b()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    private static void i(String str) {
        if (b()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", a()), e10);
            }
        }
    }

    public static int j() {
        return b() ? FFmpegKitConfig.getNativeLogLevel() : m.AV_LOG_DEBUG.i();
    }

    private static String k() {
        return b() ? AbiDetect.getNativeAbi() : a.ABI_X86_64.h();
    }

    public static String l() {
        return b() ? v.b() : "test";
    }

    public static String m() {
        return b() ? FFmpegKitConfig.L() : h() ? String.format("%s-lts", "6.0") : "6.0";
    }
}
