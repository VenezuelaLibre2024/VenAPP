package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n1 */
/* loaded from: classes.dex */
abstract class AbstractC1187n1<T, B> {
    /* renamed from: a */
    abstract void mo6229a(B b10, int i10, int i11);

    /* renamed from: b */
    abstract void mo6230b(B b10, int i10, long j10);

    /* renamed from: c */
    abstract void mo6231c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo6232d(B b10, int i10, AbstractC1167h abstractC1167h);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo6233e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo6234f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo6235g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo6236h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo6237i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo6238j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo6239k(T t10, T t11);

    /* renamed from: l */
    final void m6240l(B b10, InterfaceC1163f1 interfaceC1163f1) {
        while (interfaceC1163f1.mo5714A() != Integer.MAX_VALUE && m6241m(b10, interfaceC1163f1)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m6241m(B b10, InterfaceC1163f1 interfaceC1163f1) {
        int mo5730a = interfaceC1163f1.mo5730a();
        int m6426a = C1205t1.m6426a(mo5730a);
        int m6427b = C1205t1.m6427b(mo5730a);
        if (m6427b == 0) {
            mo6233e(b10, m6426a, interfaceC1163f1.mo5721H());
            return true;
        }
        if (m6427b == 1) {
            mo6230b(b10, m6426a, interfaceC1163f1.mo5732b());
            return true;
        }
        if (m6427b == 2) {
            mo6232d(b10, m6426a, interfaceC1163f1.mo5747o());
            return true;
        }
        if (m6427b != 3) {
            if (m6427b == 4) {
                return false;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            mo6229a(b10, m6426a, interfaceC1163f1.mo5753u());
            return true;
        }
        B mo6242n = mo6242n();
        int m6428c = C1205t1.m6428c(m6426a, 4);
        m6240l(mo6242n, interfaceC1163f1);
        if (m6428c != interfaceC1163f1.mo5730a()) {
            throw C1150b0.m5664a();
        }
        mo6231c(b10, m6426a, mo6246r(mo6242n));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo6242n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo6243o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo6244p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo6245q(InterfaceC1163f1 interfaceC1163f1);

    /* renamed from: r */
    abstract T mo6246r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo6247s(T t10, InterfaceC1208u1 interfaceC1208u1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo6248t(T t10, InterfaceC1208u1 interfaceC1208u1);
}
