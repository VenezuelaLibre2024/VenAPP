package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import cc.InterfaceC1940a;
import ee.InterfaceC7183b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.x */
/* loaded from: classes2.dex */
public class C6368x {

    /* renamed from: a */
    private final InterfaceC7183b<InterfaceC1940a> f13790a;

    /* renamed from: b */
    private final Map<String, String> f13791b = Collections.synchronizedMap(new HashMap());

    public C6368x(InterfaceC7183b<InterfaceC1940a> interfaceC7183b) {
        this.f13790a = interfaceC7183b;
    }

    /* renamed from: a */
    public void m17764a(String str, C6351g c6351g) {
        JSONObject optJSONObject;
        InterfaceC1940a interfaceC1940a = this.f13790a.get();
        if (interfaceC1940a == null) {
            return;
        }
        JSONObject m17634i = c6351g.m17634i();
        if (m17634i.length() < 1) {
            return;
        }
        JSONObject m17632g = c6351g.m17632g();
        if (m17632g.length() >= 1 && (optJSONObject = m17634i.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f13791b) {
                if (optString.equals(this.f13791b.get(str))) {
                    return;
                }
                this.f13791b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", m17632g.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                interfaceC1940a.mo10146a("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                interfaceC1940a.mo10146a("fp", "_fpc", bundle2);
            }
        }
    }
}
