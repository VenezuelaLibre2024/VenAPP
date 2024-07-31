package y;

import android.graphics.Bitmap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
class h implements g0.b0<a, g0.c0<byte[]>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static a c(g0.c0<Bitmap> c0Var, int i10) {
            return new y.a(c0Var, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.c0<Bitmap> b();
    }

    @Override // g0.b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.c0<byte[]> apply(a aVar) {
        g0.c0<Bitmap> b10 = aVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b10.c().compress(Bitmap.CompressFormat.JPEG, aVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        androidx.camera.core.impl.utils.h d10 = b10.d();
        Objects.requireNonNull(d10);
        return g0.c0.m(byteArray, d10, RecognitionOptions.QR_CODE, b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }
}
