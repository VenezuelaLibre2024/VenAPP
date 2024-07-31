package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagu implements zzacp {
    private String zza;
    private String zzb;

    public zzagu(String str, String str2) {
        this.zza = s.f(str);
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.TOKEN, this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
