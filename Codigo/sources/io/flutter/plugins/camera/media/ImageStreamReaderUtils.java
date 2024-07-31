package io.flutter.plugins.camera.media;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ImageStreamReaderUtils {
    private static boolean areUVPlanesNV21(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        boolean z10 = buffer2.remaining() == ((i12 * 2) / 4) - 2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        return z10;
    }

    private static void unpackPlane(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
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

    public ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr = new byte[((i12 / 4) * 2) + i12];
        if (areUVPlanesNV21(planeArr, i10, i11)) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer.get(bArr, i12 + 1, ((i12 * 2) / 4) - 1);
        } else {
            unpackPlane(planeArr[0], i10, i11, bArr, 0, 1);
            unpackPlane(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            unpackPlane(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
