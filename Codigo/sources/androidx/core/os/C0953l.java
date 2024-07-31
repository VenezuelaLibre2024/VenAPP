package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.l */
/* loaded from: classes.dex */
public final class C0953l {

    /* renamed from: a */
    private static long f4474a;

    /* renamed from: b */
    private static Method f4475b;

    /* renamed from: c */
    private static Method f4476c;

    /* renamed from: d */
    private static Method f4477d;

    /* renamed from: e */
    private static Method f4478e;

    /* renamed from: androidx.core.os.l$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m4735a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m4736b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f4474a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f4475b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f4476c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f4477d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f4478e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* renamed from: a */
    public static void m4733a(String str) {
        a.m4735a(str);
    }

    /* renamed from: b */
    public static void m4734b() {
        a.m4736b();
    }
}
