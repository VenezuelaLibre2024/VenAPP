package x8;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends b {

    /* renamed from: e, reason: collision with root package name */
    private final z f30707e;

    public o(int i10, String str, String str2, b bVar, z zVar) {
        super(i10, str, str2, bVar);
        this.f30707e = zVar;
    }

    @Override // x8.b
    public final JSONObject e() {
        JSONObject e10 = super.e();
        z f10 = f();
        e10.put("Response Info", f10 == null ? "null" : f10.i());
        return e10;
    }

    public z f() {
        return this.f30707e;
    }

    @Override // x8.b
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
