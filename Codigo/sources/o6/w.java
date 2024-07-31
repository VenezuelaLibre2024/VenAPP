package o6;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements j6.b<v> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Executor> f22305a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<p6.d> f22306b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<x> f22307c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<q6.b> f22308d;

    public w(bk.a<Executor> aVar, bk.a<p6.d> aVar2, bk.a<x> aVar3, bk.a<q6.b> aVar4) {
        this.f22305a = aVar;
        this.f22306b = aVar2;
        this.f22307c = aVar3;
        this.f22308d = aVar4;
    }

    public static w a(bk.a<Executor> aVar, bk.a<p6.d> aVar2, bk.a<x> aVar3, bk.a<q6.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, p6.d dVar, x xVar, q6.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f22305a.get(), this.f22306b.get(), this.f22307c.get(), this.f22308d.get());
    }
}
