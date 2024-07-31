package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.y0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzblv implements zzbng {
    private final zzblw zza;

    public zzblv(zzblw zzblwVar) {
        this.zza = zzblwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            zzcec.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = y0.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e10) {
                zzcec.zzh("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundle == null) {
            zzcec.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
