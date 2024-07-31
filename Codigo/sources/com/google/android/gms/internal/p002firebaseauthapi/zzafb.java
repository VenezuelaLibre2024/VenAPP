package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzafb implements zzacp {
    private String zza = zzaez.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafb(String str) {
        this.zzb = s.f(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
