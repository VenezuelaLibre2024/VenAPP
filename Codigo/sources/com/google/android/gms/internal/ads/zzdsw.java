package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdsw implements zzhhd {
    private final zzhhu zza;

    public zzdsw(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbz zzbbzVar = ((zzdao) this.zza).zza().zzo.zza == 3 ? zzbbz.REWARDED_INTERSTITIAL : zzbbz.REWARD_BASED_VIDEO_AD;
        zzhhl.zzb(zzbbzVar);
        return zzbbzVar;
    }
}
