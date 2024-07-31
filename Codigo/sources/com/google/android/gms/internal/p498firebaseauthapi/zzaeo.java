package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzaeo implements zzacs<zzaeo> {
    private static final String zza = "zzaeo";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;
    private long zzg;
    private List<zzafr> zzh;
    private String zzi;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaeo zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("localId", null);
            this.zzc = jSONObject.optString(Constants.EMAIL, null);
            this.zzd = jSONObject.optString(Constants.ID_TOKEN, null);
            this.zze = jSONObject.optString("refreshToken", null);
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = jSONObject.optLong("expiresIn", 0L);
            this.zzh = zzafr.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzi = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzg;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzi;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzafr> zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzi);
    }

    public final boolean zzg() {
        return this.zzf;
    }
}
