package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzgxx zzgxxVar) {
        int zzh = zzh(bArr, i10, zzgxxVar);
        int i11 = zzgxxVar.zza;
        if (i11 < 0) {
            throw zzhag.zzf();
        }
        if (i11 > bArr.length - zzh) {
            throw zzhag.zzj();
        }
        if (i11 == 0) {
            zzgxxVar.zzc = zzgyl.zzb;
            return zzh;
        }
        zzgxxVar.zzc = zzgyl.zzv(bArr, zzh, i11);
        return zzh + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzhby zzhbyVar, byte[] bArr, int i10, int i11, int i12, zzgxx zzgxxVar) {
        Object zze = zzhbyVar.zze();
        int zzl = zzl(zze, zzhbyVar, bArr, i10, i11, i12, zzgxxVar);
        zzhbyVar.zzf(zze);
        zzgxxVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzhby zzhbyVar, byte[] bArr, int i10, int i11, zzgxx zzgxxVar) {
        Object zze = zzhbyVar.zze();
        int zzm = zzm(zze, zzhbyVar, bArr, i10, i11, zzgxxVar);
        zzhbyVar.zzf(zze);
        zzgxxVar.zzc = zze;
        return zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzhby zzhbyVar, int i10, byte[] bArr, int i11, int i12, zzhad zzhadVar, zzgxx zzgxxVar) {
        int zzd = zzd(zzhbyVar, bArr, i11, i12, zzgxxVar);
        while (true) {
            zzhadVar.add(zzgxxVar.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzh = zzh(bArr, zzd, zzgxxVar);
            if (i10 != zzgxxVar.zza) {
                break;
            }
            zzd = zzd(zzhbyVar, bArr, zzh, i12, zzgxxVar);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzhad zzhadVar, zzgxx zzgxxVar) {
        zzgzv zzgzvVar = (zzgzv) zzhadVar;
        int zzh = zzh(bArr, i10, zzgxxVar);
        int i11 = zzgxxVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzgxxVar);
            zzgzvVar.zzh(zzgxxVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw zzhag.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzhcq zzhcqVar, zzgxx zzgxxVar) {
        if ((i10 >>> 3) == 0) {
            throw zzhag.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzk = zzk(bArr, i11, zzgxxVar);
            zzhcqVar.zzj(i10, Long.valueOf(zzgxxVar.zzb));
            return zzk;
        }
        if (i13 == 1) {
            zzhcqVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzh = zzh(bArr, i11, zzgxxVar);
            int i14 = zzgxxVar.zza;
            if (i14 < 0) {
                throw zzhag.zzf();
            }
            if (i14 > bArr.length - zzh) {
                throw zzhag.zzj();
            }
            zzhcqVar.zzj(i10, i14 == 0 ? zzgyl.zzb : zzgyl.zzv(bArr, zzh, i14));
            return zzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzhag.zzc();
            }
            zzhcqVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzhcq zzf = zzhcq.zzf();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzh2 = zzh(bArr, i11, zzgxxVar);
            int i17 = zzgxxVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzh2;
                break;
            }
            int zzg = zzg(i16, bArr, zzh2, i12, zzf, zzgxxVar);
            i16 = i17;
            i11 = zzg;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzhag.zzg();
        }
        zzhcqVar.zzj(i10, zzf);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzgxx zzgxxVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzgxxVar);
        }
        zzgxxVar.zza = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, zzgxx zzgxxVar) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzgxxVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzgxxVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzgxxVar.zza = i15 | i13;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzhad zzhadVar, zzgxx zzgxxVar) {
        zzgzv zzgzvVar = (zzgzv) zzhadVar;
        int zzh = zzh(bArr, i11, zzgxxVar);
        while (true) {
            zzgzvVar.zzh(zzgxxVar.zza);
            if (zzh >= i12) {
                break;
            }
            int zzh2 = zzh(bArr, zzh, zzgxxVar);
            if (i10 != zzgxxVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgxxVar);
        }
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(byte[] bArr, int i10, zzgxx zzgxxVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzgxxVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzgxxVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(Object obj, zzhby zzhbyVar, byte[] bArr, int i10, int i11, int i12, zzgxx zzgxxVar) {
        int zzc = ((zzhbh) zzhbyVar).zzc(obj, bArr, i10, i11, i12, zzgxxVar);
        zzgxxVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(Object obj, zzhby zzhbyVar, byte[] bArr, int i10, int i11, zzgxx zzgxxVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzgxxVar);
            i13 = zzgxxVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzhag.zzj();
        }
        int i15 = i13 + i14;
        zzhbyVar.zzi(obj, bArr, i14, i15, zzgxxVar);
        zzgxxVar.zzc = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
