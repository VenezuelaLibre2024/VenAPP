package be;

import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12970r2;

/* renamed from: be.g0 */
/* loaded from: classes.dex */
public final class C1740g0 implements InterfaceC10693b<C12970r2> {

    /* renamed from: a */
    private final C1736e0 f7367a;

    public C1740g0(C1736e0 c1736e0) {
        this.f7367a = c1736e0;
    }

    /* renamed from: a */
    public static C1740g0 m9393a(C1736e0 c1736e0) {
        return new C1740g0(c1736e0);
    }

    /* renamed from: c */
    public static C12970r2 m9394c(C1736e0 c1736e0) {
        return (C12970r2) C10695d.m32564e(c1736e0.m9383f());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12970r2 get() {
        return m9394c(this.f7367a);
    }
}
