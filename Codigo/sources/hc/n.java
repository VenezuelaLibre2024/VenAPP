package hc;

import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private int f16689a;

    /* renamed from: b, reason: collision with root package name */
    private String f16690b;

    private n(int i10, String str) {
        this.f16689a = i10;
        this.f16690b = str;
    }

    public static n a(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new n(jSONObject.optInt("code"), jSONObject.optString(Constants.MESSAGE));
    }

    public int b() {
        return this.f16689a;
    }

    public String c() {
        return this.f16690b;
    }
}
