package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcrg implements zzcqw {
    private final zzdzd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrg(zzdzd zzdzdVar) {
        this.zza = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqw
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) a0.c().zza(zzbgc.zzjd)).booleanValue()) {
                this.zza.zzm(jSONObject);
            }
        }
    }
}
