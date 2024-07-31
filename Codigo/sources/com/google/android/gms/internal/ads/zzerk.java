package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzerk implements zzexq {
    private final la.f zza;
    private final zzfhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerk(la.f fVar, zzfhh zzfhhVar) {
        this.zza = fVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(new zzerl(this.zzb, this.zza.a()));
    }
}
