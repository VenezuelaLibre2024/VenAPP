package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzflx implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzflx(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhgx zza = zzhhc.zza(zzhho.zza(this.zza));
        zzhgx zza2 = zzhhc.zza(zzhho.zza(this.zzb));
        Object zzflzVar = ((Boolean) a0.c().zza(zzbgc.zziA)).booleanValue() ? new zzflz((zzflw) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzflw) zza2.zzb();
        zzhhl.zzb(zzflzVar);
        return zzflzVar;
    }
}
