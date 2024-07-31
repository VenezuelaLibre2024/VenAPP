package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzevg implements zzexq {
    private final zzfgl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevg(zzfgl zzfglVar) {
        this.zza = zzfglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(new zzevh(this.zza));
    }
}
