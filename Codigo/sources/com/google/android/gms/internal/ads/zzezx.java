package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezx implements zzexp {
    private final JSONObject zza;

    public zzezx(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zza);
        } catch (JSONException unused) {
            u1.a("Unable to get cache_state");
        }
    }
}
