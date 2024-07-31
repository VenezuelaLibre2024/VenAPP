package be;

import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12966q3;

/* renamed from: be.i */
/* loaded from: classes.dex */
public final class C1743i implements InterfaceC10693b<C12966q3> {

    /* renamed from: a */
    private final C1733d f7369a;

    public C1743i(C1733d c1733d) {
        this.f7369a = c1733d;
    }

    /* renamed from: a */
    public static C1743i m9402a(C1733d c1733d) {
        return new C1743i(c1733d);
    }

    /* renamed from: c */
    public static C12966q3 m9403c(C1733d c1733d) {
        return (C12966q3) C10695d.m32564e(c1733d.m9372e());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12966q3 get() {
        return m9403c(this.f7369a);
    }
}
