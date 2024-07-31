package p138hc;

import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import la.C9475t;
import org.json.JSONObject;
import p485zb.C12873m;

/* renamed from: hc.a */
/* loaded from: classes.dex */
public class C7694a {

    /* renamed from: a */
    private String f18300a;

    /* renamed from: b */
    private String f18301b;

    private C7694a(String str, String str2) {
        C5276s.m13324j(str);
        C5276s.m13324j(str2);
        this.f18300a = str;
        this.f18301b = str2;
    }

    /* renamed from: a */
    public static C7694a m23429a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String m28179a = C9475t.m28179a(jSONObject.optString(Constants.TOKEN));
        String m28179a2 = C9475t.m28179a(jSONObject.optString("ttl"));
        if (m28179a == null || m28179a2 == null) {
            throw new C12873m("Unexpected server response.");
        }
        return new C7694a(m28179a, m28179a2);
    }

    /* renamed from: b */
    public String m23430b() {
        return this.f18301b;
    }

    /* renamed from: c */
    public String m23431c() {
        return this.f18300a;
    }
}
