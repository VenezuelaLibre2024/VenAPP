package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzqv implements zzce {
    private final zzcg<zzce> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    private zzqv(zzcg<zzce> zzcgVar) {
        zzrr zzrrVar;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzb = zznn.zza().zzb();
            zzrq zza = zznh.zza(zzcgVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzrrVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzrrVar = zznh.zza;
            this.zzb = zzrrVar;
        }
        this.zzc = zzrrVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzce
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            this.zzc.zza();
            throw new GeneralSecurityException("tag too short");
        }
        for (zzcl<zzce> zzclVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
            try {
                zzclVar.zze().zza(bArr, bArr2);
                this.zzc.zza(zzclVar.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzcl<zzce> zzclVar2 : this.zza.zze()) {
            try {
                zzclVar2.zze().zza(bArr, bArr2);
                this.zzc.zza(zzclVar2.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzce
    public final byte[] zza(byte[] bArr) {
        try {
            byte[] zza = this.zza.zza().zze().zza(bArr);
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            return zza;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
