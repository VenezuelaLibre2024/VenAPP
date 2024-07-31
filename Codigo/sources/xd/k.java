package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class k implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31199a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31200b;

    public k(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31199a = gVar;
        this.f31200b = aVar;
    }

    public static k a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new k(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.e(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31199a, this.f31200b.get());
    }
}
