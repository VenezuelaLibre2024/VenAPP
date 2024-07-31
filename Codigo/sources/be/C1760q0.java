package be;

import dj.AbstractC6993r;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.q0 */
/* loaded from: classes.dex */
public final class C1760q0 implements InterfaceC10693b<AbstractC6993r> {

    /* renamed from: a */
    private final C1754n0 f7391a;

    public C1760q0(C1754n0 c1754n0) {
        this.f7391a = c1754n0;
    }

    /* renamed from: a */
    public static C1760q0 m9447a(C1754n0 c1754n0) {
        return new C1760q0(c1754n0);
    }

    /* renamed from: c */
    public static AbstractC6993r m9448c(C1754n0 c1754n0) {
        return (AbstractC6993r) C10695d.m32564e(c1754n0.m9431c());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC6993r get() {
        return m9448c(this.f7391a);
    }
}
