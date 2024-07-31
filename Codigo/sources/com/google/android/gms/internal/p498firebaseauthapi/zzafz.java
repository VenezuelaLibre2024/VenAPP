package com.google.android.gms.internal.p498firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzafz implements zzacp {
    public static zzafy zzg() {
        return new zzaej();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, zzc());
        jSONObject.put(Constants.TOKEN, zzf());
        jSONObject.put(Constants.PROVIDER_ID, zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzaey zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
