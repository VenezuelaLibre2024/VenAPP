package com.google.android.gms.internal.p498firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import la.C9475t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagf implements zzacs<zzagf> {
    private static final String zza = "zzagf";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafv zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C9475t.m28179a(jSONObject.optString(Constants.EMAIL, null));
            this.zzc = C9475t.m28179a(jSONObject.optString("passwordHash", null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = C9475t.m28179a(jSONObject.optString("displayName", null));
            this.zzf = C9475t.m28179a(jSONObject.optString("photoUrl", null));
            this.zzg = zzafv.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = C9475t.m28179a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zzi = C9475t.m28179a(jSONObject.optString("refreshToken", null));
            this.zzj = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzj;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafs> zze() {
        zzafv zzafvVar = this.zzg;
        if (zzafvVar != null) {
            return zzafvVar.zza();
        }
        return null;
    }
}
