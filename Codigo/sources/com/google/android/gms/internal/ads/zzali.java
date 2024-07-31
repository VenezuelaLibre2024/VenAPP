package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class zzali {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzali(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = i16;
        this.zzh = i17;
        this.zzi = i18;
        this.zzj = i19;
        this.zzk = i20;
    }

    public static zzali zza(String str) {
        char c10;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        while (true) {
            int length = split.length;
            if (i10 >= length) {
                if (i11 != -1) {
                    return new zzali(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, length);
                }
                return null;
            }
            String zza = zzfwk.zza(split[i10].trim());
            switch (zza.hashCode()) {
                case -1178781136:
                    if (zza.equals("italic")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1026963764:
                    if (zza.equals("underline")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -192095652:
                    if (zza.equals("strikeout")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -70925746:
                    if (zza.equals("primarycolour")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (zza.equals("bold")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3373707:
                    if (zza.equals("name")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 366554320:
                    if (zza.equals("fontsize")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 767321349:
                    if (zza.equals("borderstyle")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1767875043:
                    if (zza.equals("alignment")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1988365454:
                    if (zza.equals("outlinecolour")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i10;
                    break;
                case 1:
                    i12 = i10;
                    break;
                case 2:
                    i13 = i10;
                    break;
                case 3:
                    i14 = i10;
                    break;
                case 4:
                    i15 = i10;
                    break;
                case 5:
                    i16 = i10;
                    break;
                case 6:
                    i17 = i10;
                    break;
                case 7:
                    i18 = i10;
                    break;
                case '\b':
                    i19 = i10;
                    break;
                case '\t':
                    i20 = i10;
                    break;
            }
            i10++;
        }
    }
}
