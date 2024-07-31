package kb;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class e0 implements jb.a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f20550c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final vb.a0 f20551a;

    /* renamed from: b, reason: collision with root package name */
    private final jb.a f20552b;

    public e0(vb.a0 a0Var, jb.a aVar) {
        this.f20551a = a0Var;
        this.f20552b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // jb.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] h10 = jb.x.j(this.f20551a).h();
        return c(this.f20552b.a(h10, f20550c), ((jb.a) jb.x.f(this.f20551a.b0(), h10, jb.a.class)).a(bArr, bArr2));
    }

    @Override // jb.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((jb.a) jb.x.f(this.f20551a.b0(), this.f20552b.b(bArr3, f20550c), jb.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
