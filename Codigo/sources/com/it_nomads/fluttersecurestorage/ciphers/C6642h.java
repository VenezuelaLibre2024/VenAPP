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

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.h */
/* loaded from: classes.dex */
public class C6642h implements InterfaceC6643i {

    /* renamed from: a */
    private final Cipher f14680a;

    /* renamed from: b */
    private final SecureRandom f14681b = new SecureRandom();

    /* renamed from: c */
    private Key f14682c;

    public C6642h(Context context, InterfaceC6635a interfaceC6635a) {
        String mo19375c = mo19375c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(mo19375c, null);
        this.f14680a = mo19376d();
        if (string != null) {
            try {
                this.f14682c = interfaceC6635a.mo19361b(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e10) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e10);
            }
        }
        byte[] bArr = new byte[16];
        this.f14681b.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f14682c = secretKeySpec;
        edit.putString(mo19375c, Base64.encodeToString(interfaceC6635a.mo19360a(secretKeySpec), 0));
        edit.apply();
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6643i
    /* renamed from: a */
    public byte[] mo19373a(byte[] bArr) {
        int mo19377e = mo19377e();
        byte[] bArr2 = new byte[mo19377e];
        this.f14681b.nextBytes(bArr2);
        this.f14680a.init(1, this.f14682c, mo19378f(bArr2));
        byte[] doFinal = this.f14680a.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + mo19377e];
        System.arraycopy(bArr2, 0, bArr3, 0, mo19377e);
        System.arraycopy(doFinal, 0, bArr3, mo19377e, doFinal.length);
        return bArr3;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6643i
    /* renamed from: b */
    public byte[] mo19374b(byte[] bArr) {
        int mo19377e = mo19377e();
        byte[] bArr2 = new byte[mo19377e];
        System.arraycopy(bArr, 0, bArr2, 0, mo19377e);
        AlgorithmParameterSpec mo19378f = mo19378f(bArr2);
        int length = bArr.length - mo19377e();
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, mo19377e, bArr3, 0, length);
        this.f14680a.init(2, this.f14682c, mo19378f);
        return this.f14680a.doFinal(bArr3);
    }

    /* renamed from: c */
    protected String mo19375c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    /* renamed from: d */
    protected Cipher mo19376d() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    /* renamed from: e */
    protected int mo19377e() {
        return 16;
    }

    /* renamed from: f */
    protected AlgorithmParameterSpec mo19378f(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }
}
