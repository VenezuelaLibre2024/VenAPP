package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.g */
/* loaded from: classes.dex */
public class C6641g extends C6640f {
    public C6641g(Context context) {
        super(context);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f, com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6635a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ byte[] mo19360a(Key key) {
        return super.mo19360a(key);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f, com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6635a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Key mo19361b(byte[] bArr, String str) {
        return super.mo19361b(bArr, str);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f
    /* renamed from: c */
    protected String mo19369c() {
        return this.f14679b.getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f
    /* renamed from: f */
    protected AlgorithmParameterSpec mo19370f() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f
    /* renamed from: i */
    protected Cipher mo19371i() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.C6640f
    /* renamed from: j */
    protected AlgorithmParameterSpec mo19372j(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f14678a, 3).setCertificateSubject(new X500Principal("CN=" + this.f14678a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
