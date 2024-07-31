package a2;

import android.os.Trace;

/* loaded from: classes.dex */
final class f {
    public static void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }
}
