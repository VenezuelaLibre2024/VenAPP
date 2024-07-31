package ck;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.C9322n;
import p187jk.C9081b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ck.b */
/* loaded from: classes3.dex */
public class C2017b {
    /* renamed from: a */
    public static void m10328a(Throwable th2, Throwable exception) {
        C9322n.m27781e(th2, "<this>");
        C9322n.m27781e(exception, "exception");
        if (th2 != exception) {
            C9081b.f21767a.mo26683a(th2, exception);
        }
    }

    /* renamed from: b */
    public static String m10329b(Throwable th2) {
        C9322n.m27781e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C9322n.m27780d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
