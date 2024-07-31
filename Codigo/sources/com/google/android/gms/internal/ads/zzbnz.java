package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.s;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnz implements zzbng {
    private final zzdzd zza;

    public zzbnz(zzdzd zzdzdVar) {
        s.k(zzdzdVar, "The Inspector Manager must not be null");
        this.zza = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j10);
    }
}
