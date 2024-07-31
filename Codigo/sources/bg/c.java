package bg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Build;
import com.google.android.gms.common.internal.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a */
    private static final c f6491a = new c();

    private c() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static c d() {
        return f6491a;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, boolean z10) {
        int i10;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i11 = limit / 6;
        ByteBuffer allocate = z10 ? ByteBuffer.allocate(limit) : ByteBuffer.allocateDirect(limit);
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            allocate.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            allocate.put(i10 + i13, byteBuffer.get(((i13 % 2) * i11) + i10 + (i13 / 2)));
        }
        return allocate;
    }

    public static Bitmap g(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    private static final void h(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit == 0) {
            return;
        }
        int i14 = i10 / (i11 / limit);
        int i15 = 0;
        for (int i16 = 0; i16 < limit; i16++) {
            int i17 = i15;
            for (int i18 = 0; i18 < i14; i18++) {
                bArr[i12] = buffer.get(i17);
                i12 += i13;
                i17 += plane.getPixelStride();
            }
            i15 += plane.getRowStride();
        }
    }

    public Bitmap b(Image image, int i10) {
        s.b(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
        return g(decodeByteArray, i10, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    public ByteBuffer c(ag.a aVar, boolean z10) {
        Bitmap.Config config;
        int f10 = aVar.f();
        if (f10 != -1) {
            if (f10 == 17) {
                return z10 ? a((ByteBuffer) s.j(aVar.d())) : (ByteBuffer) s.j(aVar.d());
            }
            if (f10 == 35) {
                return e((Image.Plane[]) s.j(aVar.i()), aVar.k(), aVar.g());
            }
            if (f10 == 842094169) {
                return f((ByteBuffer) s.j(aVar.d()), z10);
            }
            throw new qf.a("Unsupported image format", 13);
        }
        Bitmap bitmap = (Bitmap) s.j(aVar.c());
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        int ceil2 = ((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i10;
        ByteBuffer allocate = z10 ? ByteBuffer.allocate(ceil2) : ByteBuffer.allocateDirect(ceil2);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i12];
                int i16 = i15 >> 16;
                int i17 = i15 >> 8;
                int i18 = i15 & 255;
                int i19 = i11 + 1;
                int i20 = i16 & 255;
                int i21 = i17 & 255;
                allocate.put(i11, (byte) Math.min(255, (((((i20 * 66) + (i21 * 129)) + (i18 * 25)) + RecognitionOptions.ITF) >> 8) + 16));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    int i22 = ((((i20 * 112) - (i21 * 94)) - (i18 * 18)) + RecognitionOptions.ITF) >> 8;
                    int i23 = ((((i20 * (-38)) - (i21 * 74)) + (i18 * 112)) + RecognitionOptions.ITF) >> 8;
                    int i24 = i22 + RecognitionOptions.ITF;
                    int i25 = i23 + RecognitionOptions.ITF;
                    int i26 = i10 + 1;
                    allocate.put(i10, (byte) Math.min(255, i24));
                    i10 = i26 + 1;
                    allocate.put(i26, (byte) Math.min(255, i25));
                }
                i12++;
                i14++;
                i11 = i19;
            }
        }
        return allocate;
    }

    public ByteBuffer e(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            h(planeArr[0], i10, i11, bArr, 0, 1);
            h(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            h(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
