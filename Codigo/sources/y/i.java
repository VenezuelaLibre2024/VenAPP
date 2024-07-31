package y;

import android.graphics.Bitmap;
import java.util.Objects;

/* loaded from: classes.dex */
public class i implements g0.b0<g0.c0<Bitmap>, g0.c0<Bitmap>> {

    /* renamed from: a */
    private final g0.z f31503a;

    public i(g0.z zVar) {
        this.f31503a = zVar;
    }

    @Override // g0.b0
    /* renamed from: a */
    public g0.c0<Bitmap> apply(g0.c0<Bitmap> c0Var) {
        androidx.camera.core.o a10 = this.f31503a.e(new g0.w(new j0(c0Var), 1)).a();
        Objects.requireNonNull(a10);
        Bitmap a11 = f0.b.a(a10.u0(), a10.getWidth(), a10.getHeight());
        androidx.camera.core.impl.utils.h d10 = c0Var.d();
        Objects.requireNonNull(d10);
        return g0.c0.j(a11, d10, c0Var.b(), c0Var.f(), c0Var.g(), c0Var.a());
    }
}
