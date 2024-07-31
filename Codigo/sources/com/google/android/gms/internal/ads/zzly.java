package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzly {
    private static final zzur zzt = new zzur(new Object(), -1);
    public final zzcx zza;
    public final zzur zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zziz zzf;
    public final boolean zzg;
    public final zzws zzh;
    public final zzyp zzi;
    public final List zzj;
    public final zzur zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcg zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzly(zzcx zzcxVar, zzur zzurVar, long j10, long j11, int i10, zziz zzizVar, boolean z10, zzws zzwsVar, zzyp zzypVar, List list, zzur zzurVar2, boolean z11, int i11, zzcg zzcgVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzcxVar;
        this.zzb = zzurVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzizVar;
        this.zzg = z10;
        this.zzh = zzwsVar;
        this.zzi = zzypVar;
        this.zzj = list;
        this.zzk = zzurVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzcgVar;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzs = j15;
    }

    public static zzly zzg(zzyp zzypVar) {
        zzcx zzcxVar = zzcx.zza;
        zzur zzurVar = zzt;
        return new zzly(zzcxVar, zzurVar, -9223372036854775807L, 0L, 1, null, false, zzws.zza, zzypVar, zzgaa.zzl(), zzurVar, false, 0, zzcg.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzur zzh() {
        return zzt;
    }

    public final zzly zza(zzur zzurVar) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzurVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzb(zzur zzurVar, long j10, long j11, long j12, long j13, zzws zzwsVar, zzyp zzypVar, List list) {
        zzur zzurVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        zzcg zzcgVar = this.zzn;
        long j14 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzly(this.zza, zzurVar, j11, j12, this.zze, this.zzf, this.zzg, zzwsVar, zzypVar, list, zzurVar2, z10, i10, zzcgVar, j14, j13, j10, elapsedRealtime, false);
    }

    public final zzly zzc(boolean z10, int i10) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzd(zziz zzizVar) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzizVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zze(int i10) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzf(zzcx zzcxVar) {
        return new zzly(zzcxVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
