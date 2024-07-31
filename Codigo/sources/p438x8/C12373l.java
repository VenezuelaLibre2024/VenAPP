package p438x8;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C4801c3;
import com.google.android.gms.ads.internal.client.C4810d5;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x8.l */
/* loaded from: classes.dex */
public final class C12373l {

    /* renamed from: a */
    private final C4810d5 f33224a;

    /* renamed from: b */
    private final C12353b f33225b;

    private C12373l(C4810d5 c4810d5) {
        this.f33224a = c4810d5;
        C4801c3 c4801c3 = c4810d5.f9728c;
        this.f33225b = c4801c3 == null ? null : c4801c3.m12370u1();
    }

    /* renamed from: i */
    public static C12373l m40019i(C4810d5 c4810d5) {
        if (c4810d5 != null) {
            return new C12373l(c4810d5);
        }
        return null;
    }

    /* renamed from: a */
    public C12353b m40020a() {
        return this.f33225b;
    }

    /* renamed from: b */
    public String m40021b() {
        return this.f33224a.f9731f;
    }

    /* renamed from: c */
    public String m40022c() {
        return this.f33224a.f9733s;
    }

    /* renamed from: d */
    public String m40023d() {
        return this.f33224a.f9732r;
    }

    /* renamed from: e */
    public String m40024e() {
        return this.f33224a.f9730e;
    }

    /* renamed from: f */
    public String m40025f() {
        return this.f33224a.f9726a;
    }

    /* renamed from: g */
    public Bundle m40026g() {
        return this.f33224a.f9729d;
    }

    /* renamed from: h */
    public long m40027h() {
        return this.f33224a.f9727b;
    }

    /* renamed from: j */
    public final JSONObject m40028j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f33224a.f9726a);
        jSONObject.put("Latency", this.f33224a.f9727b);
        String m40024e = m40024e();
        if (m40024e == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", m40024e);
        }
        String m40021b = m40021b();
        if (m40021b == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", m40021b);
        }
        String m40023d = m40023d();
        if (m40023d == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", m40023d);
        }
        String m40022c = m40022c();
        if (m40022c == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", m40022c);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f33224a.f9729d.keySet()) {
            jSONObject2.put(str, this.f33224a.f9729d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C12353b c12353b = this.f33225b;
        if (c12353b == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c12353b.mo39957e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return m40028j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
