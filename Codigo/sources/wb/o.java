package wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import jb.t;

/* loaded from: classes2.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    private final ub.a f29820a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29821b;

    public o(ub.a aVar, int i10) {
        this.f29820a = aVar;
        this.f29821b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    @Override // jb.t
    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // jb.t
    public byte[] b(byte[] bArr) {
        return this.f29820a.a(bArr, this.f29821b);
    }
}
