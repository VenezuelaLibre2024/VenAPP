package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezw implements zzexq {
    final zzgey zza;
    final Context zzb;
    final zzbbe zzc;

    public zzezw(zzbbe zzbbeVar, zzgey zzgeyVar, Context context) {
        this.zzc = zzbbeVar;
        this.zza = zzgeyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezx(new JSONObject());
            }
        });
    }
}
