package p247n4;

import com.facebook.appevents.C4569d;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class C9661a {

    /* renamed from: b */
    private static boolean f23728b;

    /* renamed from: a */
    public static final C9661a f23727a = new C9661a();

    /* renamed from: c */
    private static final List<a> f23729c = new ArrayList();

    /* renamed from: d */
    private static final Set<String> f23730d = new HashSet();

    /* renamed from: n4.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f23731a;

        /* renamed from: b */
        private List<String> f23732b;

        public a(String eventName, List<String> deprecateParams) {
            C9322n.m27781e(eventName, "eventName");
            C9322n.m27781e(deprecateParams, "deprecateParams");
            this.f23731a = eventName;
            this.f23732b = deprecateParams;
        }

        /* renamed from: a */
        public final List<String> m28960a() {
            return this.f23732b;
        }

        /* renamed from: b */
        public final String m28961b() {
            return this.f23731a;
        }

        /* renamed from: c */
        public final void m28962c(List<String> list) {
            C9322n.m27781e(list, "<set-?>");
            this.f23732b = list;
        }
    }

    private C9661a() {
    }

    /* renamed from: a */
    public static final void m28956a() {
        if (C0033a.m107d(C9661a.class)) {
            return;
        }
        try {
            f23728b = true;
            f23727a.m28957b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9661a.class);
        }
    }

    /* renamed from: b */
    private final synchronized void m28957b() {
        C4641r m11457q;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return;
        }
        if (m11457q == null) {
            return;
        }
        String m11385k = m11457q.m11385k();
        if (m11385k != null) {
            if (m11385k.length() > 0) {
                JSONObject jSONObject = new JSONObject(m11385k);
                f23729c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = f23730d;
                            C9322n.m27780d(key, "key");
                            set.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            C9322n.m27780d(key, "key");
                            a aVar = new a(key, new ArrayList());
                            if (optJSONArray != null) {
                                aVar.m28962c(C4634n0.m11319n(optJSONArray));
                            }
                            f23729c.add(aVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m28958c(Map<String, String> parameters, String eventName) {
        if (C0033a.m107d(C9661a.class)) {
            return;
        }
        try {
            C9322n.m27781e(parameters, "parameters");
            C9322n.m27781e(eventName, "eventName");
            if (f23728b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (a aVar : new ArrayList(f23729c)) {
                    if (C9322n.m27777a(aVar.m28961b(), eventName)) {
                        for (String str : arrayList) {
                            if (aVar.m28960a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9661a.class);
        }
    }

    /* renamed from: d */
    public static final void m28959d(List<C4569d> events) {
        if (C0033a.m107d(C9661a.class)) {
            return;
        }
        try {
            C9322n.m27781e(events, "events");
            if (f23728b) {
                Iterator<C4569d> it = events.iterator();
                while (it.hasNext()) {
                    if (f23730d.contains(it.next().m10947f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9661a.class);
        }
    }
}
