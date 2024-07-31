package p141hf;

import gf.C7566h;
import org.json.JSONObject;
import p485zb.C12867g;

/* renamed from: hf.k */
/* loaded from: classes2.dex */
public class C7728k extends AbstractC7722e {

    /* renamed from: m */
    private final JSONObject f18408m;

    public C7728k(C7566h c7566h, C12867g c12867g, JSONObject jSONObject) {
        super(c7566h, c12867g);
        this.f18408m = jSONObject;
        m23553G("X-HTTP-Method-Override", "PATCH");
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: e */
    protected String mo23538e() {
        return "PUT";
    }

    @Override // p141hf.AbstractC7722e
    /* renamed from: g */
    protected JSONObject mo23556g() {
        return this.f18408m;
    }
}
