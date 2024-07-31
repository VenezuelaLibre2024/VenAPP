package be;

import p029bk.InterfaceC1806a;
import p254nd.InterfaceC9708d;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12947n;
import p487zd.C12966q3;

/* renamed from: be.f */
/* loaded from: classes.dex */
public final class C1737f implements InterfaceC10693b<C12947n> {

    /* renamed from: a */
    private final C1733d f7362a;

    /* renamed from: b */
    private final InterfaceC1806a<C12966q3> f7363b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC9708d> f7364c;

    public C1737f(C1733d c1733d, InterfaceC1806a<C12966q3> interfaceC1806a, InterfaceC1806a<InterfaceC9708d> interfaceC1806a2) {
        this.f7362a = c1733d;
        this.f7363b = interfaceC1806a;
        this.f7364c = interfaceC1806a2;
    }

    /* renamed from: a */
    public static C1737f m9384a(C1733d c1733d, InterfaceC1806a<C12966q3> interfaceC1806a, InterfaceC1806a<InterfaceC9708d> interfaceC1806a2) {
        return new C1737f(c1733d, interfaceC1806a, interfaceC1806a2);
    }

    /* renamed from: c */
    public static C12947n m9385c(C1733d c1733d, C12966q3 c12966q3, InterfaceC9708d interfaceC9708d) {
        return (C12947n) C10695d.m32564e(c1733d.m9369b(c12966q3, interfaceC9708d));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12947n get() {
        return m9385c(this.f7362a, this.f7363b.get(), this.f7364c.get());
    }
}
