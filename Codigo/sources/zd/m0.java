package zd;

import pf.g;

/* loaded from: classes.dex */
public final class m0 implements rd.b<l0> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<g.b> f32671a;

    public m0(bk.a<g.b> aVar) {
        this.f32671a = aVar;
    }

    public static m0 a(bk.a<g.b> aVar) {
        return new m0(aVar);
    }

    public static l0 c(g.b bVar) {
        return new l0(bVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f32671a.get());
    }
}
