package lc;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21182a;

    public a(String str) {
        this.f21182a = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f21182a);
        return jSONObject.toString();
    }
}
