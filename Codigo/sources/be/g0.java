package be;

import zd.r2;

/* loaded from: classes.dex */
public final class g0 implements rd.b<r2> {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f6445a;

    public g0(e0 e0Var) {
        this.f6445a = e0Var;
    }

    public static g0 a(e0 e0Var) {
        return new g0(e0Var);
    }

    public static r2 c(e0 e0Var) {
        return (r2) rd.d.e(e0Var.f());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 get() {
        return c(this.f6445a);
    }
}
