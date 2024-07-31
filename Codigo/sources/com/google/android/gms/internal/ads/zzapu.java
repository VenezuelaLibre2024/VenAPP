package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzapu extends Thread {
    private final BlockingQueue zza;
    private final zzapt zzb;
    private final zzapk zzc;
    private volatile boolean zzd = false;
    private final zzapr zze;

    public zzapu(BlockingQueue blockingQueue, zzapt zzaptVar, zzapk zzapkVar, zzapr zzaprVar) {
        this.zza = blockingQueue;
        this.zzb = zzaptVar;
        this.zzc = zzapkVar;
        this.zze = zzaprVar;
    }

    private void zzb() {
        zzaqa zzaqaVar = (zzaqa) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqaVar.zzt(3);
        try {
            try {
                zzaqaVar.zzm("network-queue-take");
                zzaqaVar.zzw();
                TrafficStats.setThreadStatsTag(zzaqaVar.zzc());
                zzapw zza = this.zzb.zza(zzaqaVar);
                zzaqaVar.zzm("network-http-complete");
                if (zza.zze && zzaqaVar.zzv()) {
                    zzaqaVar.zzp("not-modified");
                    zzaqaVar.zzr();
                } else {
                    zzaqg zzh = zzaqaVar.zzh(zza);
                    zzaqaVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzaqaVar.zzj(), zzh.zzb);
                        zzaqaVar.zzm("network-cache-written");
                    }
                    zzaqaVar.zzq();
                    this.zze.zzb(zzaqaVar, zzh, null);
                    zzaqaVar.zzs(zzh);
                }
            } catch (zzaqj e10) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqaVar, e10);
                zzaqaVar.zzr();
            } catch (Exception e11) {
                zzaqm.zzc(e11, "Unhandled exception %s", e11.toString());
                zzaqj zzaqjVar = new zzaqj(e11);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqaVar, zzaqjVar);
                zzaqaVar.zzr();
            }
        } finally {
            zzaqaVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqm.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
