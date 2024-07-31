package p172j4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p450xk.C12525q;

/* renamed from: j4.d */
/* loaded from: classes.dex */
public final class C8983d {

    /* renamed from: d */
    public static final a f21522d = new a(null);

    /* renamed from: e */
    private static final Set<C8983d> f21523e = new CopyOnWriteArraySet();

    /* renamed from: a */
    private final String f21524a;

    /* renamed from: b */
    private final String f21525b;

    /* renamed from: c */
    private final List<String> f21526c;

    /* renamed from: j4.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final void m26359a(JSONObject jSONObject) {
            List m41098u0;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString("k");
                    String v10 = optJSONObject.optString("v");
                    C9322n.m27780d(k10, "k");
                    if (!(k10.length() == 0)) {
                        Set m26355a = C8983d.m26355a();
                        C9322n.m27780d(key, "key");
                        m41098u0 = C12525q.m41098u0(k10, new String[]{","}, false, 0, 6, null);
                        C9322n.m27780d(v10, "v");
                        m26355a.add(new C8983d(key, m41098u0, v10, null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set<String> m26360b() {
            HashSet hashSet = new HashSet();
            Iterator it = C8983d.m26355a().iterator();
            while (it.hasNext()) {
                hashSet.add(((C8983d) it.next()).m26357c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set<C8983d> m26361c() {
            return new HashSet(C8983d.m26355a());
        }

        /* renamed from: d */
        public final void m26362d(String rulesFromServer) {
            C9322n.m27781e(rulesFromServer, "rulesFromServer");
            try {
                C8983d.m26355a().clear();
                m26359a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }
    }

    private C8983d(String str, List<String> list, String str2) {
        this.f21524a = str;
        this.f21525b = str2;
        this.f21526c = list;
    }

    public /* synthetic */ C8983d(String str, List list, String str2, C9315g c9315g) {
        this(str, list, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ Set m26355a() {
        if (C0033a.m107d(C8983d.class)) {
            return null;
        }
        try {
            return f21523e;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8983d.class);
            return null;
        }
    }

    /* renamed from: b */
    public final List<String> m26356b() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f21526c);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    public final String m26357c() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return this.f21524a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public final String m26358d() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            return this.f21525b;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
