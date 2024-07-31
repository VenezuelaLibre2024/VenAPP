package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.util.u1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzczu implements zzdax, zzdhz, zzdfp, zzdbn, zzayq {
    private final zzdbp zza;
    private final zzfgm zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgfg zze = zzgfg.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzczu(zzdbp zzdbpVar, zzfgm zzfgmVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzdbpVar;
        this.zzb = zzfgmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final void zzby(zzayp zzaypVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzkQ)).booleanValue() && zzm() && zzaypVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            u1.a("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzfgm zzfgmVar = this.zzb;
        if (zzfgmVar.zzf == 3) {
            return;
        }
        int i10 = zzfgmVar.zzZ;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) a0.c().zza(zzbgc.zzkQ)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzk() {
        if (this.zzb.zzf == 3) {
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzbw)).booleanValue()) {
            zzfgm zzfgmVar = this.zzb;
            if (zzfgmVar.zzZ == 2) {
                if (zzfgmVar.zzr == 0) {
                    this.zza.zza();
                } else {
                    zzgen.zzr(this.zze, new zzczt(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczs
                        public /* synthetic */ zzczs() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzczu.this.zzh();
                        }
                    }, this.zzb.zzr, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhz
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final synchronized void zzp(c3 c3Var) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }
}
