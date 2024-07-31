package com.google.android.gms.internal.measurement;

import eb.v;
import eb.w;

/* loaded from: classes2.dex */
public final class zznq implements v<zznt> {
    private static zznq zza = new zznq();
    private final v<zznt> zzb = w.b(new zzns());

    public static boolean zza() {
        return ((zznt) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznt) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznt) zza.get()).zzc();
    }

    @Override // eb.v
    public final /* synthetic */ zznt get() {
        return this.zzb.get();
    }
}
