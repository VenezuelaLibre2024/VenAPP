package xd;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class m implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31203a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<DisplayMetrics> f31204b;

    public m(g gVar, bk.a<DisplayMetrics> aVar) {
        this.f31203a = gVar;
        this.f31204b = aVar;
    }

    public static m a(g gVar, bk.a<DisplayMetrics> aVar) {
        return new m(gVar, aVar);
    }

    public static ud.l c(g gVar, DisplayMetrics displayMetrics) {
        return (ud.l) td.d.d(gVar.g(displayMetrics));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31203a, this.f31204b.get());
    }
}
