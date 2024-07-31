package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zztn {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:119:0x022e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0298 A[Catch: NumberFormatException -> 0x0239, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x0239, blocks: (B:124:0x0241, B:126:0x0253, B:137:0x026f, B:140:0x0298), top: B:123:0x0241 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x06a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzam r17) {
        /*
            Method dump skipped, instructions count: 2224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztn.zza(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public static zzsv zzb() {
        List zze = zze("audio/raw", false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zzsv) zze.get(0);
    }

    public static String zzc(zzam zzamVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (zza2 = zza(zzamVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zza2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(zztb zztbVar, zzam zzamVar, boolean z10, boolean z11) {
        String zzc2 = zzc(zzamVar);
        return zzc2 == null ? zzgaa.zzl() : zze(zzc2, z10, z11);
    }

    public static synchronized List zze(String str, boolean z10, boolean z11) {
        synchronized (zztn.class) {
            zztf zztfVar = new zztf(str, z10, z11);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zztfVar);
            if (list != null) {
                return list;
            }
            int i10 = zzfy.zza;
            ArrayList zzh = zzh(zztfVar, new zztl(z10, z11));
            if (z10 && zzh.isEmpty() && zzfy.zza <= 23) {
                zzh = zzh(zztfVar, new zztk(null));
                if (!zzh.isEmpty()) {
                    zzff.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsv) zzh.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzfy.zza < 26 && zzfy.zzb.equals("R9") && zzh.size() == 1 && ((zzsv) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzsv.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zztm() { // from class: com.google.android.gms.internal.ads.zztd
                    @Override // com.google.android.gms.internal.ads.zztm
                    public final int zza(Object obj) {
                        int i11 = zztn.zza;
                        String str2 = ((zzsv) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzfy.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzfy.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsv) zzh.get(0)).zza)) {
                zzh.add((zzsv) zzh.remove(0));
            }
            zzgaa zzj = zzgaa.zzj(zzh);
            hashMap.put(zztfVar, zzj);
            return zzj;
        }
    }

    public static List zzf(zztb zztbVar, zzam zzamVar, boolean z10, boolean z11) {
        List zze = zze(zzamVar.zzm, z10, z11);
        List zzd = zzd(zztbVar, zzamVar, z10, z11);
        zzfzx zzfzxVar = new zzfzx();
        zzfzxVar.zzh(zze);
        zzfzxVar.zzh(zzd);
        return zzfzxVar.zzi();
    }

    public static List zzg(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zztm() { // from class: com.google.android.gms.internal.ads.zzte
            @Override // com.google.android.gms.internal.ads.zztm
            public final int zza(Object obj) {
                int i10 = zztn.zza;
                return ((zzsv) obj).zzd(zzam.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:128|(1:130)(1:131))|68|(1:70)(2:120|(1:127)(1:126))|(4:(2:114|115)|94|(8:97|98|99|100|101|102|103|105)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b1, code lost:
    
        if (r1.zzb == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if ("SCV31".equals(r10) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d0, code lost:
    
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0224, code lost:
    
        com.google.android.gms.internal.ads.zzff.zzc("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182 A[Catch: Exception -> 0x020f, TryCatch #1 {Exception -> 0x020f, blocks: (B:57:0x0133, B:61:0x014a, B:65:0x015f, B:67:0x0165, B:68:0x0175, B:70:0x017d, B:72:0x01a9, B:120:0x0182, B:122:0x0192, B:124:0x019a, B:128:0x016a), top: B:56:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a A[Catch: Exception -> 0x020f, TryCatch #1 {Exception -> 0x020f, blocks: (B:57:0x0133, B:61:0x014a, B:65:0x015f, B:67:0x0165, B:68:0x0175, B:70:0x017d, B:72:0x01a9, B:120:0x0182, B:122:0x0192, B:124:0x019a, B:128:0x016a), top: B:56:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165 A[Catch: Exception -> 0x020f, TryCatch #1 {Exception -> 0x020f, blocks: (B:57:0x0133, B:61:0x014a, B:65:0x015f, B:67:0x0165, B:68:0x0175, B:70:0x017d, B:72:0x01a9, B:120:0x0182, B:122:0x0192, B:124:0x019a, B:128:0x016a), top: B:56:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d A[Catch: Exception -> 0x020f, TryCatch #1 {Exception -> 0x020f, blocks: (B:57:0x0133, B:61:0x014a, B:65:0x015f, B:67:0x0165, B:68:0x0175, B:70:0x017d, B:72:0x01a9, B:120:0x0182, B:122:0x0192, B:124:0x019a, B:128:0x016a), top: B:56:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e A[Catch: Exception -> 0x026c, TRY_ENTER, TryCatch #3 {Exception -> 0x026c, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0034, B:16:0x0042, B:20:0x004c, B:22:0x0054, B:24:0x005c, B:26:0x0066, B:28:0x0070, B:30:0x0078, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a0, B:44:0x00ac, B:46:0x00b4, B:48:0x00bc, B:50:0x00c5, B:80:0x0216, B:83:0x021e, B:85:0x0224, B:88:0x023e, B:89:0x025f, B:52:0x00ce, B:140:0x00d1, B:142:0x00d9, B:145:0x00e4, B:147:0x00ec, B:151:0x00f7, B:153:0x00ff, B:156:0x010a, B:158:0x0112, B:161:0x011d, B:163:0x0125), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zztf r23, com.google.android.gms.internal.ads.zzti r24) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztn.zzh(com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzti):java.util.ArrayList");
    }

    private static void zzi(List list, final zztm zztmVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = zztn.zza;
                zztm zztmVar2 = zztm.this;
                return zztmVar2.zza(obj2) - zztmVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzfy.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzcb.zzg(str)) {
            return true;
        }
        String zza2 = zzfwk.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
