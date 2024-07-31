package t4;

import android.util.Log;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    private static boolean f25779b;

    /* renamed from: a */
    public static final a f25778a = new a();

    /* renamed from: c */
    private static final String f25780c = a.class.getCanonicalName();

    /* renamed from: d */
    private static final List<C0435a> f25781d = new ArrayList();

    /* renamed from: e */
    private static final Set<String> f25782e = new CopyOnWriteArraySet();

    /* renamed from: t4.a$a */
    /* loaded from: classes.dex */
    public static final class C0435a {

        /* renamed from: a */
        private String f25783a;

        /* renamed from: b */
        private Map<String, String> f25784b;

        public C0435a(String eventName, Map<String, String> restrictiveParams) {
            n.e(eventName, "eventName");
            n.e(restrictiveParams, "restrictiveParams");
            this.f25783a = eventName;
            this.f25784b = restrictiveParams;
        }

        public final String a() {
            return this.f25783a;
        }

        public final Map<String, String> b() {
            return this.f25784b;
        }

        public final void c(Map<String, String> map) {
            n.e(map, "<set-?>");
            this.f25784b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            f25779b = true;
            f25778a.c();
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }

    private final String b(String str, String str2) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            try {
                for (C0435a c0435a : new ArrayList(f25781d)) {
                    if (c0435a != null && n.a(str, c0435a.a())) {
                        for (String str3 : c0435a.b().keySet()) {
                            if (n.a(str2, str3)) {
                                return c0435a.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(f25780c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final void c() {
        String k10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            r q10 = v.q(e0.m(), false);
            if (q10 == null || (k10 = q10.k()) == null) {
                return;
            }
            if (k10.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(k10);
            f25781d.clear();
            f25782e.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    n.d(key, "key");
                    C0435a c0435a = new C0435a(key, new HashMap());
                    if (optJSONObject != null) {
                        c0435a.c(n0.p(optJSONObject));
                        f25781d.add(c0435a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f25782e.add(c0435a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final boolean d(String str) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return f25782e.contains(str);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final String e(String eventName) {
        if (a5.a.d(a.class)) {
            return null;
        }
        try {
            n.e(eventName, "eventName");
            return f25779b ? f25778a.d(eventName) ? "_removed_" : eventName : eventName;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return null;
        }
    }

    public static final void f(Map<String, String> parameters, String eventName) {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            n.e(parameters, "parameters");
            n.e(eventName, "eventName");
            if (f25779b) {
                HashMap hashMap = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String b10 = f25778a.b(eventName, str);
                    if (b10 != null) {
                        hashMap.put(str, b10);
                        parameters.remove(str);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        parameters.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }
}
