package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzzk {
    public static final zzze zza = new zzze(0, -9223372036854775807L, null);
    public static final zzze zzb = new zzze(1, -9223372036854775807L, null);
    public static final zzze zzc = new zzze(2, -9223372036854775807L, null);
    public static final zzze zzd = new zzze(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfy.zzD("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzzf zzf;
    private IOException zzg;

    public zzzk(String str) {
    }

    public static zzze zzb(boolean z10, long j10) {
        return new zzze(z10 ? 1 : 0, j10, null);
    }

    public final long zza(zzzg zzzgVar, zzzc zzzcVar, int i10) {
        Looper myLooper = Looper.myLooper();
        zzek.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzzf(this, myLooper, zzzgVar, zzzcVar, i10, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzzf zzzfVar = this.zzf;
        zzek.zzb(zzzfVar);
        zzzfVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i10) {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzzf zzzfVar = this.zzf;
        if (zzzfVar != null) {
            zzzfVar.zzb(i10);
        }
    }

    public final void zzj(zzzh zzzhVar) {
        zzzf zzzfVar = this.zzf;
        if (zzzfVar != null) {
            zzzfVar.zza(true);
        }
        this.zze.execute(new zzzi(zzzhVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
