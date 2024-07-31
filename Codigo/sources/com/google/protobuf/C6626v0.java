package com.google.protobuf;

import com.google.protobuf.C6572d0;
import com.google.protobuf.C6619t;
import com.google.protobuf.C6621t1;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.v0 */
/* loaded from: classes2.dex */
final class C6626v0<T> implements InterfaceC6582g1<T> {

    /* renamed from: a */
    private final InterfaceC6614r0 f14652a;

    /* renamed from: b */
    private final AbstractC6603n1<?, ?> f14653b;

    /* renamed from: c */
    private final boolean f14654c;

    /* renamed from: d */
    private final AbstractC6607p<?> f14655d;

    private C6626v0(AbstractC6603n1<?, ?> abstractC6603n1, AbstractC6607p<?> abstractC6607p, InterfaceC6614r0 interfaceC6614r0) {
        this.f14653b = abstractC6603n1;
        this.f14654c = abstractC6607p.mo19000e(interfaceC6614r0);
        this.f14655d = abstractC6607p;
        this.f14652a = interfaceC6614r0;
    }

    /* renamed from: j */
    private <UT, UB> int m19275j(AbstractC6603n1<UT, UB> abstractC6603n1, T t10) {
        return abstractC6603n1.mo18961i(abstractC6603n1.mo18959g(t10));
    }

    /* renamed from: k */
    private <UT, UB, ET extends C6619t.b<ET>> void m19276k(AbstractC6603n1<UT, UB> abstractC6603n1, AbstractC6607p<ET> abstractC6607p, T t10, InterfaceC6579f1 interfaceC6579f1, C6604o c6604o) {
        UB mo18958f = abstractC6603n1.mo18958f(t10);
        C6619t<ET> mo18999d = abstractC6607p.mo18999d(t10);
        do {
            try {
                if (interfaceC6579f1.mo18465A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC6603n1.mo18967o(t10, mo18958f);
            }
        } while (m19278m(interfaceC6579f1, c6604o, abstractC6607p, mo18999d, abstractC6603n1, mo18958f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static <T> C6626v0<T> m19277l(AbstractC6603n1<?, ?> abstractC6603n1, AbstractC6607p<?> abstractC6607p, InterfaceC6614r0 interfaceC6614r0) {
        return new C6626v0<>(abstractC6603n1, abstractC6607p, interfaceC6614r0);
    }

    /* renamed from: m */
    private <UT, UB, ET extends C6619t.b<ET>> boolean m19278m(InterfaceC6579f1 interfaceC6579f1, C6604o c6604o, AbstractC6607p<ET> abstractC6607p, C6619t<ET> c6619t, AbstractC6603n1<UT, UB> abstractC6603n1, UB ub2) {
        int mo18481a = interfaceC6579f1.mo18481a();
        if (mo18481a != C6621t1.f14623a) {
            if (C6621t1.m19189b(mo18481a) != 2) {
                return interfaceC6579f1.mo18468D();
            }
            Object mo18997b = abstractC6607p.mo18997b(c6604o, this.f14652a, C6621t1.m19188a(mo18481a));
            if (mo18997b == null) {
                return abstractC6603n1.m18965m(ub2, interfaceC6579f1);
            }
            abstractC6607p.mo19003h(interfaceC6579f1, mo18997b, c6604o, c6619t);
            return true;
        }
        Object obj = null;
        int i10 = 0;
        AbstractC6580g abstractC6580g = null;
        while (interfaceC6579f1.mo18465A() != Integer.MAX_VALUE) {
            int mo18481a2 = interfaceC6579f1.mo18481a();
            if (mo18481a2 == C6621t1.f14625c) {
                i10 = interfaceC6579f1.mo18488h();
                obj = abstractC6607p.mo18997b(c6604o, this.f14652a, i10);
            } else if (mo18481a2 == C6621t1.f14626d) {
                if (obj != null) {
                    abstractC6607p.mo19003h(interfaceC6579f1, obj, c6604o, c6619t);
                } else {
                    abstractC6580g = interfaceC6579f1.mo18495o();
                }
            } else if (!interfaceC6579f1.mo18468D()) {
                break;
            }
        }
        if (interfaceC6579f1.mo18481a() != C6621t1.f14624b) {
            throw C6566b0.m18397b();
        }
        if (abstractC6580g != null) {
            if (obj != null) {
                abstractC6607p.mo19004i(abstractC6580g, obj, c6604o, c6619t);
            } else {
                abstractC6603n1.mo18956d(ub2, i10, abstractC6580g);
            }
        }
        return true;
    }

    /* renamed from: n */
    private <UT, UB> void m19279n(AbstractC6603n1<UT, UB> abstractC6603n1, T t10, InterfaceC6624u1 interfaceC6624u1) {
        abstractC6603n1.mo18971s(abstractC6603n1.mo18959g(t10), interfaceC6624u1);
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: a */
    public void mo18540a(T t10, T t11) {
        C6588i1.m18654G(this.f14653b, t10, t11);
        if (this.f14654c) {
            C6588i1.m18652E(this.f14655d, t10, t11);
        }
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: b */
    public void mo18541b(T t10) {
        this.f14653b.mo18962j(t10);
        this.f14655d.mo19001f(t10);
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: c */
    public final boolean mo18542c(T t10) {
        return this.f14655d.mo18998c(t10).m19171p();
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: d */
    public int mo18543d(T t10) {
        int m19275j = m19275j(this.f14653b, t10) + 0;
        return this.f14654c ? m19275j + this.f14655d.mo18998c(t10).m19167j() : m19275j;
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: e */
    public T mo18544e() {
        InterfaceC6614r0 interfaceC6614r0 = this.f14652a;
        return interfaceC6614r0 instanceof AbstractC6629x ? (T) ((AbstractC6629x) interfaceC6614r0).m19305U() : (T) interfaceC6614r0.mo19034d().mo19038f();
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: f */
    public int mo18545f(T t10) {
        int hashCode = this.f14653b.mo18959g(t10).hashCode();
        return this.f14654c ? (hashCode * 53) + this.f14655d.mo18998c(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: g */
    public boolean mo18546g(T t10, T t11) {
        if (!this.f14653b.mo18959g(t10).equals(this.f14653b.mo18959g(t11))) {
            return false;
        }
        if (this.f14654c) {
            return this.f14655d.mo18998c(t10).equals(this.f14655d.mo18998c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: h */
    public void mo18547h(T t10, InterfaceC6624u1 interfaceC6624u1) {
        Iterator<Map.Entry<?, Object>> m19172t = this.f14655d.mo18998c(t10).m19172t();
        while (m19172t.hasNext()) {
            Map.Entry<?, Object> next = m19172t.next();
            C6619t.b bVar = (C6619t.b) next.getKey();
            if (bVar.mo19179e() != C6621t1.c.MESSAGE || bVar.mo19177c() || bVar.mo19180f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC6624u1.mo18880b(bVar.mo19176a(), next instanceof C6572d0.b ? ((C6572d0.b) next).m18424a().m18448e() : next.getValue());
        }
        m19279n(this.f14653b, t10, interfaceC6624u1);
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: i */
    public void mo18548i(T t10, InterfaceC6579f1 interfaceC6579f1, C6604o c6604o) {
        m19276k(this.f14653b, this.f14655d, t10, interfaceC6579f1, c6604o);
    }
}
