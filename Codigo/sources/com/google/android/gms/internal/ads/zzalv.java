package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzalv implements zzakm {
    private final zzalo zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzalv(zzalo zzaloVar, Map map, Map map2, Map map3) {
        this.zza = zzaloVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzaloVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final long zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final List zzc(long j10) {
        return this.zza.zze(j10, this.zzc, this.zzd, this.zze);
    }
}
