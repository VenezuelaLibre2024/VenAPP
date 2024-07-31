package p122gc;

import org.json.JSONObject;

/* renamed from: gc.f */
/* loaded from: classes.dex */
public class C7543f {

    /* renamed from: a */
    private final String f17835a;

    public C7543f(String str) {
        this.f17835a = str;
    }

    /* renamed from: a */
    public String m22900a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugToken", this.f17835a);
        return jSONObject.toString();
    }
}
