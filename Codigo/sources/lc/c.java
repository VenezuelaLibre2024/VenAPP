package lc;

import com.google.android.gms.common.internal.s;
import la.t;
import org.json.JSONObject;
import zb.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f21183a;

    /* renamed from: b, reason: collision with root package name */
    private String f21184b;

    private c(String str, String str2) {
        s.j(str);
        s.j(str2);
        this.f21183a = str;
        this.f21184b = str2;
    }

    public static c a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a10 = t.a(jSONObject.optString("challenge"));
        String a11 = t.a(jSONObject.optString("ttl"));
        if (a10 == null || a11 == null) {
            throw new m("Unexpected server response.");
        }
        return new c(a10, a11);
    }

    public String b() {
        return this.f21183a;
    }
}
