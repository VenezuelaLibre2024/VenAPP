package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaoc {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfw zza = new zzfw(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfp zzb = new zzfp();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoc(int i10) {
    }

    private final int zze(zzacv zzacvVar) {
        byte[] bArr = zzfy.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzacvVar.zzj();
        return 0;
    }

    public final int zza(zzacv zzacvVar, zzadr zzadrVar, int i10) {
        long j10;
        if (i10 <= 0) {
            zze(zzacvVar);
            return 0;
        }
        long j11 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacvVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            j10 = zzd - min;
            if (zzacvVar.zzf() == j10) {
                this.zzb.zzH(min);
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min, false);
                zzfp zzfpVar = this.zzb;
                int zzd2 = zzfpVar.zzd();
                int zze = zzfpVar.zze();
                int i11 = zze - 188;
                while (true) {
                    if (i11 < zzd2) {
                        break;
                    }
                    byte[] zzM = zzfpVar.zzM();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < zzd2 || i14 >= zze || zzM[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long zzb = zzaom.zzb(zzfpVar, i11, i10);
                                if (zzb != -9223372036854775807L) {
                                    j11 = zzb;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                this.zzg = j11;
                this.zze = true;
                return 0;
            }
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacvVar);
                return 0;
            }
            if (this.zzd) {
                long j12 = this.zzf;
                if (j12 == -9223372036854775807L) {
                    zze(zzacvVar);
                    return 0;
                }
                zzfw zzfwVar = this.zza;
                this.zzh = zzfwVar.zzc(this.zzg) - zzfwVar.zzb(j12);
                zze(zzacvVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzacvVar.zzd());
            j10 = 0;
            if (zzacvVar.zzf() == 0) {
                this.zzb.zzH(min2);
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzfp zzfpVar2 = this.zzb;
                int zzd3 = zzfpVar2.zzd();
                int zze2 = zzfpVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzfpVar2.zzM()[zzd3] == 71) {
                        long zzb2 = zzaom.zzb(zzfpVar2, zzd3, i10);
                        if (zzb2 != -9223372036854775807L) {
                            j11 = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j11;
                this.zzd = true;
                return 0;
            }
        }
        zzadrVar.zza = j10;
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfw zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
