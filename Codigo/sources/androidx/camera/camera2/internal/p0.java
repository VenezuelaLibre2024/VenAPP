package androidx.camera.camera2.internal;

import androidx.camera.core.impl.l0;

/* loaded from: classes.dex */
public class p0 implements l0.b {

    /* renamed from: a */
    static final p0 f2148a = new p0();

    @Override // androidx.camera.core.impl.l0.b
    public void a(androidx.camera.core.impl.k2<?> k2Var, l0.a aVar) {
        androidx.camera.core.impl.l0 s10 = k2Var.s(null);
        androidx.camera.core.impl.n0 X = androidx.camera.core.impl.p1.X();
        int h10 = androidx.camera.core.impl.l0.a().h();
        if (s10 != null) {
            h10 = s10.h();
            aVar.a(s10.b());
            X = s10.e();
        }
        aVar.q(X);
        q.a aVar2 = new q.a(k2Var);
        aVar.r(aVar2.a0(h10));
        aVar.c(s1.d(aVar2.d0(o0.c())));
        aVar.e(aVar2.Y());
    }
}
