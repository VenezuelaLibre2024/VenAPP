package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzddm extends zzdgl {
    private final ScheduledExecutorService zzb;
    private final la.f zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzddm(ScheduledExecutorService scheduledExecutorService, la.f fVar) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = fVar;
    }

    private final synchronized void zze(long j10) {
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzg.cancel(true);
        }
        this.zzd = this.zzc.b() + j10;
        this.zzg = this.zzb.schedule(new zzddl(this, null), j10, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0L);
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.zze = -1L;
        } else {
            this.zzg.cancel(true);
            this.zze = this.zzd - this.zzc.b();
        }
        this.zzf = true;
    }

    public final synchronized void zzc() {
        if (this.zzf) {
            if (this.zze > 0 && this.zzg.isCancelled()) {
                zze(this.zze);
            }
            this.zzf = false;
        }
    }

    public final synchronized void zzd(int i10) {
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzf) {
                long j10 = this.zze;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.zze = millis;
                return;
            }
            long b10 = this.zzc.b();
            long j11 = this.zzd;
            if (b10 > j11 || j11 - this.zzc.b() > millis) {
                zze(millis);
            }
        }
    }
}
