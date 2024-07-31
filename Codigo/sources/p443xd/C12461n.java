package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.n */
/* loaded from: classes.dex */
public final class C12461n implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33725a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33726b;

    public C12461n(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33725a = c12454g;
        this.f33726b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12461n m40467a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12461n(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40468c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40446h(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40468c(this.f33725a, this.f33726b.get());
    }
}
