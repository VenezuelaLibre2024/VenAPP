package j4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import xk.q;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19743d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Set<d> f19744e = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    private final String f19745a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19746b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f19747c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            List u02;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString("k");
                    String v10 = optJSONObject.optString("v");
                    n.d(k10, "k");
                    if (!(k10.length() == 0)) {
                        Set a10 = d.a();
                        n.d(key, "key");
                        u02 = q.u0(k10, new String[]{","}, false, 0, 6, null);
                        n.d(v10, "v");
                        a10.add(new d(key, u02, v10, null));
                    }
                }
            }
        }

        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            Iterator it = d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((d) it.next()).c());
            }
            return hashSet;
        }

        public final Set<d> c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            n.e(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }
    }

    private d(String str, List<String> list, String str2) {
        this.f19745a = str;
        this.f19746b = str2;
        this.f19747c = list;
    }

    public /* synthetic */ d(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (a5.a.d(d.class)) {
            return null;
        }
        try {
            return f19744e;
        } catch (Throwable th2) {
            a5.a.b(th2, d.class);
            return null;
        }
    }

    public final List<String> b() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f19747c);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final String c() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return this.f19745a;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final String d() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            return this.f19746b;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }
}
