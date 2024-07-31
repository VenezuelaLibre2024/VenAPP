package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzhl zzhlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzji.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzhlVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzhlVar) + zzhlVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzji.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzhlVar);
            i15 = zzhlVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzhlVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzji.zzg();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzjf<?> zzjfVar, zzhl zzhlVar) {
        zzja zzjaVar = (zzja) zzjfVar;
        int zzc = zzc(bArr, i11, zzhlVar);
        while (true) {
            zzjaVar.zzd(zzhlVar.zza);
            if (zzc >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, zzc, zzhlVar);
            if (i10 != zzhlVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzhlVar);
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzlz zzlzVar, zzhl zzhlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzji.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzhlVar);
            zzlzVar.zza(i10, Long.valueOf(zzhlVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzlzVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzhlVar);
            int i14 = zzhlVar.zza;
            if (i14 < 0) {
                throw zzji.zzf();
            }
            if (i14 > bArr.length - zzc) {
                throw zzji.zzh();
            }
            zzlzVar.zza(i10, i14 == 0 ? zzhm.zza : zzhm.zza(bArr, zzc, i14));
            return zzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzji.zzc();
            }
            zzlzVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzlz zzd2 = zzlz.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzhlVar);
            int i17 = zzhlVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzc2;
                break;
            }
            int zza = zza(i16, bArr, zzc2, i12, zzd2, zzhlVar);
            i16 = i17;
            i11 = zza;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzji.zzg();
        }
        zzlzVar.zza(i10, zzd2);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, zzhl zzhlVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzhlVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzhlVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzhlVar.zza = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzlb<?> zzlbVar, int i10, byte[] bArr, int i11, int i12, zzjf<?> zzjfVar, zzhl zzhlVar) {
        int zza = zza(zzlbVar, bArr, i11, i12, zzhlVar);
        while (true) {
            zzjfVar.add(zzhlVar.zzc);
            if (zza >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza, zzhlVar);
            if (i10 != zzhlVar.zza) {
                break;
            }
            zza = zza(zzlbVar, bArr, zzc, i12, zzhlVar);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzlb zzlbVar, byte[] bArr, int i10, int i11, int i12, zzhl zzhlVar) {
        Object zza = zzlbVar.zza();
        int zza2 = zza(zza, zzlbVar, bArr, i10, i11, i12, zzhlVar);
        zzlbVar.zzc(zza);
        zzhlVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzlb zzlbVar, byte[] bArr, int i10, int i11, zzhl zzhlVar) {
        Object zza = zzlbVar.zza();
        int zza2 = zza(zza, zzlbVar, bArr, i10, i11, zzhlVar);
        zzlbVar.zzc(zza);
        zzhlVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzlb zzlbVar, byte[] bArr, int i10, int i11, int i12, zzhl zzhlVar) {
        int zza = ((zzkn) zzlbVar).zza((zzkn) obj, bArr, i10, i11, i12, zzhlVar);
        zzhlVar.zzc = obj;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzlb zzlbVar, byte[] bArr, int i10, int i11, zzhl zzhlVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzhlVar);
            i13 = zzhlVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzji.zzh();
        }
        int i15 = i13 + i14;
        zzlbVar.zza(obj, bArr, i14, i15, zzhlVar);
        zzhlVar.zzc = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzhl zzhlVar) {
        int zzc = zzc(bArr, i10, zzhlVar);
        int i11 = zzhlVar.zza;
        if (i11 < 0) {
            throw zzji.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzji.zzh();
        }
        if (i11 == 0) {
            zzhlVar.zzc = zzhm.zza;
            return zzc;
        }
        zzhlVar.zzc = zzhm.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzjf<?> zzjfVar, zzhl zzhlVar) {
        zzja zzjaVar = (zzja) zzjfVar;
        int zzc = zzc(bArr, i10, zzhlVar);
        int i11 = zzhlVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzhlVar);
            zzjaVar.zzd(zzhlVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzji.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10, zzhl zzhlVar) {
        int zzc = zzc(bArr, i10, zzhlVar);
        int i11 = zzhlVar.zza;
        if (i11 < 0) {
            throw zzji.zzf();
        }
        if (i11 == 0) {
            zzhlVar.zzc = "";
            return zzc;
        }
        zzhlVar.zzc = zzmh.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i10, zzhl zzhlVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzhlVar);
        }
        zzhlVar.zza = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i10, zzhl zzhlVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzhlVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzhlVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
