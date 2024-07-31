package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Cipher f13406a;

    /* renamed from: b, reason: collision with root package name */
    private final SecureRandom f13407b = new SecureRandom();

    /* renamed from: c, reason: collision with root package name */
    private Key f13408c;

    public h(Context context, a aVar) {
        String c10 = c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(c10, null);
        this.f13406a = d();
        if (string != null) {
            try {
                this.f13408c = aVar.b(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e10) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e10);
            }
        }
        byte[] bArr = new byte[16];
        this.f13407b.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f13408c = secretKeySpec;
        edit.putString(c10, Base64.encodeToString(aVar.a(secretKeySpec), 0));
        edit.apply();
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.i
    public byte[] a(byte[] bArr) {
        int e10 = e();
        byte[] bArr2 = new byte[e10];
        this.f13407b.nextBytes(bArr2);
        this.f13406a.init(1, this.f13408c, f(bArr2));
        byte[] doFinal = this.f13406a.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + e10];
        System.arraycopy(bArr2, 0, bArr3, 0, e10);
        System.arraycopy(doFinal, 0, bArr3, e10, doFinal.length);
        return bArr3;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.i
    public byte[] b(byte[] bArr) {
        int e10 = e();
        byte[] bArr2 = new byte[e10];
        System.arraycopy(bArr, 0, bArr2, 0, e10);
        AlgorithmParameterSpec f10 = f(bArr2);
        int length = bArr.length - e();
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, e10, bArr3, 0, length);
        this.f13406a.init(2, this.f13408c, f10);
        return this.f13406a.doFinal(bArr3);
    }

    protected String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    protected Cipher d() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    protected int e() {
        return 16;
    }

    protected AlgorithmParameterSpec f(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }
}
