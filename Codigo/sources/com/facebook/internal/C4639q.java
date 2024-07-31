package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.C4639q;
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
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9333y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p412w4.C12068a;
import p412w4.C12069b;

/* renamed from: com.facebook.internal.q */
/* loaded from: classes.dex */
public final class C4639q {

    /* renamed from: a */
    public static final C4639q f8777a = new C4639q();

    /* renamed from: b */
    private static final String f8778b = C9333y.m27797b(C4639q.class).mo27771c();

    /* renamed from: c */
    private static final AtomicBoolean f8779c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<a> f8780d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f8781e = new ConcurrentHashMap();

    /* renamed from: f */
    private static Long f8782f;

    /* renamed from: g */
    private static C12069b f8783g;

    /* renamed from: com.facebook.internal.q$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11260a();
    }

    private C4639q() {
    }

    /* renamed from: c */
    private final JSONObject m11364c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C7799e0.m23829B());
        bundle.putString("fields", "gatekeepers");
        C7807i0.c cVar = C7807i0.f18658n;
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        C7807i0 m24001x = cVar.m24001x(null, format, null);
        m24001x.m23947H(bundle);
        JSONObject m24063d = m24001x.m23949k().m24063d();
        return m24063d == null ? new JSONObject() : m24063d;
    }

    /* renamed from: d */
    public static final boolean m11365d(String name, String str, boolean z10) {
        Boolean bool;
        C9322n.m27781e(name, "name");
        Map<String, Boolean> m11373e = f8777a.m11373e(str);
        return (m11373e.containsKey(name) && (bool = m11373e.get(name)) != null) ? bool.booleanValue() : z10;
    }

    /* renamed from: f */
    private final boolean m11366f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    /* renamed from: h */
    public static final synchronized void m11367h(a aVar) {
        synchronized (C4639q.class) {
            if (aVar != null) {
                try {
                    f8780d.add(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final String m23861m = C7799e0.m23861m();
            C4639q c4639q = f8777a;
            if (c4639q.m11366f(f8782f) && f8781e.containsKey(m23861m)) {
                c4639q.m11370k();
                return;
            }
            final Context m23860l = C7799e0.m23860l();
            C9308a0 c9308a0 = C9308a0.f22565a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m23861m}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            if (m23860l == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = m23860l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!C4634n0.m11300d0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    C4634n0.m11312j0("FacebookSDK", e10);
                }
                if (jSONObject != null) {
                    m11369j(m23861m, jSONObject);
                }
            }
            Executor m23868t = C7799e0.m23868t();
            if (m23868t == null) {
                return;
            }
            if (f8779c.compareAndSet(false, true)) {
                m23868t.execute(new Runnable() { // from class: com.facebook.internal.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4639q.m11368i(m23861m, m23860l, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m11368i(String applicationId, Context context, String gateKeepersKey) {
        C9322n.m27781e(applicationId, "$applicationId");
        C9322n.m27781e(context, "$context");
        C9322n.m27781e(gateKeepersKey, "$gateKeepersKey");
        C4639q c4639q = f8777a;
        JSONObject m11364c = c4639q.m11364c(applicationId);
        if (m11364c.length() != 0) {
            m11369j(applicationId, m11364c);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, m11364c.toString()).apply();
            f8782f = Long.valueOf(System.currentTimeMillis());
        }
        c4639q.m11370k();
        f8779c.set(false);
    }

    /* renamed from: j */
    public static final synchronized JSONObject m11369j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (C4639q.class) {
            C9322n.m27781e(applicationId, "applicationId");
            jSONObject2 = f8781e.get(applicationId);
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
                        C4634n0.m11312j0("FacebookSDK", e10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f8781e.put(applicationId, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: k */
    private final void m11370k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f8780d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4639q.m11371l(C4639q.a.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11371l(a aVar) {
        aVar.mo11260a();
    }

    /* renamed from: m */
    public static final JSONObject m11372m(String applicationId, boolean z10) {
        C9322n.m27781e(applicationId, "applicationId");
        if (!z10) {
            Map<String, JSONObject> map = f8781e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject m11364c = f8777a.m11364c(applicationId);
        Context m23860l = C7799e0.m23860l();
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        m23860l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, m11364c.toString()).apply();
        return m11369j(applicationId, m11364c);
    }

    /* renamed from: e */
    public final Map<String, Boolean> m11373e(String str) {
        m11374g();
        if (str != null) {
            Map<String, JSONObject> map = f8781e;
            if (map.containsKey(str)) {
                C12069b c12069b = f8783g;
                List<C12068a> m38747a = c12069b == null ? null : c12069b.m38747a(str);
                if (m38747a != null) {
                    HashMap hashMap = new HashMap();
                    for (C12068a c12068a : m38747a) {
                        hashMap.put(c12068a.m38745a(), Boolean.valueOf(c12068a.m38746b()));
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
                    C9322n.m27780d(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                C12069b c12069b2 = f8783g;
                if (c12069b2 == null) {
                    c12069b2 = new C12069b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new C12068a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                c12069b2.m38748b(str, arrayList);
                f8783g = c12069b2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    /* renamed from: g */
    public final void m11374g() {
        m11367h(null);
    }
}
