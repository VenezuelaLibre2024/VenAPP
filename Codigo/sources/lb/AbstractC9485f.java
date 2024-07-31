package lb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import p271ob.C9830b;

/* renamed from: lb.f */
/* loaded from: classes2.dex */
abstract class AbstractC9485f {

    /* renamed from: c */
    public static final C9830b.b f23032c = C9830b.b.ALGORITHM_NOT_FIPS;

    /* renamed from: a */
    private final AbstractC9483d f23033a;

    /* renamed from: b */
    private final AbstractC9483d f23034b;

    public AbstractC9485f(byte[] bArr) {
        if (!f23032c.mo29502b()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f23033a = mo28208e(bArr, 1);
        this.f23034b = mo28208e(bArr, 0);
    }

    /* renamed from: c */
    private byte[] m28209c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f23034b.m28205a(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: d */
    private static byte[] m28210d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i10 = remaining % 16;
        int i11 = (i10 == 0 ? remaining : (remaining + 16) - i10) + length;
        ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i11);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    /* renamed from: a */
    public byte[] mo28206a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            C9488i.m28217f(m28209c(bArr), m28210d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(position);
            return this.f23033a.mo28201c(bArr, byteBuffer);
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    /* renamed from: b */
    public void mo28207b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.f23033a.mo28202d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] m28212a = C9488i.m28212a(m28209c(bArr), m28210d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(m28212a);
    }

    /* renamed from: e */
    abstract AbstractC9483d mo28208e(byte[] bArr, int i10);
}
