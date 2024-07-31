package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes2.dex */
public final class zzma {
    private static final Object zza = new Object();
    private static final String zzb = "zzma";
    private final zzcd zzc;
    private final zzbg zzd;
    private zzcb zze;

    /* loaded from: classes2.dex */
    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbg zze = null;
        private boolean zzf = true;
        private zzbu zzg = null;
        private zzvb zzh = null;
        private zzcb zzi;

        private static zzcb zza(byte[] bArr) {
            return zzcb.zza(zzbl.zza(zzbj.zza(bArr)));
        }

        private final zzbg zzb() {
            if (!zzma.zzd()) {
                Log.w(zzma.zzb, "Android Keystore requires at least Android M");
                return null;
            }
            zzmd zzmdVar = new zzmd();
            try {
                boolean zzc = zzmd.zzc(this.zzd);
                try {
                    return zzmdVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zzc) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.zzd), e10);
                    }
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        private final zzcb zzb(byte[] bArr) {
            try {
                this.zze = new zzmd().zza(this.zzd);
                try {
                    return zzcb.zza(zzbx.zza(zzbj.zza(bArr), this.zze));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzcb zza = zza(bArr);
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zza;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                if (string.length() % 2 != 0) {
                    throw new IllegalArgumentException("Expected a string of even length");
                }
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    int digit = Character.digit(string.charAt(i11), 16);
                    int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i10] = (byte) ((digit << 4) + digit2);
                }
                return bArr;
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.zza = context;
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public final zza zza(zzvb zzvbVar) {
            this.zzh = zzvbVar;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.zzd = str;
            return this;
        }

        public final synchronized zzma zza() {
            zzcb zza;
            zzma zzmaVar;
            if (this.zzb == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            zzvb zzvbVar = this.zzh;
            if (zzvbVar != null && this.zzg == null) {
                this.zzg = zzbu.zza(zzcu.zza(zzvbVar.zzj()));
            }
            synchronized (zzma.zza) {
                byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                if (zzb == null) {
                    if (this.zzd != null) {
                        this.zze = zzb();
                    }
                    if (this.zzg == null) {
                        throw new GeneralSecurityException("cannot read or generate keyset");
                    }
                    zzcb zza2 = zzcb.zzb().zza(this.zzg);
                    zza = zza2.zza(zza2.zza().zzc().zza(0).zza());
                    zzma.zza(zza.zza(), new zzmf(this.zza, this.zzb, this.zzc), this.zze);
                } else {
                    if (this.zzd != null && zzma.zzd()) {
                        zza = zzb(zzb);
                    }
                    zza = zza(zzb);
                }
                this.zzi = zza;
                zzmaVar = new zzma(this);
            }
            return zzmaVar;
        }
    }

    private zzma(zza zzaVar) {
        this.zzc = new zzmf(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzd = zzaVar.zze;
        this.zze = zzaVar.zzi;
    }

    static /* synthetic */ void zza(zzbx zzbxVar, zzcd zzcdVar, zzbg zzbgVar) {
        try {
            if (zzbgVar != null) {
                zzbxVar.zza(zzcdVar, zzbgVar);
            } else {
                zzbl.zza(zzbxVar, zzcdVar);
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbx zza() {
        return this.zze.zza();
    }
}
