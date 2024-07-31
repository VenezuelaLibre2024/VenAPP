package be;

import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.y */
/* loaded from: classes.dex */
public final class C1774y implements InterfaceC10693b<String> {

    /* renamed from: a */
    private final C1771w f7408a;

    public C1774y(C1771w c1771w) {
        this.f7408a = c1771w;
    }

    /* renamed from: a */
    public static C1774y m9481a(C1771w c1771w) {
        return new C1774y(c1771w);
    }

    /* renamed from: c */
    public static String m9482c(C1771w c1771w) {
        return (String) C10695d.m32564e(c1771w.m9474b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m9482c(this.f7408a);
    }
}
