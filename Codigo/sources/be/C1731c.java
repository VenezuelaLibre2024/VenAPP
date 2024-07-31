package be;

import cc.InterfaceC1940a;
import p029bk.InterfaceC1806a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12892c;

/* renamed from: be.c */
/* loaded from: classes.dex */
public final class C1731c implements InterfaceC10693b<C12892c> {

    /* renamed from: a */
    private final C1727a f7350a;

    /* renamed from: b */
    private final InterfaceC1806a<InterfaceC1940a> f7351b;

    public C1731c(C1727a c1727a, InterfaceC1806a<InterfaceC1940a> interfaceC1806a) {
        this.f7350a = c1727a;
        this.f7351b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1731c m9364a(C1727a c1727a, InterfaceC1806a<InterfaceC1940a> interfaceC1806a) {
        return new C1731c(c1727a, interfaceC1806a);
    }

    /* renamed from: c */
    public static C12892c m9365c(C1727a c1727a, InterfaceC1940a interfaceC1940a) {
        return (C12892c) C10695d.m32564e(c1727a.m9354b(interfaceC1940a));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12892c get() {
        return m9365c(this.f7350a, this.f7351b.get());
    }
}
