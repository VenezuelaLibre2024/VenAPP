package lb;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: lb.g */
/* loaded from: classes2.dex */
public class C9486g extends AbstractC9483d {
    public C9486g(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    /* renamed from: g */
    static int[] m28211g(int[] iArr, int[] iArr2) {
        C9480a.m28192c(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        C9480a.m28193d(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // lb.AbstractC9483d
    /* renamed from: b */
    int[] mo28200b(int[] iArr, int i10) {
        if (iArr.length != mo28203e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        C9480a.m28192c(iArr2, m28211g(this.f23030a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // lb.AbstractC9483d
    /* renamed from: c */
    public /* bridge */ /* synthetic */ byte[] mo28201c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.mo28201c(bArr, byteBuffer);
    }

    @Override // lb.AbstractC9483d
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo28202d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.mo28202d(byteBuffer, bArr, bArr2);
    }

    @Override // lb.AbstractC9483d
    /* renamed from: e */
    int mo28203e() {
        return 24;
    }
}
