package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.regex.Pattern;
import l9.y;

/* loaded from: classes2.dex */
public final class zzfmy {
    public static void zza(com.google.common.util.concurrent.f fVar, zzfmz zzfmzVar, zzfmo zzfmoVar) {
        zzg(fVar, zzfmzVar, zzfmoVar, false);
    }

    public static void zzb(com.google.common.util.concurrent.f fVar, zzfmz zzfmzVar, zzfmo zzfmoVar) {
        zzg(fVar, zzfmzVar, zzfmoVar, true);
    }

    public static void zzc(com.google.common.util.concurrent.f fVar, zzfmz zzfmzVar, zzfmo zzfmoVar) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            zzgen.zzr(zzgee.zzu(fVar), new zzfmx(zzfmzVar, zzfmoVar), zzcep.zzf);
        }
    }

    public static void zzd(com.google.common.util.concurrent.f fVar, zzfmo zzfmoVar) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            zzgen.zzr(zzgee.zzu(fVar), new zzfmv(zzfmoVar), zzcep.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) a0.c().zza(zzbgc.zziH), str);
    }

    public static int zzf(zzfhh zzfhhVar) {
        int e10 = y.e(zzfhhVar) - 1;
        return (e10 == 0 || e10 == 1) ? 7 : 23;
    }

    private static void zzg(com.google.common.util.concurrent.f fVar, zzfmz zzfmzVar, zzfmo zzfmoVar, boolean z10) {
        if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
            zzgen.zzr(zzgee.zzu(fVar), new zzfmw(zzfmzVar, zzfmoVar, z10), zzcep.zzf);
        }
    }
}
