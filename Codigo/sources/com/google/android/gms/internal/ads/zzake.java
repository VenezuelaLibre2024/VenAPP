package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzake {
    private zzaea zzb;
    private zzacx zzc;
    private zzajz zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajx zza = new zzajx();
    private zzakb zzj = new zzakb();

    protected abstract long zza(zzfp zzfpVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzakb();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract boolean zzc(zzfp zzfpVar, long j10, zzakb zzakbVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze(zzacv zzacvVar, zzadr zzadrVar) {
        zzek.zzb(this.zzb);
        int i10 = zzfy.zza;
        int i11 = this.zzh;
        if (i11 == 0) {
            while (this.zza.zze(zzacvVar)) {
                long zzf = zzacvVar.zzf();
                long j10 = this.zzf;
                this.zzk = zzf - j10;
                if (!zzc(this.zza.zza(), j10, this.zzj)) {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzamVar);
                        this.zzm = true;
                    }
                    zzajz zzajzVar = this.zzj.zzb;
                    if (zzajzVar != null) {
                        this.zzd = zzajzVar;
                    } else if (zzacvVar.zzd() == -1) {
                        this.zzd = new zzakd(null);
                    } else {
                        zzajy zzb = this.zza.zzb();
                        this.zzd = new zzajs(this, this.zzf, zzacvVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzacvVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i11 == 1) {
            ((zzack) zzacvVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i11 != 2) {
            return -1;
        }
        long zzd = this.zzd.zzd(zzacvVar);
        if (zzd >= 0) {
            zzadrVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzadu zze = this.zzd.zze();
            zzek.zzb(zze);
            this.zzc.zzO(zze);
            this.zzl = true;
        }
        if (this.zzk > 0 || this.zza.zze(zzacvVar)) {
            this.zzk = 0L;
            zzfp zza = this.zza.zza();
            long zza2 = zza(zza);
            if (zza2 >= 0) {
                long j11 = this.zzg;
                if (j11 + zza2 >= this.zze) {
                    long zzf2 = zzf(j11);
                    zzady.zzb(this.zzb, zza, zza.zze());
                    this.zzb.zzt(zzf2, 1, zza.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zza2;
            return 0;
        }
        this.zzh = 3;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf(long j10) {
        return (j10 * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzg(long j10) {
        return (this.zzi * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzacx zzacxVar, zzaea zzaeaVar) {
        this.zzc = zzacxVar;
        this.zzb = zzaeaVar;
        zzb(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(long j10) {
        this.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzg = zzg(j11);
            this.zze = zzg;
            zzajz zzajzVar = this.zzd;
            int i10 = zzfy.zza;
            zzajzVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
