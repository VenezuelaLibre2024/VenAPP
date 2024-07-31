package zk;

import ck.n;
import gk.Continuation;

/* loaded from: classes3.dex */
public final class o0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation<?> continuation) {
        Object b10;
        if (continuation instanceof el.j) {
            return continuation.toString();
        }
        try {
            n.a aVar = ck.n.f7126b;
            b10 = ck.n.b(continuation + '@' + b(continuation));
        } catch (Throwable th2) {
            n.a aVar2 = ck.n.f7126b;
            b10 = ck.n.b(ck.o.a(th2));
        }
        if (ck.n.d(b10) != null) {
            b10 = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) b10;
    }
}
