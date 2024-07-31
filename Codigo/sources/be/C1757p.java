package be;

import android.app.Application;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.p */
/* loaded from: classes.dex */
public final class C1757p implements InterfaceC10693b<Application> {

    /* renamed from: a */
    private final C1753n f7386a;

    public C1757p(C1753n c1753n) {
        this.f7386a = c1753n;
    }

    /* renamed from: a */
    public static C1757p m9438a(C1753n c1753n) {
        return new C1757p(c1753n);
    }

    /* renamed from: c */
    public static Application m9439c(C1753n c1753n) {
        return (Application) C10695d.m32564e(c1753n.m9428b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return m9439c(this.f7386a);
    }
}
