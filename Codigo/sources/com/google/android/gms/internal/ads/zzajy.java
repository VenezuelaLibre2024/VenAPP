package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzajy {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfp zzg = new zzfp(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacv zzacvVar, boolean z10) {
        zza();
        this.zzg.zzH(27);
        if (zzacy.zzc(zzacvVar, this.zzg.zzM(), 0, 27, z10) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z10) {
                    return false;
                }
                throw zzcc.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzH(zzm);
            if (zzacy.zzc(zzacvVar, this.zzg.zzM(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzm();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacv zzacvVar, long j10) {
        zzek.zzd(zzacvVar.zzf() == zzacvVar.zze());
        this.zzg.zzH(4);
        while (true) {
            if ((j10 == -1 || zzacvVar.zzf() + 4 < j10) && zzacy.zzc(zzacvVar, this.zzg.zzM(), 0, 4, true)) {
                this.zzg.zzK(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzacvVar.zzj();
                    return true;
                }
                ((zzack) zzacvVar).zzo(1, false);
            }
        }
        do {
            if (j10 != -1 && zzacvVar.zzf() >= j10) {
                break;
            }
        } while (zzacvVar.zzc(1) != -1);
        return false;
    }
}
