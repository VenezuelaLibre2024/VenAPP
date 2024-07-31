package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzghe {
    public static zzggq zza(byte[] bArr) {
        try {
            zzguy zze = zzguy.zze(bArr, zzgzf.zza());
            zzgoe zzd = zzgoe.zzd();
            zzgoy zza = zzgoy.zza(zze);
            return !zzd.zzk(zza) ? new zzgnp(zza) : zzd.zzc(zza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zzb(zzggq zzggqVar) {
        return ((zzgoy) zzgoe.zzd().zzf(zzggqVar, zzgoy.class)).zzc().zzax();
    }
}
