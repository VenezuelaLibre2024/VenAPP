package be;

/* loaded from: classes.dex */
public final class p0 implements rd.b<dj.r> {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f6465a;

    public p0(n0 n0Var) {
        this.f6465a = n0Var;
    }

    public static p0 a(n0 n0Var) {
        return new p0(n0Var);
    }

    public static dj.r c(n0 n0Var) {
        return (dj.r) rd.d.e(n0Var.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dj.r get() {
        return c(this.f6465a);
    }
}
