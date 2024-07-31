package lb;

import java.nio.ByteBuffer;

/* renamed from: lb.c */
/* loaded from: classes2.dex */
public class C9482c extends AbstractC9483d {
    public C9482c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // lb.AbstractC9483d
    /* renamed from: b */
    public int[] mo28200b(int[] iArr, int i10) {
        if (iArr.length != mo28203e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        C9480a.m28192c(iArr2, this.f23030a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
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
    public int mo28203e() {
        return 12;
    }
}
