package p054d3;

import java.util.Map;

/* renamed from: d3.c */
/* loaded from: classes.dex */
public class C6822c {

    /* renamed from: a */
    private String f15067a;

    /* renamed from: b */
    private String f15068b;

    public C6822c(String str) {
        this.f15068b = str;
    }

    public C6822c(String str, String str2) {
        this.f15067a = str2;
        this.f15068b = str;
    }

    /* renamed from: a */
    public static C6822c m19711a(Map<String, String> map) {
        return new C6822c(map.get("path"), map.get("fieldname"));
    }

    /* renamed from: b */
    public String m19712b() {
        return this.f15067a;
    }

    /* renamed from: c */
    public String m19713c() {
        return this.f15068b;
    }
}
