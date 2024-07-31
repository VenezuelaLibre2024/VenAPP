package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final ee.b<cc.a> f12558a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f12559b = Collections.synchronizedMap(new HashMap());

    public x(ee.b<cc.a> bVar) {
        this.f12558a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject optJSONObject;
        cc.a aVar = this.f12558a.get();
        if (aVar == null) {
            return;
        }
        JSONObject i10 = gVar.i();
        if (i10.length() < 1) {
            return;
        }
        JSONObject g10 = gVar.g();
        if (g10.length() >= 1 && (optJSONObject = i10.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f12559b) {
                if (optString.equals(this.f12559b.get(str))) {
                    return;
                }
                this.f12559b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", g10.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                aVar.a("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                aVar.a("fp", "_fpc", bundle2);
            }
        }
    }
}
