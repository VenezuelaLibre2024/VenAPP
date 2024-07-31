package com.google.android.gms.internal.p498firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzafo {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;
    private boolean zzf;

    public static zzafo zza(String str) {
        try {
            zzafo zzafoVar = new zzafo();
            JSONObject jSONObject = new JSONObject(str);
            zzafoVar.zza = jSONObject.optString("iss");
            zzafoVar.zzb = jSONObject.optString("aud");
            zzafoVar.zzc = jSONObject.optString("sub");
            zzafoVar.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzafoVar.zze = Long.valueOf(jSONObject.optLong("exp"));
            zzafoVar.zzf = jSONObject.optBoolean("is_anonymous");
            return zzafoVar;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e10));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e10));
        }
    }

    public final Long zza() {
        return this.zze;
    }

    public final Long zzb() {
        return this.zzd;
    }
}
