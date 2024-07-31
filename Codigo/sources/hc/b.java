package hc;

import android.util.Log;
import ic.a;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends ec.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f16652d = "hc.b";

    /* renamed from: a, reason: collision with root package name */
    private final String f16653a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16654b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16655c;

    b(String str, long j10) {
        this(str, j10, new a.C0286a().a());
    }

    b(String str, long j10, long j11) {
        com.google.android.gms.common.internal.s.f(str);
        this.f16653a = str;
        this.f16655c = j10;
        this.f16654b = j11;
    }

    public static b c(a aVar) {
        long g10;
        com.google.android.gms.common.internal.s.j(aVar);
        try {
            g10 = (long) (Double.parseDouble(aVar.b().replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> b10 = ic.c.b(aVar.c());
            g10 = 1000 * (g(b10, "exp") - g(b10, "iat"));
        }
        return new b(aVar.c(), g10);
    }

    public static b d(String str) {
        com.google.android.gms.common.internal.s.j(str);
        Map<String, Object> b10 = ic.c.b(str);
        long g10 = g(b10, "iat");
        return new b(str, (g(b10, "exp") - g10) * 1000, g10 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getString(Constants.TOKEN), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            Log.e(f16652d, "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    private static long g(Map<String, Object> map, String str) {
        com.google.android.gms.common.internal.s.j(map);
        com.google.android.gms.common.internal.s.f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // ec.c
    public long a() {
        return this.f16654b + this.f16655c;
    }

    @Override // ec.c
    public String b() {
        return this.f16653a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        return this.f16655c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.f16654b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.TOKEN, this.f16653a);
            jSONObject.put("receivedAt", this.f16654b);
            jSONObject.put("expiresIn", this.f16655c);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.e(f16652d, "Could not serialize token: " + e10.getMessage());
            return null;
        }
    }
}
