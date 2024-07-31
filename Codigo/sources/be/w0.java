package be;

import java.util.concurrent.Executor;
import zd.q2;

/* loaded from: classes.dex */
public final class w0 implements rd.b<q2> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<zb.g> f6477a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<f6.g> f6478b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<cc.a> f6479c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<fe.f> f6480d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<ce.a> f6481e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<zd.s> f6482f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<Executor> f6483g;

    public w0(bk.a<zb.g> aVar, bk.a<f6.g> aVar2, bk.a<cc.a> aVar3, bk.a<fe.f> aVar4, bk.a<ce.a> aVar5, bk.a<zd.s> aVar6, bk.a<Executor> aVar7) {
        this.f6477a = aVar;
        this.f6478b = aVar2;
        this.f6479c = aVar3;
        this.f6480d = aVar4;
        this.f6481e = aVar5;
        this.f6482f = aVar6;
        this.f6483g = aVar7;
    }

    public static w0 a(bk.a<zb.g> aVar, bk.a<f6.g> aVar2, bk.a<cc.a> aVar3, bk.a<fe.f> aVar4, bk.a<ce.a> aVar5, bk.a<zd.s> aVar6, bk.a<Executor> aVar7) {
        return new w0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static q2 c(zb.g gVar, f6.g gVar2, cc.a aVar, fe.f fVar, ce.a aVar2, zd.s sVar, Executor executor) {
        return (q2) rd.d.e(v0.e(gVar, gVar2, aVar, fVar, aVar2, sVar, executor));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q2 get() {
        return c(this.f6477a.get(), this.f6478b.get(), this.f6479c.get(), this.f6480d.get(), this.f6481e.get(), this.f6482f.get(), this.f6483g.get());
    }
}
