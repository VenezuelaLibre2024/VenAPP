package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzdvu implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzdvu(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdds zzddsVar = (zzdvq) this.zza.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        zzdds zzddsVar2 = (zzefi) this.zzc.zzb();
        if (true == ((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue()) {
            zzddsVar = zzddsVar2;
        }
        return new zzdim(zzddsVar, zzgeyVar);
    }
}