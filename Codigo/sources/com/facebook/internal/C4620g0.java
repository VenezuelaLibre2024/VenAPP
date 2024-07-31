package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.g0 */
/* loaded from: classes.dex */
public final class C4620g0 {

    /* renamed from: a */
    public static final C4620g0 f8730a = new C4620g0();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, JSONObject> f8731b = new ConcurrentHashMap<>();

    private C4620g0() {
    }

    /* renamed from: a */
    public static final JSONObject m11208a(String accessToken) {
        C9322n.m27781e(accessToken, "accessToken");
        return f8731b.get(accessToken);
    }

    /* renamed from: b */
    public static final void m11209b(String key, JSONObject value) {
        C9322n.m27781e(key, "key");
        C9322n.m27781e(value, "value");
        f8731b.put(key, value);
    }
}
