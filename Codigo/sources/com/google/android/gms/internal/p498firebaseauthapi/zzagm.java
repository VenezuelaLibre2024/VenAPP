package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagm implements zzagg {
    private final String zza;
    private final String zzb;

    private zzagm(String str, String str2) {
        this.zza = C5276s.m13320f(str);
        this.zzb = str2;
    }

    public static zzagm zza(String str, String str2) {
        return new zzagm(str, str2);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
