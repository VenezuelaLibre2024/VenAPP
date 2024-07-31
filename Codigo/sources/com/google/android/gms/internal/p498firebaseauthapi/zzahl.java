package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzahl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzahk zzahkVar) {
        if ((i10 >>> 3) == 0) {
            throw zzaji.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzahkVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzahkVar) + zzahkVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzaji.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzahkVar);
            i15 = zzahkVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzahkVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzaji.zzg();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzajj<?> zzajjVar, zzahk zzahkVar) {
        zzajd zzajdVar = (zzajd) zzajjVar;
        int zzc = zzc(bArr, i11, zzahkVar);
        while (true) {
            zzajdVar.zzc(zzahkVar.zza);
            if (zzc >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, zzc, zzahkVar);
            if (i10 != zzahkVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzahkVar);
        }
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, int i12, zzamd zzamdVar, zzahk zzahkVar) {
        if ((i10 >>> 3) == 0) {
            throw zzaji.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzahkVar);
            zzamdVar.zza(i10, Long.valueOf(zzahkVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzamdVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzahkVar);
            int i14 = zzahkVar.zza;
            if (i14 < 0) {
                throw zzaji.zzf();
            }
            if (i14 > bArr.length - zzc) {
                throw zzaji.zzi();
            }
            zzamdVar.zza(i10, i14 == 0 ? zzahp.zza : zzahp.zza(bArr, zzc, i14));
            return zzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzaji.zzc();
            }
            zzamdVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzamd zzd2 = zzamd.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzahkVar);
            int i17 = zzahkVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzc2;
                break;
            }
            int zza = zza(i16, bArr, zzc2, i12, zzd2, zzahkVar);
            i16 = i17;
            i11 = zza;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzaji.zzg();
        }
        zzamdVar.zza(i10, zzd2);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, byte[] bArr, int i11, zzahk zzahkVar) {
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
                                zzahkVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzahkVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzahkVar.zza = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzalf<?> zzalfVar, int i10, byte[] bArr, int i11, int i12, zzajj<?> zzajjVar, zzahk zzahkVar) {
        int zza = zza(zzalfVar, bArr, i11, i12, zzahkVar);
        while (true) {
            zzajjVar.add(zzahkVar.zzc);
            if (zza >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza, zzahkVar);
            if (i10 != zzahkVar.zza) {
                break;
            }
            zza = zza(zzalfVar, bArr, zzc, i12, zzahkVar);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzalf zzalfVar, byte[] bArr, int i10, int i11, int i12, zzahk zzahkVar) {
        Object zza = zzalfVar.zza();
        int zza2 = zza(zza, zzalfVar, bArr, i10, i11, i12, zzahkVar);
        zzalfVar.zzc(zza);
        zzahkVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzalf zzalfVar, byte[] bArr, int i10, int i11, zzahk zzahkVar) {
        Object zza = zzalfVar.zza();
        int zza2 = zza(zza, zzalfVar, bArr, i10, i11, zzahkVar);
        zzalfVar.zzc(zza);
        zzahkVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzalf zzalfVar, byte[] bArr, int i10, int i11, int i12, zzahk zzahkVar) {
        int zza = ((zzakr) zzalfVar).zza((zzakr) obj, bArr, i10, i11, i12, zzahkVar);
        zzahkVar.zzc = obj;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Object obj, zzalf zzalfVar, byte[] bArr, int i10, int i11, zzahk zzahkVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzahkVar);
            i13 = zzahkVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzaji.zzi();
        }
        int i15 = i13 + i14;
        zzalfVar.zza(obj, bArr, i14, i15, zzahkVar);
        zzahkVar.zzc = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzahk zzahkVar) {
        int zzc = zzc(bArr, i10, zzahkVar);
        int i11 = zzahkVar.zza;
        if (i11 < 0) {
            throw zzaji.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzaji.zzi();
        }
        if (i11 == 0) {
            zzahkVar.zzc = zzahp.zza;
            return zzc;
        }
        zzahkVar.zzc = zzahp.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzajj<?> zzajjVar, zzahk zzahkVar) {
        zzajd zzajdVar = (zzajd) zzajjVar;
        int zzc = zzc(bArr, i10, zzahkVar);
        int i11 = zzahkVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzahkVar);
            zzajdVar.zzc(zzahkVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzaji.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10, zzahk zzahkVar) {
        int zzc = zzc(bArr, i10, zzahkVar);
        int i11 = zzahkVar.zza;
        if (i11 < 0) {
            throw zzaji.zzf();
        }
        if (i11 == 0) {
            zzahkVar.zzc = "";
            return zzc;
        }
        zzahkVar.zzc = zzaml.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i10, zzahk zzahkVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzahkVar);
        }
        zzahkVar.zza = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i10, zzahk zzahkVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzahkVar.zzb = j10;
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
        zzahkVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
