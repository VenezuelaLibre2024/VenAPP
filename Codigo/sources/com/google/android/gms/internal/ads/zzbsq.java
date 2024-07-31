package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbsq {
    public static final List zza(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(optJSONArray.getString(i10));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
