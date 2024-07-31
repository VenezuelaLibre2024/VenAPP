package com.google.firebase.auth;

import java.util.Map;

/* renamed from: com.google.firebase.auth.c0 */
/* loaded from: classes.dex */
public class C6053c0 {

    /* renamed from: a */
    private String f12850a;

    /* renamed from: b */
    private Map<String, Object> f12851b;

    public C6053c0(String str, Map<String, Object> map) {
        this.f12850a = str;
        this.f12851b = map;
    }

    /* renamed from: h */
    private final long m16470h(String str) {
        Integer num = (Integer) this.f12851b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    /* renamed from: a */
    public long m16471a() {
        return m16470h("auth_time");
    }

    /* renamed from: b */
    public Map<String, Object> m16472b() {
        return this.f12851b;
    }

    /* renamed from: c */
    public long m16473c() {
        return m16470h("exp");
    }

    /* renamed from: d */
    public long m16474d() {
        return m16470h("iat");
    }

    /* renamed from: e */
    public String m16475e() {
        Map map = (Map) this.f12851b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: f */
    public String m16476f() {
        Map map = (Map) this.f12851b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    /* renamed from: g */
    public String m16477g() {
        return this.f12850a;
    }
}
