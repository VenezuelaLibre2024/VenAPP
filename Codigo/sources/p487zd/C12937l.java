package p487zd;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.l */
/* loaded from: classes.dex */
public final class C12937l implements InterfaceC10693b<C12932k> {

    /* renamed from: a */
    private final InterfaceC1806a<C12983u2> f35215a;

    /* renamed from: b */
    private final InterfaceC1806a<Application> f35216b;

    /* renamed from: c */
    private final InterfaceC1806a<InterfaceC1956a> f35217c;

    public C12937l(InterfaceC1806a<C12983u2> interfaceC1806a, InterfaceC1806a<Application> interfaceC1806a2, InterfaceC1806a<InterfaceC1956a> interfaceC1806a3) {
        this.f35215a = interfaceC1806a;
        this.f35216b = interfaceC1806a2;
        this.f35217c = interfaceC1806a3;
    }

    /* renamed from: a */
    public static C12937l m42836a(InterfaceC1806a<C12983u2> interfaceC1806a, InterfaceC1806a<Application> interfaceC1806a2, InterfaceC1806a<InterfaceC1956a> interfaceC1806a3) {
        return new C12937l(interfaceC1806a, interfaceC1806a2, interfaceC1806a3);
    }

    /* renamed from: c */
    public static C12932k m42837c(C12983u2 c12983u2, Application application, InterfaceC1956a interfaceC1956a) {
        return new C12932k(c12983u2, application, interfaceC1956a);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12932k get() {
        return m42837c(this.f35215a.get(), this.f35216b.get(), this.f35217c.get());
    }
}
