package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlw implements zzlj {
    private final zzla zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlw(zzla zzlaVar) {
        this.zza = zzlaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final byte[] zza() {
        if (Arrays.equals(this.zza.zzb(), zzlt.zzf)) {
            return zzlt.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final byte[] zza(byte[] bArr, zzll zzllVar) {
        byte[] zza = zzxr.zza(zzllVar.zza().zzb(), bArr);
        byte[] zza2 = zzwg.zza(bArr, zzllVar.zzb().zzb());
        byte[] zza3 = zzlt.zza(zzlt.zzb);
        zzla zzlaVar = this.zza;
        return zzlaVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzlaVar.zza());
    }
}
