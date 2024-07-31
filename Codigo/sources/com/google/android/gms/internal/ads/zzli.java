package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzli {
    public final zzup zza;
    public final Object zzb;
    public final zzwh[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzlj zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzmh[] zzi;
    private final zzyo zzj;
    private final zzlx zzk;
    private zzli zzl;
    private zzws zzm;
    private zzyp zzn;
    private long zzo;

    public zzli(zzmh[] zzmhVarArr, long j10, zzyo zzyoVar, zzyx zzyxVar, zzlx zzlxVar, zzlj zzljVar, zzyp zzypVar) {
        this.zzi = zzmhVarArr;
        this.zzo = j10;
        this.zzj = zzyoVar;
        this.zzk = zzlxVar;
        zzur zzurVar = zzljVar.zza;
        this.zzb = zzurVar.zza;
        this.zzf = zzljVar;
        this.zzm = zzws.zza;
        this.zzn = zzypVar;
        this.zzc = new zzwh[2];
        this.zzh = new boolean[2];
        long j11 = zzljVar.zzb;
        long j12 = zzljVar.zzd;
        zzup zzp = zzlxVar.zzp(zzurVar, zzyxVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zztw(zzp, true, 0L, j12) : zzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzyp zzypVar = this.zzn;
            if (i10 >= zzypVar.zza) {
                return;
            }
            zzypVar.zzb(i10);
            zzyi zzyiVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzyp zzypVar = this.zzn;
            if (i10 >= zzypVar.zza) {
                return;
            }
            zzypVar.zzb(i10);
            zzyi zzyiVar = this.zzn.zzc[i10];
            i10++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzyp zzypVar, long j10, boolean z10) {
        return zzb(zzypVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzyp zzypVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzypVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzypVar.zza(this.zzn, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzmh[] zzmhVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzmhVarArr[i11].zzbj();
            i11++;
        }
        zzs();
        this.zzn = zzypVar;
        zzt();
        long zzf = this.zza.zzf(zzypVar.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzmh[] zzmhVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzmhVarArr2[i12].zzbj();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzwh[] zzwhVarArr = this.zzc;
            if (i13 >= 2) {
                return zzf;
            }
            if (zzwhVarArr[i13] != null) {
                zzek.zzf(zzypVar.zzb(i13));
                this.zzi[i13].zzbj();
                this.zze = true;
            } else {
                zzek.zzf(zzypVar.zzc[i13] == null);
            }
            i13++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzli zzg() {
        return this.zzl;
    }

    public final zzws zzh() {
        return this.zzm;
    }

    public final zzyp zzi() {
        return this.zzn;
    }

    public final zzyp zzj(float f10, zzcx zzcxVar) {
        zzyp zzp = this.zzj.zzp(this.zzi, this.zzm, this.zzf.zza, zzcxVar);
        for (zzyi zzyiVar : zzp.zzc) {
        }
        return zzp;
    }

    public final void zzk(long j10, float f10, long j11) {
        zzek.zzf(zzu());
        long j12 = j10 - this.zzo;
        zzle zzleVar = new zzle();
        zzleVar.zze(j12);
        zzleVar.zzf(f10);
        zzleVar.zzd(j11);
        this.zza.zzo(new zzlg(zzleVar, null));
    }

    public final void zzl(float f10, zzcx zzcxVar) {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzyp zzj = zzj(f10, zzcxVar);
        zzlj zzljVar = this.zzf;
        long j10 = zzljVar.zzb;
        long j11 = zzljVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long zza = zza(zzj, j10, false);
        long j12 = this.zzo;
        zzlj zzljVar2 = this.zzf;
        this.zzo = j12 + (zzljVar2.zzb - zza);
        this.zzf = zzljVar2.zzb(zza);
    }

    public final void zzm(long j10) {
        zzek.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzup zzupVar = this.zza;
        try {
            boolean z10 = zzupVar instanceof zztw;
            zzlx zzlxVar = this.zzk;
            if (z10) {
                zzlxVar.zzi(((zztw) zzupVar).zza);
            } else {
                zzlxVar.zzi(zzupVar);
            }
        } catch (RuntimeException e10) {
            zzff.zzd("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzli zzliVar) {
        if (zzliVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzliVar;
        zzt();
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzup zzupVar = this.zza;
        if (zzupVar instanceof zztw) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zztw) zzupVar).zzn(0L, j10);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
