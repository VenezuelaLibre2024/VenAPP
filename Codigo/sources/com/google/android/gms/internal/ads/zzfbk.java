package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfbk implements zzexp {
    private final Map zza;

    public zzfbk(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", x.b().zzi(this.zza));
        } catch (JSONException e10) {
            u1.a("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
