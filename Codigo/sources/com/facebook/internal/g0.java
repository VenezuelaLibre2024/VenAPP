package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f7755a = new g0();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, JSONObject> f7756b = new ConcurrentHashMap<>();

    private g0() {
    }

    public static final JSONObject a(String accessToken) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        return f7756b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(value, "value");
        f7756b.put(key, value);
    }
}
