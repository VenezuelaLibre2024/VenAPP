package p138hc;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import ec.AbstractC7173c;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p160ic.C7959c;
import p160ic.InterfaceC7957a;

/* renamed from: hc.b */
/* loaded from: classes.dex */
public final class C7695b extends AbstractC7173c {

    /* renamed from: d */
    private static final String f18302d = "hc.b";

    /* renamed from: a */
    private final String f18303a;

    /* renamed from: b */
    private final long f18304b;

    /* renamed from: c */
    private final long f18305c;

    C7695b(String str, long j10) {
        this(str, j10, new InterfaceC7957a.a().mo24442a());
    }

    C7695b(String str, long j10, long j11) {
        C5276s.m13320f(str);
        this.f18303a = str;
        this.f18305c = j10;
        this.f18304b = j11;
    }

    /* renamed from: c */
    public static C7695b m23432c(C7694a c7694a) {
        long m23435g;
        C5276s.m13324j(c7694a);
        try {
            m23435g = (long) (Double.parseDouble(c7694a.m23430b().replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> m24450b = C7959c.m24450b(c7694a.m23431c());
            m23435g = 1000 * (m23435g(m24450b, "exp") - m23435g(m24450b, "iat"));
        }
        return new C7695b(c7694a.m23431c(), m23435g);
    }

    /* renamed from: d */
    public static C7695b m23433d(String str) {
        C5276s.m13324j(str);
        Map<String, Object> m24450b = C7959c.m24450b(str);
        long m23435g = m23435g(m24450b, "iat");
        return new C7695b(str, (m23435g(m24450b, "exp") - m23435g) * 1000, m23435g * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C7695b m23434e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C7695b(jSONObject.getString(Constants.TOKEN), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            Log.e(f18302d, "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: g */
    private static long m23435g(Map<String, Object> map, String str) {
        C5276s.m13324j(map);
        C5276s.m13320f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // ec.AbstractC7173c
    /* renamed from: a */
    public long mo21367a() {
        return this.f18304b + this.f18305c;
    }

    @Override // ec.AbstractC7173c
    /* renamed from: b */
    public String mo21368b() {
        return this.f18303a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m23436f() {
        return this.f18305c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m23437h() {
        return this.f18304b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m23438i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.TOKEN, this.f18303a);
            jSONObject.put("receivedAt", this.f18304b);
            jSONObject.put("expiresIn", this.f18305c);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.e(f18302d, "Could not serialize token: " + e10.getMessage());
            return null;
        }
    }
}
