package be;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p165ij.AbstractC8003a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.v */
/* loaded from: classes.dex */
public final class C1769v implements InterfaceC10693b<AbstractC8003a<String>> {

    /* renamed from: a */
    private final C1767u f7397a;

    /* renamed from: b */
    private final InterfaceC1806a<Application> f7398b;

    public C1769v(C1767u c1767u, InterfaceC1806a<Application> interfaceC1806a) {
        this.f7397a = c1767u;
        this.f7398b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1769v m9465a(C1767u c1767u, InterfaceC1806a<Application> interfaceC1806a) {
        return new C1769v(c1767u, interfaceC1806a);
    }

    /* renamed from: c */
    public static AbstractC8003a<String> m9466c(C1767u c1767u, Application application) {
        return (AbstractC8003a) C10695d.m32564e(c1767u.m9463a(application));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC8003a<String> get() {
        return m9466c(this.f7397a, this.f7398b.get());
    }
}
