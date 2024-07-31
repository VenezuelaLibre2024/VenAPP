package p396v6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p361t6.C11108u1;
import p363t8.C11144d0;
import p436x6.C12318m;

/* renamed from: v6.p0 */
/* loaded from: classes.dex */
public final class C11662p0 {

    /* renamed from: a */
    private static final int[] f30441a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f30442b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f30443c = {64, 112, RecognitionOptions.ITF, 192, 224, RecognitionOptions.QR_CODE, 384, 448, RecognitionOptions.UPC_A, 640, 768, 896, RecognitionOptions.UPC_E, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, RecognitionOptions.PDF417, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecognitionOptions.AZTEC, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m36644a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p396v6.C11662p0.m36644a(byte[]):int");
    }

    /* renamed from: b */
    private static C11144d0 m36645b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C11144d0(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m36646c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        C11144d0 c11144d0 = new C11144d0(copyOf);
        if (copyOf[0] == 31) {
            C11144d0 c11144d02 = new C11144d0(copyOf);
            while (c11144d02.m34626b() >= 16) {
                c11144d02.m34642r(2);
                c11144d0.m34630f(c11144d02.m34632h(14), 14);
            }
        }
        c11144d0.m34638n(copyOf);
        return c11144d0;
    }

    /* renamed from: c */
    private static boolean m36646c(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1;
    }

    /* renamed from: d */
    public static boolean m36647d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    /* renamed from: e */
    public static int m36648e(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 != -2) {
            if (b10 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                i13 = position + 7;
            } else if (b10 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                i11 = position + 5;
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                i13 = position + 6;
            }
            i12 = byteBuffer.get(i13) & 60;
            return (((i12 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        i11 = position + 4;
        i12 = byteBuffer.get(i11) & 252;
        return (((i12 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: f */
    public static int m36649f(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: g */
    public static C11108u1 m36650g(byte[] bArr, String str, String str2, C12318m c12318m) {
        C11144d0 m36645b = m36645b(bArr);
        m36645b.m34642r(60);
        int i10 = f30441a[m36645b.m34632h(6)];
        int i11 = f30442b[m36645b.m34632h(4)];
        int m34632h = m36645b.m34632h(5);
        int[] iArr = f30443c;
        int i12 = m34632h >= iArr.length ? -1 : (iArr[m34632h] * AdError.NETWORK_ERROR_CODE) / 2;
        m36645b.m34642r(10);
        return new C11108u1.b().m34540U(str).m34552g0("audio/vnd.dts").m34528I(i12).m34529J(i10 + (m36645b.m34632h(2) > 0 ? 1 : 0)).m34553h0(i11).m34534O(c12318m).m34543X(str2).m34526G();
    }
}
