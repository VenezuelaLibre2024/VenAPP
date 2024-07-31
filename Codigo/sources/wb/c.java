package wb;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import ob.b;

/* loaded from: classes2.dex */
public final class c implements jb.a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0370b f29770b = b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final lb.b f29771a;

    public c(byte[] bArr) {
        if (!f29770b.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f29771a = new lb.b(bArr, true);
    }

    @Override // jb.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f29771a.b(p.c(12), bArr, bArr2);
    }

    @Override // jb.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f29771a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
