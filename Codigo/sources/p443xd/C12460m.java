package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.m */
/* loaded from: classes.dex */
public final class C12460m implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33723a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33724b;

    public C12460m(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33723a = c12454g;
        this.f33724b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12460m m40464a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12460m(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40465c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40445g(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40465c(this.f33723a, this.f33724b.get());
    }
}
