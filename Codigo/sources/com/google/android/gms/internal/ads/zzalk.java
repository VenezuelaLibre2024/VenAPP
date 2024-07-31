package com.google.android.gms.internal.ads;

import android.graphics.Color;
import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes2.dex */
final class zzalk {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalk(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        if (r4 != 3) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzalk zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzali r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalk.zzb(java.lang.String, com.google.android.gms.internal.ads.zzali):com.google.android.gms.internal.ads.zzalk");
    }

    public static Integer zzc(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzek.zzd(parseLong <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(zzgcu.zza(((parseLong >> 24) & 255) ^ 255), zzgcu.zza(parseLong & 255), zzgcu.zza((parseLong >> 8) & 255), zzgcu.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            zzff.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                zzff.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            zzff.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }
}
