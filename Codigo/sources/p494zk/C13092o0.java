package p494zk;

import ck.C2029n;
import ck.C2030o;
import p089el.C7226j;
import p124gk.Continuation;

/* renamed from: zk.o0 */
/* loaded from: classes3.dex */
public final class C13092o0 {
    /* renamed from: a */
    public static final String m43273a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m43274b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m43275c(Continuation<?> continuation) {
        Object m10340b;
        if (continuation instanceof C7226j) {
            return continuation.toString();
        }
        try {
            C2029n.a aVar = C2029n.f8078b;
            m10340b = C2029n.m10340b(continuation + '@' + m43274b(continuation));
        } catch (Throwable th2) {
            C2029n.a aVar2 = C2029n.f8078b;
            m10340b = C2029n.m10340b(C2030o.m10348a(th2));
        }
        if (C2029n.m10342d(m10340b) != null) {
            m10340b = continuation.getClass().getName() + '@' + m43274b(continuation);
        }
        return (String) m10340b;
    }
}
