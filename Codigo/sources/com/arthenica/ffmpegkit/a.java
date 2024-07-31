package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public enum a {
    ABI_ARMV7A_NEON("armeabi-v7a-neon"),
    ABI_ARMV7A("armeabi-v7a"),
    ABI_ARM("armeabi"),
    ABI_X86("x86"),
    ABI_X86_64("x86_64"),
    ABI_ARM64_V8A("arm64-v8a"),
    ABI_UNKNOWN("unknown");

    private final String name;

    a(String str) {
        this.name = str;
    }

    public String h() {
        return this.name;
    }
}
