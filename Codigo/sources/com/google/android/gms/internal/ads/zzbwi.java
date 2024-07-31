package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.b;

/* loaded from: classes2.dex */
public final class zzbwi extends zzbkz {
    private final b.c zza;

    public zzbwi(b.c cVar) {
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final void zze(zzblj zzbljVar) {
        this.zza.onNativeAdLoaded(new zzbwb(zzbljVar));
    }
}
