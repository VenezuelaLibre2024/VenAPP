package com.google.android.gms.internal.p498firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzcu {
    public static zzch zza(byte[] bArr) {
        try {
            zzvb zza = zzvb.zza(bArr, zzaio.zza());
            zznu zza2 = zznu.zza();
            zzor zza3 = zzor.zza(zza);
            return !zza2.zzb(zza3) ? new zznf(zza3) : zza2.zza((zznu) zza3);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzch zzchVar) {
        return (zzchVar instanceof zznf ? ((zznf) zzchVar).zzb() : (zzor) zznu.zza().zza((zznu) zzchVar, zzor.class)).zza().zzj();
    }
}
