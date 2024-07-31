package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeys implements zzexp {
    private final String zza;

    public zzeys(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e10) {
            u1.b("Failed putting Ad ID.", e10);
        }
    }
}
