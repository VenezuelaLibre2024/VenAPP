package be;

import p106fe.InterfaceC7337f;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.h */
/* loaded from: classes.dex */
public final class C1741h implements InterfaceC10693b<InterfaceC7337f> {

    /* renamed from: a */
    private final C1733d f7368a;

    public C1741h(C1733d c1733d) {
        this.f7368a = c1733d;
    }

    /* renamed from: a */
    public static C1741h m9396a(C1733d c1733d) {
        return new C1741h(c1733d);
    }

    /* renamed from: c */
    public static InterfaceC7337f m9397c(C1733d c1733d) {
        return (InterfaceC7337f) C10695d.m32564e(c1733d.m9371d());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7337f get() {
        return m9397c(this.f7368a);
    }
}
