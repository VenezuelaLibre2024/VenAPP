package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzert implements zzexq {
    private final com.google.common.util.concurrent.f zza;
    private final Executor zzb;

    public zzert(com.google.common.util.concurrent.f fVar, Executor executor) {
        this.zza = fVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzn(this.zza, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                final String str = (String) obj;
                return zzgen.zzh(new zzexp() { // from class: com.google.android.gms.internal.ads.zzerr
                    @Override // com.google.android.gms.internal.ads.zzexp
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
