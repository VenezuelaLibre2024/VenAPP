package z2;

import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f32257a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32258b;

    private a(String str, String str2) {
        this.f32257a = str;
        this.f32258b = str2;
    }

    public static a c(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new a((String) map.get("name"), (String) map.get("defType"));
    }

    public String a() {
        return this.f32258b;
    }

    public String b() {
        return this.f32257a;
    }
}
