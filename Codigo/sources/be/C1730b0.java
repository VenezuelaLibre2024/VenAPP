package be;

import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import pf.C10169g;
import vi.AbstractC11904d;
import vi.C11953w0;

/* renamed from: be.b0 */
/* loaded from: classes.dex */
public final class C1730b0 implements InterfaceC10693b<C10169g.b> {

    /* renamed from: a */
    private final C1775z f7347a;

    /* renamed from: b */
    private final InterfaceC1806a<AbstractC11904d> f7348b;

    /* renamed from: c */
    private final InterfaceC1806a<C11953w0> f7349c;

    public C1730b0(C1775z c1775z, InterfaceC1806a<AbstractC11904d> interfaceC1806a, InterfaceC1806a<C11953w0> interfaceC1806a2) {
        this.f7347a = c1775z;
        this.f7348b = interfaceC1806a;
        this.f7349c = interfaceC1806a2;
    }

    /* renamed from: a */
    public static C1730b0 m9361a(C1775z c1775z, InterfaceC1806a<AbstractC11904d> interfaceC1806a, InterfaceC1806a<C11953w0> interfaceC1806a2) {
        return new C1730b0(c1775z, interfaceC1806a, interfaceC1806a2);
    }

    /* renamed from: c */
    public static C10169g.b m9362c(C1775z c1775z, AbstractC11904d abstractC11904d, C11953w0 c11953w0) {
        return (C10169g.b) C10695d.m32564e(c1775z.m9487c(abstractC11904d, c11953w0));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10169g.b get() {
        return m9362c(this.f7347a, this.f7348b.get(), this.f7349c.get());
    }
}
