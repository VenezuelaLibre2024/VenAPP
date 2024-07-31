package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzefe {
    private final zzbzp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefe(zzbzp zzbzpVar) {
        this.zza = zzbzpVar;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject == null) {
            u1.a("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
    }

    public final void zzb() {
        zzces.zza(this.zza.zza(), "persistFlags");
    }
}