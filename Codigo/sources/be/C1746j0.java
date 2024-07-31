package be;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12983u2;

/* renamed from: be.j0 */
/* loaded from: classes.dex */
public final class C1746j0 implements InterfaceC10693b<C12983u2> {

    /* renamed from: a */
    private final C1742h0 f7374a;

    /* renamed from: b */
    private final InterfaceC1806a<Application> f7375b;

    public C1746j0(C1742h0 c1742h0, InterfaceC1806a<Application> interfaceC1806a) {
        this.f7374a = c1742h0;
        this.f7375b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1746j0 m9411a(C1742h0 c1742h0, InterfaceC1806a<Application> interfaceC1806a) {
        return new C1746j0(c1742h0, interfaceC1806a);
    }

    /* renamed from: c */
    public static C12983u2 m9412c(C1742h0 c1742h0, Application application) {
        return (C12983u2) C10695d.m32564e(c1742h0.m9400b(application));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12983u2 get() {
        return m9412c(this.f7374a, this.f7375b.get());
    }
}
