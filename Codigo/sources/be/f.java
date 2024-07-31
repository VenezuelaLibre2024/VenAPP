package be;

import zd.q3;

/* loaded from: classes.dex */
public final class f implements rd.b<zd.n> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6440a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<q3> f6441b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<nd.d> f6442c;

    public f(d dVar, bk.a<q3> aVar, bk.a<nd.d> aVar2) {
        this.f6440a = dVar;
        this.f6441b = aVar;
        this.f6442c = aVar2;
    }

    public static f a(d dVar, bk.a<q3> aVar, bk.a<nd.d> aVar2) {
        return new f(dVar, aVar, aVar2);
    }

    public static zd.n c(d dVar, q3 q3Var, nd.d dVar2) {
        return (zd.n) rd.d.e(dVar.b(q3Var, dVar2));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public zd.n get() {
        return c(this.f6440a, this.f6441b.get(), this.f6442c.get());
    }
}
