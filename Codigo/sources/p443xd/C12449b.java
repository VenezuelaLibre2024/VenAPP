package p443xd;

import android.app.Application;
import p029bk.InterfaceC1806a;
import td.C11246d;

/* renamed from: xd.b */
/* loaded from: classes.dex */
public final class C12449b implements InterfaceC1806a {

    /* renamed from: a */
    private final C12448a f33703a;

    public C12449b(C12448a c12448a) {
        this.f33703a = c12448a;
    }

    /* renamed from: a */
    public static C12449b m40428a(C12448a c12448a) {
        return new C12449b(c12448a);
    }

    /* renamed from: c */
    public static Application m40429c(C12448a c12448a) {
        return (Application) C11246d.m35132d(c12448a.m40427a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return m40429c(this.f33703a);
    }
}
