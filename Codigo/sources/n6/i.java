package n6;

import android.content.Context;
import o6.x;

/* loaded from: classes.dex */
public final class i implements j6.b<x> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f21822a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<p6.d> f21823b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<o6.f> f21824c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<r6.a> f21825d;

    public i(bk.a<Context> aVar, bk.a<p6.d> aVar2, bk.a<o6.f> aVar3, bk.a<r6.a> aVar4) {
        this.f21822a = aVar;
        this.f21823b = aVar2;
        this.f21824c = aVar3;
        this.f21825d = aVar4;
    }

    public static i a(bk.a<Context> aVar, bk.a<p6.d> aVar2, bk.a<o6.f> aVar3, bk.a<r6.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, p6.d dVar, o6.f fVar, r6.a aVar) {
        return (x) j6.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f21822a.get(), this.f21823b.get(), this.f21824c.get(), this.f21825d.get());
    }
}
