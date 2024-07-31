package p438x8;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x8.o */
/* loaded from: classes.dex */
public final class C12377o extends C12353b {

    /* renamed from: e */
    private final C12388z f33227e;

    public C12377o(int i10, String str, String str2, C12353b c12353b, C12388z c12388z) {
        super(i10, str, str2, c12353b);
        this.f33227e = c12388z;
    }

    @Override // p438x8.C12353b
    /* renamed from: e */
    public final JSONObject mo39957e() {
        JSONObject mo39957e = super.mo39957e();
        C12388z m40033f = m40033f();
        mo39957e.put("Response Info", m40033f == null ? "null" : m40033f.m40054i());
        return mo39957e;
    }

    /* renamed from: f */
    public C12388z m40033f() {
        return this.f33227e;
    }

    @Override // p438x8.C12353b
    public String toString() {
        try {
            return mo39957e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
