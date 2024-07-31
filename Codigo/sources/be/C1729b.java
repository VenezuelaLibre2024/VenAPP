package be;

import p029bk.InterfaceC1806a;
import p165ij.AbstractC8003a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;
import p487zd.C12892c;

/* renamed from: be.b */
/* loaded from: classes.dex */
public final class C1729b implements InterfaceC10693b<AbstractC8003a<String>> {

    /* renamed from: a */
    private final C1727a f7345a;

    /* renamed from: b */
    private final InterfaceC1806a<C12892c> f7346b;

    public C1729b(C1727a c1727a, InterfaceC1806a<C12892c> interfaceC1806a) {
        this.f7345a = c1727a;
        this.f7346b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C1729b m9358a(C1727a c1727a, InterfaceC1806a<C12892c> interfaceC1806a) {
        return new C1729b(c1727a, interfaceC1806a);
    }

    /* renamed from: c */
    public static AbstractC8003a<String> m9359c(C1727a c1727a, C12892c c12892c) {
        return (AbstractC8003a) C10695d.m32564e(c1727a.m9353a(c12892c));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC8003a<String> get() {
        return m9359c(this.f7345a, this.f7346b.get());
    }
}
