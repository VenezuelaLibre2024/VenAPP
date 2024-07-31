package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaee {
    private final String zza;

    public zzaee(String str) {
        this.zza = C5276s.m13320f(str);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
