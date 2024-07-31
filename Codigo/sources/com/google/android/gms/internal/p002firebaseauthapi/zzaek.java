package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaek implements zzacp {
    private String zza;
    private String zzb = "http://localhost";
    private final String zzc;

    public zzaek(String str, String str2) {
        this.zza = s.f(str);
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.IDENTIFIER, this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
