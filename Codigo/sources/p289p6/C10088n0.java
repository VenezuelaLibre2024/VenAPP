package p289p6;

import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;
import p327r6.InterfaceC10625a;

/* renamed from: p6.n0 */
/* loaded from: classes.dex */
public final class C10088n0 implements InterfaceC8989b<C10086m0> {

    /* renamed from: a */
    private final InterfaceC1806a<InterfaceC10625a> f24756a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC10625a> f24757b;

    /* renamed from: c */
    private final InterfaceC1806a<AbstractC10069e> f24758c;

    /* renamed from: d */
    private final InterfaceC1806a<C10100t0> f24759d;

    /* renamed from: e */
    private final InterfaceC1806a<String> f24760e;

    public C10088n0(InterfaceC1806a<InterfaceC10625a> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<AbstractC10069e> interfaceC1806a3, InterfaceC1806a<C10100t0> interfaceC1806a4, InterfaceC1806a<String> interfaceC1806a5) {
        this.f24756a = interfaceC1806a;
        this.f24757b = interfaceC1806a2;
        this.f24758c = interfaceC1806a3;
        this.f24759d = interfaceC1806a4;
        this.f24760e = interfaceC1806a5;
    }

    /* renamed from: a */
    public static C10088n0 m30127a(InterfaceC1806a<InterfaceC10625a> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<AbstractC10069e> interfaceC1806a3, InterfaceC1806a<C10100t0> interfaceC1806a4, InterfaceC1806a<String> interfaceC1806a5) {
        return new C10088n0(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5);
    }

    /* renamed from: c */
    public static C10086m0 m30128c(InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, Object obj, Object obj2, InterfaceC1806a<String> interfaceC1806a) {
        return new C10086m0(interfaceC10625a, interfaceC10625a2, (AbstractC10069e) obj, (C10100t0) obj2, interfaceC1806a);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10086m0 get() {
        return m30128c(this.f24756a.get(), this.f24757b.get(), this.f24758c.get(), this.f24759d.get(), this.f24760e);
    }
}
