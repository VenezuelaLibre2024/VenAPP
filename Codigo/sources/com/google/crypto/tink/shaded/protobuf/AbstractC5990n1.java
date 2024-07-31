package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5990n1<T, B> {
    /* renamed from: a */
    abstract void mo15888a(B b10, int i10, int i11);

    /* renamed from: b */
    abstract void mo15889b(B b10, int i10, long j10);

    /* renamed from: c */
    abstract void mo15890c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo15891d(B b10, int i10, AbstractC5970h abstractC5970h);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo15892e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo15893f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo15894g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo15895h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo15896i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo15897j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo15898k(T t10, T t11);

    /* renamed from: l */
    final void m15899l(B b10, InterfaceC5966f1 interfaceC5966f1) {
        while (interfaceC5966f1.mo15427A() != Integer.MAX_VALUE && m15900m(b10, interfaceC5966f1)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m15900m(B b10, InterfaceC5966f1 interfaceC5966f1) {
        int mo15443a = interfaceC5966f1.mo15443a();
        int m16092a = C6008t1.m16092a(mo15443a);
        int m16093b = C6008t1.m16093b(mo15443a);
        if (m16093b == 0) {
            mo15892e(b10, m16092a, interfaceC5966f1.mo15434H());
            return true;
        }
        if (m16093b == 1) {
            mo15889b(b10, m16092a, interfaceC5966f1.mo15444b());
            return true;
        }
        if (m16093b == 2) {
            mo15891d(b10, m16092a, interfaceC5966f1.mo15457o());
            return true;
        }
        if (m16093b != 3) {
            if (m16093b == 4) {
                return false;
            }
            if (m16093b != 5) {
                throw C5953b0.m15326e();
            }
            mo15888a(b10, m16092a, interfaceC5966f1.mo15463u());
            return true;
        }
        B mo15901n = mo15901n();
        int m16094c = C6008t1.m16094c(m16092a, 4);
        m15899l(mo15901n, interfaceC5966f1);
        if (m16094c != interfaceC5966f1.mo15443a()) {
            throw C5953b0.m15323b();
        }
        mo15890c(b10, m16092a, mo15905r(mo15901n));
        return true;
    }

    /* renamed from: n */
    abstract B mo15901n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo15902o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo15903p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo15904q(InterfaceC5966f1 interfaceC5966f1);

    /* renamed from: r */
    abstract T mo15905r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo15906s(T t10, InterfaceC6011u1 interfaceC6011u1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo15907t(T t10, InterfaceC6011u1 interfaceC6011u1);
}
