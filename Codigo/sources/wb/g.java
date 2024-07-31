package wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g implements jb.a {

    /* renamed from: a, reason: collision with root package name */
    private final lb.e f29795a;

    public g(byte[] bArr) {
        this.f29795a = new lb.e(bArr);
    }

    @Override // jb.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] c10 = p.c(12);
        allocate.put(c10);
        this.f29795a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    @Override // jb.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f29795a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
