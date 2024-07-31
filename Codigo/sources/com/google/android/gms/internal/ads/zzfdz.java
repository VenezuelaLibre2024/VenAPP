package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdz {
    private final zzfiv zza;
    private final zzdae zzb;
    private final Executor zzc;
    private zzfdy zzd;

    public zzfdz(zzfiv zzfivVar, zzdae zzdaeVar, Executor executor) {
        this.zza = zzfivVar;
        this.zzb = zzdaeVar;
        this.zzc = executor;
    }

    @Deprecated
    public final zzfjf zze() {
        zzfhh zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final com.google.common.util.concurrent.f zzc() {
        com.google.common.util.concurrent.f zze;
        zzfdy zzfdyVar = this.zzd;
        if (zzfdyVar != null) {
            return zzgen.zzh(zzfdyVar);
        }
        if (((Boolean) zzbih.zza.zze()).booleanValue()) {
            zze = zzgen.zze(zzgen.zzm(zzgee.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfdw(this), this.zzc), zzecf.class, new zzfdv(this), this.zzc);
        } else {
            zzfdy zzfdyVar2 = new zzfdy(null, zze(), null);
            this.zzd = zzfdyVar2;
            zze = zzgen.zzh(zzfdyVar2);
        }
        return zzgen.zzm(zze, zzfdu.zza, this.zzc);
    }
}
