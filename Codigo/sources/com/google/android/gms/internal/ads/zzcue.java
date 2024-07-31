package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcue implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcue(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddm zzb() {
        return new zzddm((ScheduledExecutorService) this.zza.zzb(), (la.f) this.zzb.zzb());
    }
}
