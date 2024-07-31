package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class p implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31209a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31210b;

    public p(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31209a = gVar;
        this.f31210b = aVar;
    }

    public static p a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new p(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.j(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31209a, this.f31210b.get());
    }
}
