package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzant {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfw zza = new zzfw(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfp zzb = new zzfp();

    public static long zzc(zzfp zzfpVar) {
        int zzd = zzfpVar.zzd();
        if (zzfpVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfpVar.zzG(bArr, 0, 9);
        zzfpVar.zzK(zzd);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzfy.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzacvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzacv zzacvVar, zzadr zzadrVar) {
        long j10;
        long j11 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacvVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            j10 = zzd - min;
            if (zzacvVar.zzf() == j10) {
                this.zzb.zzH(min);
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min, false);
                zzfp zzfpVar = this.zzb;
                int zzd2 = zzfpVar.zzd();
                int zze = zzfpVar.zze() - 4;
                while (true) {
                    if (zze < zzd2) {
                        break;
                    }
                    if (zzg(zzfpVar.zzM(), zze) == 442) {
                        zzfpVar.zzK(zze + 4);
                        long zzc = zzc(zzfpVar);
                        if (zzc != -9223372036854775807L) {
                            j11 = zzc;
                            break;
                        }
                    }
                    zze--;
                }
                this.zzg = j11;
                this.zze = true;
                return 0;
            }
            zzadrVar.zza = j10;
            return 1;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzacvVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzacvVar);
                return 0;
            }
            zzfw zzfwVar = this.zza;
            this.zzh = zzfwVar.zzc(this.zzg) - zzfwVar.zzb(j12);
            zzf(zzacvVar);
            return 0;
        }
        int min2 = (int) Math.min(20000L, zzacvVar.zzd());
        j10 = 0;
        if (zzacvVar.zzf() == 0) {
            this.zzb.zzH(min2);
            zzacvVar.zzj();
            ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min2, false);
            zzfp zzfpVar2 = this.zzb;
            int zzd3 = zzfpVar2.zzd();
            int zze2 = zzfpVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzfpVar2.zzM(), zzd3) == 442) {
                    zzfpVar2.zzK(zzd3 + 4);
                    long zzc2 = zzc(zzfpVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j11 = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j11;
            this.zzd = true;
            return 0;
        }
        zzadrVar.zza = j10;
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfw zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
