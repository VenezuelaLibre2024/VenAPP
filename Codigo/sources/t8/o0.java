package t8;

import android.os.Trace;

/* loaded from: classes.dex */
public final class o0 {
    public static void a(String str) {
        if (r0.f26744a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (r0.f26744a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
