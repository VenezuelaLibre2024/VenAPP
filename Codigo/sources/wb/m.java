package wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import ob.b;

/* loaded from: classes2.dex */
public final class m implements ub.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0370b f29810d = b.EnumC0370b.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f29811a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f29812b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f29813c;

    public m(byte[] bArr) {
        r.a(bArr.length);
        this.f29811a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c10 = c();
        c10.init(1, this.f29811a);
        byte[] b10 = sb.a.b(c10.doFinal(new byte[16]));
        this.f29812b = b10;
        this.f29813c = sb.a.b(b10);
    }

    private static Cipher c() {
        if (f29810d.b()) {
            return i.f29799b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // ub.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c10 = c();
        c10.init(1, this.f29811a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d10 = max * 16 == bArr.length ? f.d(bArr, (max - 1) * 16, this.f29812b, 0, 16) : f.e(sb.a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f29813c);
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < max - 1; i11++) {
            bArr2 = c10.doFinal(f.d(bArr2, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(c10.doFinal(f.e(d10, bArr2)), i10);
    }
}
