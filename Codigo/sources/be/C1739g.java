package be;

import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p485zb.C12867g;

/* renamed from: be.g */
/* loaded from: classes.dex */
public final class C1739g implements InterfaceC10693b<C12867g> {

    /* renamed from: a */
    private final C1733d f7366a;

    public C1739g(C1733d c1733d) {
        this.f7366a = c1733d;
    }

    /* renamed from: a */
    public static C1739g m9390a(C1733d c1733d) {
        return new C1739g(c1733d);
    }

    /* renamed from: c */
    public static C12867g m9391c(C1733d c1733d) {
        return (C12867g) C10695d.m32564e(c1733d.m9370c());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12867g get() {
        return m9391c(this.f7366a);
    }
}
