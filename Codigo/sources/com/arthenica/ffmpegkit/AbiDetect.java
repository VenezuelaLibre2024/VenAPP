package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class AbiDetect {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7208a = false;

    static {
        u.g();
    }

    private AbiDetect() {
    }

    public static String a() {
        return f7208a ? "arm-v7a-neon" : getNativeAbi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        f7208a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native String getNativeAbi();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native String getNativeBuildConf();

    static native String getNativeCpuAbi();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean isNativeLTSBuild();
}
