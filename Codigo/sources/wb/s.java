package wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s implements jb.a {

    /* renamed from: a, reason: collision with root package name */
    private final lb.h f29825a;

    public s(byte[] bArr) {
        this.f29825a = new lb.h(bArr);
    }

    @Override // jb.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] c10 = p.c(24);
        allocate.put(c10);
        this.f29825a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    @Override // jb.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f29825a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
