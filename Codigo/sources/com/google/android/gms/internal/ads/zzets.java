package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzets implements zzexq {
    private final zzgey zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzets(zzgey zzgeyVar) {
        this.zza = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzett(Long.valueOf(t.b().a() - t.q().zzi().zzh().zza()).longValue());
            }
        });
    }
}
