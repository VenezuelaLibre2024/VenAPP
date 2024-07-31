package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbgs {
    private final Map zza = new HashMap();
    private final zzbgu zzb;

    public zzbgs(zzbgu zzbguVar) {
        this.zzb = zzbguVar;
    }

    public final zzbgu zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbgr zzbgrVar) {
        this.zza.put(str, zzbgrVar);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbgr zzbgrVar = (zzbgr) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbgrVar != null) {
            this.zzb.zze(zzbgrVar, j10, strArr);
        }
        this.zza.put(str, new zzbgr(j10, null, null));
    }
}
