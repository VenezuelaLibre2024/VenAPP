package y;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class s implements g0.b0<g0.c0<byte[]>, g0.c0<Bitmap>> {
    private Bitmap b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new w.g0(1, "Failed to decode JPEG.", e10);
        }
    }

    @Override // g0.b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.c0<Bitmap> apply(g0.c0<byte[]> c0Var) {
        Rect b10 = c0Var.b();
        Bitmap b11 = b(c0Var.c(), b10);
        androidx.camera.core.impl.utils.h d10 = c0Var.d();
        Objects.requireNonNull(d10);
        return g0.c0.j(b11, d10, new Rect(0, 0, b11.getWidth(), b11.getHeight()), c0Var.f(), androidx.camera.core.impl.utils.r.p(c0Var.g(), b10), c0Var.a());
    }
}
