package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfap implements zzexp {
    private final Bundle zza;

    public zzfap(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                y0.f(y0.f(jSONObject, "device"), "play_store").put("parental_controls", x.b().zzh(this.zza));
            } catch (JSONException unused) {
                u1.a("Failed putting parental controls bundle.");
            }
        }
    }
}
