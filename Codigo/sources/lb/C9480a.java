package lb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: lb.a */
/* loaded from: classes2.dex */
final class C9480a {

    /* renamed from: a */
    private static final int[] f23025a = m28194e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    static void m28190a(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int m28191b = m28191b(i14 ^ iArr[i13], 16);
        iArr[i13] = m28191b;
        int i15 = iArr[i12] + m28191b;
        iArr[i12] = i15;
        int m28191b2 = m28191b(iArr[i11] ^ i15, 12);
        iArr[i11] = m28191b2;
        int i16 = iArr[i10] + m28191b2;
        iArr[i10] = i16;
        int m28191b3 = m28191b(iArr[i13] ^ i16, 8);
        iArr[i13] = m28191b3;
        int i17 = iArr[i12] + m28191b3;
        iArr[i12] = i17;
        iArr[i11] = m28191b(iArr[i11] ^ i17, 7);
    }

    /* renamed from: b */
    private static int m28191b(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m28192c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f23025a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m28193d(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            m28190a(iArr, 0, 4, 8, 12);
            m28190a(iArr, 1, 5, 9, 13);
            m28190a(iArr, 2, 6, 10, 14);
            m28190a(iArr, 3, 7, 11, 15);
            m28190a(iArr, 0, 5, 10, 15);
            m28190a(iArr, 1, 6, 11, 12);
            m28190a(iArr, 2, 7, 8, 13);
            m28190a(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int[] m28194e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
