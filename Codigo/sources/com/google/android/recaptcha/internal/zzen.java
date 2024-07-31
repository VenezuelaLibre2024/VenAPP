package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzen {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i10, zzem zzemVar) {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        }
        if (i11 > bArr.length - zzj) {
            throw zzgy.zzj();
        }
        if (i11 == 0) {
            zzemVar.zzc = zzez.zzb;
            return zzj;
        }
        zzemVar.zzc = zzez.zzm(bArr, zzj, i11);
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
    public static int zzc(zzil zzilVar, byte[] bArr, int i10, int i11, int i12, zzem zzemVar) {
        Object zze = zzilVar.zze();
        int zzn = zzn(zze, zzilVar, bArr, i10, i11, i12, zzemVar);
        zzilVar.zzf(zze);
        zzemVar.zzc = zze;
        return zzn;
    }

    static int zzd(zzil zzilVar, byte[] bArr, int i10, int i11, zzem zzemVar) {
        Object zze = zzilVar.zze();
        int zzo = zzo(zze, zzilVar, bArr, i10, i11, zzemVar);
        zzilVar.zzf(zze);
        zzemVar.zzc = zze;
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(zzil zzilVar, int i10, byte[] bArr, int i11, int i12, zzgv zzgvVar, zzem zzemVar) {
        int zzd = zzd(zzilVar, bArr, i11, i12, zzemVar);
        while (true) {
            zzgvVar.add(zzemVar.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzemVar);
            if (i10 != zzemVar.zza) {
                break;
            }
            zzd = zzd(zzilVar, bArr, zzj, i12, zzemVar);
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i10, zzgv zzgvVar, zzem zzemVar) {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzemVar);
            zzgpVar.zzg(zzemVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzgy.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(byte[] bArr, int i10, zzem zzemVar) {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        }
        if (i11 == 0) {
            zzemVar.zzc = "";
            return zzj;
        }
        zzemVar.zzc = new String(bArr, zzj, i11, zzgw.zzb);
        return zzj + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(byte[] bArr, int i10, zzem zzemVar) {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 < 0) {
            throw zzgy.zzf();
        }
        if (i11 == 0) {
            zzemVar.zzc = "";
            return zzj;
        }
        zzemVar.zzc = zzju.zzd(bArr, zzj, i11);
        return zzj + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzjg zzjgVar, zzem zzemVar) {
        if ((i10 >>> 3) == 0) {
            throw zzgy.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzm = zzm(bArr, i11, zzemVar);
            zzjgVar.zzj(i10, Long.valueOf(zzemVar.zzb));
            return zzm;
        }
        if (i13 == 1) {
            zzjgVar.zzj(i10, Long.valueOf(zzq(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzj = zzj(bArr, i11, zzemVar);
            int i14 = zzemVar.zza;
            if (i14 < 0) {
                throw zzgy.zzf();
            }
            if (i14 > bArr.length - zzj) {
                throw zzgy.zzj();
            }
            zzjgVar.zzj(i10, i14 == 0 ? zzez.zzb : zzez.zzm(bArr, zzj, i14));
            return zzj + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzgy.zzc();
            }
            zzjgVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzjg zzf = zzjg.zzf();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, i11, zzemVar);
            int i17 = zzemVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzj2;
                break;
            }
            int zzi = zzi(i16, bArr, zzj2, i12, zzf, zzemVar);
            i16 = i17;
            i11 = zzi;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzgy.zzg();
        }
        zzjgVar.zzj(i10, zzf);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(byte[] bArr, int i10, zzem zzemVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzemVar);
        }
        zzemVar.zza = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, byte[] bArr, int i11, zzem zzemVar) {
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
                                zzemVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzemVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzemVar.zza = i15 | i13;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzgv zzgvVar, zzem zzemVar) {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int zzj = zzj(bArr, i11, zzemVar);
        while (true) {
            zzgpVar.zzg(zzemVar.zza);
            if (zzj >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzemVar);
            if (i10 != zzemVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzemVar);
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(byte[] bArr, int i10, zzem zzemVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzemVar.zzb = j10;
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
        zzemVar.zzb = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(Object obj, zzil zzilVar, byte[] bArr, int i10, int i11, int i12, zzem zzemVar) {
        int zzc = ((zzib) zzilVar).zzc(obj, bArr, i10, i11, i12, zzemVar);
        zzemVar.zzc = obj;
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(Object obj, zzil zzilVar, byte[] bArr, int i10, int i11, zzem zzemVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzemVar);
            i13 = zzemVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzgy.zzj();
        }
        int i15 = i13 + i14;
        zzilVar.zzi(obj, bArr, i14, i15, zzemVar);
        zzemVar.zzc = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzem zzemVar) {
        if ((i10 >>> 3) == 0) {
            throw zzgy.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzm(bArr, i11, zzemVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzj(bArr, i11, zzemVar) + zzemVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzgy.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzj(bArr, i11, zzemVar);
            i15 = zzemVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzemVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzgy.zzg();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzq(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
