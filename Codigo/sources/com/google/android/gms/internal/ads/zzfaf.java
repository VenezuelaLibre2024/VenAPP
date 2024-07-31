package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfaf implements zzexp {
    private final String zza;
    private final String zzb;

    public zzfaf(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject f10 = y0.f((JSONObject) obj, "pii");
            f10.put("doritos", this.zza);
            f10.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            u1.a("Failed putting doritos string.");
        }
    }
}
