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

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5468a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f5469b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f5470a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f5471b;

        /* renamed from: c, reason: collision with root package name */
        b f5472c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5473d;

        /* renamed from: e, reason: collision with root package name */
        int f5474e;

        /* renamed from: f, reason: collision with root package name */
        boolean f5475f;

        /* renamed from: g, reason: collision with root package name */
        final Context f5476g;

        /* renamed from: androidx.security.crypto.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0085a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0086a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$a$a$b */
            /* loaded from: classes.dex */
            public static class b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static c a(a aVar) {
                b bVar = aVar.f5472c;
                if (bVar == null && aVar.f5471b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f5470a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecognitionOptions.QR_CODE);
                    if (aVar.f5473d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f5474e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f5474e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f5475f && aVar.f5476g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0086a.a(keySize);
                    }
                    aVar.f5471b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f5471b;
                if (keyGenParameterSpec != null) {
                    return new c(e.c(keyGenParameterSpec), aVar.f5471b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public a(Context context, String str) {
            this.f5476g = context.getApplicationContext();
            this.f5470a = str;
        }

        public c a() {
            return C0085a.a(this);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f5472c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f5470a.equals(C0085a.b(keyGenParameterSpec))) {
                this.f5471b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f5470a + " vs " + C0085a.b(keyGenParameterSpec));
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AES256_GCM
    }

    c(String str, Object obj) {
        this.f5468a = str;
        this.f5469b = (KeyGenParameterSpec) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f5468a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f5468a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f5468a + ", isKeyStoreBacked=" + b() + "}";
    }
}
