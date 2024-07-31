package zd;

/* loaded from: classes.dex */
public final class n3 implements rd.b<m3> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<u2> f32683a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<ce.a> f32684b;

    public n3(bk.a<u2> aVar, bk.a<ce.a> aVar2) {
        this.f32683a = aVar;
        this.f32684b = aVar2;
    }

    public static n3 a(bk.a<u2> aVar, bk.a<ce.a> aVar2) {
        return new n3(aVar, aVar2);
    }

    public static m3 c(u2 u2Var, ce.a aVar) {
        return new m3(u2Var, aVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m3 get() {
        return c(this.f32683a.get(), this.f32684b.get());
    }
}
