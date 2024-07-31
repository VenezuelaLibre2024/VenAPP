package hf;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k extends e {

    /* renamed from: m, reason: collision with root package name */
    private final JSONObject f16758m;

    public k(gf.h hVar, zb.g gVar, JSONObject jSONObject) {
        super(hVar, gVar);
        this.f16758m = jSONObject;
        G("X-HTTP-Method-Override", "PATCH");
    }

    @Override // hf.e
    protected String e() {
        return "PUT";
    }

    @Override // hf.e
    protected JSONObject g() {
        return this.f16758m;
    }
}
