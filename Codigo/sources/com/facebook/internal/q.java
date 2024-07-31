package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.q;
import i4.i0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f7797a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7798b = kotlin.jvm.internal.y.b(q.class).c();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f7799c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f7800d = new ConcurrentLinkedQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, JSONObject> f7801e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static Long f7802f;

    /* renamed from: g, reason: collision with root package name */
    private static w4.b f7803g;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private q() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", i4.e0.B());
        bundle.putString("fields", "gatekeepers");
        i0.c cVar = i4.i0.f17005n;
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        i4.i0 x10 = cVar.x(null, format, null);
        x10.H(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public static final boolean d(String name, String str, boolean z10) {
        Boolean bool;
        kotlin.jvm.internal.n.e(name, "name");
        Map<String, Boolean> e10 = f7797a.e(str);
        return (e10.containsKey(name) && (bool = e10.get(name)) != null) ? bool.booleanValue() : z10;
    }

    private final boolean f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    public static final synchronized void h(a aVar) {
        synchronized (q.class) {
            if (aVar != null) {
                try {
                    f7800d.add(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final String m10 = i4.e0.m();
            q qVar = f7797a;
            if (qVar.f(f7802f) && f7801e.containsKey(m10)) {
                qVar.k();
                return;
            }
            final Context l10 = i4.e0.l();
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m10}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            if (l10 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!n0.d0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    n0.j0("FacebookSDK", e10);
                }
                if (jSONObject != null) {
                    j(m10, jSONObject);
                }
            }
            Executor t10 = i4.e0.t();
            if (t10 == null) {
                return;
            }
            if (f7799c.compareAndSet(false, true)) {
                t10.execute(new Runnable() { // from class: com.facebook.internal.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.i(m10, l10, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        kotlin.jvm.internal.n.e(applicationId, "$applicationId");
        kotlin.jvm.internal.n.e(context, "$context");
        kotlin.jvm.internal.n.e(gateKeepersKey, "$gateKeepersKey");
        q qVar = f7797a;
        JSONObject c10 = qVar.c(applicationId);
        if (c10.length() != 0) {
            j(applicationId, c10);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, c10.toString()).apply();
            f7802f = Long.valueOf(System.currentTimeMillis());
        }
        qVar.k();
        f7799c.set(false);
    }

    public static final synchronized JSONObject j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (q.class) {
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            jSONObject2 = f7801e.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i10 = 0;
            JSONObject jSONObject3 = null;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject4.getString(Constants.KEY), jSONObject4.getBoolean("value"));
                    } catch (JSONException e10) {
                        n0.j0("FacebookSDK", e10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f7801e.put(applicationId, jSONObject2);
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f7800d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.l(q.a.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String applicationId, boolean z10) {
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        if (!z10) {
            Map<String, JSONObject> map = f7801e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject c10 = f7797a.c(applicationId);
        Context l10 = i4.e0.l();
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c10.toString()).apply();
        return j(applicationId, c10);
    }

    public final Map<String, Boolean> e(String str) {
        g();
        if (str != null) {
            Map<String, JSONObject> map = f7801e;
            if (map.containsKey(str)) {
                w4.b bVar = f7803g;
                List<w4.a> a10 = bVar == null ? null : bVar.a(str);
                if (a10 != null) {
                    HashMap hashMap = new HashMap();
                    for (w4.a aVar : a10) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    kotlin.jvm.internal.n.d(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                w4.b bVar2 = f7803g;
                if (bVar2 == null) {
                    bVar2 = new w4.b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new w4.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f7803g = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h(null);
    }
}
