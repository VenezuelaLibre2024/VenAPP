package p010a8;

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
import p351s8.C10831l;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p363t8.C11137a;

/* renamed from: a8.a */
/* loaded from: classes.dex */
class C0043a implements InterfaceC10827j {

    /* renamed from: a */
    private final InterfaceC10827j f114a;

    /* renamed from: b */
    private final byte[] f115b;

    /* renamed from: c */
    private final byte[] f116c;

    /* renamed from: d */
    private CipherInputStream f117d;

    public C0043a(InterfaceC10827j interfaceC10827j, byte[] bArr, byte[] bArr2) {
        this.f114a = interfaceC10827j;
        this.f115b = bArr;
        this.f116c = bArr2;
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        if (this.f117d != null) {
            this.f117d = null;
            this.f114a.close();
        }
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: e */
    public final Map<String, List<String>> mo159e() {
        return this.f114a.mo159e();
    }

    @Override // p351s8.InterfaceC10827j
    public final Uri getUri() {
        return this.f114a.getUri();
    }

    /* renamed from: h */
    protected Cipher m160h() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public final void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34603e(interfaceC10834m0);
        this.f114a.mo161l(interfaceC10834m0);
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public final long mo162o(C10835n c10835n) {
        try {
            Cipher m160h = m160h();
            try {
                m160h.init(2, new SecretKeySpec(this.f115b, "AES"), new IvParameterSpec(this.f116c));
                C10831l c10831l = new C10831l(this.f114a, c10835n);
                this.f117d = new CipherInputStream(c10831l, m160h);
                c10831l.m33014b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public final int read(byte[] bArr, int i10, int i11) {
        C11137a.m34603e(this.f117d);
        int read = this.f117d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
