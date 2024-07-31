package p487zd;

import p029bk.InterfaceC1806a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.x0 */
/* loaded from: classes.dex */
public final class C12993x0 implements InterfaceC10693b<C12989w0> {

    /* renamed from: a */
    private final InterfaceC1806a<C12983u2> f35325a;

    public C12993x0(InterfaceC1806a<C12983u2> interfaceC1806a) {
        this.f35325a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12993x0 m42974a(InterfaceC1806a<C12983u2> interfaceC1806a) {
        return new C12993x0(interfaceC1806a);
    }

    /* renamed from: c */
    public static C12989w0 m42975c(C12983u2 c12983u2) {
        return new C12989w0(c12983u2);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12989w0 get() {
        return m42975c(this.f35325a.get());
    }
}
