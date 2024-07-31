package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.core.impl.y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 implements y1.d {

    /* renamed from: a */
    static final j1 f2082a = new j1();

    @Override // androidx.camera.core.impl.y1.d
    public void a(Size size, androidx.camera.core.impl.k2<?> k2Var, y1.b bVar) {
        androidx.camera.core.impl.y1 o10 = k2Var.o(null);
        androidx.camera.core.impl.n0 X = androidx.camera.core.impl.p1.X();
        int l10 = androidx.camera.core.impl.y1.a().l();
        if (o10 != null) {
            l10 = o10.l();
            bVar.a(o10.b());
            bVar.c(o10.i());
            bVar.b(o10.g());
            X = o10.d();
        }
        bVar.r(X);
        if (k2Var instanceof androidx.camera.core.impl.r1) {
            t.p.b(size, bVar);
        }
        q.a aVar = new q.a(k2Var);
        bVar.t(aVar.a0(l10));
        bVar.e(aVar.b0(n1.b()));
        bVar.k(aVar.e0(m1.b()));
        bVar.d(s1.d(aVar.d0(o0.c())));
        androidx.camera.core.impl.m1 a02 = androidx.camera.core.impl.m1.a0();
        a02.r(q.a.M, aVar.X(q.c.e()));
        a02.r(q.a.O, aVar.c0(null));
        a02.r(q.a.I, Long.valueOf(aVar.f0(-1L)));
        bVar.g(a02);
        bVar.g(aVar.Y());
    }
}
