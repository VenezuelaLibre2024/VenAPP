package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzcmh implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzcmh(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzp zzb() {
        Context zza = ((zzclm) this.zza).zza();
        zzfnc zzfncVar = (zzfnc) this.zzb.zzb();
        zzbrx zzb = t.h().zzb(zza, zzcei.zza(), zzfncVar);
        zzbrr zzbrrVar = zzbru.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzbrrVar, zzbrrVar);
        return new zzbzo(zza, t.h().zzb(zza, zzcei.zza(), zzfncVar).zza("google.afma.sdkConstants.getSdkConstants", zzbrrVar, zzbrrVar));
    }
}
