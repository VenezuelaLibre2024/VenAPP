package n4;

import com.facebook.appevents.d;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    private static boolean f21795b;

    /* renamed from: a */
    public static final a f21794a = new a();

    /* renamed from: c */
    private static final List<C0355a> f21796c = new ArrayList();

    /* renamed from: d */
    private static final Set<String> f21797d = new HashSet();

    /* renamed from: n4.a$a */
    /* loaded from: classes.dex */
    public static final class C0355a {

        /* renamed from: a */
        private String f21798a;

        /* renamed from: b */
        private List<String> f21799b;

        public C0355a(String eventName, List<String> deprecateParams) {
            n.e(eventName, "eventName");
            n.e(deprecateParams, "deprecateParams");
            this.f21798a = eventName;
            this.f21799b = deprecateParams;
        }

        public final List<String> a() {
            return this.f21799b;
        }

        public final String b() {
            return this.f21798a;
        }

        public final void c(List<String> list) {
            n.e(list, "<set-?>");
            this.f21799b = list;
        }
    }

    private a() {
    }

    public static final void a() {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            f21795b = true;
            f21794a.b();
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }

    private final synchronized void b() {
        r q10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            q10 = v.q(e0.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return;
        }
        if (q10 == null) {
            return;
        }
        String k10 = q10.k();
        if (k10 != null) {
            if (k10.length() > 0) {
                JSONObject jSONObject = new JSONObject(k10);
                f21796c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = f21797d;
                            n.d(key, "key");
                            set.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            n.d(key, "key");
                            C0355a c0355a = new C0355a(key, new ArrayList());
                            if (optJSONArray != null) {
                                c0355a.c(n0.n(optJSONArray));
                            }
                            f21796c.add(c0355a);
                        }
                    }
                }
            }
        }
    }

    public static final void c(Map<String, String> parameters, String eventName) {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            n.e(parameters, "parameters");
            n.e(eventName, "eventName");
            if (f21795b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C0355a c0355a : new ArrayList(f21796c)) {
                    if (n.a(c0355a.b(), eventName)) {
                        for (String str : arrayList) {
                            if (c0355a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }

    public static final void d(List<d> events) {
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            n.e(events, "events");
            if (f21795b) {
                Iterator<d> it = events.iterator();
                while (it.hasNext()) {
                    if (f21797d.contains(it.next().f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }
}
