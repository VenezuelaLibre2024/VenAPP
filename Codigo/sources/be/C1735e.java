package be;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12897d;
import p487zd.C12938l0;
import p487zd.C12987v2;

/* renamed from: be.e */
/* loaded from: classes.dex */
public final class C1735e implements InterfaceC10693b<C12897d> {

    /* renamed from: a */
    private final C1733d f7357a;

    /* renamed from: b */
    private final InterfaceC1806a<C12938l0> f7358b;

    /* renamed from: c */
    private final InterfaceC1806a<Application> f7359c;

    /* renamed from: d */
    private final InterfaceC1806a<C12987v2> f7360d;

    public C1735e(C1733d c1733d, InterfaceC1806a<C12938l0> interfaceC1806a, InterfaceC1806a<Application> interfaceC1806a2, InterfaceC1806a<C12987v2> interfaceC1806a3) {
        this.f7357a = c1733d;
        this.f7358b = interfaceC1806a;
        this.f7359c = interfaceC1806a2;
        this.f7360d = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C1735e m9375a(C1733d c1733d, InterfaceC1806a<C12938l0> interfaceC1806a, InterfaceC1806a<Application> interfaceC1806a2, InterfaceC1806a<C12987v2> interfaceC1806a3) {
        return new C1735e(c1733d, interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C12897d m9376c(C1733d c1733d, InterfaceC1806a<C12938l0> interfaceC1806a, Application application, C12987v2 c12987v2) {
        return (C12897d) C10695d.m32564e(c1733d.m9368a(interfaceC1806a, application, c12987v2));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12897d get() {
        return m9376c(this.f7357a, this.f7358b, this.f7359c.get(), this.f7360d.get());
    }
}
