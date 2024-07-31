package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzela implements zzeip {
    private final zzdua zza;

    public zzela(zzdua zzduaVar) {
        this.zza = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeip
    public final zzeiq zza(String str, JSONObject jSONObject) {
        return new zzeiq(this.zza.zzc(str, jSONObject), new zzekj(), str);
    }
}
