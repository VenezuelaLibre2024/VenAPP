package be;

/* loaded from: classes.dex */
public final class f0 implements rd.b<ij.a<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f6443a;

    public f0(e0 e0Var) {
        this.f6443a = e0Var;
    }

    public static f0 a(e0 e0Var) {
        return new f0(e0Var);
    }

    public static ij.a<String> c(e0 e0Var) {
        return (ij.a) rd.d.e(e0Var.e());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ij.a<String> get() {
        return c(this.f6443a);
    }
}
