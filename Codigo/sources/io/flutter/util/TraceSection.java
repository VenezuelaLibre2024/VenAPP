package io.flutter.util;

import a2.b;

/* loaded from: classes3.dex */
public final class TraceSection {
    public static void begin(String str) {
        b.c(cropSectionName(str));
    }

    public static void beginAsyncSection(String str, int i10) {
        b.a(cropSectionName(str), i10);
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
        b.f();
    }

    public static void endAsyncSection(String str, int i10) {
        b.d(cropSectionName(str), i10);
    }
}
