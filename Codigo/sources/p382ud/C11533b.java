package p382ud;

import android.app.Application;
import p029bk.InterfaceC1806a;

/* renamed from: ud.b */
/* loaded from: classes.dex */
public final class C11533b implements InterfaceC1806a {

    /* renamed from: a */
    private final InterfaceC1806a<Application> f29909a;

    public C11533b(InterfaceC1806a<Application> interfaceC1806a) {
        this.f29909a = interfaceC1806a;
    }

    /* renamed from: a */
    public static C11533b m36094a(InterfaceC1806a<Application> interfaceC1806a) {
        return new C11533b(interfaceC1806a);
    }

    /* renamed from: c */
    public static C11532a m36095c(Application application) {
        return new C11532a(application);
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11532a get() {
        return m36095c(this.f29909a.get());
    }
}
