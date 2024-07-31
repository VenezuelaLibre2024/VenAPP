package lb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    int[] f21177a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21178b;

    public d(byte[] bArr, int i10) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f21177a = a.e(bArr);
        this.f21178b = i10;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int remaining = byteBuffer2.remaining();
        int i10 = (remaining / 64) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer a10 = a(bArr, this.f21178b + i11);
            if (i11 == i10 - 1) {
                wb.f.c(byteBuffer, byteBuffer2, a10, remaining % 64);
            } else {
                wb.f.c(byteBuffer, byteBuffer2, a10, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a(byte[] bArr, int i10) {
        int[] b10 = b(a.e(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        a.d(iArr);
        for (int i11 = 0; i11 < b10.length; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }

    abstract int[] b(int[] iArr, int i10);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
