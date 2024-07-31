package com.arthenica.ffmpegkit;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.arthenica.ffmpegkit.r */
/* loaded from: classes.dex */
public class C2086r {
    /* renamed from: a */
    public static C2085q m10528a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("streams");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("chapters");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; optJSONArray != null && i10 < optJSONArray.length(); i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                arrayList.add(new C2071c0(optJSONObject));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; optJSONArray2 != null && i11 < optJSONArray2.length(); i11++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i11);
            if (optJSONObject2 != null) {
                arrayList2.add(new C2074f(optJSONObject2));
            }
        }
        return new C2085q(jSONObject, arrayList, arrayList2);
    }
}
