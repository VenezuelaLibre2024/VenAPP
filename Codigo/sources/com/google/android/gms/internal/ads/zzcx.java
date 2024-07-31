package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class zzcx {
    public static final zzcx zza = new zzcs();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = zzcr.zza;

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcx)) {
            return false;
        }
        zzcx zzcxVar = (zzcx) obj;
        if (zzcxVar.zzc() == zzc() && zzcxVar.zzb() == zzb()) {
            zzcw zzcwVar = new zzcw();
            zzcu zzcuVar = new zzcu();
            zzcw zzcwVar2 = new zzcw();
            zzcu zzcuVar2 = new zzcu();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzcwVar, 0L).equals(zzcxVar.zze(i10, zzcwVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzcuVar, true).equals(zzcxVar.zzd(i11, zzcuVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzcxVar.zzg(true) && (zzh = zzh(true)) == zzcxVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzcxVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        int zzc2 = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = zzc2 * 31;
            if (i11 >= zzc()) {
                break;
            }
            zzc2 = i10 + zze(i11, zzcwVar, 0L).hashCode();
            i11++;
        }
        int zzb2 = i10 + zzb();
        for (int i12 = 0; i12 < zzb(); i12++) {
            zzb2 = (zzb2 * 31) + zzd(i12, zzcuVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcu zzd(int i10, zzcu zzcuVar, boolean z10);

    public abstract zzcw zze(int i10, zzcw zzcwVar, long j10);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzcu zzcuVar, zzcw zzcwVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzcuVar, false).zzd;
        if (zze(i12, zzcwVar, 0L).zzq != i10) {
            return i10 + 1;
        }
        int zzj = zzj(i12, i11, z10);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzcwVar, 0L).zzp;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == zzh(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == zzh(z10) ? zzg(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzcw zzcwVar, zzcu zzcuVar, int i10, long j10) {
        Pair zzm = zzm(zzcwVar, zzcuVar, i10, j10, 0L);
        zzm.getClass();
        return zzm;
    }

    public final Pair zzm(zzcw zzcwVar, zzcu zzcuVar, int i10, long j10, long j11) {
        zzek.zza(i10, 0, zzc());
        zze(i10, zzcwVar, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = zzcwVar.zzn;
            j10 = 0;
        }
        int i11 = zzcwVar.zzp;
        zzd(i11, zzcuVar, false);
        while (i11 < zzcwVar.zzq) {
            long j13 = zzcuVar.zzf;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = zzd(i12, zzcuVar, false).zzf;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        zzd(i11, zzcuVar, true);
        long j15 = zzcuVar.zzf;
        long j16 = zzcuVar.zze;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = zzcuVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcu zzn(Object obj, zzcu zzcuVar) {
        return zzd(zza(obj), zzcuVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
