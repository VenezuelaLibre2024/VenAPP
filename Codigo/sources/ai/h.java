package ai;

import java.util.HashMap;
import java.util.Map;
import yh.c0;

/* loaded from: classes3.dex */
public class h {
    public static Map<String, Object> a(e eVar) {
        c0 e10 = eVar.e();
        if (e10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", e10.c());
        hashMap.put("arguments", e10.b());
        return hashMap;
    }
}
