package lb;

import io.flutter.embedding.android.KeyboardMap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p419wb.C12134f;

/* renamed from: lb.i */
/* loaded from: classes2.dex */
public class C9488i {
    /* renamed from: a */
    public static byte[] m28212a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i10 = 0;
        long m28214c = m28214c(bArr, 0, 0) & 67108863;
        int i11 = 3;
        long m28214c2 = m28214c(bArr, 3, 2) & 67108611;
        long m28214c3 = m28214c(bArr, 6, 4) & 67092735;
        long m28214c4 = m28214c(bArr, 9, 6) & 66076671;
        long m28214c5 = m28214c(bArr, 12, 8) & 1048575;
        long j10 = m28214c2 * 5;
        long j11 = m28214c3 * 5;
        long j12 = m28214c4 * 5;
        long j13 = m28214c5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            m28213b(bArr3, bArr2, i12);
            long m28214c6 = j18 + m28214c(bArr3, i10, i10);
            long m28214c7 = j14 + m28214c(bArr3, i11, 2);
            long m28214c8 = j15 + m28214c(bArr3, 6, 4);
            long m28214c9 = j16 + m28214c(bArr3, 9, 6);
            long m28214c10 = j17 + (m28214c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j19 = (m28214c6 * m28214c) + (m28214c7 * j13) + (m28214c8 * j12) + (m28214c9 * j11) + (m28214c10 * j10);
            long j20 = (m28214c6 * m28214c2) + (m28214c7 * m28214c) + (m28214c8 * j13) + (m28214c9 * j12) + (m28214c10 * j11);
            long j21 = (m28214c6 * m28214c3) + (m28214c7 * m28214c2) + (m28214c8 * m28214c) + (m28214c9 * j13) + (m28214c10 * j12);
            long j22 = (m28214c6 * m28214c4) + (m28214c7 * m28214c3) + (m28214c8 * m28214c2) + (m28214c9 * m28214c) + (m28214c10 * j13);
            long j23 = j20 + (j19 >> 26);
            long j24 = j21 + (j23 >> 26);
            long j25 = j22 + (j24 >> 26);
            long j26 = (m28214c6 * m28214c5) + (m28214c7 * m28214c4) + (m28214c8 * m28214c3) + (m28214c9 * m28214c2) + (m28214c10 * m28214c) + (j25 >> 26);
            long j27 = (j19 & 67108863) + ((j26 >> 26) * 5);
            j14 = (j23 & 67108863) + (j27 >> 26);
            i12 += 16;
            j15 = j24 & 67108863;
            j16 = j25 & 67108863;
            j17 = j26 & 67108863;
            i11 = 3;
            j18 = j27 & 67108863;
            i10 = 0;
        }
        long j28 = j15 + (j14 >> 26);
        long j29 = j28 & 67108863;
        long j30 = j16 + (j28 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j17 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j18 + ((j32 >> 26) * 5);
        long j35 = j34 & 67108863;
        long j36 = (j14 & 67108863) + (j34 >> 26);
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = (j37 >> 26) + j36;
        long j40 = j29 + (j39 >> 26);
        long j41 = j31 + (j40 >> 26);
        long j42 = (j33 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = j35 & j43;
        long j45 = j36 & j43;
        long j46 = j29 & j43;
        long j47 = j31 & j43;
        long j48 = j33 & j43;
        long j49 = ~j43;
        long j50 = (j39 & 67108863 & j49) | j45;
        long j51 = (j40 & 67108863 & j49) | j46;
        long j52 = (j41 & 67108863 & j49) | j47;
        long j53 = (j42 & j49) | j48;
        long j54 = (j44 | (j38 & j49) | (j50 << 26)) & KeyboardMap.kValueMask;
        long j55 = ((j50 >> 6) | (j51 << 20)) & KeyboardMap.kValueMask;
        long j56 = ((j51 >> 12) | (j52 << 14)) & KeyboardMap.kValueMask;
        long j57 = ((j52 >> 18) | (j53 << 8)) & KeyboardMap.kValueMask;
        long m28215d = j54 + m28215d(bArr, 16);
        long j58 = m28215d & KeyboardMap.kValueMask;
        long m28215d2 = j55 + m28215d(bArr, 20) + (m28215d >> 32);
        long j59 = m28215d2 & KeyboardMap.kValueMask;
        long m28215d3 = j56 + m28215d(bArr, 24) + (m28215d2 >> 32);
        long j60 = m28215d3 & KeyboardMap.kValueMask;
        long m28215d4 = (j57 + m28215d(bArr, 28) + (m28215d3 >> 32)) & KeyboardMap.kValueMask;
        byte[] bArr4 = new byte[16];
        m28216e(bArr4, j58, 0);
        m28216e(bArr4, j59, 4);
        m28216e(bArr4, j60, 8);
        m28216e(bArr4, m28215d4, 12);
        return bArr4;
    }

    /* renamed from: b */
    private static void m28213b(byte[] bArr, byte[] bArr2, int i10) {
        int min = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    /* renamed from: c */
    private static long m28214c(byte[] bArr, int i10, int i11) {
        return (m28215d(bArr, i10) >> i11) & 67108863;
    }

    /* renamed from: d */
    private static long m28215d(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & KeyboardMap.kValueMask;
    }

    /* renamed from: e */
    private static void m28216e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    /* renamed from: f */
    public static void m28217f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!C12134f.m38882b(m28212a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
