package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzcze implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcze(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcyk zzcykVar = (zzcyk) this.zza.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        zzgaf zzo = ((Boolean) a0.c().zza(zzbgc.zzfC)).booleanValue() ? zzgaf.zzo(new zzdim(zzcykVar, zzgeyVar)) : zzgaf.zzn();
        zzhhl.zzb(zzo);
        return zzo;
    }
}
