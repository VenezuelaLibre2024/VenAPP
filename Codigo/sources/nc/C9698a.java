package nc;

import org.json.JSONObject;

/* renamed from: nc.a */
/* loaded from: classes.dex */
public class C9698a {

    /* renamed from: a */
    private final String f23859a;

    public C9698a(String str) {
        this.f23859a = str;
    }

    /* renamed from: a */
    public String m29083a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("safetyNetToken", this.f23859a);
        return jSONObject.toString();
    }
}
