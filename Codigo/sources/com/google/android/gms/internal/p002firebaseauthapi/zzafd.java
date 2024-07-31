package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import la.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzafd implements zzacs<zzafd> {
    private static final String zza = "zzafd";
    private zzaff zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacs
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafd zza(String str) {
        zzaff zzaffVar;
        int i10;
        zzafc zzafcVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzafcVar = new zzafc();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzafcVar = new zzafc(t.a(jSONObject2.optString("localId", null)), t.a(jSONObject2.optString(Constants.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), t.a(jSONObject2.optString("displayName", null)), t.a(jSONObject2.optString("photoUrl", null)), zzafv.zza(jSONObject2.optJSONArray("providerUserInfo")), t.a(jSONObject2.optString("rawPassword", null)), t.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafr.zza(jSONObject2.optJSONArray("mfaInfo")), zzafq.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzafcVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzaffVar = new zzaff(arrayList);
                }
                zzaffVar = new zzaff(new ArrayList());
            } else {
                zzaffVar = new zzaff();
            }
            this.zzb = zzaffVar;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahc.zza(e10, zza, str);
        }
    }

    public final List<zzafc> zza() {
        return this.zzb.zza();
    }
}
