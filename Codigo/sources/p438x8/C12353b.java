package p438x8;

import com.google.android.gms.ads.internal.client.C4801c3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x8.b */
/* loaded from: classes.dex */
public class C12353b {

    /* renamed from: a */
    private final int f33174a;

    /* renamed from: b */
    private final String f33175b;

    /* renamed from: c */
    private final String f33176c;

    /* renamed from: d */
    private final C12353b f33177d;

    public C12353b(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public C12353b(int i10, String str, String str2, C12353b c12353b) {
        this.f33174a = i10;
        this.f33175b = str;
        this.f33176c = str2;
        this.f33177d = c12353b;
    }

    /* renamed from: a */
    public int mo39953a() {
        return this.f33174a;
    }

    /* renamed from: b */
    public String m39954b() {
        return this.f33176c;
    }

    /* renamed from: c */
    public String m39955c() {
        return this.f33175b;
    }

    /* renamed from: d */
    public final C4801c3 m39956d() {
        C4801c3 c4801c3;
        C12353b c12353b = this.f33177d;
        if (c12353b == null) {
            c4801c3 = null;
        } else {
            String str = c12353b.f33176c;
            c4801c3 = new C4801c3(c12353b.f33174a, c12353b.f33175b, str, null, null);
        }
        return new C4801c3(this.f33174a, this.f33175b, this.f33176c, c4801c3, null);
    }

    /* renamed from: e */
    public JSONObject mo39957e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f33174a);
        jSONObject.put("Message", this.f33175b);
        jSONObject.put("Domain", this.f33176c);
        C12353b c12353b = this.f33177d;
        jSONObject.put("Cause", c12353b == null ? "null" : c12353b.mo39957e());
        return jSONObject;
    }

    public String toString() {
        try {
            return mo39957e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
