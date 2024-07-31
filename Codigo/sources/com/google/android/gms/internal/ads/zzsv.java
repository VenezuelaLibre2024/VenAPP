package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzsv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    zzsv(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = zzcb.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r15.isFeatureSupported("secure-playback") != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsv zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzsv r11 = new com.google.android.gms.internal.ads.zzsv
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfy.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfy.zza
            r5 = 22
            if (r3 > r5) goto L3b
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfy.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r8 = r0
            goto L3e
        L3d:
            r8 = r2
        L3e:
            if (r4 == 0) goto L4c
            int r3 = com.google.android.gms.internal.ads.zzfy.zza
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4c
            r9 = r0
            goto L4d
        L4c:
            r9 = r2
        L4d:
            if (r20 != 0) goto L5e
            if (r4 == 0) goto L5c
            int r3 = com.google.android.gms.internal.ads.zzfy.zza
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L5c
            goto L5e
        L5c:
            r10 = r2
            goto L5f
        L5e:
            r10 = r0
        L5f:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsv.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsv");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzfy.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        zzff.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzfy.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private final boolean zzl(zzam zzamVar, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zza = zztn.zza(zzamVar);
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i10 = 8;
            if ("video/dolby-vision".equals(zzamVar.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzfy.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i10 = RecognitionOptions.UPC_E;
                } else if (intValue3 >= 120000000) {
                    i10 = RecognitionOptions.UPC_A;
                } else if (intValue3 >= 60000000) {
                    i10 = RecognitionOptions.QR_CODE;
                } else if (intValue3 >= 30000000) {
                    i10 = RecognitionOptions.ITF;
                } else if (intValue3 >= 18000000) {
                    i10 = 64;
                } else if (intValue3 >= 12000000) {
                    i10 = 32;
                } else if (intValue3 >= 7200000) {
                    i10 = 16;
                } else if (intValue3 < 3600000) {
                    i10 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i10;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                    if ("video/hevc".equals(this.zzb) && intValue == 2) {
                        String str = zzfy.zzb;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                }
            }
            zzj("codec.profileLevel, " + zzamVar.zzj + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzm(zzam zzamVar) {
        return this.zzb.equals(zzamVar.zzm) || this.zzb.equals(zztn.zzc(zzamVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i10, i11);
    }

    public final zzis zzb(zzam zzamVar, zzam zzamVar2) {
        int i10 = true != zzfy.zzF(zzamVar.zzm, zzamVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i10 |= RecognitionOptions.UPC_E;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i10 |= RecognitionOptions.UPC_A;
            }
            if (!zzfy.zzF(zzamVar.zzy, zzamVar2.zzy)) {
                i10 |= RecognitionOptions.PDF417;
            }
            String str = this.zza;
            if (zzfy.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzis(this.zza, zzamVar, zzamVar2, true != zzamVar.zzd(zzamVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i10 |= RecognitionOptions.AZTEC;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i10 |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zza = zztn.zza(zzamVar);
                Pair zza2 = zztn.zza(zzamVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzis(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzis(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzis(this.zza, zzamVar, zzamVar2, 0, i10);
    }

    public final boolean zzd(zzam zzamVar) {
        return zzm(zzamVar) && zzl(zzamVar, false);
    }

    public final boolean zze(zzam zzamVar) {
        String str;
        String str2;
        int i10;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i11 = zzamVar.zzr;
            if (i11 <= 0 || (i10 = zzamVar.zzs) <= 0) {
                return true;
            }
            int i12 = zzfy.zza;
            return zzg(i11, i10, zzamVar.zzt);
        }
        int i13 = zzfy.zza;
        int i14 = zzamVar.zzA;
        if (i14 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                str2 = "sampleRate.caps";
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    str2 = "sampleRate.aCaps";
                } else if (!audioCapabilities.isSampleRateSupported(i14)) {
                    str2 = "sampleRate.support, " + i14;
                }
            }
            zzj(str2);
            return false;
        }
        int i15 = zzamVar.zzz;
        if (i15 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                str = "channelCount.caps";
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    str = "channelCount.aCaps";
                } else {
                    String str3 = this.zza;
                    String str4 = this.zzb;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((zzfy.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                        int i16 = "audio/ac3".equals(str4) ? 6 : "audio/eac3".equals(str4) ? 16 : 30;
                        zzff.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i16 + "]");
                        maxInputChannelCount = i16;
                    }
                    if (maxInputChannelCount < i15) {
                        str = "channelCount.support, " + i15;
                    }
                }
            }
            zzj(str);
            return false;
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zza = zztn.zza(zzamVar);
        return zza != null && ((Integer) zza.first).intValue() == 42;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String sb3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            sb3 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (zzfy.zza >= 29) {
                    int zza = zzsu.zza(videoCapabilities, this.zzb, i10, i11, d10);
                    if (zza != 2) {
                        if (zza == 1) {
                            sb2 = new StringBuilder();
                            str = "sizeAndRate.cover, ";
                            sb2.append(str);
                            sb2.append(i10);
                            sb2.append("x");
                            sb2.append(i11);
                            sb2.append("@");
                            sb2.append(d10);
                            sb3 = sb2.toString();
                        }
                    }
                    return true;
                }
                if (!zzk(videoCapabilities, i10, i11, d10)) {
                    if (i10 >= i11 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzfy.zzb)) || !zzk(videoCapabilities, i11, i10, d10))) {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    } else {
                        zzff.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10) + "] [" + this.zza + ", " + this.zzb + "] [" + zzfy.zze + "]");
                    }
                }
                return true;
            }
            sb3 = "sizeAndRate.vCaps";
        }
        zzj(sb3);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
