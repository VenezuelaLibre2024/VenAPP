package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class j implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31197a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31198b;

    public j(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31197a = gVar;
        this.f31198b = aVar;
    }

    public static j a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new j(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.d(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31197a, this.f31198b.get());
    }
}
