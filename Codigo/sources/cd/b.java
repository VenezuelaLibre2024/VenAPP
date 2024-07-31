package cd;

import cd.d;
import org.json.JSONObject;
import vc.w;

/* loaded from: classes.dex */
class b implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(w wVar) {
        return new d(wVar.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // cd.h
    public d a(w wVar, JSONObject jSONObject) {
        return b(wVar);
    }
}
