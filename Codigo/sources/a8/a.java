package a8;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s8.m0;

/* loaded from: classes.dex */
class a implements s8.j {

    /* renamed from: a, reason: collision with root package name */
    private final s8.j f114a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f115b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f116c;

    /* renamed from: d, reason: collision with root package name */
    private CipherInputStream f117d;

    public a(s8.j jVar, byte[] bArr, byte[] bArr2) {
        this.f114a = jVar;
        this.f115b = bArr;
        this.f116c = bArr2;
    }

    @Override // s8.j
    public void close() {
        if (this.f117d != null) {
            this.f117d = null;
            this.f114a.close();
        }
    }

    @Override // s8.j
    public final Map<String, List<String>> e() {
        return this.f114a.e();
    }

    @Override // s8.j
    public final Uri getUri() {
        return this.f114a.getUri();
    }

    protected Cipher h() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // s8.j
    public final void l(m0 m0Var) {
        t8.a.e(m0Var);
        this.f114a.l(m0Var);
    }

    @Override // s8.j
    public final long o(s8.n nVar) {
        try {
            Cipher h10 = h();
            try {
                h10.init(2, new SecretKeySpec(this.f115b, "AES"), new IvParameterSpec(this.f116c));
                s8.l lVar = new s8.l(this.f114a, nVar);
                this.f117d = new CipherInputStream(lVar, h10);
                lVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // s8.h
    public final int read(byte[] bArr, int i10, int i11) {
        t8.a.e(this.f117d);
        int read = this.f117d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
