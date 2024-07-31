package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1156d0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.C1206u;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.v0 */
/* loaded from: classes.dex */
final class C1210v0<T> implements InterfaceC1166g1<T> {

    /* renamed from: a */
    private final InterfaceC1198r0 f5021a;

    /* renamed from: b */
    private final AbstractC1187n1<?, ?> f5022b;

    /* renamed from: c */
    private final boolean f5023c;

    /* renamed from: d */
    private final AbstractC1194q<?> f5024d;

    private C1210v0(AbstractC1187n1<?, ?> abstractC1187n1, AbstractC1194q<?> abstractC1194q, InterfaceC1198r0 interfaceC1198r0) {
        this.f5022b = abstractC1187n1;
        this.f5023c = abstractC1194q.mo6295e(interfaceC1198r0);
        this.f5024d = abstractC1194q;
        this.f5021a = interfaceC1198r0;
    }

    /* renamed from: j */
    private <UT, UB> int m6523j(AbstractC1187n1<UT, UB> abstractC1187n1, T t10) {
        return abstractC1187n1.mo6237i(abstractC1187n1.mo6235g(t10));
    }

    /* renamed from: k */
    private <UT, UB, ET extends C1206u.b<ET>> void m6524k(AbstractC1187n1<UT, UB> abstractC1187n1, AbstractC1194q<ET> abstractC1194q, T t10, InterfaceC1163f1 interfaceC1163f1, C1191p c1191p) {
        UB mo6234f = abstractC1187n1.mo6234f(t10);
        C1206u<ET> mo6294d = abstractC1194q.mo6294d(t10);
        do {
            try {
                if (interfaceC1163f1.mo5714A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC1187n1.mo6243o(t10, mo6234f);
            }
        } while (m6526m(interfaceC1163f1, c1191p, abstractC1194q, mo6294d, abstractC1187n1, mo6234f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static <T> C1210v0<T> m6525l(AbstractC1187n1<?, ?> abstractC1187n1, AbstractC1194q<?> abstractC1194q, InterfaceC1198r0 interfaceC1198r0) {
        return new C1210v0<>(abstractC1187n1, abstractC1194q, interfaceC1198r0);
    }

    /* renamed from: m */
    private <UT, UB, ET extends C1206u.b<ET>> boolean m6526m(InterfaceC1163f1 interfaceC1163f1, C1191p c1191p, AbstractC1194q<ET> abstractC1194q, C1206u<ET> c1206u, AbstractC1187n1<UT, UB> abstractC1187n1, UB ub2) {
        int mo5730a = interfaceC1163f1.mo5730a();
        if (mo5730a != C1205t1.f4989a) {
            if (C1205t1.m6427b(mo5730a) != 2) {
                return interfaceC1163f1.mo5717D();
            }
            Object mo6292b = abstractC1194q.mo6292b(c1191p, this.f5021a, C1205t1.m6426a(mo5730a));
            if (mo6292b == null) {
                return abstractC1187n1.m6241m(ub2, interfaceC1163f1);
            }
            abstractC1194q.mo6298h(interfaceC1163f1, mo6292b, c1191p, c1206u);
            return true;
        }
        Object obj = null;
        int i10 = 0;
        AbstractC1167h abstractC1167h = null;
        while (interfaceC1163f1.mo5714A() != Integer.MAX_VALUE) {
            int mo5730a2 = interfaceC1163f1.mo5730a();
            if (mo5730a2 == C1205t1.f4991c) {
                i10 = interfaceC1163f1.mo5740h();
                obj = abstractC1194q.mo6292b(c1191p, this.f5021a, i10);
            } else if (mo5730a2 == C1205t1.f4992d) {
                if (obj != null) {
                    abstractC1194q.mo6298h(interfaceC1163f1, obj, c1191p, c1206u);
                } else {
                    abstractC1167h = interfaceC1163f1.mo5747o();
                }
            } else if (!interfaceC1163f1.mo5717D()) {
                break;
            }
        }
        if (interfaceC1163f1.mo5730a() != C1205t1.f4990b) {
            throw C1150b0.m5664a();
        }
        if (abstractC1167h != null) {
            if (obj != null) {
                abstractC1194q.mo6299i(abstractC1167h, obj, c1191p, c1206u);
            } else {
                abstractC1187n1.mo6232d(ub2, i10, abstractC1167h);
            }
        }
        return true;
    }

    /* renamed from: n */
    private <UT, UB> void m6527n(AbstractC1187n1<UT, UB> abstractC1187n1, T t10, InterfaceC1208u1 interfaceC1208u1) {
        abstractC1187n1.mo6247s(abstractC1187n1.mo6235g(t10), interfaceC1208u1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: a */
    public void mo5792a(T t10, T t11) {
        C1172i1.m5923G(this.f5022b, t10, t11);
        if (this.f5023c) {
            C1172i1.m5921E(this.f5024d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: b */
    public void mo5793b(T t10) {
        this.f5022b.mo6238j(t10);
        this.f5024d.mo6296f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: c */
    public final boolean mo5794c(T t10) {
        return this.f5024d.mo6293c(t10).m6453p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: d */
    public int mo5795d(T t10) {
        int m6523j = m6523j(this.f5022b, t10) + 0;
        return this.f5023c ? m6523j + this.f5024d.mo6293c(t10).m6449j() : m6523j;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: e */
    public T mo5796e() {
        return (T) this.f5021a.mo6310d().mo6313f();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: f */
    public int mo5797f(T t10) {
        int hashCode = this.f5022b.mo6235g(t10).hashCode();
        return this.f5023c ? (hashCode * 53) + this.f5024d.mo6293c(t10).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: g */
    public boolean mo5798g(T t10, T t11) {
        if (!this.f5022b.mo6235g(t10).equals(this.f5022b.mo6235g(t11))) {
            return false;
        }
        if (this.f5023c) {
            return this.f5024d.mo6293c(t10).equals(this.f5024d.mo6293c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: h */
    public void mo5799h(T t10, InterfaceC1163f1 interfaceC1163f1, C1191p c1191p) {
        m6524k(this.f5022b, this.f5024d, t10, interfaceC1163f1, c1191p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1166g1
    /* renamed from: i */
    public void mo5800i(T t10, InterfaceC1208u1 interfaceC1208u1) {
        Iterator<Map.Entry<?, Object>> m6454s = this.f5024d.mo6293c(t10).m6454s();
        while (m6454s.hasNext()) {
            Map.Entry<?, Object> next = m6454s.next();
            C1206u.b bVar = (C1206u.b) next.getKey();
            if (bVar.mo6461e() != C1205t1.c.MESSAGE || bVar.mo6459c() || bVar.mo6462f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC1208u1.mo6166b(bVar.mo6458a(), next instanceof C1156d0.b ? ((C1156d0.b) next).m5686a().m5763e() : next.getValue());
        }
        m6527n(this.f5022b, t10, interfaceC1208u1);
    }
}
