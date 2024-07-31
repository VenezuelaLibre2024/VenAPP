package ai;

import java.util.HashMap;
import java.util.Map;
import p469yh.C12700c0;

/* renamed from: ai.h */
/* loaded from: classes3.dex */
public class C0124h {
    /* renamed from: a */
    public static Map<String, Object> m573a(InterfaceC0121e interfaceC0121e) {
        C12700c0 mo561e = interfaceC0121e.mo561e();
        if (mo561e == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", mo561e.m41879c());
        hashMap.put("arguments", mo561e.m41878b());
        return hashMap;
    }
}
