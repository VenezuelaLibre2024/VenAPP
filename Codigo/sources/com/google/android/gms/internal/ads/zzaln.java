package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaln {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgaf zze = zzgaf.zzp("auto", "none");
    private static final zzgaf zzf = zzgaf.zzq("dot", "sesame", "circle");
    private static final zzgaf zzg = zzgaf.zzp("filled", "open");
    private static final zzgaf zzh = zzgaf.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaln(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaln zza(String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        String zza = zzfwk.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgaf zzm = zzgaf.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzgag.zza(zzgca.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i10 = -1;
        int i11 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z10 = false;
            }
            z10 = -1;
        } else {
            if (str2.equals("outside")) {
                z10 = true;
            }
            z10 = -1;
        }
        int i12 = z10 ? !z10 ? 1 : -2 : 2;
        zzgbz zzb = zzgca.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzgbz zzb2 = zzgca.zzb(zzg, zzm);
            zzgbz zzb3 = zzgca.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzgag.zza(zzb2, "filled");
                int i13 = (str3.hashCode() == 3417674 && str3.equals("open")) ? false : -1 ? 1 : 2;
                String str4 = (String) zzgag.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i10 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    i10 = 2;
                } else if (i10 != 1) {
                    i11 = i13;
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                i11 = i13;
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (!((str5.hashCode() == 3387192 && str5.equals("none")) ? false : -1)) {
                i10 = 0;
            }
        }
        return new zzaln(i10, i11, i12);
    }
}
