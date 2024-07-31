package p238mb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p179jb.InterfaceC9009a;
import p419wb.C12137i;
import p419wb.C12144p;
import p419wb.C12145q;
import p419wb.C12146r;

/* renamed from: mb.a */
/* loaded from: classes2.dex */
public final class C9563a implements InterfaceC9009a {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f23268b = new a();

    /* renamed from: a */
    private final SecretKey f23269a;

    /* renamed from: mb.a$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C12137i.f32264b.m38888a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C9563a(byte[] bArr) {
        C12146r.m38911a(bArr.length);
        this.f23269a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m28447c(byte[] bArr) {
        return m28448d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    private static AlgorithmParameterSpec m28448d(byte[] bArr, int i10, int i11) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(RecognitionOptions.ITF, bArr, i10, i11);
        } catch (ClassNotFoundException unused) {
            if (C12145q.m38910b()) {
                return new IvParameterSpec(bArr, i10, i11);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] m38907c = C12144p.m38907c(12);
        System.arraycopy(m38907c, 0, bArr3, 0, 12);
        AlgorithmParameterSpec m28447c = m28447c(m38907c);
        ThreadLocal<Cipher> threadLocal = f23268b;
        threadLocal.get().init(1, this.f23269a, m28447c);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int doFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec m28448d = m28448d(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = f23268b;
        threadLocal.get().init(2, this.f23269a, m28448d);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
