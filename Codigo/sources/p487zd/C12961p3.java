package p487zd;

import dj.AbstractC6993r;
import p029bk.InterfaceC1806a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.p3 */
/* loaded from: classes.dex */
public final class C12961p3 implements InterfaceC10693b<C12956o3> {

    /* renamed from: a */
    private final InterfaceC1806a<AbstractC6993r> f35255a;

    /* renamed from: b */
    private final InterfaceC1806a<AbstractC6993r> f35256b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC6993r> f35257c;

    public C12961p3(InterfaceC1806a<AbstractC6993r> interfaceC1806a, InterfaceC1806a<AbstractC6993r> interfaceC1806a2, InterfaceC1806a<AbstractC6993r> interfaceC1806a3) {
        this.f35255a = interfaceC1806a;
        this.f35256b = interfaceC1806a2;
        this.f35257c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C12961p3 m42883a(InterfaceC1806a<AbstractC6993r> interfaceC1806a, InterfaceC1806a<AbstractC6993r> interfaceC1806a2, InterfaceC1806a<AbstractC6993r> interfaceC1806a3) {
        return new C12961p3(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C12956o3 m42884c(AbstractC6993r abstractC6993r, AbstractC6993r abstractC6993r2, AbstractC6993r abstractC6993r3) {
        return new C12956o3(abstractC6993r, abstractC6993r2, abstractC6993r3);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12956o3 get() {
        return m42884c(this.f35255a.get(), this.f35256b.get(), this.f35257c.get());
    }
}
