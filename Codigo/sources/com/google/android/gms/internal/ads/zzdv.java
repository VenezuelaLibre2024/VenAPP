package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzdv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdv(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = this.zzb * i10;
                i17 += Math.abs(sArr[i19 + i18] - sArr[(i19 + i11) + i18]);
            }
            int i20 = i17 * i15;
            int i21 = i13 * i11;
            if (i20 < i21) {
                i13 = i17;
            }
            if (i20 < i21) {
                i15 = i11;
            }
            int i22 = i17 * i14;
            int i23 = i16 * i11;
            if (i22 > i23) {
                i16 = i17;
            }
            if (i22 > i23) {
                i14 = i11;
            }
            i11++;
        }
        this.zzu = i13 / i15;
        this.zzv = i16 / i14;
        return i15;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] zzl = zzl(this.zzl, this.zzm, i11);
        this.zzl = zzl;
        int i12 = this.zzm;
        int i13 = this.zzb;
        System.arraycopy(sArr, i10 * i13, zzl, i12 * i13, i11 * i13);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.zzh / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.zzb;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i16 * i10) + (i12 * i13) + i14];
                    i14++;
                }
            }
            this.zzi[i13] = (short) (i15 / i12);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzk() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10 = this.zzc / this.zzd;
        double d10 = f10;
        int i18 = this.zzm;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i19 = this.zzk;
            if (i19 >= this.zzh) {
                int i20 = 0;
                do {
                    int i21 = this.zzr;
                    if (i21 > 0) {
                        int min = Math.min(this.zzh, i21);
                        zzh(this.zzj, i20, min);
                        this.zzr -= min;
                        i20 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i22 = this.zza;
                        int i23 = i22 > 4000 ? i22 / 4000 : 1;
                        if (this.zzb == 1 && i23 == 1) {
                            i10 = zzg(sArr, i20, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i20, i23);
                            int zzg = zzg(this.zzi, 0, this.zzf / i23, this.zzg / i23);
                            if (i23 != 1) {
                                int i24 = zzg * i23;
                                int i25 = i23 * 4;
                                int i26 = this.zzf;
                                int i27 = i24 - i25;
                                if (i27 >= i26) {
                                    i26 = i27;
                                }
                                int i28 = i24 + i25;
                                int i29 = this.zzg;
                                if (i28 > i29) {
                                    i28 = i29;
                                }
                                if (this.zzb == 1) {
                                    i10 = zzg(sArr, i20, i26, i28);
                                } else {
                                    zzi(sArr, i20, 1);
                                    i10 = zzg(this.zzi, 0, i26, i28);
                                }
                            } else {
                                i10 = zzg;
                            }
                        }
                        int i30 = this.zzu;
                        int i31 = (i30 == 0 || (i13 = this.zzs) == 0 || this.zzv > i30 * 3 || i30 + i30 <= this.zzt * 3) ? i10 : i13;
                        int i32 = i20 + i31;
                        this.zzt = i30;
                        this.zzs = i10;
                        float f11 = i31;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f12 = (-1.0f) + f10;
                            if (f10 >= 2.0f) {
                                i12 = (int) (f11 / f12);
                            } else {
                                this.zzr = (int) ((f11 * (2.0f - f10)) / f12);
                                i12 = i31;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i12);
                            this.zzl = zzl;
                            int i33 = i12;
                            zzj(i12, this.zzb, zzl, this.zzm, sArr2, i20, sArr2, i32);
                            this.zzm += i33;
                            i20 += i31 + i33;
                        } else {
                            int i34 = i31;
                            short[] sArr3 = this.zzj;
                            float f13 = 1.0f - f10;
                            if (f10 < 0.5f) {
                                i11 = (int) ((f11 * f10) / f13);
                            } else {
                                this.zzr = (int) ((f11 * ((f10 + f10) - 1.0f)) / f13);
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i35);
                            this.zzl = zzl2;
                            int i36 = this.zzb;
                            System.arraycopy(sArr3, i20 * i36, zzl2, this.zzm * i36, i36 * i34);
                            zzj(i11, this.zzb, this.zzl, this.zzm + i34, sArr3, i32, sArr3, i20);
                            this.zzm += i35;
                            i20 += i11;
                        }
                    }
                } while (this.zzh + i20 <= i19);
                int i37 = this.zzk - i20;
                short[] sArr4 = this.zzj;
                int i38 = this.zzb;
                System.arraycopy(sArr4, i20 * i38, sArr4, 0, i38 * i37);
                this.zzk = i37;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f14 = this.zze * this.zzd;
        if (f14 == 1.0f || this.zzm == i18) {
            return;
        }
        int i39 = this.zza;
        int i40 = (int) (i39 / f14);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.zzm - i18;
        short[] zzl3 = zzl(this.zzn, this.zzo, i41);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i42 = this.zzb;
        System.arraycopy(sArr5, i18 * i42, zzl3, this.zzo * i42, i42 * i41);
        this.zzm = i18;
        this.zzo += i41;
        int i43 = 0;
        while (true) {
            i14 = this.zzo;
            i15 = i14 - 1;
            if (i43 >= i15) {
                break;
            }
            while (true) {
                i16 = this.zzp + 1;
                int i44 = i16 * i40;
                i17 = this.zzq;
                if (i44 <= i17 * i39) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i45 = 0;
                while (true) {
                    int i46 = this.zzb;
                    if (i45 < i46) {
                        short[] sArr6 = this.zzl;
                        int i47 = this.zzm * i46;
                        short[] sArr7 = this.zzn;
                        int i48 = (i43 * i46) + i45;
                        short s10 = sArr7[i48];
                        short s11 = sArr7[i48 + i46];
                        int i49 = this.zzq * i39;
                        int i50 = this.zzp;
                        int i51 = i50 * i40;
                        int i52 = (i50 + 1) * i40;
                        int i53 = i52 - i49;
                        int i54 = i52 - i51;
                        sArr6[i47 + i45] = (short) (((s10 * i53) + ((i54 - i53) * s11)) / i54);
                        i45++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i16;
            if (i16 == i39) {
                this.zzp = 0;
                zzek.zzf(i17 == i40);
                this.zzq = 0;
            }
            i43++;
        }
        if (i15 != 0) {
            short[] sArr8 = this.zzn;
            int i55 = this.zzb;
            System.arraycopy(sArr8, i15 * i55, sArr8, 0, (i14 - i15) * i55);
            this.zzo -= i15;
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i10 = this.zzm - min;
        this.zzm = i10;
        int i11 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        int i12 = this.zzm;
        float f10 = this.zzo;
        float f11 = this.zzc;
        float f12 = this.zze;
        float f13 = this.zzd;
        int i13 = i12 + ((int) ((((i11 / (f11 / f13)) + f10) / (f12 * f13)) + 0.5f));
        int i14 = this.zzh;
        this.zzj = zzl(this.zzj, i11, i14 + i14 + i11);
        int i15 = 0;
        while (true) {
            int i16 = this.zzh;
            int i17 = this.zzb;
            i10 = i16 + i16;
            if (i15 >= i10 * i17) {
                break;
            }
            this.zzj[(i17 * i11) + i15] = 0;
            i15++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i13) {
            this.zzm = i13;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] zzl = zzl(this.zzj, this.zzk, i11);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
