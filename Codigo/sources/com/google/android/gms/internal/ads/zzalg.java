package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class zzalg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzalg(int i10, int i11, int i12, int i13, int i14) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
    }

    public static zzalg zza(String str) {
        char c10;
        zzek.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = split.length;
            if (i10 >= length) {
                if (i11 == -1 || i12 == -1 || i14 == -1) {
                    return null;
                }
                return new zzalg(i11, i12, i13, i14, length);
            }
            String zza = zzfwk.zza(split[i10].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (zza.equals("end")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3556653:
                    if (zza.equals("text")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (zza.equals("start")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 109780401:
                    if (zza.equals("style")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            if (c10 == 0) {
                i11 = i10;
            } else if (c10 == 1) {
                i12 = i10;
            } else if (c10 == 2) {
                i13 = i10;
            } else if (c10 == 3) {
                i14 = i10;
            }
            i10++;
        }
    }
}
