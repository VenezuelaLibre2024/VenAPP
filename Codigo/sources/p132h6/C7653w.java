package p132h6;

import p029bk.InterfaceC1806a;
import p174j6.InterfaceC8989b;
import p249n6.InterfaceC9667e;
import p266o6.C9810r;
import p266o6.C9814v;
import p327r6.InterfaceC10625a;

/* renamed from: h6.w */
/* loaded from: classes.dex */
public final class C7653w implements InterfaceC8989b<C7651u> {

    /* renamed from: a */
    private final InterfaceC1806a<InterfaceC10625a> f18102a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC10625a> f18103b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC9667e> f18104c;

    /* renamed from: d */
    private final InterfaceC1806a<C9810r> f18105d;

    /* renamed from: e */
    private final InterfaceC1806a<C9814v> f18106e;

    public C7653w(InterfaceC1806a<InterfaceC10625a> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<InterfaceC9667e> interfaceC1806a3, InterfaceC1806a<C9810r> interfaceC1806a4, InterfaceC1806a<C9814v> interfaceC1806a5) {
        this.f18102a = interfaceC1806a;
        this.f18103b = interfaceC1806a2;
        this.f18104c = interfaceC1806a3;
        this.f18105d = interfaceC1806a4;
        this.f18106e = interfaceC1806a5;
    }

    /* renamed from: a */
    public static C7653w m23238a(InterfaceC1806a<InterfaceC10625a> interfaceC1806a, InterfaceC1806a<InterfaceC10625a> interfaceC1806a2, InterfaceC1806a<InterfaceC9667e> interfaceC1806a3, InterfaceC1806a<C9810r> interfaceC1806a4, InterfaceC1806a<C9814v> interfaceC1806a5) {
        return new C7653w(interfaceC1806a, interfaceC1806a2, interfaceC1806a3, interfaceC1806a4, interfaceC1806a5);
    }

    /* renamed from: c */
    public static C7651u m23239c(InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, InterfaceC9667e interfaceC9667e, C9810r c9810r, C9814v c9814v) {
        return new C7651u(interfaceC10625a, interfaceC10625a2, interfaceC9667e, c9810r, c9814v);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7651u get() {
        return m23239c(this.f18102a.get(), this.f18103b.get(), this.f18104c.get(), this.f18105d.get(), this.f18106e.get());
    }
}
