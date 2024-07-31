package x8;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.d5;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final d5 f30704a;

    /* renamed from: b, reason: collision with root package name */
    private final b f30705b;

    private l(d5 d5Var) {
        this.f30704a = d5Var;
        c3 c3Var = d5Var.f8651c;
        this.f30705b = c3Var == null ? null : c3Var.u1();
    }

    public static l i(d5 d5Var) {
        if (d5Var != null) {
            return new l(d5Var);
        }
        return null;
    }

    public b a() {
        return this.f30705b;
    }

    public String b() {
        return this.f30704a.f8654f;
    }

    public String c() {
        return this.f30704a.f8656s;
    }

    public String d() {
        return this.f30704a.f8655r;
    }

    public String e() {
        return this.f30704a.f8653e;
    }

    public String f() {
        return this.f30704a.f8649a;
    }

    public Bundle g() {
        return this.f30704a.f8652d;
    }

    public long h() {
        return this.f30704a.f8650b;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f30704a.f8649a);
        jSONObject.put("Latency", this.f30704a.f8650b);
        String e10 = e();
        if (e10 == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", e10);
        }
        String b10 = b();
        if (b10 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", b10);
        }
        String d10 = d();
        if (d10 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", d10);
        }
        String c10 = c();
        if (c10 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", c10);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f30704a.f8652d.keySet()) {
            jSONObject2.put(str, this.f30704a.f8652d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        b bVar = this.f30705b;
        if (bVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", bVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
