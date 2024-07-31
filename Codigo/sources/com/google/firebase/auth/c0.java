package com.google.firebase.auth;

import java.util.Map;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private String f11635a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f11636b;

    public c0(String str, Map<String, Object> map) {
        this.f11635a = str;
        this.f11636b = map;
    }

    private final long h(String str) {
        Integer num = (Integer) this.f11636b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return h("auth_time");
    }

    public Map<String, Object> b() {
        return this.f11636b;
    }

    public long c() {
        return h("exp");
    }

    public long d() {
        return h("iat");
    }

    public String e() {
        Map map = (Map) this.f11636b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        Map map = (Map) this.f11636b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String g() {
        return this.f11635a;
    }
}
