package p487zd;

import p029bk.InterfaceC1806a;
import p334rd.InterfaceC10693b;
import pf.C10169g;

/* renamed from: zd.m0 */
/* loaded from: classes.dex */
public final class C12943m0 implements InterfaceC10693b<C12938l0> {

    /* renamed from: a */
    private final InterfaceC1806a<C10169g.b> f35222a;

    public C12943m0(InterfaceC1806a<C10169g.b> interfaceC1806a) {
        this.f35222a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12943m0 m42844a(InterfaceC1806a<C10169g.b> interfaceC1806a) {
        return new C12943m0(interfaceC1806a);
    }

    /* renamed from: c */
    public static C12938l0 m42845c(C10169g.b bVar) {
        return new C12938l0(bVar);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12938l0 get() {
        return m42845c(this.f35222a.get());
    }
}
