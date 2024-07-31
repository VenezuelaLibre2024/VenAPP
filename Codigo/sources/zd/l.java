package zd;

import android.app.Application;

/* loaded from: classes.dex */
public final class l implements rd.b<k> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<u2> f32664a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f32665b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<ce.a> f32666c;

    public l(bk.a<u2> aVar, bk.a<Application> aVar2, bk.a<ce.a> aVar3) {
        this.f32664a = aVar;
        this.f32665b = aVar2;
        this.f32666c = aVar3;
    }

    public static l a(bk.a<u2> aVar, bk.a<Application> aVar2, bk.a<ce.a> aVar3) {
        return new l(aVar, aVar2, aVar3);
    }

    public static k c(u2 u2Var, Application application, ce.a aVar) {
        return new k(u2Var, application, aVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f32664a.get(), this.f32665b.get(), this.f32666c.get());
    }
}
