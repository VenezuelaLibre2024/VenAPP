package dd;

import java.util.Stack;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f13882a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13883b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f13884c;

    /* renamed from: d, reason: collision with root package name */
    public final e f13885d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f13882a = str;
        this.f13883b = str2;
        this.f13884c = stackTraceElementArr;
        this.f13885d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
