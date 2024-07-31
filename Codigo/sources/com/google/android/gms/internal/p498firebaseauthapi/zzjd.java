package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzjd implements zzbp {
    private final zzcg<zzbp> zza;
    private final zzrr zzb;
    private final zzrr zzc;

    public zzjd(zzcg<zzbp> zzcgVar) {
        zzrr zzrrVar;
        this.zza = zzcgVar;
        if (zzcgVar.zzf()) {
            zzro zzb = zznn.zza().zzb();
            zzrq zza = zznh.zza(zzcgVar);
            this.zzb = zzb.zza(zza, "daead", "encrypt");
            zzrrVar = zzb.zza(zza, "daead", "decrypt");
        } else {
            zzrrVar = zznh.zza;
            this.zzb = zzrrVar;
        }
        this.zzc = zzrrVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl<zzbp> zzclVar : this.zza.zza(copyOf)) {
                try {
                    byte[] zza = zzclVar.zzf().zza(copyOfRange, bArr2);
                    this.zzc.zza(zzclVar.zza(), copyOfRange.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl<zzbp> zzclVar2 : this.zza.zze()) {
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
}
