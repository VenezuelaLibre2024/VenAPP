package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgqt {
    private Integer zza;
    private Integer zzb;
    private zzgqu zzc;
    private zzgqv zzd;

    private zzgqt() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgqt(zzgqs zzgqsVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgqv.zzd;
    }

    public final zzgqt zza(zzgqu zzgquVar) {
        this.zzc = zzgquVar;
        return this;
    }

    public final zzgqt zzb(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgqt zzc(int i10) {
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgqt zzd(zzgqv zzgqvVar) {
        this.zzd = zzgqvVar;
        return this;
    }

    public final zzgqx zze() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        int intValue = this.zzb.intValue();
        zzgqu zzgquVar = this.zzc;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
        }
        if (zzgquVar == zzgqu.zza) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
            }
        } else if (zzgquVar == zzgqu.zzb) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
            }
        } else if (zzgquVar == zzgqu.zzc) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
            }
        } else if (zzgquVar == zzgqu.zzd) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
            }
        } else {
            if (zzgquVar != zzgqu.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
            }
        }
        return new zzgqx(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
