package zd;

/* loaded from: classes.dex */
public final class x0 implements rd.b<w0> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<u2> f32774a;

    public x0(bk.a<u2> aVar) {
        this.f32774a = aVar;
    }

    public static x0 a(bk.a<u2> aVar) {
        return new x0(aVar);
    }

    public static w0 c(u2 u2Var) {
        return new w0(u2Var);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w0 get() {
        return c(this.f32774a.get());
    }
}
