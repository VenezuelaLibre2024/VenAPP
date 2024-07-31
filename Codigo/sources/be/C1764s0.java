package be;

import p043ce.InterfaceC1956a;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.s0 */
/* loaded from: classes.dex */
public final class C1764s0 implements InterfaceC10693b<InterfaceC1956a> {

    /* renamed from: a */
    private final C1762r0 f7394a;

    public C1764s0(C1762r0 c1762r0) {
        this.f7394a = c1762r0;
    }

    /* renamed from: a */
    public static C1764s0 m9457a(C1762r0 c1762r0) {
        return new C1764s0(c1762r0);
    }

    /* renamed from: c */
    public static InterfaceC1956a m9458c(C1762r0 c1762r0) {
        return (InterfaceC1956a) C10695d.m32564e(c1762r0.m9453a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1956a get() {
        return m9458c(this.f7394a);
    }
}
