package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhhh extends zzhgz {
    private static final zzhhm zza = zzhhe.zza(Collections.emptyMap());

    public /* synthetic */ zzhhh(Map map, zzhhf zzhhfVar) {
        super(map);
    }

    public static zzhhg zzc(int i10) {
        return new zzhhg(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzhha.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhhm) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
