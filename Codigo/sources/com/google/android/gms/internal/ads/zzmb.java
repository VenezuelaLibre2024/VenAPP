package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzmb {
    private final zzma zza;
    private final zzlz zzb;
    private final zzel zzc;
    private final zzcx zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzmb(zzlz zzlzVar, zzma zzmaVar, zzcx zzcxVar, int i10, zzel zzelVar, Looper looper) {
        this.zzb = zzlzVar;
        this.zza = zzmaVar;
        this.zzd = zzcxVar;
        this.zzg = looper;
        this.zzc = zzelVar;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzma zzc() {
        return this.zza;
    }

    public final zzmb zzd() {
        zzek.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzmb zze(Object obj) {
        zzek.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzmb zzf(int i10) {
        zzek.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) {
        zzek.zzf(this.zzi);
        zzek.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j10);
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
