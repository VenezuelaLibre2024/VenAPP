package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaem implements zzacp {
    private String zza;

    public zzaem(String str) {
        this.zza = C5276s.m13320f(str);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        return jSONObject.toString();
    }
}
