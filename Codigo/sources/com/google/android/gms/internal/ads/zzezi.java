package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezi implements zzexp {
    private final JSONObject zza;

    public zzezi(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject f10 = y0.f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zza;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f10.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            u1.a("Failed putting app indexing json.");
        }
    }
}
