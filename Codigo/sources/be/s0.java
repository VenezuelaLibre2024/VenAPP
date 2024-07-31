package be;

/* loaded from: classes.dex */
public final class s0 implements rd.b<ce.a> {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f6472a;

    public s0(r0 r0Var) {
        this.f6472a = r0Var;
    }

    public static s0 a(r0 r0Var) {
        return new s0(r0Var);
    }

    public static ce.a c(r0 r0Var) {
        return (ce.a) rd.d.e(r0Var.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.a get() {
        return c(this.f6472a);
    }
}
