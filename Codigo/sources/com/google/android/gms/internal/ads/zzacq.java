package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzacq {
    public final String zza;

    private zzacq(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzacq zza(zzfp zzfpVar) {
        String str;
        zzfpVar.zzL(2);
        int zzm = zzfpVar.zzm();
        int i10 = zzm >> 1;
        int i11 = zzm & 1;
        int zzm2 = zzfpVar.zzm() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i12 = zzm2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(i12 >= 10 ? "." : ".0");
        sb2.append(i12);
        return new zzacq(i10, i12, sb2.toString());
    }
}
