package p419wb;

import com.google.android.gms.common.api.C5101a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: wb.f */
/* loaded from: classes2.dex */
public final class C12134f {
    /* renamed from: a */
    public static byte[] m38881a(byte[]... bArr) {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            if (i10 > C5101a.e.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += bArr2.length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            i11 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static final boolean m38882b(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    /* renamed from: c */
    public static final void m38883c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: d */
    public static final byte[] m38884d(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    /* renamed from: e */
    public static final byte[] m38885e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m38884d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: f */
    public static final byte[] m38886f(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        int length = bArr.length - bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            int i11 = length + i10;
            copyOf[i11] = (byte) (copyOf[i11] ^ bArr2[i10]);
        }
        return copyOf;
    }
}
