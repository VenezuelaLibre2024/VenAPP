package be;

import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12966q3;
import p487zd.C12971r3;

/* renamed from: be.j */
/* loaded from: classes.dex */
public final class C1745j implements InterfaceC10693b<C12971r3> {

    /* renamed from: a */
    private final C1733d f7372a;

    /* renamed from: b */
    private final InterfaceC1806a<C12966q3> f7373b;

    public C1745j(C1733d c1733d, InterfaceC1806a<C12966q3> interfaceC1806a) {
        this.f7372a = c1733d;
        this.f7373b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1745j m9408a(C1733d c1733d, InterfaceC1806a<C12966q3> interfaceC1806a) {
        return new C1745j(c1733d, interfaceC1806a);
    }

    /* renamed from: c */
    public static C12971r3 m9409c(C1733d c1733d, C12966q3 c12966q3) {
        return (C12971r3) C10695d.m32564e(c1733d.m9373f(c12966q3));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12971r3 get() {
        return m9409c(this.f7372a, this.f7373b.get());
    }
}
