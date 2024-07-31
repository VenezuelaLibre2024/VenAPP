package p487zd;

import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.n3 */
/* loaded from: classes.dex */
public final class C12951n3 implements InterfaceC10693b<C12946m3> {

    /* renamed from: a */
    private final InterfaceC1806a<C12983u2> f35234a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC1956a> f35235b;

    public C12951n3(InterfaceC1806a<C12983u2> interfaceC1806a, InterfaceC1806a<InterfaceC1956a> interfaceC1806a2) {
        this.f35234a = interfaceC1806a;
        this.f35235b = interfaceC1806a2;
    }

    /* renamed from: a */
    public static C12951n3 m42878a(InterfaceC1806a<C12983u2> interfaceC1806a, InterfaceC1806a<InterfaceC1956a> interfaceC1806a2) {
        return new C12951n3(interfaceC1806a, interfaceC1806a2);
    }

    /* renamed from: c */
    public static C12946m3 m42879c(C12983u2 c12983u2, InterfaceC1956a interfaceC1956a) {
        return new C12946m3(c12983u2, interfaceC1956a);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12946m3 get() {
        return m42879c(this.f35234a.get(), this.f35235b.get());
    }
}
