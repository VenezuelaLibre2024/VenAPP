package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;

/* loaded from: classes2.dex */
public final class zzqj {
    private Boolean zza;

    public zzqj() {
    }

    public zzqj(Context context) {
    }

    public final zzpg zza(zzam zzamVar, zzk zzkVar) {
        zzamVar.getClass();
        zzkVar.getClass();
        int i10 = zzfy.zza;
        if (i10 < 29 || zzamVar.zzA == -1) {
            return zzpg.zza;
        }
        Boolean bool = this.zza;
        if (bool == null) {
            bool = Boolean.FALSE;
            this.zza = bool;
        }
        bool.booleanValue();
        String str = zzamVar.zzm;
        str.getClass();
        int zza = zzcb.zza(str, zzamVar.zzj);
        if (zza == 0 || i10 < zzfy.zzf(zza)) {
            return zzpg.zza;
        }
        int zzg = zzfy.zzg(zzamVar.zzz);
        if (zzg == 0) {
            return zzpg.zza;
        }
        try {
            AudioFormat zzv = zzfy.zzv(zzamVar.zzA, zzg, zza);
            AudioAttributes audioAttributes = zzkVar.zza().zza;
            return i10 >= 31 ? zzqi.zza(zzv, audioAttributes, false) : zzqh.zza(zzv, audioAttributes, false);
        } catch (IllegalArgumentException unused) {
            return zzpg.zza;
        }
    }
}
