package com.it_nomads.fluttersecurestorage.ciphers;

import android.content.Context;
import android.content.res.Configuration;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
class f implements a {

    /* renamed from: a, reason: collision with root package name */
    protected final String f13404a = c();

    /* renamed from: b, reason: collision with root package name */
    protected final Context f13405b;

    public f(Context context) {
        this.f13405b = context;
        e(context);
    }

    private void d(Context context) {
        Locale locale = Locale.getDefault();
        try {
            k(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(j(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
        } finally {
            k(locale);
        }
    }

    private void e(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.f13404a, null) == null) {
            d(context);
        }
    }

    private PrivateKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f13404a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f13404a);
    }

    private PublicKey h() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f13404a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f13404a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f13404a);
    }

    private void k(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f13405b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f13405b.createConfigurationContext(configuration);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public byte[] a(Key key) {
        PublicKey h10 = h();
        Cipher i10 = i();
        i10.init(3, h10, f());
        return i10.wrap(key);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public Key b(byte[] bArr, String str) {
        PrivateKey g10 = g();
        Cipher i10 = i();
        i10.init(4, g10, f());
        return i10.unwrap(bArr, str, 3);
    }

    protected String c() {
        return this.f13405b.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    protected AlgorithmParameterSpec f() {
        return null;
    }

    protected Cipher i() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    protected AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f13404a, 3).setCertificateSubject(new X500Principal("CN=" + this.f13404a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
