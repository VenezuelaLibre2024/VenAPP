package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzczf implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzczf(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdbr zzdbrVar = (zzdvo) this.zza.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        zzdbr zzdbrVar2 = (zzefg) this.zzc.zzb();
        if (true == ((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
            zzdbrVar = zzdbrVar2;
        }
        return new zzdim(zzdbrVar, zzgeyVar);
    }
}
