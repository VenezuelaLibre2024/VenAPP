package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezn implements zzexp {
    final String zza;
    final int zzb;

    public zzezn(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject f10 = y0.f(jSONObject, "pii");
            f10.put("pvid", this.zza);
            f10.put("pvid_s", this.zzb);
        } catch (JSONException e10) {
            u1.b("Failed putting gms core app set ID info.", e10);
        }
    }
}
