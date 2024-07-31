package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzetq implements zzexq {
    private final AtomicReference zza = new AtomicReference();
    private final la.f zzb;
    private final zzexq zzc;
    private final long zzd;

    public zzetq(zzexq zzexqVar, long j10, la.f fVar) {
        this.zzb = fVar;
        this.zzc = zzexqVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        zzetp zzetpVar = (zzetp) this.zza.get();
        if (zzetpVar == null || zzetpVar.zza()) {
            zzexq zzexqVar = this.zzc;
            zzetp zzetpVar2 = new zzetp(zzexqVar.zzb(), this.zzd, this.zzb);
            this.zza.set(zzetpVar2);
            zzetpVar = zzetpVar2;
        }
        return zzetpVar.zza;
    }
}
