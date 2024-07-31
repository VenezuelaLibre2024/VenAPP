package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgmy {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgmy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmy(zzgmx zzgmxVar) {
    }

    public final zzgmy zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzgna zzb() {
        return new zzgna(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
