package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdwf {
    private final zzdwk zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdwf(zzdwk zzdwkVar, Executor executor) {
        this.zza = zzdwkVar;
        this.zzc = zzdwkVar.zza();
        this.zzb = executor;
    }

    public final zzdwe zza() {
        zzdwe zzdweVar = new zzdwe(this);
        zzdwe.zza(zzdweVar);
        return zzdweVar;
    }

    public final void zze() {
        if (((Boolean) a0.c().zza(zzbgc.zzlb)).booleanValue()) {
            zzdwe zza = zza();
            zza.zzb("action", "pecr");
            zza.zzg();
        }
    }
}
