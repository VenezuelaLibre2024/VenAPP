package nc;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21926a;

    public a(String str) {
        this.f21926a = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("safetyNetToken", this.f21926a);
        return jSONObject.toString();
    }
}
