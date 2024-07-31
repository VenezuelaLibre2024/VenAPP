package p419wb;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p179jb.InterfaceC9013e;
import p271ob.C9830b;
import sb.C10880a;

/* renamed from: wb.d */
/* loaded from: classes2.dex */
public final class C12132d implements InterfaceC9013e {

    /* renamed from: c */
    public static final C9830b.b f32237c = C9830b.b.ALGORITHM_NOT_FIPS;

    /* renamed from: d */
    private static final Collection<Integer> f32238d = Arrays.asList(64);

    /* renamed from: e */
    private static final byte[] f32239e = new byte[16];

    /* renamed from: f */
    private static final byte[] f32240f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a */
    private final C12141m f32241a;

    /* renamed from: b */
    private final byte[] f32242b;

    public C12132d(byte[] bArr) {
        if (!f32237c.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f32238d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f32242b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f32241a = new C12141m(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    /* renamed from: c */
    private byte[] m38871c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f32241a.mo36088a(f32240f, 16);
        }
        byte[] mo36088a = this.f32241a.mo36088a(f32239e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            mo36088a = C12134f.m38885e(C10880a.m33191b(mo36088a), this.f32241a.mo36088a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f32241a.mo36088a(bArr3.length >= 16 ? C12134f.m38886f(bArr3, mo36088a) : C12134f.m38885e(C10880a.m33190a(bArr3), C10880a.m33191b(mo36088a)), 16);
    }

    @Override // p179jb.InterfaceC9013e
    /* renamed from: a */
    public byte[] mo26431a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher m38888a = C12137i.f32264b.m38888a("AES/CTR/NoPadding");
        byte[] m38871c = m38871c(bArr2, bArr);
        byte[] bArr3 = (byte[]) m38871c.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        m38888a.init(1, new SecretKeySpec(this.f32242b, "AES"), new IvParameterSpec(bArr3));
        return C12134f.m38881a(m38871c, m38888a.doFinal(bArr));
    }

    @Override // p179jb.InterfaceC9013e
    /* renamed from: b */
    public byte[] mo26432b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher m38888a = C12137i.f32264b.m38888a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        m38888a.init(2, new SecretKeySpec(this.f32242b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = m38888a.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && C12145q.m38910b()) {
            doFinal = new byte[0];
        }
        if (C12134f.m38882b(copyOfRange, m38871c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
