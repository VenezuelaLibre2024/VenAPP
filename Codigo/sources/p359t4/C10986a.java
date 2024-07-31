package p359t4;

import android.util.Log;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public final class C10986a {

    /* renamed from: b */
    private static boolean f27923b;

    /* renamed from: a */
    public static final C10986a f27922a = new C10986a();

    /* renamed from: c */
    private static final String f27924c = C10986a.class.getCanonicalName();

    /* renamed from: d */
    private static final List<a> f27925d = new ArrayList();

    /* renamed from: e */
    private static final Set<String> f27926e = new CopyOnWriteArraySet();

    /* renamed from: t4.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f27927a;

        /* renamed from: b */
        private Map<String, String> f27928b;

        public a(String eventName, Map<String, String> restrictiveParams) {
            C9322n.m27781e(eventName, "eventName");
            C9322n.m27781e(restrictiveParams, "restrictiveParams");
            this.f27927a = eventName;
            this.f27928b = restrictiveParams;
        }

        /* renamed from: a */
        public final String m33544a() {
            return this.f27927a;
        }

        /* renamed from: b */
        public final Map<String, String> m33545b() {
            return this.f27928b;
        }

        /* renamed from: c */
        public final void m33546c(Map<String, String> map) {
            C9322n.m27781e(map, "<set-?>");
            this.f27928b = map;
        }
    }

    private C10986a() {
    }

    /* renamed from: a */
    public static final void m33538a() {
        if (C0033a.m107d(C10986a.class)) {
            return;
        }
        try {
            f27923b = true;
            f27922a.m33540c();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10986a.class);
        }
    }

    /* renamed from: b */
    private final String m33539b(String str, String str2) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            try {
                for (a aVar : new ArrayList(f27925d)) {
                    if (aVar != null && C9322n.m27777a(str, aVar.m33544a())) {
                        for (String str3 : aVar.m33545b().keySet()) {
                            if (C9322n.m27777a(str2, str3)) {
                                return aVar.m33545b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(f27924c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    private final void m33540c() {
        String m11385k;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null || (m11385k = m11457q.m11385k()) == null) {
                return;
            }
            if (m11385k.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m11385k);
            f27925d.clear();
            f27926e.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    C9322n.m27780d(key, "key");
                    a aVar = new a(key, new HashMap());
                    if (optJSONObject != null) {
                        aVar.m33546c(C4634n0.m11323p(optJSONObject));
                        f27925d.add(aVar);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f27926e.add(aVar.m33544a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: d */
    private final boolean m33541d(String str) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return f27926e.contains(str);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: e */
    public static final String m33542e(String eventName) {
        if (C0033a.m107d(C10986a.class)) {
            return null;
        }
        try {
            C9322n.m27781e(eventName, "eventName");
            return f27923b ? f27922a.m33541d(eventName) ? "_removed_" : eventName : eventName;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10986a.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m33543f(Map<String, String> parameters, String eventName) {
        if (C0033a.m107d(C10986a.class)) {
            return;
        }
        try {
            C9322n.m27781e(parameters, "parameters");
            C9322n.m27781e(eventName, "eventName");
            if (f27923b) {
                HashMap hashMap = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String m33539b = f27922a.m33539b(eventName, str);
                    if (m33539b != null) {
                        hashMap.put(str, m33539b);
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
            C0033a.m105b(th2, C10986a.class);
        }
    }
}
