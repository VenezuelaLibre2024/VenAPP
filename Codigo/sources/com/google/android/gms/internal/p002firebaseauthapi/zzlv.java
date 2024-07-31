package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlv implements zzlj {
    private final zzwo zza;
    private final zzla zzb;

    private zzlv(zzla zzlaVar, zzwo zzwoVar) {
        this.zzb = zzlaVar;
        this.zza = zzwoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlv zza(zzwo zzwoVar) {
        int i10 = zzlu.zza[zzwoVar.ordinal()];
        if (i10 == 1) {
            return new zzlv(new zzla("HmacSha256"), zzwo.NIST_P256);
        }
        if (i10 == 2) {
            return new zzlv(new zzla("HmacSha384"), zzwo.NIST_P384);
        }
        if (i10 == 3) {
            return new zzlv(new zzla("HmacSha512"), zzwo.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzwoVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final byte[] zza() {
        int i10 = zzlu.zza[this.zza.ordinal()];
        if (i10 == 1) {
            return zzlt.zzc;
        }
        if (i10 == 2) {
            return zzlt.zzd;
        }
        if (i10 == 3) {
            return zzlt.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final byte[] zza(byte[] bArr, zzll zzllVar) {
        byte[] zza = zzwp.zza(zzwp.zza(this.zza, zzllVar.zza().zzb()), zzwp.zza(this.zza, zzwr.UNCOMPRESSED, bArr));
        byte[] zza2 = zzwg.zza(bArr, zzllVar.zzb().zzb());
        byte[] zza3 = zzlt.zza(zza());
        zzla zzlaVar = this.zzb;
        return zzlaVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzlaVar.zza());
    }
}
