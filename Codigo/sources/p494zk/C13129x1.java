package p494zk;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C9322n;

/* renamed from: zk.x1 */
/* loaded from: classes3.dex */
public final class C13129x1 extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC13125w1 f35495a;

    public C13129x1(String str, Throwable th2, InterfaceC13125w1 interfaceC13125w1) {
        super(str);
        this.f35495a = interfaceC13125w1;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C13129x1) {
                C13129x1 c13129x1 = (C13129x1) obj;
                if (!C9322n.m27777a(c13129x1.getMessage(), getMessage()) || !C9322n.m27777a(c13129x1.f35495a, this.f35495a) || !C9322n.m27777a(c13129x1.getCause(), getCause())) {
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
        C9322n.m27778b(message);
        int hashCode = ((message.hashCode() * 31) + this.f35495a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f35495a;
    }
}
