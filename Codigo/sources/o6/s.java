package o6;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements j6.b<r> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f22290a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<i6.e> f22291b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<p6.d> f22292c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<x> f22293d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<Executor> f22294e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<q6.b> f22295f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<r6.a> f22296g;

    /* renamed from: h, reason: collision with root package name */
    private final bk.a<r6.a> f22297h;

    /* renamed from: i, reason: collision with root package name */
    private final bk.a<p6.c> f22298i;

    public s(bk.a<Context> aVar, bk.a<i6.e> aVar2, bk.a<p6.d> aVar3, bk.a<x> aVar4, bk.a<Executor> aVar5, bk.a<q6.b> aVar6, bk.a<r6.a> aVar7, bk.a<r6.a> aVar8, bk.a<p6.c> aVar9) {
        this.f22290a = aVar;
        this.f22291b = aVar2;
        this.f22292c = aVar3;
        this.f22293d = aVar4;
        this.f22294e = aVar5;
        this.f22295f = aVar6;
        this.f22296g = aVar7;
        this.f22297h = aVar8;
        this.f22298i = aVar9;
    }

    public static s a(bk.a<Context> aVar, bk.a<i6.e> aVar2, bk.a<p6.d> aVar3, bk.a<x> aVar4, bk.a<Executor> aVar5, bk.a<q6.b> aVar6, bk.a<r6.a> aVar7, bk.a<r6.a> aVar8, bk.a<p6.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, i6.e eVar, p6.d dVar, x xVar, Executor executor, q6.b bVar, r6.a aVar, r6.a aVar2, p6.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f22290a.get(), this.f22291b.get(), this.f22292c.get(), this.f22293d.get(), this.f22294e.get(), this.f22295f.get(), this.f22296g.get(), this.f22297h.get(), this.f22298i.get());
    }
}
