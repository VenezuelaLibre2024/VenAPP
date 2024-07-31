package be;

import p254nd.InterfaceC9708d;
import p334rd.C10695d;
import p334rd.InterfaceC10693b;

/* renamed from: be.m */
/* loaded from: classes.dex */
public final class C1751m implements InterfaceC10693b<InterfaceC9708d> {

    /* renamed from: a */
    private final C1747k f7381a;

    public C1751m(C1747k c1747k) {
        this.f7381a = c1747k;
    }

    /* renamed from: a */
    public static C1751m m9423a(C1747k c1747k) {
        return new C1751m(c1747k);
    }

    /* renamed from: c */
    public static InterfaceC9708d m9424c(C1747k c1747k) {
        return (InterfaceC9708d) C10695d.m32564e(c1747k.m9415b());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9708d get() {
        return m9424c(this.f7381a);
    }
}
