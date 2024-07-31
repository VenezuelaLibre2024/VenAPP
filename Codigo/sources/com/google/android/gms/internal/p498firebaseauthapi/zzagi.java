package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagi implements zzacp {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzaee zzh;

    private zzagi(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = C5276s.m13320f(str);
        this.zzb = C5276s.m13320f(str2);
        this.zzc = C5276s.m13320f(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzagi zza(String str, String str2, String str3, String str4, String str5, String str6) {
        C5276s.m13320f(str3);
        return new zzagi(Constants.SIGN_IN_METHOD_PHONE, str, str2, str3, str4, str5, str6);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            zzaee zzaeeVar = this.zzh;
            if (zzaeeVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzaeeVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaee zzaeeVar) {
        this.zzh = zzaeeVar;
    }

    public final String zzb() {
        return this.zzd;
    }
}
