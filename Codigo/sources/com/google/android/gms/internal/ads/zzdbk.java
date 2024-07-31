package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzdbk extends zzdgl implements zzdbb {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdbk(zzdbj zzdbjVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzdbjVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(final c3 c3Var) {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbc
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zza(c3.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbd
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(final zzdkv zzdkvVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbf
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zzc(zzdkv.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcec.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdkv("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbe
            @Override // java.lang.Runnable
            public final void run() {
                zzdbk.this.zzd();
            }
        }, ((Integer) a0.c().zza(zzbgc.zzkj)).intValue(), TimeUnit.MILLISECONDS);
    }
}
