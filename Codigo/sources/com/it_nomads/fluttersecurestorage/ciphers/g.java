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

/* loaded from: classes.dex */
public class g extends f {
    public g(Context context) {
        super(context);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f, com.it_nomads.fluttersecurestorage.ciphers.a
    public /* bridge */ /* synthetic */ byte[] a(Key key) {
        return super.a(key);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f, com.it_nomads.fluttersecurestorage.ciphers.a
    public /* bridge */ /* synthetic */ Key b(byte[] bArr, String str) {
        return super.b(bArr, str);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    protected String c() {
        return this.f13405b.getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    protected AlgorithmParameterSpec f() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    protected Cipher i() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.f
    protected AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f13404a, 3).setCertificateSubject(new X500Principal("CN=" + this.f13404a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
