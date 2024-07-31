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

/* renamed from: com.it_nomads.fluttersecurestorage.ciphers.f */
/* loaded from: classes.dex */
class C6640f implements InterfaceC6635a {

    /* renamed from: a */
    protected final String f14678a = mo19369c();

    /* renamed from: b */
    protected final Context f14679b;

    public C6640f(Context context) {
        this.f14679b = context;
        m19365e(context);
    }

    /* renamed from: d */
    private void m19364d(Context context) {
        Locale locale = Locale.getDefault();
        try {
            m19368k(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(mo19372j(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
        } finally {
            m19368k(locale);
        }
    }

    /* renamed from: e */
    private void m19365e(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.f14678a, null) == null) {
            m19364d(context);
        }
    }

    /* renamed from: g */
    private PrivateKey m19366g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f14678a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f14678a);
    }

    /* renamed from: h */
    private PublicKey m19367h() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f14678a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f14678a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f14678a);
    }

    /* renamed from: k */
    private void m19368k(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f14679b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f14679b.createConfigurationContext(configuration);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6635a
    /* renamed from: a */
    public byte[] mo19360a(Key key) {
        PublicKey m19367h = m19367h();
        Cipher mo19371i = mo19371i();
        mo19371i.init(3, m19367h, mo19370f());
        return mo19371i.wrap(key);
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.InterfaceC6635a
    /* renamed from: b */
    public Key mo19361b(byte[] bArr, String str) {
        PrivateKey m19366g = m19366g();
        Cipher mo19371i = mo19371i();
        mo19371i.init(4, m19366g, mo19370f());
        return mo19371i.unwrap(bArr, str, 3);
    }

    /* renamed from: c */
    protected String mo19369c() {
        return this.f14679b.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    /* renamed from: f */
    protected AlgorithmParameterSpec mo19370f() {
        return null;
    }

    /* renamed from: i */
    protected Cipher mo19371i() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    /* renamed from: j */
    protected AlgorithmParameterSpec mo19372j(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f14678a, 3).setCertificateSubject(new X500Principal("CN=" + this.f14678a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
