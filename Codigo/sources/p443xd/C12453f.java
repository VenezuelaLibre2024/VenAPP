package p443xd;

import p029bk.InterfaceC1806a;
import p311qd.C10457q;
import td.C11246d;

/* renamed from: xd.f */
/* loaded from: classes.dex */
public final class C12453f implements InterfaceC1806a {

    /* renamed from: a */
    private final C12452e f33708a;

    public C12453f(C12452e c12452e) {
        this.f33708a = c12452e;
    }

    /* renamed from: a */
    public static C12453f m40436a(C12452e c12452e) {
        return new C12453f(c12452e);
    }

    /* renamed from: c */
    public static C10457q m40437c(C12452e c12452e) {
        return (C10457q) C11246d.m35132d(c12452e.m40435a());
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10457q get() {
        return m40437c(this.f33708a);
    }
}
