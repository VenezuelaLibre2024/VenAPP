package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzdxr implements zzdxf {
    private final long zza;
    private final zzeqm zzb;

    public zzdxr(long j10, Context context, zzdxk zzdxkVar, zzclg zzclgVar, String str) {
        this.zza = j10;
        zzfer zzu = zzclgVar.zzu();
        zzu.zzc(context);
        zzu.zza(new z4());
        zzu.zzb(str);
        zzeqm zza = zzu.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdxq(this, zzdxkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzb(u4 u4Var) {
        this.zzb.zzaa(u4Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzc() {
        this.zzb.zzW(com.google.android.gms.dynamic.d.h2(null));
    }
}
