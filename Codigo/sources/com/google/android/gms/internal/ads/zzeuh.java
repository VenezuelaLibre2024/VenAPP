package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeuh implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeuh(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzclm) this.zza).zza();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        return new zzeug(zza, zzgeyVar);
    }
}