package com.google.android.gms.internal.measurement;

import eb.v;
import eb.w;

/* loaded from: classes2.dex */
public final class zzqd implements v<zzqc> {
    private static zzqd zza = new zzqd();
    private final v<zzqc> zzb = w.b(new zzqf());

    public static boolean zza() {
        return ((zzqc) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqc) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqc) zza.get()).zzc();
    }

    @Override // eb.v
    public final /* synthetic */ zzqc get() {
        return this.zzb.get();
    }
}
