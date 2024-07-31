package be;

import zd.q3;
import zd.r3;

/* loaded from: classes.dex */
public final class j implements rd.b<r3> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6450a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<q3> f6451b;

    public j(d dVar, bk.a<q3> aVar) {
        this.f6450a = dVar;
        this.f6451b = aVar;
    }

    public static j a(d dVar, bk.a<q3> aVar) {
        return new j(dVar, aVar);
    }

    public static r3 c(d dVar, q3 q3Var) {
        return (r3) rd.d.e(dVar.f(q3Var));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r3 get() {
        return c(this.f6450a, this.f6451b.get());
    }
}
