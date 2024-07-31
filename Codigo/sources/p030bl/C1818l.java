package p030bl;

import ck.C2037v;
import kotlin.jvm.internal.C9333y;
import p089el.C7241q0;
import p089el.C7250z;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13041b3;

/* renamed from: bl.l */
/* loaded from: classes3.dex */
public class C1818l<E> extends C1808b<E> {

    /* renamed from: n */
    private final int f7718n;

    /* renamed from: o */
    private final EnumC1807a f7719o;

    public C1818l(int i10, EnumC1807a enumC1807a, InterfaceC9998l<? super E, C2037v> interfaceC9998l) {
        super(i10, interfaceC9998l);
        this.f7718n = i10;
        this.f7719o = enumC1807a;
        if (!(enumC1807a != EnumC1807a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C9333y.m27797b(C1808b.class).mo27771c() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    /* renamed from: A0 */
    private final Object m9819A0(E e10, boolean z10) {
        return this.f7719o == EnumC1807a.DROP_LATEST ? m9820y0(e10, z10) : m9821z0(e10);
    }

    /* renamed from: y0 */
    private final Object m9820y0(E e10, boolean z10) {
        InterfaceC9998l<E, C2037v> interfaceC9998l;
        C7241q0 m21690d;
        Object mo9734a = super.mo9734a(e10);
        if (C1813g.m9799i(mo9734a) || C1813g.m9798h(mo9734a)) {
            return mo9734a;
        }
        if (!z10 || (interfaceC9998l = this.f7678c) == null || (m21690d = C7250z.m21690d(interfaceC9998l, e10, null, 2, null)) == null) {
            return C1813g.f7712b.m9804c(C2037v.f8089a);
        }
        throw m21690d;
    }

    /* renamed from: z0 */
    private final Object m9821z0(E e10) {
        C1815i c1815i;
        Object obj = C1809c.f7692d;
        C1815i c1815i2 = (C1815i) C1808b.f7672i.get(this);
        while (true) {
            long andIncrement = C1808b.f7668e.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean m9679S = m9679S(andIncrement);
            int i10 = C1809c.f7690b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c1815i2.f16188c != j11) {
                C1815i m9670C = m9670C(j11, c1815i2);
                if (m9670C != null) {
                    c1815i = m9670C;
                } else if (m9679S) {
                    return C1813g.f7712b.m9802a(m9728H());
                }
            } else {
                c1815i = c1815i2;
            }
            int m9718t0 = m9718t0(c1815i, i11, e10, j10, obj, m9679S);
            if (m9718t0 == 0) {
                c1815i.m21557b();
                return C1813g.f7712b.m9804c(C2037v.f8089a);
            }
            if (m9718t0 == 1) {
                return C1813g.f7712b.m9804c(C2037v.f8089a);
            }
            if (m9718t0 == 2) {
                if (m9679S) {
                    c1815i.m21566p();
                    return C1813g.f7712b.m9802a(m9728H());
                }
                InterfaceC13041b3 interfaceC13041b3 = obj instanceof InterfaceC13041b3 ? (InterfaceC13041b3) obj : null;
                if (interfaceC13041b3 != null) {
                    m9690f0(interfaceC13041b3, c1815i, i11);
                }
                m9743y((c1815i.f16188c * i10) + i11);
                return C1813g.f7712b.m9804c(C2037v.f8089a);
            }
            if (m9718t0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (m9718t0 == 4) {
                if (j10 < m9727G()) {
                    c1815i.m21557b();
                }
                return C1813g.f7712b.m9802a(m9728H());
            }
            if (m9718t0 == 5) {
                c1815i.m21557b();
            }
            c1815i2 = c1815i;
        }
    }

    @Override // p030bl.C1808b
    /* renamed from: T */
    protected boolean mo9733T() {
        return this.f7719o == EnumC1807a.DROP_OLDEST;
    }

    @Override // p030bl.C1808b, p030bl.InterfaceC1821o
    /* renamed from: a */
    public Object mo9734a(E e10) {
        return m9819A0(e10, false);
    }
}
