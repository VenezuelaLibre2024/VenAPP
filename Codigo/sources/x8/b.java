package x8;

import com.google.android.gms.ads.internal.client.c3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f30654a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30655b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30656c;

    /* renamed from: d, reason: collision with root package name */
    private final b f30657d;

    public b(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public b(int i10, String str, String str2, b bVar) {
        this.f30654a = i10;
        this.f30655b = str;
        this.f30656c = str2;
        this.f30657d = bVar;
    }

    public int a() {
        return this.f30654a;
    }

    public String b() {
        return this.f30656c;
    }

    public String c() {
        return this.f30655b;
    }

    public final c3 d() {
        c3 c3Var;
        b bVar = this.f30657d;
        if (bVar == null) {
            c3Var = null;
        } else {
            String str = bVar.f30656c;
            c3Var = new c3(bVar.f30654a, bVar.f30655b, str, null, null);
        }
        return new c3(this.f30654a, this.f30655b, this.f30656c, c3Var, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f30654a);
        jSONObject.put("Message", this.f30655b);
        jSONObject.put("Domain", this.f30656c);
        b bVar = this.f30657d;
        jSONObject.put("Cause", bVar == null ? "null" : bVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
