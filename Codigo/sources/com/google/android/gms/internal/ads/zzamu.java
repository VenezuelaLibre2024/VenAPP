package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzamu implements zzamy {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfo zzc = new zzfo(new byte[7], 7);
    private final zzfp zzd = new zzfp(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzaea zzg;
    private zzaea zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzaea zzu;
    private long zzv;

    public zzamu(boolean z10, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = RecognitionOptions.QR_CODE;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzaea zzaeaVar, long j10, int i10, int i11) {
        this.zzi = 4;
        this.zzj = i10;
        this.zzu = zzaeaVar;
        this.zzv = j10;
        this.zzs = i11;
    }

    private final boolean zzk(zzfp zzfpVar, byte[] bArr, int i10) {
        int min = Math.min(zzfpVar.zzb(), i10 - this.zzj);
        zzfpVar.zzG(bArr, this.zzj, min);
        int i11 = this.zzj + min;
        this.zzj = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzfp zzfpVar, byte[] bArr, int i10) {
        if (zzfpVar.zzb() < i10) {
            return false;
        }
        zzfpVar.zzG(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzfp zzfpVar) {
        int i10;
        zzaea zzaeaVar;
        long j10;
        int i11;
        int i12;
        int i13;
        this.zzg.getClass();
        int i14 = zzfy.zza;
        while (zzfpVar.zzb() > 0) {
            int i15 = this.zzi;
            int i16 = 13;
            int i17 = 2;
            if (i15 == 0) {
                byte[] zzM = zzfpVar.zzM();
                int zzd = zzfpVar.zzd();
                int zze = zzfpVar.zze();
                while (zzd < zze) {
                    int i18 = zzd + 1;
                    int i19 = zzM[zzd] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i19)) {
                        if (!this.zzm) {
                            int i20 = i18 - 2;
                            zzfpVar.zzK(i20 + 1);
                            if (zzm(zzfpVar, this.zzc.zza, 1)) {
                                this.zzc.zzk(4);
                                int zzd2 = this.zzc.zzd(1);
                                int i21 = this.zzn;
                                if (i21 == -1 || zzd2 == i21) {
                                    if (this.zzo != -1) {
                                        if (zzm(zzfpVar, this.zzc.zza, 1)) {
                                            this.zzc.zzk(i17);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzfpVar.zzK(i20 + 2);
                                            }
                                        }
                                    }
                                    if (zzm(zzfpVar, this.zzc.zza, 4)) {
                                        this.zzc.zzk(14);
                                        int zzd3 = this.zzc.zzd(i16);
                                        if (zzd3 >= 7) {
                                            byte[] zzM2 = zzfpVar.zzM();
                                            int zze2 = zzfpVar.zze();
                                            int i22 = i20 + zzd3;
                                            if (i22 < zze2) {
                                                byte b10 = zzM2[i22];
                                                if (b10 == -1) {
                                                    int i23 = i22 + 1;
                                                    if (i23 != zze2) {
                                                        byte b11 = zzM2[i23];
                                                        if (zzl((byte) -1, b11) && ((b11 & 8) >> 3) == zzd2) {
                                                        }
                                                    }
                                                } else if (b10 == 73) {
                                                    int i24 = i22 + 1;
                                                    if (i24 != zze2) {
                                                        if (zzM2[i24] == 68) {
                                                            int i25 = i22 + 2;
                                                            if (i25 != zze2) {
                                                                if (zzM2[i25] == 51) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                zzfpVar.zzK(i18);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.zzp = (i19 & 8) >> 3;
                        this.zzl = 1 == ((i19 & 1) ^ 1);
                        if (this.zzm) {
                            zzi();
                        } else {
                            this.zzi = 1;
                            this.zzj = 0;
                        }
                        zzfpVar.zzK(i18);
                        break;
                        break;
                    }
                    int i26 = this.zzk;
                    int i27 = i26 | i19;
                    if (i27 == 329) {
                        i12 = 2;
                        i13 = 768;
                    } else if (i27 == 511) {
                        i12 = 2;
                        i13 = RecognitionOptions.UPC_A;
                    } else if (i27 == 836) {
                        i12 = 2;
                        i13 = RecognitionOptions.UPC_E;
                    } else {
                        if (i27 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzK(0);
                            zzfpVar.zzK(i18);
                            break;
                            break;
                        }
                        if (i26 != 256) {
                            this.zzk = RecognitionOptions.QR_CODE;
                            zzd = i18 - 1;
                            i16 = 13;
                            i17 = 2;
                        } else {
                            i12 = 2;
                            i17 = i12;
                            zzd = i18;
                            i16 = 13;
                        }
                    }
                    this.zzk = i13;
                    i17 = i12;
                    zzd = i18;
                    i16 = 13;
                }
                zzfpVar.zzK(zzd);
            } else if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        int min = Math.min(zzfpVar.zzb(), this.zzs - this.zzj);
                        this.zzu.zzr(zzfpVar, min);
                        int i28 = this.zzj + min;
                        this.zzj = i28;
                        if (i28 == this.zzs) {
                            zzek.zzf(this.zzt != -9223372036854775807L);
                            this.zzu.zzt(this.zzt, 1, this.zzs, 0, null);
                            this.zzt += this.zzv;
                            zzh();
                        }
                    } else {
                        if (zzk(zzfpVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzk(0);
                            if (this.zzq) {
                                this.zzc.zzm(10);
                            } else {
                                int zzd4 = this.zzc.zzd(2) + 1;
                                if (zzd4 != 2) {
                                    zzff.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzm(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i29 = this.zzo;
                                byte[] bArr = {(byte) (((i29 >> 1) & 7) | 16), (byte) (((zzd5 << 3) & 120) | ((i29 << 7) & RecognitionOptions.ITF))};
                                zzabr zza2 = zzabs.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(this.zzf);
                                zzakVar.zzW("audio/mp4a-latm");
                                zzakVar.zzz(zza2.zzc);
                                zzakVar.zzy(zza2.zzb);
                                zzakVar.zzX(zza2.zza);
                                zzakVar.zzL(Collections.singletonList(bArr));
                                zzakVar.zzN(this.zze);
                                zzam zzac = zzakVar.zzac();
                                this.zzr = 1024000000 / zzac.zzA;
                                this.zzg.zzl(zzac);
                                this.zzq = true;
                            }
                            this.zzc.zzm(4);
                            int zzd6 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd6 -= 2;
                            }
                            i10 = zzd6;
                            zzaeaVar = this.zzg;
                            j10 = this.zzr;
                            i11 = 0;
                            zzj(zzaeaVar, j10, i11, i10);
                        }
                    }
                } else if (zzk(zzfpVar, this.zzd.zzM(), 10)) {
                    this.zzh.zzr(this.zzd, 10);
                    this.zzd.zzK(6);
                    zzaeaVar = this.zzh;
                    j10 = 0;
                    i10 = 10 + this.zzd.zzl();
                    i11 = 10;
                    zzj(zzaeaVar, j10, i11, i10);
                }
            } else if (zzfpVar.zzb() != 0) {
                zzfo zzfoVar = this.zzc;
                zzfoVar.zza[0] = zzfpVar.zzM()[zzfpVar.zzd()];
                zzfoVar.zzk(2);
                int zzd7 = this.zzc.zzd(4);
                int i30 = this.zzo;
                if (i30 == -1 || zzd7 == i30) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzf = zzaokVar.zzb();
        zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 1);
        this.zzg = zzw;
        this.zzu = zzw;
        if (!this.zzb) {
            this.zzh = new zzact();
            return;
        }
        zzaokVar.zzc();
        zzaea zzw2 = zzacxVar.zzw(zzaokVar.zza(), 5);
        this.zzh = zzw2;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzaokVar.zzb());
        zzakVar.zzW("application/id3");
        zzw2.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        this.zzt = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
