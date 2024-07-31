package wb;

import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ob.b;

/* loaded from: classes2.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0370b f29758d = b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f29759e = new C0480a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f29760a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29761b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29762c;

    /* renamed from: wb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0480a extends ThreadLocal<Cipher> {
        C0480a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f29799b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        if (!f29758d.b()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f29760a = new SecretKeySpec(bArr, "AES");
        int blockSize = f29759e.get().getBlockSize();
        this.f29762c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f29761b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = f29759e.get();
        byte[] bArr4 = new byte[this.f29762c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f29761b);
        cipher.init(z10 ? 1 : 2, this.f29760a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // wb.l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f29761b;
        if (length > a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.f29761b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] c10 = p.c(i10);
        System.arraycopy(c10, 0, bArr2, 0, this.f29761b);
        c(bArr, 0, bArr.length, bArr2, this.f29761b, c10, true);
        return bArr2;
    }

    @Override // wb.l
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f29761b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f29761b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
