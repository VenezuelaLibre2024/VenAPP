package p309qb;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p179jb.InterfaceC9009a;

/* renamed from: qb.b */
/* loaded from: classes2.dex */
public final class C10416b implements InterfaceC9009a {

    /* renamed from: b */
    private static final String f25958b = "b";

    /* renamed from: a */
    private final SecretKey f25959a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10416b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f25959a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    /* renamed from: c */
    private byte[] m31217c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(RecognitionOptions.ITF, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f25959a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    /* renamed from: d */
    private byte[] m31218d(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f25959a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    /* renamed from: e */
    private static void m31219e() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        try {
            return m31218d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f25958b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            m31219e();
            return m31218d(bArr, bArr2);
        }
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return m31217c(bArr, bArr2);
        } catch (ProviderException e10) {
            e = e10;
            Log.w(f25958b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m31219e();
            return m31217c(bArr, bArr2);
        } catch (AEADBadTagException e11) {
            throw e11;
        } catch (GeneralSecurityException e12) {
            e = e12;
            Log.w(f25958b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m31219e();
            return m31217c(bArr, bArr2);
        }
    }
}
