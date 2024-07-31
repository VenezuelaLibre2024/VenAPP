package zk;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class x1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient w1 f32944a;

    public x1(String str, Throwable th2, w1 w1Var) {
        super(str);
        this.f32944a = w1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof x1) {
                x1 x1Var = (x1) obj;
                if (!kotlin.jvm.internal.n.a(x1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.n.a(x1Var.f32944a, this.f32944a) || !kotlin.jvm.internal.n.a(x1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.n.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f32944a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f32944a;
    }
}
