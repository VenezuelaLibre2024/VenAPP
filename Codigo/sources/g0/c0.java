package g0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class c0<T> {
    public static c0<Bitmap> j(Bitmap bitmap, androidx.camera.core.impl.utils.h hVar, Rect rect, int i10, Matrix matrix, androidx.camera.core.impl.s sVar) {
        return new c(bitmap, hVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, sVar);
    }

    public static c0<androidx.camera.core.o> k(androidx.camera.core.o oVar, androidx.camera.core.impl.utils.h hVar, Rect rect, int i10, Matrix matrix, androidx.camera.core.impl.s sVar) {
        return l(oVar, hVar, new Size(oVar.getWidth(), oVar.getHeight()), rect, i10, matrix, sVar);
    }

    public static c0<androidx.camera.core.o> l(androidx.camera.core.o oVar, androidx.camera.core.impl.utils.h hVar, Size size, Rect rect, int i10, Matrix matrix, androidx.camera.core.impl.s sVar) {
        if (oVar.getFormat() == 256) {
            androidx.core.util.h.l(hVar, "JPEG image must have Exif.");
        }
        return new c(oVar, hVar, oVar.getFormat(), size, rect, i10, matrix, sVar);
    }

    public static c0<byte[]> m(byte[] bArr, androidx.camera.core.impl.utils.h hVar, int i10, Size size, Rect rect, int i11, Matrix matrix, androidx.camera.core.impl.s sVar) {
        return new c(bArr, hVar, i10, size, rect, i11, matrix, sVar);
    }

    public abstract androidx.camera.core.impl.s a();

    public abstract Rect b();

    public abstract T c();

    public abstract androidx.camera.core.impl.utils.h d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public boolean i() {
        return androidx.camera.core.impl.utils.r.e(b(), h());
    }
}
