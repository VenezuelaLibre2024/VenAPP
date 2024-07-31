package com.arthenica.ffmpegkit;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {
    public static q a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("streams");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("chapters");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; optJSONArray != null && i10 < optJSONArray.length(); i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                arrayList.add(new c0(optJSONObject));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; optJSONArray2 != null && i11 < optJSONArray2.length(); i11++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i11);
            if (optJSONObject2 != null) {
                arrayList2.add(new f(optJSONObject2));
            }
        }
        return new q(jSONObject, arrayList, arrayList2);
    }
}
