package p138hc;

import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* renamed from: hc.n */
/* loaded from: classes.dex */
public class C7707n {

    /* renamed from: a */
    private int f18339a;

    /* renamed from: b */
    private String f18340b;

    private C7707n(int i10, String str) {
        this.f18339a = i10;
        this.f18340b = str;
    }

    /* renamed from: a */
    public static C7707n m23470a(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new C7707n(jSONObject.optInt("code"), jSONObject.optString(Constants.MESSAGE));
    }

    /* renamed from: b */
    public int m23471b() {
        return this.f18339a;
    }

    /* renamed from: c */
    public String m23472c() {
        return this.f18340b;
    }
}
