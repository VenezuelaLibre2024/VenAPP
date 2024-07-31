package p443xd;

import android.util.DisplayMetrics;
import p029bk.InterfaceC1806a;
import p382ud.C11543l;
import td.C11246d;

/* renamed from: xd.o */
/* loaded from: classes.dex */
public final class C12462o implements InterfaceC1806a {

    /* renamed from: a */
    private final C12454g f33727a;

    /* renamed from: b */
    private final InterfaceC1806a<DisplayMetrics> f33728b;

    public C12462o(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        this.f33727a = c12454g;
        this.f33728b = interfaceC1806a;
    }

    /* renamed from: a */
    public static C12462o m40470a(C12454g c12454g, InterfaceC1806a<DisplayMetrics> interfaceC1806a) {
        return new C12462o(c12454g, interfaceC1806a);
    }

    /* renamed from: c */
    public static C11543l m40471c(C12454g c12454g, DisplayMetrics displayMetrics) {
        return (C11543l) C11246d.m35132d(c12454g.m40447i(displayMetrics));
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11543l get() {
        return m40471c(this.f33727a, this.f33728b.get());
    }
}
