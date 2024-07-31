package p494zk;

import p089el.C7226j;
import p124gk.Continuation;

/* renamed from: zk.p */
/* loaded from: classes3.dex */
public final class C13095p {
    /* renamed from: a */
    public static final void m43278a(InterfaceC13083m<?> interfaceC13083m, InterfaceC13044c1 interfaceC13044c1) {
        interfaceC13083m.mo24601k(new C13049d1(interfaceC13044c1));
    }

    /* renamed from: b */
    public static final <T> C13087n<T> m43279b(Continuation<? super T> continuation) {
        if (!(continuation instanceof C7226j)) {
            return new C13087n<>(continuation, 1);
        }
        C13087n<T> m21588m = ((C7226j) continuation).m21588m();
        if (m21588m != null) {
            if (!m21588m.m43261J()) {
                m21588m = null;
            }
            if (m21588m != null) {
                return m21588m;
            }
        }
        return new C13087n<>(continuation, 2);
    }
}
