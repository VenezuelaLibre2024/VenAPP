package lc;

import com.google.android.gms.common.internal.C5276s;
import la.C9475t;
import org.json.JSONObject;
import p485zb.C12873m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lc.c */
/* loaded from: classes.dex */
public class C9491c {

    /* renamed from: a */
    private String f23036a;

    /* renamed from: b */
    private String f23037b;

    private C9491c(String str, String str2) {
        C5276s.m13324j(str);
        C5276s.m13324j(str2);
        this.f23036a = str;
        this.f23037b = str2;
    }

    /* renamed from: a */
    public static C9491c m28220a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String m28179a = C9475t.m28179a(jSONObject.optString("challenge"));
        String m28179a2 = C9475t.m28179a(jSONObject.optString("ttl"));
        if (m28179a == null || m28179a2 == null) {
            throw new C12873m("Unexpected server response.");
        }
        return new C9491c(m28179a, m28179a2);
    }

    /* renamed from: b */
    public String m28221b() {
        return this.f23036a;
    }
}
