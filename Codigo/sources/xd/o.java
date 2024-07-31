package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class o implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31207a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31208b;

    public o(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31207a = gVar;
        this.f31208b = aVar;
    }

    public static o a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new o(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.i(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31207a, this.f31208b.get());
    }
}
