package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.s0;

/* loaded from: classes2.dex */
public final class zzdpn implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;
    private final zzhhu zzc;

    public zzdpn(zzhhu zzhhuVar, zzhhu zzhhuVar2, zzhhu zzhhuVar3) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
        this.zzc = zzhhuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        s0 s0Var = (s0) this.zza.zzb();
        la.f fVar = (la.f) this.zzb.zzb();
        zzgey zzgeyVar = zzcep.zza;
        zzhhl.zzb(zzgeyVar);
        return new zzdpm(s0Var, fVar, zzgeyVar);
    }
}
