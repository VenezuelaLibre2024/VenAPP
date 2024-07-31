package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.j */
/* loaded from: classes.dex */
public final class C12457j implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33717a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33718b;

    public C12457j(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33717a = c12454g;
        this.f33718b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12457j m40455a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12457j(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40456c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40442d(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40456c(this.f33717a, this.f33718b.get());
    }
}
