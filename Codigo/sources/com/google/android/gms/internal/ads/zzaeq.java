package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaeq {
    protected final zzaea zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzaeq(int i10, int i11, long j10, int i12, zzaea zzaeaVar) {
        i11 = i11 != 1 ? 2 : i11;
        this.zzd = j10;
        this.zze = i12;
        this.zza = zzaeaVar;
        this.zzb = zzi(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.zzc = i11 == 2 ? zzi(i10, 1650720768) : -1;
        this.zzk = new long[RecognitionOptions.UPC_A];
        this.zzl = new int[RecognitionOptions.UPC_A];
    }

    private static int zzi(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private final long zzj(int i10) {
        return (this.zzd * i10) / this.zze;
    }

    private final zzadv zzk(int i10) {
        return new zzadv(this.zzl[i10] * zzj(1), this.zzk[i10]);
    }

    public final zzads zza(long j10) {
        int zzj = (int) (j10 / zzj(1));
        int zzb = zzfy.zzb(this.zzl, zzj, true, true);
        if (this.zzl[zzb] == zzj) {
            zzadv zzk = zzk(zzb);
            return new zzads(zzk, zzk);
        }
        zzadv zzk2 = zzk(zzb);
        int i10 = zzb + 1;
        return i10 < this.zzk.length ? new zzads(zzk2, zzk(i10)) : new zzads(zzk2, zzk2);
    }

    public final void zzb(long j10) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i10 = this.zzj;
        jArr2[i10] = j10;
        this.zzl[i10] = this.zzi;
        this.zzj = i10 + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i10) {
        this.zzf = i10;
        this.zzg = i10;
    }

    public final void zzf(long j10) {
        int i10;
        if (this.zzj == 0) {
            i10 = 0;
        } else {
            i10 = this.zzl[zzfy.zzc(this.zzk, j10, true, true)];
        }
        this.zzh = i10;
    }

    public final boolean zzg(int i10) {
        return this.zzb == i10 || this.zzc == i10;
    }

    public final boolean zzh(zzacv zzacvVar) {
        int i10 = this.zzg;
        int zzf = i10 - this.zza.zzf(zzacvVar, i10, false);
        this.zzg = zzf;
        boolean z10 = zzf == 0;
        if (z10) {
            if (this.zzf > 0) {
                this.zza.zzt(zzj(this.zzh), Arrays.binarySearch(this.zzl, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z10;
    }
}
