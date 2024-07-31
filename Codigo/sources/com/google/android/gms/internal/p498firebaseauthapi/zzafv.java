package com.google.android.gms.internal.p498firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import la.C9475t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzafv {
    private List<zzafs> zza;

    public zzafv() {
        this.zza = new ArrayList();
    }

    private zzafv(List<zzafs> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static zzafv zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafv(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzafs() : new zzafs(C9475t.m28179a(jSONObject.optString("federatedId", null)), C9475t.m28179a(jSONObject.optString("displayName", null)), C9475t.m28179a(jSONObject.optString("photoUrl", null)), C9475t.m28179a(jSONObject.optString(Constants.PROVIDER_ID, null)), null, C9475t.m28179a(jSONObject.optString("phoneNumber", null)), C9475t.m28179a(jSONObject.optString(Constants.EMAIL, null))));
        }
        return new zzafv(arrayList);
    }

    public final List<zzafs> zza() {
        return this.zza;
    }
}
