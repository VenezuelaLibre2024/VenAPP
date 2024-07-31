package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfgr {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgr(JsonReader jsonReader) {
        JSONObject h10 = y0.h(jsonReader);
        this.zzd = h10;
        this.zza = h10.optString("ad_html", null);
        this.zzb = h10.optString("ad_base_url", null);
        this.zzc = h10.optJSONObject("ad_json");
    }
}
