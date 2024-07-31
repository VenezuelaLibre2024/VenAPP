package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzaly {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfp zzc = new zzfp();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfp zzfpVar, StringBuilder sb2) {
        zzc(zzfpVar);
        if (zzfpVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzfpVar, sb2);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzfpVar.zzm();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(zzm);
        return sb3.toString();
    }

    static void zzc(zzfp zzfpVar) {
        while (true) {
            for (boolean z10 = true; zzfpVar.zzb() > 0 && z10; z10 = false) {
                char c10 = (char) zzfpVar.zzM()[zzfpVar.zzd()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzfpVar.zzL(1);
                } else {
                    int zzd = zzfpVar.zzd();
                    int zze = zzfpVar.zze();
                    byte[] zzM = zzfpVar.zzM();
                    if (zzd + 2 <= zze) {
                        int i10 = zzd + 1;
                        if (zzM[zzd] == 47) {
                            int i11 = i10 + 1;
                            if (zzM[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= zze) {
                                        break;
                                    }
                                    if (((char) zzM[i11]) == '*' && ((char) zzM[i12]) == '/') {
                                        zze = i12 + 1;
                                        i11 = zze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzfpVar.zzL(zze - zzfpVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzfp zzfpVar, StringBuilder sb2) {
        sb2.setLength(0);
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        loop0: while (true) {
            for (boolean z10 = false; zzd < zze && !z10; z10 = true) {
                char c10 = (char) zzfpVar.zzM()[zzd];
                if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                    sb2.append(c10);
                    zzd++;
                }
            }
        }
        zzfpVar.zzL(zzd - zzfpVar.zzd());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x031a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r3, r4)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfp r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzb(com.google.android.gms.internal.ads.zzfp):java.util.List");
    }
}
