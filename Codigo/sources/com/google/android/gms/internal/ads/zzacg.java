package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzacg {
    protected final zzaca zza;
    protected final zzacf zzb;
    protected zzacc zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzacg(zzacd zzacdVar, zzacf zzacfVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzacfVar;
        this.zzd = i10;
        this.zza = new zzaca(zzacdVar, j10, 0L, j12, j13, j14, j15);
    }

    protected static final int zzf(zzacv zzacvVar, long j10, zzadr zzadrVar) {
        if (j10 == zzacvVar.zzf()) {
            return 0;
        }
        zzadrVar.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzacv zzacvVar, long j10) {
        long zzf = j10 - zzacvVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzack) zzacvVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzacv zzacvVar, zzadr zzadrVar) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zzacc zzaccVar = this.zzc;
            zzek.zzb(zzaccVar);
            j10 = zzaccVar.zzf;
            j11 = zzaccVar.zzg;
            long j21 = j11 - j10;
            int i11 = this.zzd;
            j12 = zzaccVar.zzh;
            if (j21 <= i11) {
                zzc(false, j10);
                return zzf(zzacvVar, j10, zzadrVar);
            }
            if (!zzg(zzacvVar, j12)) {
                return zzf(zzacvVar, j12, zzadrVar);
            }
            zzacvVar.zzj();
            zzacf zzacfVar = this.zzb;
            j13 = zzaccVar.zzb;
            zzace zza = zzacfVar.zza(zzacvVar, j13);
            i10 = zza.zzb;
            if (i10 == -3) {
                zzc(false, j12);
                return zzf(zzacvVar, j12, zzadrVar);
            }
            if (i10 == -2) {
                j19 = zza.zzc;
                j20 = zza.zzd;
                zzacc.zzh(zzaccVar, j19, j20);
            } else {
                if (i10 != -1) {
                    j14 = zza.zzd;
                    zzg(zzacvVar, j14);
                    j15 = zza.zzd;
                    zzc(true, j15);
                    j16 = zza.zzd;
                    return zzf(zzacvVar, j16, zzadrVar);
                }
                j17 = zza.zzc;
                j18 = zza.zzd;
                zzacc.zzg(zzaccVar, j17, j18);
            }
        }
    }

    public final zzadu zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zzacc zzaccVar = this.zzc;
        if (zzaccVar != null) {
            j15 = zzaccVar.zza;
            if (j15 == j10) {
                return;
            }
        }
        zzaca zzacaVar = this.zza;
        long zzf = zzacaVar.zzf(j10);
        j11 = zzacaVar.zzc;
        j12 = zzacaVar.zzd;
        j13 = zzacaVar.zze;
        j14 = zzacaVar.zzf;
        this.zzc = new zzacc(j10, zzf, 0L, j11, j12, j13, j14);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
