package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5980k0;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* loaded from: classes2.dex */
public final class C5976j implements InterfaceC5966f1 {

    /* renamed from: a */
    private final AbstractC5973i f12636a;

    /* renamed from: b */
    private int f12637b;

    /* renamed from: c */
    private int f12638c;

    /* renamed from: d */
    private int f12639d = 0;

    private C5976j(AbstractC5973i abstractC5973i) {
        AbstractC5973i abstractC5973i2 = (AbstractC5973i) C5950a0.m15303b(abstractC5973i, "input");
        this.f12636a = abstractC5973i2;
        abstractC5973i2.f12610d = this;
    }

    /* renamed from: Q */
    public static C5976j m15657Q(AbstractC5973i abstractC5973i) {
        C5976j c5976j = abstractC5973i.f12610d;
        return c5976j != null ? c5976j : new C5976j(abstractC5973i);
    }

    /* renamed from: R */
    private <T> void m15658R(T t10, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        int i10 = this.f12638c;
        this.f12638c = C6008t1.m16094c(C6008t1.m16092a(this.f12637b), 4);
        try {
            interfaceC5969g1.mo15478i(t10, this, c5994p);
            if (this.f12637b == this.f12638c) {
            } else {
                throw C5953b0.m15329h();
            }
        } finally {
            this.f12638c = i10;
        }
    }

    /* renamed from: S */
    private <T> void m15659S(T t10, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        int mo15531C = this.f12636a.mo15531C();
        AbstractC5973i abstractC5973i = this.f12636a;
        if (abstractC5973i.f12607a >= abstractC5973i.f12608b) {
            throw C5953b0.m15330i();
        }
        int mo15538l = abstractC5973i.mo15538l(mo15531C);
        this.f12636a.f12607a++;
        interfaceC5969g1.mo15478i(t10, this, c5994p);
        this.f12636a.mo15534a(0);
        r5.f12607a--;
        this.f12636a.mo15537k(mo15538l);
    }

    /* renamed from: T */
    private <T> T m15660T(InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        T mo15474e = interfaceC5969g1.mo15474e();
        m15658R(mo15474e, interfaceC5969g1, c5994p);
        interfaceC5969g1.mo15471b(mo15474e);
        return mo15474e;
    }

    /* renamed from: U */
    private <T> T m15661U(InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        T mo15474e = interfaceC5969g1.mo15474e();
        m15659S(mo15474e, interfaceC5969g1, c5994p);
        interfaceC5969g1.mo15471b(mo15474e);
        return mo15474e;
    }

    /* renamed from: W */
    private void m15662W(int i10) {
        if (this.f12636a.mo15535d() != i10) {
            throw C5953b0.m15332m();
        }
    }

    /* renamed from: X */
    private void m15663X(int i10) {
        if (C6008t1.m16093b(this.f12637b) != i10) {
            throw C5953b0.m15326e();
        }
    }

    /* renamed from: Y */
    private void m15664Y(int i10) {
        if ((i10 & 3) != 0) {
            throw C5953b0.m15329h();
        }
    }

