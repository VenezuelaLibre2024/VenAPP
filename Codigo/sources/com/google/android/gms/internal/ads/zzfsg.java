package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public final class zzfsg {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfsg(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfsh.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfsh.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzayc r8, com.google.android.gms.internal.ads.zzfsm r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsg.zza(com.google.android.gms.internal.ads.zzayc, com.google.android.gms.internal.ads.zzfsm):boolean");
    }

    final zzayf zzb(int i10) {
        SharedPreferences sharedPreferences;
        String zze;
        if (i10 == 1) {
            sharedPreferences = this.zzc;
            zze = zzf();
        } else {
            sharedPreferences = this.zzc;
            zze = zze();
        }
        String string = sharedPreferences.getString(zze, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] d10 = la.k.d(string);
            zzgyl zzgylVar = zzgyl.zzb;
            zzayf zzh = zzayf.zzh(zzgyl.zzv(d10, 0, d10.length));
            String zzk = zzh.zzk();
            File zzb = zzfsh.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfsh.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfsh.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzhag unused) {
        }
        return null;
    }

    public final zzfsf zzc(int i10) {
        zzayf zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfsh.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfsh.zzb(zzk, "pcam", zzd());
        }
        return new zzfsf(zzb, zzb2, zzfsh.zzb(zzk, "pcbc", zzd()), zzfsh.zzb(zzk, "pcopt", zzd()));
    }
}
