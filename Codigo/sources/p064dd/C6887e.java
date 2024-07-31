package p064dd;

import java.util.Stack;

/* renamed from: dd.e */
/* loaded from: classes.dex */
public class C6887e {

    /* renamed from: a */
    public final String f15236a;

    /* renamed from: b */
    public final String f15237b;

    /* renamed from: c */
    public final StackTraceElement[] f15238c;

    /* renamed from: d */
    public final C6887e f15239d;

    private C6887e(String str, String str2, StackTraceElement[] stackTraceElementArr, C6887e c6887e) {
        this.f15236a = str;
        this.f15237b = str2;
        this.f15238c = stackTraceElementArr;
        this.f15239d = c6887e;
    }

    /* renamed from: a */
    public static C6887e m19869a(Throwable th2, InterfaceC6886d interfaceC6886d) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        C6887e c6887e = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            c6887e = new C6887e(th3.getLocalizedMessage(), th3.getClass().getName(), interfaceC6886d.mo19866a(th3.getStackTrace()), c6887e);
        }
        return c6887e;
    }
}
