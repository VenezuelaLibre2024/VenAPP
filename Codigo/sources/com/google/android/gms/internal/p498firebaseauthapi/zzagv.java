package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C6059d2;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import la.C9475t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzagv implements zzacs<zzagv> {
    private static final String zza = "zzagv";
    private boolean zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private List<zzafr> zzt;
    private String zzu;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagv zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            this.zzc = jSONObject.optBoolean("needEmail", false);
            this.zzd = C9475t.m28179a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zze = C9475t.m28179a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            this.zzg = C9475t.m28179a(jSONObject.optString("localId", null));
            this.zzh = C9475t.m28179a(jSONObject.optString(Constants.EMAIL, null));
            this.zzi = C9475t.m28179a(jSONObject.optString("displayName", null));
            this.zzj = C9475t.m28179a(jSONObject.optString("photoUrl", null));
            this.zzk = C9475t.m28179a(jSONObject.optString(Constants.PROVIDER_ID, null));
            this.zzl = C9475t.m28179a(jSONObject.optString("rawUserInfo", null));
            this.zzm = jSONObject.optBoolean("isNewUser", false);
            this.zzn = jSONObject.optString("oauthAccessToken", null);
            this.zzo = jSONObject.optString("oauthIdToken", null);
            this.zzq = C9475t.m28179a(jSONObject.optString("errorMessage", null));
            this.zzr = C9475t.m28179a(jSONObject.optString("pendingToken", null));
            this.zzs = C9475t.m28179a(jSONObject.optString("tenantId", null));
            this.zzt = zzafr.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzu = C9475t.m28179a(jSONObject.optString("mfaPendingCredential", null));
            this.zzp = C9475t.m28179a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final C6059d2 zzb() {
        if (TextUtils.isEmpty(this.zzn) && TextUtils.isEmpty(this.zzo)) {
            return null;
        }
        return C6059d2.m16491D1(this.zzk, this.zzo, this.zzn, this.zzr, this.zzp);
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzu;
    }

    public final String zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzs;
    }

    public final List<zzafr> zzk() {
        return this.zzt;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzu);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzq);
    }
}
