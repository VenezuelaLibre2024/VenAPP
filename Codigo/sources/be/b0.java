package be;

import pf.g;

/* loaded from: classes.dex */
public final class b0 implements rd.b<g.b> {

    /* renamed from: a, reason: collision with root package name */
    private final z f6425a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<vi.d> f6426b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<vi.w0> f6427c;

    public b0(z zVar, bk.a<vi.d> aVar, bk.a<vi.w0> aVar2) {
        this.f6425a = zVar;
        this.f6426b = aVar;
        this.f6427c = aVar2;
    }

    public static b0 a(z zVar, bk.a<vi.d> aVar, bk.a<vi.w0> aVar2) {
        return new b0(zVar, aVar, aVar2);
    }

    public static g.b c(z zVar, vi.d dVar, vi.w0 w0Var) {
        return (g.b) rd.d.e(zVar.c(dVar, w0Var));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.b get() {
        return c(this.f6425a, this.f6426b.get(), this.f6427c.get());
    }
}
