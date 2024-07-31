package y;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class p implements g0.b0<a, g0.c0<byte[]>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static a c(g0.c0<androidx.camera.core.o> c0Var, int i10) {
            return new d(c0Var, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.c0<androidx.camera.core.o> b();
    }

    private static androidx.camera.core.impl.utils.h b(byte[] bArr) {
        try {
            return androidx.camera.core.impl.utils.h.h(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new w.g0(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    private g0.c0<byte[]> c(a aVar) {
        g0.c0<androidx.camera.core.o> b10 = aVar.b();
        byte[] c10 = f0.b.c(b10.c());
        androidx.camera.core.impl.utils.h d10 = b10.d();
        Objects.requireNonNull(d10);
        return g0.c0.m(c10, d10, RecognitionOptions.QR_CODE, b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }

    private g0.c0<byte[]> d(a aVar) {
        g0.c0<androidx.camera.core.o> b10 = aVar.b();
        androidx.camera.core.o c10 = b10.c();
        Rect b11 = b10.b();
        try {
            byte[] d10 = f0.b.d(c10, b11, aVar.a(), b10.f());
            return g0.c0.m(d10, b(d10), RecognitionOptions.QR_CODE, new Size(b11.width(), b11.height()), new Rect(0, 0, b11.width(), b11.height()), b10.f(), androidx.camera.core.impl.utils.r.p(b10.g(), b11), b10.a());
        } catch (b.a e10) {
            throw new w.g0(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    @Override // g0.b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.c0<byte[]> apply(a aVar) {
        g0.c0<byte[]> d10;
        try {
            int e10 = aVar.b().e();
            if (e10 == 35) {
                d10 = d(aVar);
            } else {
                if (e10 != 256) {
                    throw new IllegalArgumentException("Unexpected format: " + e10);
                }
                d10 = c(aVar);
            }
            return d10;
        } finally {
            aVar.b().c().close();
        }
    }
}
