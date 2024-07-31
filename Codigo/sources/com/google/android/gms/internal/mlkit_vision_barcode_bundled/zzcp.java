package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzco zzcoVar) {
        int zzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzeo.zzd();
        }
        if (i11 > bArr.length - zzj) {
            throw zzeo.zzg();
        }
        if (i11 == 0) {
            zzcoVar.zzc = zzdb.zzb;
            return zzj;
        }
        zzcoVar.zzc = zzdb.zzr(bArr, zzj, i11);
        return zzj + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(zzgh zzghVar, byte[] bArr, int i10, int i11, int i12, zzco zzcoVar) {
        Object zze = zzghVar.zze();
        int zzn = zzn(zze, zzghVar, bArr, i10, i11, i12, zzcoVar);
        zzghVar.zzf(zze);
        zzcoVar.zzc = zze;
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(zzgh zzghVar, byte[] bArr, int i10, int i11, zzco zzcoVar) {
        Object zze = zzghVar.zze();
        int zzo = zzo(zze, zzghVar, bArr, i10, i11, zzcoVar);
        zzghVar.zzf(zze);
        zzcoVar.zzc = zze;
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzgh zzghVar, int i10, byte[] bArr, int i11, int i12, zzel zzelVar, zzco zzcoVar) {
        int zzd = zzd(zzghVar, bArr, i11, i12, zzcoVar);
        while (true) {
            zzelVar.add(zzcoVar.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzcoVar);
            if (i10 != zzcoVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i12, zzcoVar);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzel zzelVar, zzco zzcoVar) {
        zzee zzeeVar = (zzee) zzelVar;
        int zzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzcoVar);
            zzeeVar.zzg(zzcoVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzeo.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzco zzcoVar) {
        int zzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzeo.zzd();
        }
        if (i11 == 0) {
            zzcoVar.zzc = "";
            return zzj;
        }
        zzcoVar.zzc = new String(bArr, zzj, i11, zzem.zzb);
        return zzj + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzco zzcoVar) {
        int zzj = zzj(bArr, i10, zzcoVar);
        int i11 = zzcoVar.zza;
        if (i11 < 0) {
            throw zzeo.zzd();
        }
        if (i11 == 0) {
            zzcoVar.zzc = "";
            return zzj;
        }
        int length = bArr.length;
        int i12 = zzhn.zza;
        if ((zzj | i11 | ((length - zzj) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i11)));
        }
        int i13 = zzj + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (zzj < i13) {
            byte b10 = bArr[zzj];
            if (!zzhj.zzd(b10)) {
                break;
            }
            zzj++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (zzj < i13) {
            int i15 = zzj + 1;
            byte b11 = bArr[zzj];
            if (zzhj.zzd(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                zzj = i15;
                while (true) {
                    i14 = i16;
                    if (zzj < i13) {
                        byte b12 = bArr[zzj];
                        if (zzhj.zzd(b12)) {
                            zzj++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b12;
                        }
                    }
                }
            } else if (b11 < -32) {
                if (i15 >= i13) {
                    throw zzeo.zzc();
                }
                zzhj.zzc(b11, bArr[i15], cArr, i14);
                zzj = i15 + 1;
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i13 - 1) {
                    throw zzeo.zzc();
                }
                int i17 = i15 + 1;
                zzhj.zzb(b11, bArr[i15], bArr[i17], cArr, i14);
                zzj = i17 + 1;
                i14++;
            } else {
                if (i15 >= i13 - 2) {
                    throw zzeo.zzc();
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                zzhj.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i14 += 2;
                zzj = i19 + 1;
            }
        }
        zzcoVar.zzc = new String(cArr, 0, i14);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzgz zzgzVar, zzco zzcoVar) {
        if ((i10 >>> 3) == 0) {
            throw zzeo.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzm = zzm(bArr, i11, zzcoVar);
            zzgzVar.zzj(i10, Long.valueOf(zzcoVar.zzb));
            return zzm;
        }
        if (i13 == 1) {
            zzgzVar.zzj(i10, Long.valueOf(zzq(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzj = zzj(bArr, i11, zzcoVar);
            int i14 = zzcoVar.zza;
            if (i14 < 0) {
                throw zzeo.zzd();
            }
            if (i14 > bArr.length - zzj) {
                throw zzeo.zzg();
            }
            zzgzVar.zzj(i10, i14 == 0 ? zzdb.zzb : zzdb.zzr(bArr, zzj, i14));
            return zzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzeo.zzb();
            }
            zzgzVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzgz zzf = zzgz.zzf();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, i11, zzcoVar);
            int i17 = zzcoVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzj2;
                break;
            }
            int zzi = zzi(i16, bArr, zzj2, i12, zzf, zzcoVar);
            i16 = i17;
            i11 = zzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzeo.zze();
        }
        zzgzVar.zzj(i10, zzf);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzco zzcoVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzcoVar);
        }
        zzcoVar.zza = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzco zzcoVar) {
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
                                zzcoVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzcoVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzcoVar.zza = i15 | i13;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzel zzelVar, zzco zzcoVar) {
        zzee zzeeVar = (zzee) zzelVar;
        int zzj = zzj(bArr, i11, zzcoVar);
        while (true) {
            zzeeVar.zzg(zzcoVar.zza);
            if (zzj >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzcoVar);
            if (i10 != zzcoVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzcoVar);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzco zzcoVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzcoVar.zzb = j10;
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
        zzcoVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(Object obj, zzgh zzghVar, byte[] bArr, int i10, int i11, int i12, zzco zzcoVar) {
        int zzc = ((zzfr) zzghVar).zzc(obj, bArr, i10, i11, i12, zzcoVar);
        zzcoVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(Object obj, zzgh zzghVar, byte[] bArr, int i10, int i11, zzco zzcoVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzcoVar);
            i13 = zzcoVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzeo.zzg();
        }
        int i15 = i13 + i14;
        zzghVar.zzh(obj, bArr, i14, i15, zzcoVar);
        zzcoVar.zzc = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzco zzcoVar) {
        if ((i10 >>> 3) == 0) {
            throw zzeo.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzm(bArr, i11, zzcoVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzj(bArr, i11, zzcoVar) + zzcoVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzeo.zzb();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzj(bArr, i11, zzcoVar);
            i15 = zzcoVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzcoVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzeo.zze();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzq(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
