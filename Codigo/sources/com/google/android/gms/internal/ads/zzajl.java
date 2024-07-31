package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzajl {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzacv zzacvVar) {
        return zzc(zzacvVar, true, false);
    }

    public static boolean zzb(zzacv zzacvVar, boolean z10) {
        return zzc(zzacvVar, false, z10);
    }

    private static boolean zzc(zzacv zzacvVar, boolean z10, boolean z11) {
        boolean z12;
        long j10;
        int i10;
        zzfp zzfpVar;
        boolean z13;
        long zzd = zzacvVar.zzd();
        long j11 = -1;
        long j12 = 4096;
        if (zzd != -1 && zzd <= 4096) {
            j12 = zzd;
        }
        zzfp zzfpVar2 = new zzfp(64);
        int i11 = (int) j12;
        boolean z14 = false;
        int i12 = 0;
        boolean z15 = false;
        while (i12 < i11) {
            zzfpVar2.zzH(8);
            if (!zzacvVar.zzm(zzfpVar2.zzM(), z14 ? 1 : 0, 8, true)) {
                z12 = z14 ? 1 : 0;
                break;
            }
            long zzu = zzfpVar2.zzu();
            int zzg = zzfpVar2.zzg();
            if (zzu == 1) {
                zzacvVar.zzh(zzfpVar2.zzM(), 8, 8);
                i10 = 16;
                zzfpVar2.zzJ(16);
                j10 = zzfpVar2.zzt();
            } else {
                if (zzu == 0) {
                    long zzd2 = zzacvVar.zzd();
                    if (zzd2 != j11) {
                        zzu = (zzd2 - zzacvVar.zze()) + 8;
                    }
                }
                j10 = zzu;
                i10 = 8;
            }
            long j13 = i10;
            if (j10 < j13) {
                return z14;
            }
            i12 += i10;
            if (zzg == 1836019574) {
                i11 += (int) j10;
                if (zzd != -1 && i11 > zzd) {
                    i11 = (int) zzd;
                }
                j11 = -1;
            } else {
                if (zzg == 1836019558 || zzg == 1836475768) {
                    z12 = true;
                    break;
                }
                z15 = (!(zzg == 1835295092 ? z14 ? 1 : 0 : true)) | z15;
                zzfp zzfpVar3 = zzfpVar2;
                if ((i12 + j10) - j13 >= i11) {
                    break;
                }
                int i13 = (int) (j10 - j13);
                i12 += i13;
                if (zzg != 1718909296) {
                    zzfpVar = zzfpVar3;
                    if (i13 != 0) {
                        zzacvVar.zzg(i13);
                    }
                } else {
                    if (i13 < 8) {
                        return false;
                    }
                    zzfpVar = zzfpVar3;
                    zzfpVar.zzH(i13);
                    zzacvVar.zzh(zzfpVar.zzM(), 0, i13);
                    int i14 = i13 >> 2;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (i15 != 1) {
                            int zzg2 = zzfpVar.zzg();
                            if ((zzg2 >>> 8) != 3368816) {
                                if (zzg2 == 1751476579) {
                                    if (!z11) {
                                        zzg2 = 1751476579;
                                    }
                                }
                                int[] iArr = zza;
                                for (int i16 = 0; i16 < 29; i16++) {
                                    if (iArr[i16] != zzg2) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        zzfpVar.zzL(4);
                    }
                    z13 = z15;
                    if (!z13) {
                        return false;
                    }
                    z15 = z13;
                }
                zzfpVar2 = zzfpVar;
                j11 = -1;
                z14 = false;
            }
        }
        z12 = false;
        return z15 && z10 == z12;
    }
}
