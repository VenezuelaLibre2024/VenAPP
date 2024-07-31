package p419wb;

import com.google.android.gms.common.api.C5101a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p271ob.C9830b;

/* renamed from: wb.a */
/* loaded from: classes2.dex */
public final class C12129a implements InterfaceC12140l {

    /* renamed from: d */
    public static final C9830b.b f32223d = C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e */
    private static final ThreadLocal<Cipher> f32224e = new a();

    /* renamed from: a */
    private final SecretKeySpec f32225a;

    /* renamed from: b */
    private final int f32226b;

    /* renamed from: c */
    private final int f32227c;

    /* renamed from: wb.a$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C12137i.f32264b.m38888a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C12129a(byte[] bArr, int i10) {
        if (!f32223d.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        C12146r.m38911a(bArr.length);
        this.f32225a = new SecretKeySpec(bArr, "AES");
        int blockSize = f32224e.get().getBlockSize();
        this.f32227c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f32226b = i10;
    }

    /* renamed from: c */
    private void m38861c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = f32224e.get();
        byte[] bArr4 = new byte[this.f32227c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f32226b);
        cipher.init(z10 ? 1 : 2, this.f32225a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // p419wb.InterfaceC12140l
    /* renamed from: a */
    public byte[] mo38862a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f32226b;
        if (length > C5101a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (C5101a.e.API_PRIORITY_OTHER - this.f32226b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] m38907c = C12144p.m38907c(i10);
        System.arraycopy(m38907c, 0, bArr2, 0, this.f32226b);
        m38861c(bArr, 0, bArr.length, bArr2, this.f32226b, m38907c, true);
        return bArr2;
    }

    @Override // p419wb.InterfaceC12140l
    /* renamed from: b */
    public byte[] mo38863b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f32226b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f32226b;
        byte[] bArr3 = new byte[length2 - i11];
        m38861c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
