package y;

import androidx.camera.core.ImageProcessingUtil;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Objects;

/* loaded from: classes.dex */
public class u implements g0.b0<g0.c0<byte[]>, g0.c0<androidx.camera.core.o>> {
    @Override // g0.b0
    /* renamed from: a */
    public g0.c0<androidx.camera.core.o> apply(g0.c0<byte[]> c0Var) {
        androidx.camera.core.t tVar = new androidx.camera.core.t(androidx.camera.core.p.a(c0Var.h().getWidth(), c0Var.h().getHeight(), RecognitionOptions.QR_CODE, 2));
        androidx.camera.core.o e10 = ImageProcessingUtil.e(tVar, c0Var.c());
        tVar.l();
        Objects.requireNonNull(e10);
        androidx.camera.core.impl.utils.h d10 = c0Var.d();
        Objects.requireNonNull(d10);
        return g0.c0.k(e10, d10, c0Var.b(), c0Var.f(), c0Var.g(), c0Var.a());
    }
}