    /* renamed from: Z */
    private void m15665Z(int i10) {
        if ((i10 & 7) != 0) {
            throw C5953b0.m15329h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: A */
    public int mo15427A() {
        int i10 = this.f12639d;
        if (i10 != 0) {
            this.f12637b = i10;
            this.f12639d = 0;
        } else {
            this.f12637b = this.f12636a.mo15530B();
        }
        int i11 = this.f12637b;
        return (i11 == 0 || i11 == this.f12638c) ? C5101a.e.API_PRIORITY_OTHER : C6008t1.m16092a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: B */
    public void mo15428B(List<String> list) {
        m15666V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: C */
    public void mo15429C(List<Float> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C6014w)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b == 2) {
                int mo15531C = this.f12636a.mo15531C();
                m15664Y(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Float.valueOf(this.f12636a.mo15545s()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            do {
                list.add(Float.valueOf(this.f12636a.mo15545s()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6014w c6014w = (C6014w) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 == 2) {
            int mo15531C2 = this.f12636a.mo15531C();
            m15664Y(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c6014w.m16210h(this.f12636a.mo15545s());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        if (m16093b2 != 5) {
            throw C5953b0.m15326e();
        }
        do {
            c6014w.m16210h(this.f12636a.mo15545s());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: D */
    public boolean mo15430D() {
        int i10;
        if (this.f12636a.mo15536e() || (i10 = this.f12637b) == this.f12638c) {
            return false;
        }
        return this.f12636a.mo15533E(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: E */
    public int mo15431E() {
        m15663X(5);
        return this.f12636a.mo15548v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: F */
    public void mo15432F(List<AbstractC5970h> list) {
        int mo15530B;
        if (C6008t1.m16093b(this.f12637b) != 2) {
            throw C5953b0.m15326e();
        }
        do {
            list.add(mo15457o());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B = this.f12636a.mo15530B();
            }
        } while (mo15530B == this.f12637b);
        this.f12639d = mo15530B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: G */
    public void mo15433G(List<Double> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C5985m)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 1) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                int mo15531C = this.f12636a.mo15531C();
                m15665Z(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Double.valueOf(this.f12636a.mo15541o()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            do {
                list.add(Double.valueOf(this.f12636a.mo15541o()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5985m c5985m = (C5985m) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 1) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            int mo15531C2 = this.f12636a.mo15531C();
            m15665Z(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c5985m.m15870h(this.f12636a.mo15541o());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        do {
            c5985m.m15870h(this.f12636a.mo15541o());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: H */
    public long mo15434H() {
        m15663X(0);
        return this.f12636a.mo15547u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: I */
    public String mo15435I() {
        m15663X(2);
        return this.f12636a.mo15529A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: J */
    public <T> void mo15436J(T t10, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        m15663X(3);
        m15658R(t10, interfaceC5969g1, c5994p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    @Deprecated
    /* renamed from: K */
    public <T> T mo15437K(Class<T> cls, C5994p c5994p) {
        m15663X(3);
        return (T) m15660T(C5957c1.m15338a().m15340c(cls), c5994p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: L */
    public <K, V> void mo15438L(Map<K, V> map, C5980k0.a<K, V> aVar, C5994p c5994p) {
        m15663X(2);
        this.f12636a.mo15538l(this.f12636a.mo15531C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: M */
    public <T> void mo15439M(T t10, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        m15663X(2);
        m15659S(t10, interfaceC5969g1, c5994p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: N */
    public <T> void mo15440N(List<T> list, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        int mo15530B;
        if (C6008t1.m16093b(this.f12637b) != 2) {
            throw C5953b0.m15326e();
        }
        int i10 = this.f12637b;
        do {
            list.add(m15661U(interfaceC5969g1, c5994p));
            if (this.f12636a.mo15536e() || this.f12639d != 0) {
                return;
            } else {
                mo15530B = this.f12636a.mo15530B();
            }
        } while (mo15530B == i10);
        this.f12639d = mo15530B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: O */
    public <T> T mo15441O(Class<T> cls, C5994p c5994p) {
        m15663X(2);
        return (T) m15661U(C5957c1.m15338a().m15340c(cls), c5994p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    @Deprecated
    /* renamed from: P */
    public <T> void mo15442P(List<T> list, InterfaceC5969g1<T> interfaceC5969g1, C5994p c5994p) {
        int mo15530B;
        if (C6008t1.m16093b(this.f12637b) != 3) {
            throw C5953b0.m15326e();
        }
        int i10 = this.f12637b;
        do {
            list.add(m15660T(interfaceC5969g1, c5994p));
            if (this.f12636a.mo15536e() || this.f12639d != 0) {
                return;
            } else {
                mo15530B = this.f12636a.mo15530B();
            }
        } while (mo15530B == i10);
        this.f12639d = mo15530B;
    }

    /* renamed from: V */
    public void m15666V(List<String> list, boolean z10) {
        int mo15530B;
        int mo15530B2;
        if (C6008t1.m16093b(this.f12637b) != 2) {
            throw C5953b0.m15326e();
        }
        if (!(list instanceof InterfaceC5968g0) || z10) {
            do {
                list.add(z10 ? mo15435I() : mo15468z());
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        InterfaceC5968g0 interfaceC5968g0 = (InterfaceC5968g0) list;
        do {
            interfaceC5968g0.mo15423j1(mo15457o());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: a */
    public int mo15443a() {
        return this.f12637b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: b */
    public long mo15444b() {
        m15663X(1);
        return this.f12636a.mo15544r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: c */
    public void mo15445c(List<Integer> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b == 2) {
                int mo15531C = this.f12636a.mo15531C();
                m15664Y(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15548v()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15548v()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 == 2) {
            int mo15531C2 = this.f12636a.mo15531C();
            m15664Y(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c6020z.m16278F0(this.f12636a.mo15548v());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        if (m16093b2 != 5) {
            throw C5953b0.m15326e();
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15548v());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: d */
    public void mo15446d(List<Long> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C5974i0)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Long.valueOf(this.f12636a.mo15551y()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Long.valueOf(this.f12636a.mo15551y()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5974i0 c5974i0 = (C5974i0) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c5974i0.m15593k(this.f12636a.mo15551y());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c5974i0.m15593k(this.f12636a.mo15551y());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: e */
    public boolean mo15447e() {
        m15663X(0);
        return this.f12636a.mo15539m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: f */
    public long mo15448f() {
        m15663X(1);
        return this.f12636a.mo15549w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: g */
    public void mo15449g(List<Long> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C5974i0)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Long.valueOf(this.f12636a.mo15532D()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Long.valueOf(this.f12636a.mo15532D()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5974i0 c5974i0 = (C5974i0) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c5974i0.m15593k(this.f12636a.mo15532D());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c5974i0.m15593k(this.f12636a.mo15532D());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: h */
    public int mo15450h() {
        m15663X(0);
        return this.f12636a.mo15531C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: i */
    public void mo15451i(List<Long> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C5974i0)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Long.valueOf(this.f12636a.mo15547u()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Long.valueOf(this.f12636a.mo15547u()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5974i0 c5974i0 = (C5974i0) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c5974i0.m15593k(this.f12636a.mo15547u());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c5974i0.m15593k(this.f12636a.mo15547u());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: j */
    public void mo15452j(List<Integer> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15542p()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15542p()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c6020z.m16278F0(this.f12636a.mo15542p());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15542p());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: k */
    public int mo15453k() {
        m15663X(0);
        return this.f12636a.mo15542p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: l */
    public int mo15454l() {
        m15663X(0);
        return this.f12636a.mo15550x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: m */
    public void mo15455m(List<Boolean> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C5964f)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Boolean.valueOf(this.f12636a.mo15539m()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Boolean.valueOf(this.f12636a.mo15539m()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5964f c5964f = (C5964f) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c5964f.m15410k(this.f12636a.mo15539m());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c5964f.m15410k(this.f12636a.mo15539m());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: n */
    public void mo15456n(List<String> list) {
        m15666V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: o */
    public AbstractC5970h mo15457o() {
        m15663X(2);
        return this.f12636a.mo15540n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: p */
    public int mo15458p() {
        m15663X(0);
        return this.f12636a.mo15546t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: q */
    public void mo15459q(List<Long> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C5974i0)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 1) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                int mo15531C = this.f12636a.mo15531C();
                m15665Z(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Long.valueOf(this.f12636a.mo15544r()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f12636a.mo15544r()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5974i0 c5974i0 = (C5974i0) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 1) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            int mo15531C2 = this.f12636a.mo15531C();
            m15665Z(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c5974i0.m15593k(this.f12636a.mo15544r());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        do {
            c5974i0.m15593k(this.f12636a.mo15544r());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: r */
    public void mo15460r(List<Integer> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15550x()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15550x()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c6020z.m16278F0(this.f12636a.mo15550x());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15550x());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    public double readDouble() {
        m15663X(1);
        return this.f12636a.mo15541o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    public float readFloat() {
        m15663X(5);
        return this.f12636a.mo15545s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: s */
    public long mo15461s() {
        m15663X(0);
        return this.f12636a.mo15532D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: t */
    public void mo15462t(List<Integer> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15531C()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15531C()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c6020z.m16278F0(this.f12636a.mo15531C());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15531C());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: u */
    public int mo15463u() {
        m15663X(5);
        return this.f12636a.mo15543q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: v */
    public void mo15464v(List<Long> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C5974i0)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 1) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                int mo15531C = this.f12636a.mo15531C();
                m15665Z(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Long.valueOf(this.f12636a.mo15549w()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f12636a.mo15549w()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C5974i0 c5974i0 = (C5974i0) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 1) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            int mo15531C2 = this.f12636a.mo15531C();
            m15665Z(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c5974i0.m15593k(this.f12636a.mo15549w());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        do {
            c5974i0.m15593k(this.f12636a.mo15549w());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: w */
    public void mo15465w(List<Integer> list) {
        int mo15530B;
        int mo15535d;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b != 0) {
                if (m16093b != 2) {
                    throw C5953b0.m15326e();
                }
                mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15546t()));
                } while (this.f12636a.mo15535d() < mo15535d);
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15546t()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 != 0) {
            if (m16093b2 != 2) {
                throw C5953b0.m15326e();
            }
            mo15535d = this.f12636a.mo15535d() + this.f12636a.mo15531C();
            do {
                c6020z.m16278F0(this.f12636a.mo15546t());
            } while (this.f12636a.mo15535d() < mo15535d);
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15546t());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
        return;
        m15662W(mo15535d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: x */
    public void mo15466x(List<Integer> list) {
        int mo15530B;
        int mo15530B2;
        if (!(list instanceof C6020z)) {
            int m16093b = C6008t1.m16093b(this.f12637b);
            if (m16093b == 2) {
                int mo15531C = this.f12636a.mo15531C();
                m15664Y(mo15531C);
                int mo15535d = this.f12636a.mo15535d() + mo15531C;
                do {
                    list.add(Integer.valueOf(this.f12636a.mo15543q()));
                } while (this.f12636a.mo15535d() < mo15535d);
                return;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            do {
                list.add(Integer.valueOf(this.f12636a.mo15543q()));
                if (this.f12636a.mo15536e()) {
                    return;
                } else {
                    mo15530B = this.f12636a.mo15530B();
                }
            } while (mo15530B == this.f12637b);
            this.f12639d = mo15530B;
            return;
        }
        C6020z c6020z = (C6020z) list;
        int m16093b2 = C6008t1.m16093b(this.f12637b);
        if (m16093b2 == 2) {
            int mo15531C2 = this.f12636a.mo15531C();
            m15664Y(mo15531C2);
            int mo15535d2 = this.f12636a.mo15535d() + mo15531C2;
            do {
                c6020z.m16278F0(this.f12636a.mo15543q());
            } while (this.f12636a.mo15535d() < mo15535d2);
            return;
        }
        if (m16093b2 != 5) {
            throw C5953b0.m15326e();
        }
        do {
            c6020z.m16278F0(this.f12636a.mo15543q());
            if (this.f12636a.mo15536e()) {
                return;
            } else {
                mo15530B2 = this.f12636a.mo15530B();
            }
        } while (mo15530B2 == this.f12637b);
        this.f12639d = mo15530B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: y */
    public long mo15467y() {
        m15663X(0);
        return this.f12636a.mo15551y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1
    /* renamed from: z */
    public String mo15468z() {
        m15663X(2);
        return this.f12636a.mo15552z();
    }
}
