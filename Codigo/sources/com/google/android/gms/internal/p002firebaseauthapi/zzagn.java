package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagn extends zzagj {
    private static final String zza = "zzagn";
    private String zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagj
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzagn zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzag.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagj, com.google.android.gms.internal.p002firebaseauthapi.zzacs
    public final /* synthetic */ zzagj zza(String str) {
        return (zzagn) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagj
    public final String zza() {
        return this.zzb;
    }
}
