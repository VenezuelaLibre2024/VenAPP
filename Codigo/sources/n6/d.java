package n6;

import java.util.concurrent.Executor;
import o6.x;

/* loaded from: classes.dex */
public final class d implements j6.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Executor> f21816a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<i6.e> f21817b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<x> f21818c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<p6.d> f21819d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<q6.b> f21820e;

    public d(bk.a<Executor> aVar, bk.a<i6.e> aVar2, bk.a<x> aVar3, bk.a<p6.d> aVar4, bk.a<q6.b> aVar5) {
        this.f21816a = aVar;
        this.f21817b = aVar2;
        this.f21818c = aVar3;
        this.f21819d = aVar4;
        this.f21820e = aVar5;
    }

    public static d a(bk.a<Executor> aVar, bk.a<i6.e> aVar2, bk.a<x> aVar3, bk.a<p6.d> aVar4, bk.a<q6.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, i6.e eVar, x xVar, p6.d dVar, q6.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f21816a.get(), this.f21817b.get(), this.f21818c.get(), this.f21819d.get(), this.f21820e.get());
    }
}
