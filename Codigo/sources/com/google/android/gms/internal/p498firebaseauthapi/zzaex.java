package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaex implements zzaer {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaex(String str, String str2, String str3, String str4, String str5) {
        this.zza = C5276s.m13320f(str);
        this.zzb = C5276s.m13320f(str2);
        this.zzc = C5276s.m13320f(str3);
        this.zzd = C5276s.m13320f(str4);
        this.zze = str5;
    }

    public static zzaex zza(String str, String str2, String str3, String str4, String str5) {
        return new zzaex(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaer
    public final /* synthetic */ zzaer zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
