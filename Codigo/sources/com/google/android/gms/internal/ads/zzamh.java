package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzamh {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x020b A[FALL_THROUGH, PHI: r8
      0x020b: PHI (r8v5 int) = (r8v1 int), (r8v1 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int) binds: [B:7:0x0050, B:12:0x0059, B:25:0x0095, B:45:0x0128, B:58:0x0161, B:59:0x0163, B:57:0x020b, B:54:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzea zzb(String str) {
        zzamg zzamgVar = new zzamg();
        zzh(str, zzamgVar);
        return zzamgVar.zza();
    }

    public static zzama zzc(zzfp zzfpVar, List list) {
        Charset charset = zzfwq.zzc;
        String zzy = zzfpVar.zzy(charset);
        if (zzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzy);
            if (matcher.matches()) {
                return zze(null, matcher, zzfpVar, list);
            }
            String zzy2 = zzfpVar.zzy(charset);
            if (zzy2 != null) {
                Matcher matcher2 = pattern.matcher(zzy2);
                if (matcher2.matches()) {
                    return zze(zzy.trim(), matcher2, zzfpVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzame zzameVar) {
        List zzf = zzf(list, str, zzameVar);
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            zzalz zzalzVar = ((zzamf) zzf.get(i10)).zzb;
            if (zzalzVar.zze() != -1) {
                return zzalzVar.zze();
            }
        }
        return -1;
    }

    private static zzama zze(String str, Matcher matcher, zzfp zzfpVar, List list) {
        zzamg zzamgVar = new zzamg();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzamgVar.zza = zzamj.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzamgVar.zzb = zzamj.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzamgVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String zzy = zzfpVar.zzy(zzfwq.zzc);
                if (TextUtils.isEmpty(zzy)) {
                    zzamgVar.zzc = zza(str, sb2.toString(), list);
                    return new zzama(zzamgVar.zza().zzp(), zzamgVar.zza, zzamgVar.zzb);
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(zzy.trim());
            }
        } catch (NumberFormatException unused) {
            zzff.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzame zzameVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzalz zzalzVar = (zzalz) list.get(i10);
            int zzf = zzalzVar.zzf(str, zzameVar.zza, zzameVar.zzd, zzameVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzamf(zzf, zzalzVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x008a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzg(java.lang.String r18, com.google.android.gms.internal.ads.zzame r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zzg(java.lang.String, com.google.android.gms.internal.ads.zzame, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
    
        if (r15 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        if (r15 == 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        if (r15 == 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        if (r15 == 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
    
        if (r15 == 4) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0168, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0169, code lost:
    
        if (r15 == 5) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016b, code lost:
    
        com.google.android.gms.internal.ads.zzff.zzf("WebvttCueParser", "Invalid alignment value: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0177, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0179, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017a, code lost:
    
        r17.zzd = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x018e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:89:0x00c1. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzamg r17) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamh.zzh(java.lang.String, com.google.android.gms.internal.ads.zzamg):void");
    }
}
