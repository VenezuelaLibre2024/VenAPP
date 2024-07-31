package com.google.android.gms.internal.measurement;

import eb.v;
import eb.w;

/* loaded from: classes2.dex */
public final class zzon implements v<zzom> {
    private static zzon zza = new zzon();
    private final v<zzom> zzb = w.b(new zzop());

    public static boolean zza() {
        return ((zzom) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzom) zza.get()).zzb();
    }

    @Override // eb.v
    public final /* synthetic */ zzom get() {
        return this.zzb.get();
    }
}
