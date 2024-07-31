package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzekh implements zzein {
    private final zzcvc zza;
    private final zzejo zzb;
    private final zzgey zzc;
    private final zzdaz zzd;
    private final ScheduledExecutorService zze;
    private final zzdwa zzf;

    public zzekh(zzcvc zzcvcVar, zzejo zzejoVar, zzdaz zzdazVar, ScheduledExecutorService scheduledExecutorService, zzgey zzgeyVar, zzdwa zzdwaVar) {
        this.zza = zzcvcVar;
        this.zzb = zzejoVar;
        this.zzd = zzdazVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgeyVar;
        this.zzf = zzdwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekh.this.zzc(zzfgyVar, zzfgmVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        zzbld zza = zzfgyVar.zza.zza.zza();
        boolean zzb = this.zzb.zzb(zzfgyVar, zzfgmVar);
        if (((Boolean) a0.c().zza(zzbgc.zzlq)).booleanValue()) {
            this.zzf.zza().put("has_dbl", zza != null ? "1" : "0");
            this.zzf.zza().put("crdb", true != zzb ? "0" : "1");
        }
        return zza != null && zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcuf zzc(final zzfgy zzfgyVar, final zzfgm zzfgmVar) {
        return this.zza.zzb(new zzcwx(zzfgyVar, zzfgmVar, null), new zzcvp(zzfgyVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // java.lang.Runnable
            public final void run() {
                zzekh.this.zzf(zzfgyVar, zzfgmVar);
            }
        })).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        zzgen.zzr(zzgen.zzo(this.zzb.zza(zzfgyVar, zzfgmVar), zzfgmVar.zzS, TimeUnit.SECONDS, this.zze), new zzekg(this), this.zzc);
    }
}
