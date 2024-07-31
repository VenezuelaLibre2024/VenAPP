package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import la.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagh implements zzacs<zzagh> {
    private static final String zza = "zzagh";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagh zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = t.a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zzc = t.a(jSONObject.optString("displayName", null));
            this.zzd = t.a(jSONObject.optString(Constants.EMAIL, null));
            this.zze = t.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zze;
    }
}
