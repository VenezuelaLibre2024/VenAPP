package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfmc implements zzflw {
    private final zzfmg zza;
    private final zzfme zzb;
    private final zzflt zzc;

    public zzfmc(zzflt zzfltVar, zzfmg zzfmgVar, zzfme zzfmeVar) {
        this.zzc = zzfltVar;
        this.zza = zzfmgVar;
        this.zzb = zzfmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflw
    public final String zza(zzflv zzflvVar) {
        zzfme zzfmeVar = this.zzb;
        Map zzj = zzflvVar.zzj();
        zzfmeVar.zza(zzj);
        return this.zza.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzflw
    public final void zzb(zzflv zzflvVar) {
        this.zzc.zzb(zza(zzflvVar));
    }
}
