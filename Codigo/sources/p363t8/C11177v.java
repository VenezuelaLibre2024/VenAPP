package p363t8;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p378u8.C11450c;

/* renamed from: t8.v */
/* loaded from: classes.dex */
public final class C11177v {
    /* renamed from: a */
    public static void m34988a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m34989b(MediaFormat mediaFormat, C11450c c11450c) {
        if (c11450c != null) {
            m34991d(mediaFormat, "color-transfer", c11450c.f29661c);
            m34991d(mediaFormat, "color-standard", c11450c.f29659a);
            m34991d(mediaFormat, "color-range", c11450c.f29660b);
            m34988a(mediaFormat, "hdr-static-info", c11450c.f29662d);
        }
    }

    /* renamed from: c */
    public static void m34990c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    /* renamed from: d */
    public static void m34991d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* renamed from: e */
    public static void m34992e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
