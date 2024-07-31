package d3;

import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f13713a;

    /* renamed from: b, reason: collision with root package name */
    private String f13714b;

    public c(String str) {
        this.f13714b = str;
    }

    public c(String str, String str2) {
        this.f13713a = str2;
        this.f13714b = str;
    }

    public static c a(Map<String, String> map) {
        return new c(map.get("path"), map.get("fieldname"));
    }

    public String b() {
        return this.f13713a;
    }

    public String c() {
        return this.f13714b;
    }
}
