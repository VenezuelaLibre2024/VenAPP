package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzuy;
import com.google.android.gms.internal.p498firebaseauthapi.zzvg;
import com.google.android.gms.internal.p498firebaseauthapi.zzvj;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzcx {
    private static final Charset zza = Charset.forName("UTF-8");

    public static zzvj zza(zzvg zzvgVar) {
        zzvj.zzb zza2 = zzvj.zza().zza(zzvgVar.zzb());
        for (zzvg.zzb zzbVar : zzvgVar.zze()) {
            zza2.zza((zzvj.zza) ((zzajc) zzvj.zza.zzb().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zzf()));
        }
        return (zzvj) ((zzajc) zza2.zzf());
    }

    public static void zzb(zzvg zzvgVar) {
        int zzb = zzvgVar.zzb();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzvg.zzb zzbVar : zzvgVar.zze()) {
            if (zzbVar.zzc() == zzuz.ENABLED) {
                if (!zzbVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzf() == zzvs.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zzc() == zzuz.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zza())));
                }
                if (zzbVar.zza() == zzb) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (zzbVar.zzb().zzb() != zzuy.zza.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
