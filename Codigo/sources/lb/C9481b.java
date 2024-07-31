package lb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p271ob.C9830b;
import p419wb.C12137i;
import p419wb.C12145q;
import p419wb.C12146r;

/* renamed from: lb.b */
/* loaded from: classes2.dex */
public final class C9481b {

    /* renamed from: c */
    public static final C9830b.b f23026c = C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f23027d = new a();

    /* renamed from: a */
    private final SecretKey f23028a;

    /* renamed from: b */
    private final boolean f23029b;

    /* renamed from: lb.b$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C12137i.f32264b.m38888a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C9481b(byte[] bArr, boolean z10) {
        if (!f23026c.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C12146r.m38911a(bArr.length);
        this.f23028a = new SecretKeySpec(bArr, "AES");
        this.f23029b = z10;
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m28195c(byte[] bArr) {
        return m28196d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    private static AlgorithmParameterSpec m28196d(byte[] bArr, int i10, int i11) {
        return (!C12145q.m38910b() || C12145q.m38909a() > 19) ? new GCMParameterSpec(RecognitionOptions.ITF, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    /* renamed from: a */
    public byte[] m28197a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z10 = this.f23029b;
        if (bArr2.length < (z10 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z10 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec m28195c = m28195c(bArr);
        ThreadLocal<Cipher> threadLocal = f23027d;
        threadLocal.get().init(2, this.f23028a, m28195c);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocal.get().updateAAD(bArr3);
        }
        boolean z11 = this.f23029b;
        return threadLocal.get().doFinal(bArr2, z11 ? 12 : 0, z11 ? bArr2.length - 12 : bArr2.length);
    }

    /* renamed from: b */
    public byte[] m28198b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z10 = this.f23029b;
        int length = bArr2.length;
        if (z10) {
            length += 12;
        }
        byte[] bArr4 = new byte[length + 16];
        if (z10) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec m28195c = m28195c(bArr);
        ThreadLocal<Cipher> threadLocal = f23027d;
        threadLocal.get().init(1, this.f23028a, m28195c);
        if (bArr3 != null && bArr3.length != 0) {
            threadLocal.get().updateAAD(bArr3);
        }
        int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, this.f23029b ? 12 : 0);
        if (doFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
    }
}
