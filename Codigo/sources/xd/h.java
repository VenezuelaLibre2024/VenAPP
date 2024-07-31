package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class h implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31193a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31194b;

    public h(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31193a = gVar;
        this.f31194b = aVar;
    }

    public static h a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new h(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.b(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31193a, this.f31194b.get());
    }
}
