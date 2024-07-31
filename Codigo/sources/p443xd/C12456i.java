package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.i */
/* loaded from: classes.dex */
public final class C12456i implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33715a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33716b;

    public C12456i(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33715a = c12454g;
        this.f33716b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12456i m40452a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12456i(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40453c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40441c(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40453c(this.f33715a, this.f33716b.get());
    }
}
