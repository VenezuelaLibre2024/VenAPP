package b0;

import w.k1;

/* loaded from: classes.dex */
public abstract class f implements k1 {
    public static k1 e(float f10, float f11, float f12, float f13) {
        return new a(f10, f11, f12, f13);
    }

    public static k1 f(k1 k1Var) {
        return new a(k1Var.d(), k1Var.a(), k1Var.c(), k1Var.b());
    }

    @Override // w.k1
    public abstract float a();

    @Override // w.k1
    public abstract float b();

    @Override // w.k1
    public abstract float c();

    @Override // w.k1
    public abstract float d();
}
