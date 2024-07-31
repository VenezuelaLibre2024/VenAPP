package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaac {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j10 = this.zze;
        if (j10 == 0) {
            return 0L;
        }
        return this.zzf / j10;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j10) {
        int i10;
        long j11 = this.zzd;
        if (j11 == 0) {
            this.zza = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.zza;
            this.zzb = j12;
            this.zzf = j12;
            this.zze = 1L;
        } else {
            long j13 = j10 - this.zzc;
            int i11 = (int) (j11 % 15);
            if (Math.abs(j13 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j13;
                boolean[] zArr = this.zzg;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    i10 = this.zzh - 1;
                    this.zzh = i10;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i11]) {
                    zArr2[i11] = true;
                    i10 = this.zzh + 1;
                    this.zzh = i10;
                }
            }
        }
        this.zzd++;
        this.zzc = j10;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j10 = this.zzd;
        if (j10 == 0) {
            return false;
        }
        return this.zzg[(int) ((j10 - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
