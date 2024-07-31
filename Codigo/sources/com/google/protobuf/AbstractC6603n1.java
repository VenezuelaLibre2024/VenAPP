package com.google.protobuf;

/* renamed from: com.google.protobuf.n1 */
/* loaded from: classes2.dex */
abstract class AbstractC6603n1<T, B> {
    /* renamed from: a */
    abstract void mo18953a(B b10, int i10, int i11);

    /* renamed from: b */
    abstract void mo18954b(B b10, int i10, long j10);

    /* renamed from: c */
    abstract void mo18955c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo18956d(B b10, int i10, AbstractC6580g abstractC6580g);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo18957e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo18958f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo18959g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo18960h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo18961i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo18962j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo18963k(T t10, T t11);

    /* renamed from: l */
    final void m18964l(B b10, InterfaceC6579f1 interfaceC6579f1) {
        while (interfaceC6579f1.mo18465A() != Integer.MAX_VALUE && m18965m(b10, interfaceC6579f1)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m18965m(B b10, InterfaceC6579f1 interfaceC6579f1) {
        int mo18481a = interfaceC6579f1.mo18481a();
        int m19188a = C6621t1.m19188a(mo18481a);
        int m19189b = C6621t1.m19189b(mo18481a);
        if (m19189b == 0) {
            mo18957e(b10, m19188a, interfaceC6579f1.mo18472H());
            return true;
        }
        if (m19189b == 1) {
            mo18954b(b10, m19188a, interfaceC6579f1.mo18482b());
            return true;
        }
        if (m19189b == 2) {
            mo18956d(b10, m19188a, interfaceC6579f1.mo18495o());
            return true;
        }
        if (m19189b != 3) {
            if (m19189b == 4) {
                return false;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            mo18953a(b10, m19188a, interfaceC6579f1.mo18501u());
            return true;
        }
        B mo18966n = mo18966n();
        int m19190c = C6621t1.m19190c(m19188a, 4);
        m18964l(mo18966n, interfaceC6579f1);
        if (m19190c != interfaceC6579f1.mo18481a()) {
            throw C6566b0.m18397b();
        }
        mo18955c(b10, m19188a, mo18970r(mo18966n));
        return true;
    }

    /* renamed from: n */
    abstract B mo18966n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo18967o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo18968p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo18969q(InterfaceC6579f1 interfaceC6579f1);

    /* renamed from: r */
    abstract T mo18970r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo18971s(T t10, InterfaceC6624u1 interfaceC6624u1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo18972t(T t10, InterfaceC6624u1 interfaceC6624u1);
}
