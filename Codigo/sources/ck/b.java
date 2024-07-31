package ck;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class b {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.n.e(th2, "<this>");
        kotlin.jvm.internal.n.e(exception, "exception");
        if (th2 != exception) {
            jk.b.f19988a.a(th2, exception);
        }
    }

    public static String b(Throwable th2) {
        kotlin.jvm.internal.n.e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.n.d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
