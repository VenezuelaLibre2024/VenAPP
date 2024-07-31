package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzabv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, RecognitionOptions.ITF, 160, 192, 224, RecognitionOptions.QR_CODE, 320, 384, 448, RecognitionOptions.UPC_A, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * RecognitionOptions.QR_CODE;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return zzf((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static zzam zzc(zzfp zzfpVar, String str, String str2, zzae zzaeVar) {
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzi(zzfpVar);
        int i10 = zzc[zzfoVar.zzd(2)];
        zzfoVar.zzm(8);
        int i11 = zze[zzfoVar.zzd(3)];
        if (zzfoVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzfoVar.zzd(5)] * AdError.NETWORK_ERROR_CODE;
        zzfoVar.zze();
        zzfpVar.zzK(zzfoVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/ac3");
        zzakVar.zzy(i11);
        zzakVar.zzX(i10);
        zzakVar.zzE(zzaeVar);
        zzakVar.zzN(str2);
        zzakVar.zzx(i12);
        zzakVar.zzR(i12);
        return zzakVar.zzac();
    }

    public static zzam zzd(zzfp zzfpVar, String str, String str2, zzae zzaeVar) {
        String str3;
        zzfo zzfoVar = new zzfo();
        zzfoVar.zzi(zzfpVar);
        int zzd2 = zzfoVar.zzd(13) * AdError.NETWORK_ERROR_CODE;
        zzfoVar.zzm(3);
        int i10 = zzc[zzfoVar.zzd(2)];
        zzfoVar.zzm(10);
        int i11 = zze[zzfoVar.zzd(3)];
        if (zzfoVar.zzd(1) != 0) {
            i11++;
        }
        zzfoVar.zzm(3);
        int zzd3 = zzfoVar.zzd(4);
        zzfoVar.zzm(1);
        if (zzd3 > 0) {
            zzfoVar.zzm(6);
            if (zzfoVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzfoVar.zzm(1);
        }
        if (zzfoVar.zza() > 7) {
            zzfoVar.zzm(7);
            if (zzfoVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfoVar.zze();
                zzfpVar.zzK(zzfoVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzK(str);
                zzakVar.zzW(str3);
                zzakVar.zzy(i11);
                zzakVar.zzX(i10);
                zzakVar.zzE(zzaeVar);
                zzakVar.zzN(str2);
                zzakVar.zzR(zzd2);
                return zzakVar.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfoVar.zze();
        zzfpVar.zzK(zzfoVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzK(str);
        zzakVar2.zzW(str3);
        zzakVar2.zzy(i11);
        zzakVar2.zzX(i10);
        zzakVar2.zzE(zzaeVar);
        zzakVar2.zzN(str2);
        zzakVar2.zzR(zzd2);
        return zzakVar2.zzac();
    }

    public static zzabu zze(zzfo zzfoVar) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzc2 = zzfoVar.zzc();
        zzfoVar.zzm(40);
        int zzd2 = zzfoVar.zzd(5);
        zzfoVar.zzk(zzc2);
        int i21 = -1;
        if (zzd2 > 10) {
            zzfoVar.zzm(16);
            int zzd3 = zzfoVar.zzd(2);
            if (zzd3 == 0) {
                i21 = 0;
            } else if (zzd3 == 1) {
                i21 = 1;
            } else if (zzd3 == 2) {
                i21 = 2;
            }
            zzfoVar.zzm(3);
            int zzd4 = zzfoVar.zzd(11) + 1;
            int zzd5 = zzfoVar.zzd(2);
            if (zzd5 == 3) {
                i17 = zzd[zzfoVar.zzd(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int zzd6 = zzfoVar.zzd(2);
                int i22 = zzb[zzd6];
                i16 = zzd6;
                i17 = zzc[zzd5];
                i18 = i22;
            }
            int i23 = zzd4 + zzd4;
            int i24 = (i23 * i17) / (i18 * 32);
            int zzd7 = zzfoVar.zzd(3);
            boolean zzo = zzfoVar.zzo();
            i10 = zze[zzd7] + (zzo ? 1 : 0);
            zzfoVar.zzm(10);
            if (zzfoVar.zzo()) {
                zzfoVar.zzm(8);
            }
            if (zzd7 == 0) {
                zzfoVar.zzm(5);
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                i19 = 0;
                zzd7 = 0;
            } else {
                i19 = zzd7;
            }
            if (i21 == 1) {
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzfoVar.zzo()) {
                if (i19 > 2) {
                    zzfoVar.zzm(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzfoVar.zzm(6);
                }
                if ((i19 & 4) != 0) {
                    zzfoVar.zzm(6);
                }
                if (zzo && zzfoVar.zzo()) {
                    zzfoVar.zzm(5);
                }
                if (i20 == 0) {
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    if (i19 == 0 && zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(6);
                    }
                    int zzd8 = zzfoVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfoVar.zzm(5);
                    } else if (zzd8 == 2) {
                        zzfoVar.zzm(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfoVar.zzd(5);
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(5);
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(4);
                            }
                            if (zzfoVar.zzo()) {
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(4);
                                }
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(4);
                                }
                            }
                        }
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(5);
                            if (zzfoVar.zzo()) {
                                zzfoVar.zzm(7);
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(8);
                                }
                            }
                        }
                        zzfoVar.zzm((zzd9 + 2) * 8);
                        zzfoVar.zze();
                    }
                    if (i19 < 2) {
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(14);
                        }
                        if (zzd7 == 0 && zzfoVar.zzo()) {
                            zzfoVar.zzm(14);
                        }
                    }
                    if (zzfoVar.zzo()) {
                        if (i16 == 0) {
                            zzfoVar.zzm(5);
                            i20 = 0;
                            i16 = 0;
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (zzfoVar.zzo()) {
                                    zzfoVar.zzm(5);
                                }
                            }
                        }
                    }
                    i20 = 0;
                }
            }
            if (zzfoVar.zzo()) {
                zzfoVar.zzm(5);
                if (i19 == 2) {
                    zzfoVar.zzm(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzfoVar.zzm(2);
                }
                if (zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                if (i19 == 0 && zzfoVar.zzo()) {
                    zzfoVar.zzm(8);
                }
                if (zzd5 < 3) {
                    zzfoVar.zzl();
                }
            }
            if (i20 == 0 && i16 != 3) {
                zzfoVar.zzl();
            }
            if (i20 == 2 && (i16 == 3 || zzfoVar.zzo())) {
                zzfoVar.zzm(6);
            }
            str = (zzfoVar.zzo() && zzfoVar.zzd(6) == 1 && zzfoVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * RecognitionOptions.QR_CODE;
            i12 = i24;
        } else {
            zzfoVar.zzm(32);
            int zzd10 = zzfoVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfoVar.zzd(6);
            int i26 = zzf[zzd11 / 2] * AdError.NETWORK_ERROR_CODE;
            int zzf2 = zzf(zzd10, zzd11);
            zzfoVar.zzm(8);
            int zzd12 = zzfoVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfoVar.zzm(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfoVar.zzm(2);
            }
            if (zzd12 == 2) {
                zzfoVar.zzm(2);
            }
            int i27 = zzd10 < 3 ? zzc[zzd10] : -1;
            i10 = zze[zzd12] + (zzfoVar.zzo() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = i26;
            i13 = zzf2;
            i14 = i27;
            i15 = 1536;
        }
        return new zzabu(str, i11, i10, i14, i13, i15, i12, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
