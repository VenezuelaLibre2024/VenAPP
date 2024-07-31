package xd;

import android.app.Application;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class l implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f31201a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f31202b;

    public l(g gVar, bk.a<Application> aVar) {
        this.f31201a = gVar;
        this.f31202b = aVar;
    }

    public static l a(g gVar, bk.a<Application> aVar) {
        return new l(gVar, aVar);
    }

    public static DisplayMetrics c(g gVar, Application application) {
        return (DisplayMetrics) td.d.d(gVar.f(application));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DisplayMetrics get() {
        return c(this.f31201a, this.f31202b.get());
    }
}
