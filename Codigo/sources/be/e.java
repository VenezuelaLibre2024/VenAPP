package be;

import android.app.Application;
import zd.v2;

/* loaded from: classes.dex */
public final class e implements rd.b<zd.d> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6435a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<zd.l0> f6436b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<Application> f6437c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<v2> f6438d;

    public e(d dVar, bk.a<zd.l0> aVar, bk.a<Application> aVar2, bk.a<v2> aVar3) {
        this.f6435a = dVar;
        this.f6436b = aVar;
        this.f6437c = aVar2;
        this.f6438d = aVar3;
    }

    public static e a(d dVar, bk.a<zd.l0> aVar, bk.a<Application> aVar2, bk.a<v2> aVar3) {
        return new e(dVar, aVar, aVar2, aVar3);
    }

    public static zd.d c(d dVar, bk.a<zd.l0> aVar, Application application, v2 v2Var) {
        return (zd.d) rd.d.e(dVar.a(aVar, application, v2Var));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public zd.d get() {
        return c(this.f6435a, this.f6436b, this.f6437c.get(), this.f6438d.get());
    }
}
