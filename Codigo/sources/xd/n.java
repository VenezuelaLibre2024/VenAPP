package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class n implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31205a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31206b;

    public n(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31205a = gVar;
        this.f31206b = aVar;
    }

    public static n a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new n(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.h(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31205a, this.f31206b.get());
    }
}
