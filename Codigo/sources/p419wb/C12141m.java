package p419wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p271ob.C9830b;
import p380ub.InterfaceC11528a;
import sb.C10880a;

/* renamed from: wb.m */
/* loaded from: classes2.dex */
public final class C12141m implements InterfaceC11528a {

    /* renamed from: d */
    public static final C9830b.b f32275d = C9830b.b.ALGORITHM_NOT_FIPS;

    /* renamed from: a */
    private final SecretKey f32276a;

    /* renamed from: b */
    private byte[] f32277b;

    /* renamed from: c */
    private byte[] f32278c;

    public C12141m(byte[] bArr) {
        C12146r.m38911a(bArr.length);
        this.f32276a = new SecretKeySpec(bArr, "AES");
        m38900b();
    }

    /* renamed from: b */
    private void m38900b() {
        Cipher m38901c = m38901c();
        m38901c.init(1, this.f32276a);
        byte[] m33191b = C10880a.m33191b(m38901c.doFinal(new byte[16]));
        this.f32277b = m33191b;
        this.f32278c = C10880a.m33191b(m33191b);
    }

    /* renamed from: c */
    private static Cipher m38901c() {
        if (f32275d.mo29502b()) {
            return C12137i.f32264b.m38888a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // p380ub.InterfaceC11528a
    /* renamed from: a */
    public byte[] mo36088a(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher m38901c = m38901c();
        m38901c.init(1, this.f32276a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] m38884d = max * 16 == bArr.length ? C12134f.m38884d(bArr, (max - 1) * 16, this.f32277b, 0, 16) : C12134f.m38885e(C10880a.m33190a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f32278c);
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < max - 1; i11++) {
            bArr2 = m38901c.doFinal(C12134f.m38884d(bArr2, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(m38901c.doFinal(C12134f.m38885e(m38884d, bArr2)), i10);
    }
}
