package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzko implements zzbo {
    private final zzcg<zzbo> zza;
    private final zzrr zzb;

    public zzko(zzcg<zzbo> zzcgVar) {
        this.zza = zzcgVar;
        this.zzb = zzcgVar.zzf() ? zznn.zza().zzb().zza(zznh.zza(zzcgVar), "hybrid_decrypt", "decrypt") : zznh.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (zzcl<zzbo> zzclVar : this.zza.zza(copyOfRange)) {
                try {
                    byte[] zza = zzclVar.zzf().zza(copyOfRange2, bArr2);
                    this.zzb.zza(zzclVar.zza(), copyOfRange2.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzcl<zzbo> zzclVar2 : this.zza.zze()) {
            try {
                byte[] zza2 = zzclVar2.zzf().zza(bArr, bArr2);
                this.zzb.zza(zzclVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
