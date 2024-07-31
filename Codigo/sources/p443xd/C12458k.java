package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.k */
/* loaded from: classes.dex */
public final class C12458k implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33719a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33720b;

    public C12458k(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33719a = c12454g;
        this.f33720b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12458k m40458a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12458k(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40459c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40443e(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40459c(this.f33719a, this.f33720b.get());
    }
}
