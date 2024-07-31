package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaen implements zzacs<zzaen> {
    private static final String zza = "zzaen";
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private zzago zzf = zzago.zza();
    private List<String> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaen zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString(Constants.PROVIDER_ID, null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.zzf = new zzago(1, zzahc.zza(jSONObject.optJSONArray("allProviders")));
            } else {
                this.zzf = zzago.zza();
            }
            this.zzg = zzahc.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzg;
    }
}
