package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class i implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31195a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31196b;

    public i(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31195a = gVar;
        this.f31196b = aVar;
    }

    public static i a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new i(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.c(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31195a, this.f31196b.get());
    }
}
