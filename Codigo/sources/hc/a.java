package hc;

import io.flutter.plugins.firebase.auth.Constants;
import la.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f16650a;

    /* renamed from: b, reason: collision with root package name */
    private String f16651b;

    private a(String str, String str2) {
        com.google.android.gms.common.internal.s.j(str);
        com.google.android.gms.common.internal.s.j(str2);
        this.f16650a = str;
        this.f16651b = str2;
    }

    public static a a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a10 = t.a(jSONObject.optString(Constants.TOKEN));
        String a11 = t.a(jSONObject.optString("ttl"));
        if (a10 == null || a11 == null) {
            throw new zb.m("Unexpected server response.");
        }
        return new a(a10, a11);
    }

    public String b() {
        return this.f16651b;
    }

    public String c() {
        return this.f16650a;
    }
}
