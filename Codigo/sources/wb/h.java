package wb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import jb.t;

/* loaded from: classes2.dex */
public final class h implements jb.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f29796a;

    /* renamed from: b, reason: collision with root package name */
    private final t f29797b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29798c;

    public h(l lVar, t tVar, int i10) {
        this.f29796a = lVar;
        this.f29797b = tVar;
        this.f29798c = i10;
    }

    @Override // jb.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f29796a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(a10, this.f29797b.b(f.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // jb.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f29798c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f29798c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f29797b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f29796a.b(copyOfRange);
    }
}
