package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes2.dex */
public final class zzmd implements zzcc {
    private static final Object zza = new Object();
    private static final String zzb = "zzmd";
    private final String zzc;
    private KeyStore zzd;

    /* loaded from: classes2.dex */
    public static final class zza {
        KeyStore zza;
        private String zzb = null;

        public zza() {
            this.zza = null;
            if (!zzmd.zza()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zza = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public zzmd() {
        this(new zza());
    }

    private zzmd(zza zzaVar) {
        this.zzc = null;
        this.zzd = zzaVar.zza;
    }

    static /* synthetic */ boolean zza() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(String str) {
        zzmd zzmdVar = new zzmd();
        synchronized (zza) {
            if (zzmdVar.zzd(str)) {
                return false;
            }
            String zza2 = zzxo.zza("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(RecognitionOptions.QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return true;
        }
    }

    private final synchronized boolean zzd(String str) {
        String zza2;
        zza2 = zzxo.zza("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzd = keyStore;
                keyStore.load(null);
                return this.zzd.containsAlias(zza2);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.zzd.containsAlias(zza2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final synchronized zzbg zza(String str) {
        zzmb zzmbVar;
        zzmbVar = new zzmb(zzxo.zza("android-keystore://", str), this.zzd);
        byte[] zza2 = zzou.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzmbVar.zza(zzmbVar.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzmbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcc
    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
