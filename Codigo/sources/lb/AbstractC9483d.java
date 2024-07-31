package lb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p419wb.C12134f;

/* renamed from: lb.d */
/* loaded from: classes2.dex */
abstract class AbstractC9483d {

    /* renamed from: a */
    int[] f23030a;

    /* renamed from: b */
    private final int f23031b;

    public AbstractC9483d(byte[] bArr, int i10) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f23030a = C9480a.m28194e(bArr);
        this.f23031b = i10;
    }

    /* renamed from: f */
    private void m28204f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != mo28203e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo28203e());
        }
        int remaining = byteBuffer2.remaining();
        int i10 = (remaining / 64) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer m28205a = m28205a(bArr, this.f23031b + i11);
            if (i11 == i10 - 1) {
                C12134f.m38883c(byteBuffer, byteBuffer2, m28205a, remaining % 64);
            } else {
                C12134f.m38883c(byteBuffer, byteBuffer2, m28205a, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer m28205a(byte[] bArr, int i10) {
        int[] mo28200b = mo28200b(C9480a.m28194e(bArr), i10);
        int[] iArr = (int[]) mo28200b.clone();
        C9480a.m28193d(iArr);
        for (int i11 = 0; i11 < mo28200b.length; i11++) {
            mo28200b[i11] = mo28200b[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo28200b, 0, 16);
        return order;
    }

    /* renamed from: b */
    abstract int[] mo28200b(int[] iArr, int i10);

    /* renamed from: c */
    public byte[] mo28201c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m28204f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    /* renamed from: d */
    public void mo28202d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        m28204f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    /* renamed from: e */
    abstract int mo28203e();
}
