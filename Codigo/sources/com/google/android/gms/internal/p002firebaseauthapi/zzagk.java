package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagk implements zzagg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzaee zzg;
    private final String zzh = null;

    private zzagk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = s.f(str);
        this.zzb = s.f(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzagk zza(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(str2);
        return new zzagk(str, Constants.SIGN_IN_METHOD_PHONE, str2, str3, str4, str5, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("playIntegrityToken", this.zzf);
            }
            zzaee zzaeeVar = this.zzg;
            if (zzaeeVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzaeeVar.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaee zzaeeVar) {
        this.zzg = zzaeeVar;
    }

    public final String zzb() {
        return this.zzd;
    }
}
