package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import com.google.android.gms.common.internal.j;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import tf.b;

/* loaded from: classes2.dex */
public final class zzql {
    private static final j zza = new j("RemoteModelUtils", "");

    public static zzlu zza(b bVar, n nVar, zzqb zzqbVar) {
        l zzb = zzqbVar.zzb();
        String a10 = bVar.a();
        zzma zzmaVar = new zzma();
        zzlv zzlvVar = new zzlv();
        zzlvVar.zzc(bVar.b());
        zzlvVar.zzd(zzlx.CLOUD);
        zzlvVar.zza(zzag.zzb(a10));
        int ordinal = zzb.ordinal();
        zzlvVar.zzb(ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? zzlw.TYPE_UNKNOWN : zzlw.BASE_DIGITAL_INK : zzlw.CUSTOM : zzlw.BASE_TRANSLATE);
        zzmaVar.zzb(zzlvVar.zzg());
        zzmd zzc = zzmaVar.zzc();
        zzlr zzlrVar = new zzlr();
        zzlrVar.zzd(zzqbVar.zzc());
        zzlrVar.zzc(zzqbVar.zzd());
        zzlrVar.zzb(Long.valueOf(zzqbVar.zza()));
        zzlrVar.zzf(zzc);
        if (zzqbVar.zzg()) {
            long b10 = nVar.b(bVar);
            if (b10 == 0) {
                zza.g("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long c10 = nVar.c(bVar);
                if (c10 == 0) {
                    c10 = SystemClock.elapsedRealtime();
                    nVar.d(bVar, c10);
                }
                zzlrVar.zzg(Long.valueOf(c10 - b10));
            }
        }
        if (zzqbVar.zzf()) {
            long b11 = nVar.b(bVar);
            if (b11 == 0) {
                zza.g("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzlrVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - b11));
            }
        }
        return zzlrVar.zzi();
    }
}
