package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import la.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzafk implements zzacs<zzafk> {
    private static final String zza = "zzafk";
    private String zzb;
    private zzap<zzafu> zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacs
    /* renamed from: zzc */
    public final zzafk zza(String str) {
        zzap<zzafu> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = t.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzao zzg = zzap.zzg();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        zzg.zza(jSONObject2 == null ? zzafu.zza(null, null) : zzafu.zza(t.a(jSONObject2.optString("provider")), t.a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzap.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb(String str) {
        zzap<zzafu> zzapVar = this.zzc;
        if (zzapVar != null && !zzapVar.isEmpty()) {
            zzap<zzafu> zzapVar2 = this.zzc;
            int size = zzapVar2.size();
            int i10 = 0;
            while (i10 < size) {
                zzafu zzafuVar = zzapVar2.get(i10);
                i10++;
                zzafu zzafuVar2 = zzafuVar;
                String zza2 = zzafuVar2.zza();
                String zzb = zzafuVar2.zzb();
                if (zza2 != null && zzb != null) {
                    if ((zza2.equals("ENFORCE") || zza2.equals("AUDIT")) && zzb.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
