package be;

import cc.InterfaceC1940a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.l */
/* loaded from: classes.dex */
public final class C1749l implements InterfaceC10693b<InterfaceC1940a> {

    /* renamed from: a */
    private final C1747k f7380a;

    public C1749l(C1747k c1747k) {
        this.f7380a = c1747k;
    }

    /* renamed from: a */
    public static C1749l m9419a(C1747k c1747k) {
        return new C1749l(c1747k);
    }

    /* renamed from: c */
    public static InterfaceC1940a m9420c(C1747k c1747k) {
        return (InterfaceC1940a) C10695d.m32564e(c1747k.m9414a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1940a get() {
        return m9420c(this.f7380a);
    }
}
