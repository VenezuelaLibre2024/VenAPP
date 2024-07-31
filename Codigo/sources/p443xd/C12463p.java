package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.p */
/* loaded from: classes.dex */
public final class C12463p implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33729a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33730b;

    public C12463p(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33729a = c12454g;
        this.f33730b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12463p m40473a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12463p(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40474c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40448j(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40474c(this.f33729a, this.f33730b.get());
    }
}
