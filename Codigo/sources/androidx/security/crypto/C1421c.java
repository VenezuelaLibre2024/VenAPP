package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: androidx.security.crypto.c */
/* loaded from: classes.dex */
public final class C1421c {

    /* renamed from: a */
    private final String f6293a;

    /* renamed from: b */
    private final KeyGenParameterSpec f6294b;

    /* renamed from: androidx.security.crypto.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final String f6295a;

        /* renamed from: b */
        KeyGenParameterSpec f6296b;

        /* renamed from: c */
        b f6297c;

        /* renamed from: d */
        boolean f6298d;

        /* renamed from: e */
        int f6299e;

        /* renamed from: f */
        boolean f6300f;

        /* renamed from: g */
        final Context f6301g;

        /* renamed from: androidx.security.crypto.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C13170a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C13171a {
                /* renamed from: a */
                static void m8147a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$a$a$b */
            /* loaded from: classes.dex */
            public static class b {
                /* renamed from: a */
                static void m8148a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            /* renamed from: a */
            static C1421c m8145a(a aVar) {
                b bVar = aVar.f6297c;
                if (bVar == null && aVar.f6296b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f6295a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecognitionOptions.QR_CODE);
                    if (aVar.f6298d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.m8148a(keySize, aVar.f6299e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f6299e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f6300f && aVar.f6301g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C13171a.m8147a(keySize);
                    }
                    aVar.f6296b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f6296b;
                if (keyGenParameterSpec != null) {
                    return new C1421c(C1423e.m8153c(keyGenParameterSpec), aVar.f6296b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            /* renamed from: b */
            static String m8146b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public a(Context context, String str) {
            this.f6301g = context.getApplicationContext();
            this.f6295a = str;
        }

        /* renamed from: a */
        public C1421c m8143a() {
            return C13170a.m8145a(this);
        }

        /* renamed from: b */
        public a m8144b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f6297c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f6295a.equals(C13170a.m8146b(keyGenParameterSpec))) {
                this.f6296b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f6295a + " vs " + C13170a.m8146b(keyGenParameterSpec));
        }
    }

    /* renamed from: androidx.security.crypto.c$b */
    /* loaded from: classes.dex */
    public enum b {
        AES256_GCM
    }

    C1421c(String str, Object obj) {
        this.f6293a = str;
        this.f6294b = (KeyGenParameterSpec) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m8141a() {
        return this.f6293a;
    }

    /* renamed from: b */
    public boolean m8142b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f6293a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f6293a + ", isKeyStoreBacked=" + m8142b() + "}";
    }
}
