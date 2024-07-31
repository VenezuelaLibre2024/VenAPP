package gc;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f16198a;

    public f(String str) {
        this.f16198a = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugToken", this.f16198a);
        return jSONObject.toString();
    }
}
