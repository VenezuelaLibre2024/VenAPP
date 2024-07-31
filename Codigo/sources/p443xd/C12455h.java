package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.h */
/* loaded from: classes.dex */
public final class C12455h implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33713a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33714b;

    public C12455h(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33713a = c12454g;
        this.f33714b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12455h m40449a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12455h(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40450c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40440b(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40450c(this.f33713a, this.f33714b.get());
    }
}
