package f0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.utils.j;
import androidx.camera.core.impl.utils.k;
import androidx.camera.core.o;
import androidx.core.util.h;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        private final EnumC0234a f14847a;

        /* renamed from: f0.b$a$a */
        /* loaded from: classes.dex */
        public enum EnumC0234a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC0234a enumC0234a) {
            super(str);
            this.f14847a = enumC0234a;
        }
    }

    public static Bitmap a(o.a[] aVarArr, int i10, int i11) {
        h.b(aVarArr.length == 1, "Expect a single plane");
        h.b(aVarArr[0].e() == 4, "Expect pixelStride=4");
        h.b(aVarArr[0].d() == i10 * 4, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].c().rewind();
        ImageProcessingUtil.i(createBitmap, aVarArr[0].c(), aVarArr[0].d());
        return createBitmap;
    }

    public static ByteBuffer b(Bitmap bitmap) {
        h.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.h(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static byte[] c(o oVar) {
        if (oVar.getFormat() != 256) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        ByteBuffer c10 = oVar.u0()[0].c();
        byte[] bArr = new byte[c10.capacity()];
        c10.rewind();
        c10.get(bArr);
        return bArr;
    }

    public static byte[] d(o oVar, Rect rect, int i10, int i11) {
        if (oVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(e(oVar), 17, oVar.getWidth(), oVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = new k(byteArrayOutputStream, j.b(oVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, oVar.getWidth(), oVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, kVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0234a.ENCODE_FAILED);
    }

    public static byte[] e(o oVar) {
        o.a aVar = oVar.u0()[0];
        o.a aVar2 = oVar.u0()[1];
        o.a aVar3 = oVar.u0()[2];
        ByteBuffer c10 = aVar.c();
        ByteBuffer c11 = aVar2.c();
        ByteBuffer c12 = aVar3.c();
        c10.rewind();
        c11.rewind();
        c12.rewind();
        int remaining = c10.remaining();
        byte[] bArr = new byte[((oVar.getWidth() * oVar.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < oVar.getHeight(); i11++) {
            c10.get(bArr, i10, oVar.getWidth());
            i10 += oVar.getWidth();
            c10.position(Math.min(remaining, (c10.position() - oVar.getWidth()) + aVar.d()));
        }
        int height = oVar.getHeight() / 2;
        int width = oVar.getWidth() / 2;
        int d10 = aVar3.d();
        int d11 = aVar2.d();
        int e10 = aVar3.e();
        int e11 = aVar2.e();
        byte[] bArr2 = new byte[d10];
        byte[] bArr3 = new byte[d11];
        for (int i12 = 0; i12 < height; i12++) {
            c12.get(bArr2, 0, Math.min(d10, c12.remaining()));
            c11.get(bArr3, 0, Math.min(d11, c11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += e10;
                i14 += e11;
            }
        }
        return bArr;
    }
}
