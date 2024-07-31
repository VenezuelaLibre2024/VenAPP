package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzdd implements zzbg {
    private final zzcg<zzbg> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzdd(zzcg<zzbg> zzcgVar) {
        zzrr zzrrVar;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzb = zznn.zza().zzb();
            zzrq zza = zznh.zza(zzcgVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzrrVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzrrVar = zznh.zza;
            this.zzb = zzrrVar;
        }
        this.zzc = zzrrVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl<zzbg> zzclVar : this.zza.zza(copyOf)) {
                try {
                    byte[] zza = zzclVar.zzf().zza(copyOfRange, bArr2);
                    this.zzc.zza(zzclVar.zza(), copyOfRange.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl<zzbg> zzclVar2 : this.zza.zze()) {
            try {
                byte[] zza2 = zzclVar2.zzf().zza(bArr, bArr2);
                this.zzc.zza(zzclVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        try {
            byte[] zza = zzwg.zza(this.zza.zza().zzh(), this.zza.zza().zzf().zzb(bArr, bArr2));
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            return zza;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
