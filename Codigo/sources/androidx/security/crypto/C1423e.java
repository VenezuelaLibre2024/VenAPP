package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@Deprecated
/* renamed from: androidx.security.crypto.e */
/* loaded from: classes.dex */
public final class C1423e {

    /* renamed from: a */
    public static final KeyGenParameterSpec f6302a = m8151a("_androidx_security_master_key_");

    /* renamed from: b */
    private static final Object f6303b = new Object();

    /* renamed from: a */
    private static KeyGenParameterSpec m8151a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(RecognitionOptions.QR_CODE).build();
    }

    /* renamed from: b */
    private static void m8152b(KeyGenParameterSpec keyGenParameterSpec) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e10) {
            throw new GeneralSecurityException(e10.getMessage(), e10);
        }
    }

    /* renamed from: c */
    public static String m8153c(KeyGenParameterSpec keyGenParameterSpec) {
        m8155e(keyGenParameterSpec);
        synchronized (f6303b) {
            if (!m8154d(keyGenParameterSpec.getKeystoreAlias())) {
                m8152b(keyGenParameterSpec);
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    private static boolean m8154d(String str) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    /* renamed from: e */
    static void m8155e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
    }
}