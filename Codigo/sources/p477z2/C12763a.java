package p477z2;

import java.util.Map;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public class C12763a {

    /* renamed from: a */
    private final String f34808a;

    /* renamed from: b */
    private final String f34809b;

    private C12763a(String str, String str2) {
        this.f34808a = str;
        this.f34809b = str2;
    }

    /* renamed from: c */
    public static C12763a m42354c(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new C12763a((String) map.get("name"), (String) map.get("defType"));
    }

    /* renamed from: a */
    public String m42355a() {
        return this.f34809b;
    }

    /* renamed from: b */
    public String m42356b() {
        return this.f34808a;
    }
}
