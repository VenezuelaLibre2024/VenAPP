package bg;

import ag.C0113a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.Build;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import p313qf.C10475a;

/* renamed from: bg.c */
/* loaded from: classes2.dex */
public class C1779c {

    /* renamed from: a */
    private static final C1779c f7413a = new C1779c();

    private C1779c() {
    }

    /* renamed from: a */
    public static ByteBuffer m9493a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: d */
    public static C1779c m9494d() {
        return f7413a;
    }

    /* renamed from: f */
    public static ByteBuffer m9495f(ByteBuffer byteBuffer, boolean z10) {
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

    /* renamed from: g */
    public static Bitmap m9496g(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    /* renamed from: h */
    private static final void m9497h(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
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

    /* renamed from: b */
    public Bitmap m9498b(Image image, int i10) {
        C5276s.m13316b(image.getFormat() == 256, "Only JPEG is supported now");
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
        return m9496g(decodeByteArray, i10, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    /* renamed from: c */
    public ByteBuffer m9499c(C0113a c0113a, boolean z10) {
        Bitmap.Config config;
        int m538f = c0113a.m538f();
        if (m538f != -1) {
            if (m538f == 17) {
                return z10 ? m9493a((ByteBuffer) C5276s.m13324j(c0113a.m536d())) : (ByteBuffer) C5276s.m13324j(c0113a.m536d());
            }
            if (m538f == 35) {
                return m9500e((Image.Plane[]) C5276s.m13324j(c0113a.m541i()), c0113a.m543k(), c0113a.m539g());
            }
            if (m538f == 842094169) {
                return m9495f((ByteBuffer) C5276s.m13324j(c0113a.m536d()), z10);
            }
            throw new C10475a("Unsupported image format", 13);
        }
        Bitmap bitmap = (Bitmap) C5276s.m13324j(c0113a.m535c());
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

    /* renamed from: e */
    public ByteBuffer m9500e(Image.Plane[] planeArr, int i10, int i11) {
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
            m9497h(planeArr[0], i10, i11, bArr, 0, 1);
            m9497h(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            m9497h(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
