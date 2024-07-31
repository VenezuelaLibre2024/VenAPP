package androidx.camera.camera2.internal;

import androidx.camera.core.impl.l0;
import q.a;

/* loaded from: classes.dex */
final class j2 extends p0 {

    /* renamed from: c */
    static final j2 f2083c = new j2(new t.k());

    /* renamed from: b */
    private final t.k f2084b;

    private j2(t.k kVar) {
        this.f2084b = kVar;
    }

    @Override // androidx.camera.camera2.internal.p0, androidx.camera.core.impl.l0.b
    public void a(androidx.camera.core.impl.k2<?> k2Var, l0.a aVar) {
        super.a(k2Var, aVar);
        if (!(k2Var instanceof androidx.camera.core.impl.d1)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.d1 d1Var = (androidx.camera.core.impl.d1) k2Var;
        a.C0388a c0388a = new a.C0388a();
        if (d1Var.c0()) {
            this.f2084b.a(d1Var.X(), c0388a);
        }
        aVar.e(c0388a.c());
    }
}
