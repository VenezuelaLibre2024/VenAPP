package be;

import p165ij.AbstractC8003a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.f0 */
/* loaded from: classes.dex */
public final class C1738f0 implements InterfaceC10693b<AbstractC8003a<String>> {

    /* renamed from: a */
    private final C1736e0 f7365a;

    public C1738f0(C1736e0 c1736e0) {
        this.f7365a = c1736e0;
    }

    /* renamed from: a */
    public static C1738f0 m9387a(C1736e0 c1736e0) {
        return new C1738f0(c1736e0);
    }

    /* renamed from: c */
    public static AbstractC8003a<String> m9388c(C1736e0 c1736e0) {
        return (AbstractC8003a) C10695d.m32564e(c1736e0.m9382e());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC8003a<String> get() {
        return m9388c(this.f7365a);
    }
}
