package lc;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lc.a */
/* loaded from: classes.dex */
public class C9489a {

    /* renamed from: a */
    private final String f23035a;

    public C9489a(String str) {
        this.f23035a = str;
    }

    /* renamed from: a */
    public String m28218a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f23035a);
        return jSONObject.toString();
    }
}
