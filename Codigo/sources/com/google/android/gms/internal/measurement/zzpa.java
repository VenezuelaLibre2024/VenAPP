package com.google.android.gms.internal.measurement;

import eb.v;
import eb.w;

/* loaded from: classes2.dex */
public final class zzpa implements v<zzpd> {
    private static zzpa zza = new zzpa();
    private final v<zzpd> zzb = w.b(new zzpc());

    public static double zza() {
        return ((zzpd) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpd) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpd) zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpd) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpd) zza.get()).zze();
    }

    @Override // eb.v
    public final /* synthetic */ zzpd get() {
        return this.zzb.get();
    }
}
