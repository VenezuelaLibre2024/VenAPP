package p443xd;

import android.app.Application;
import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import td.C11246d;

/* renamed from: xd.l */
/* loaded from: classes.dex */
public final class C12459l implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33721a;

    /* renamed from: b */
    private final InterfaceC1806a<Application> f33722b;

    public C12459l(C12454g c12454g, InterfaceC1806a<Application> interfaceC1806a) {
        this.f33721a = c12454g;
        this.f33722b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12459l m40461a(C12454g c12454g, InterfaceC1806a<Application> interfaceC1806a) {
        return new C12459l(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static DisplayMetrics m40462c(C12454g c12454g, Application application) {
        return (DisplayMetrics) C11246d.m35132d(c12454g.m40444f(application));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DisplayMetrics get() {
        return m40462c(this.f33721a, this.f33722b.get());
    }
}
