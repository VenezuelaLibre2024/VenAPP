package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbnt implements zzbnu {
    final /* synthetic */ zzceu zza;

    public zzbnt(zzbnv zzbnvVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        this.zza.zzd(new zzbrm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
