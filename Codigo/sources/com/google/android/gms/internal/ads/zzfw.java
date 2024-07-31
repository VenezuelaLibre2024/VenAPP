package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfw {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfw(long j10) {
        zzi(0L);
    }

    public static long zzg(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long zzh(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public final synchronized long zza(long j10) {
        if (!zzj()) {
            long j11 = this.zza;
            if (j11 == 9223372036854775806L) {
                Long l10 = (Long) this.zzd.get();
                l10.getClass();
                j11 = l10.longValue();
            }
            this.zzb = j11 - j10;
            notifyAll();
        }
        this.zzc = j10;
        return j10 + this.zzb;
    }

    public final synchronized long zzb(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            long zzh = zzh(j11);
            long j12 = (4294967296L + zzh) / 8589934592L;
            long j13 = (((-1) + j12) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - zzh) < Math.abs(j10 - zzh)) {
                j10 = j13;
            }
        }
        return zza(zzg(j10));
    }

    public final synchronized long zzc(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            long zzh = zzh(j11);
            long j12 = zzh / 8589934592L;
            long j13 = (j12 * 8589934592L) + j10;
            j10 += (j12 + 1) * 8589934592L;
            if (j13 >= zzh) {
                j10 = j13;
            }
        }
        return zza(zzg(j10));
    }

    public final synchronized long zzd() {
        long j10 = this.zza;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long zze() {
        long j10;
        j10 = this.zzc;
        return j10 != -9223372036854775807L ? j10 + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j10) {
        this.zza = j10;
        this.zzb = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}
