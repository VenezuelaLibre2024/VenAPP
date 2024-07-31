package p487zd;

import de.AbstractC6900m;
import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.u */
/* loaded from: classes.dex */
public final class C12980u implements InterfaceC10693b<C12976t> {

    /* renamed from: a */
    private final InterfaceC1806a<C12989w0> f35302a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC1956a> f35303b;

    /* renamed from: c */
    private final InterfaceC1806a<C12956o3> f35304c;

    /* renamed from: d */
    private final InterfaceC1806a<C12946m3> f35305d;

    /* renamed from: e */
    private final InterfaceC1806a<C12932k> f35306e;

    /* renamed from: f */
    private final InterfaceC1806a<AbstractC6900m> f35307f;

    /* renamed from: g */
    private final InterfaceC1806a<C12965q2> f35308g;

    /* renamed from: h */
    private final InterfaceC1806a<C12947n> f35309h;

    public C12980u(InterfaceC1806a<C12989w0> interfaceC1806a, InterfaceC1806a<InterfaceC1956a> interfaceC1806a2, InterfaceC1806a<C12956o3> interfaceC1806a3, InterfaceC1806a<C12946m3> interfaceC1806a4, InterfaceC1806a<C12932k> interfaceC1806a5, InterfaceC1806a<AbstractC6900m> interfaceC1806a6, InterfaceC1806a<C12965q2> interfaceC1806a7, InterfaceC1806a<C12947n> interfaceC1806a8) {
        this.f35302a = interfaceC1806a;
        this.f35303b = interfaceC1806a2;
        this.f35304c = interfaceC1806a3;
        this.f35305d = interfaceC1806a4;
        this.f35306e = interfaceC1806a5;
        this.f35307f = interfaceC1806a6;
        this.f35308g = interfaceC1806a7;
        this.f35309h = interfaceC1806a8;
    }

    /* renamed from: a */
    public static C12980u m42943a(InterfaceC1806a<C12989w0> interfaceC1806a, InterfaceC1806a<InterfaceC1956a> interfaceC1806a2, InterfaceC1806a<C12956o3> interfaceC1806a3, InterfaceC1806a<C12946m3> interfaceC1806a4, InterfaceC1806a<C12932k> interfaceC1806a5, InterfaceC1806a<AbstractC6900m> interfaceC1806a6, InterfaceC1806a<C12965q2> interfaceC1806a7, InterfaceC1806a<C12947n> interfaceC1806a8) {
        return new C12980u(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5, interfaceC1806a6, interfaceC1806a7, interfaceC1806a8);
    }

    /* renamed from: c */
    public static C12976t m42944c(C12989w0 c12989w0, InterfaceC1956a interfaceC1956a, C12956o3 c12956o3, C12946m3 c12946m3, C12932k c12932k, AbstractC6900m abstractC6900m, C12965q2 c12965q2, C12947n c12947n) {
        return new C12976t(c12989w0, interfaceC1956a, c12956o3, c12946m3, c12932k, abstractC6900m, c12965q2, c12947n);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12976t get() {
        return m42944c(this.f35302a.get(), this.f35303b.get(), this.f35304c.get(), this.f35305d.get(), this.f35306e.get(), this.f35307f.get(), this.f35308g.get(), this.f35309h.get());
    }
}
