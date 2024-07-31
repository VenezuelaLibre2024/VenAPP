package p487zd;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p334rd.InterfaceC10693b;

/* renamed from: zd.w2 */
/* loaded from: classes.dex */
public final class C12991w2 implements InterfaceC10693b<C12987v2> {

    /* renamed from: a */
    private final InterfaceC1806a<Application> f35323a;

    public C12991w2(InterfaceC1806a<Application> interfaceC1806a) {
        this.f35323a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12991w2 m42971a(InterfaceC1806a<Application> interfaceC1806a) {
        return new C12991w2(interfaceC1806a);
    }

    /* renamed from: c */
    public static C12987v2 m42972c(Application application) {
        return new C12987v2(application);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12987v2 get() {
        return m42972c(this.f35323a.get());
    }
}
