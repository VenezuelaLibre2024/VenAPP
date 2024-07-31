package qd;

import java.util.concurrent.Executor;
import zd.i2;
import zd.r2;

/* loaded from: classes.dex */
public final class x implements rd.b<q> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<i2> f23960a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<r2> f23961b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<zd.n> f23962c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<fe.f> f23963d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<zd.t> f23964e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<zd.s> f23965f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<Executor> f23966g;

    public x(bk.a<i2> aVar, bk.a<r2> aVar2, bk.a<zd.n> aVar3, bk.a<fe.f> aVar4, bk.a<zd.t> aVar5, bk.a<zd.s> aVar6, bk.a<Executor> aVar7) {
        this.f23960a = aVar;
        this.f23961b = aVar2;
        this.f23962c = aVar3;
        this.f23963d = aVar4;
        this.f23964e = aVar5;
        this.f23965f = aVar6;
        this.f23966g = aVar7;
    }

    public static x a(bk.a<i2> aVar, bk.a<r2> aVar2, bk.a<zd.n> aVar3, bk.a<fe.f> aVar4, bk.a<zd.t> aVar5, bk.a<zd.s> aVar6, bk.a<Executor> aVar7) {
        return new x(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static q c(i2 i2Var, r2 r2Var, zd.n nVar, fe.f fVar, zd.t tVar, zd.s sVar, Executor executor) {
        return new q(i2Var, r2Var, nVar, fVar, tVar, sVar, executor);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f23960a.get(), this.f23961b.get(), this.f23962c.get(), this.f23963d.get(), this.f23964e.get(), this.f23965f.get(), this.f23966g.get());
    }
}
