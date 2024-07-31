package y;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;
import y.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements g0.b0<e0.b, g0.c0<androidx.camera.core.o>> {
    private static g0.c0<androidx.camera.core.o> b(f0 f0Var, androidx.camera.core.impl.utils.h hVar, androidx.camera.core.o oVar) {
        return g0.c0.k(oVar, hVar, f0Var.b(), f0Var.e(), f0Var.f(), d(oVar));
    }

    private static g0.c0<androidx.camera.core.o> c(f0 f0Var, androidx.camera.core.impl.utils.h hVar, androidx.camera.core.o oVar) {
        Size size = new Size(oVar.getWidth(), oVar.getHeight());
        int e10 = f0Var.e() - hVar.n();
        Size e11 = e(e10, size);
        Matrix b10 = androidx.camera.core.impl.utils.r.b(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, e11.getWidth(), e11.getHeight()), e10);
        return g0.c0.l(oVar, hVar, e11, f(f0Var.b(), b10), hVar.n(), g(f0Var.f(), b10), d(oVar));
    }

    private static androidx.camera.core.impl.s d(androidx.camera.core.o oVar) {
        return ((b0.b) oVar.e1()).e();
    }

    private static Size e(int i10, Size size) {
        return androidx.camera.core.impl.utils.r.f(androidx.camera.core.impl.utils.r.q(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // g0.b0
    /* renamed from: a */
    public g0.c0<androidx.camera.core.o> apply(e0.b bVar) {
        androidx.camera.core.impl.utils.h g10;
        androidx.camera.core.o a10 = bVar.a();
        f0 b10 = bVar.b();
        if (a10.getFormat() == 256) {
            try {
                g10 = androidx.camera.core.impl.utils.h.g(a10);
                a10.u0()[0].c().rewind();
            } catch (IOException e10) {
                throw new w.g0(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            g10 = null;
        }
        if (!r.f31551g.b(a10)) {
            return b(b10, g10, a10);
        }
        androidx.core.util.h.l(g10, "JPEG image must have exif.");
        return c(b10, g10, a10);
    }
}
