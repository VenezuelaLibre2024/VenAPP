package be;

import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import vi.C11953w0;

/* renamed from: be.a0 */
/* loaded from: classes.dex */
public final class C1728a0 implements InterfaceC10693b<C11953w0> {

    /* renamed from: a */
    private final C1775z f7344a;

    public C1728a0(C1775z c1775z) {
        this.f7344a = c1775z;
    }

    /* renamed from: a */
    public static C1728a0 m9355a(C1775z c1775z) {
        return new C1728a0(c1775z);
    }

    /* renamed from: c */
    public static C11953w0 m9356c(C1775z c1775z) {
        return (C11953w0) C10695d.m32564e(c1775z.m9486b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11953w0 get() {
        return m9356c(this.f7344a);
    }
}
