package com.google.android.gms.internal.measurement;

import eb.v;
import eb.w;

/* loaded from: classes2.dex */
public final class zznk implements v<zznn> {
    private static zznk zza = new zznk();
    private final v<zznn> zzb = w.b(new zznm());

    public static boolean zza() {
        return ((zznn) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznn) zza.get()).zzb();
    }

    @Override // eb.v
    public final /* synthetic */ zznn get() {
        return this.zzb.get();
    }
}
