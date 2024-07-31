package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezt implements zzexp {
    private final String zza;

    public zzezt(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject f10 = y0.f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            f10.put("attok", this.zza);
        } catch (JSONException e10) {
            u1.b("Failed putting attestation token.", e10);
        }
    }
}
