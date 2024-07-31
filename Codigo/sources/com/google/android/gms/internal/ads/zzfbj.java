package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.r1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfbj implements zzexq {
    private final zzgey zza;

    public zzfbj(zzgey zzgeyVar) {
        this.zza = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) a0.c().zza(zzbgc.zzK);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) a0.c().zza(zzbgc.zzL)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, r1.a(str2));
                        }
                    }
                }
                return new zzfbk(hashMap);
            }
        });
    }
}
