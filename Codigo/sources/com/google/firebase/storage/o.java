package com.google.firebase.storage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private String f12699a;

    /* renamed from: b, reason: collision with root package name */
    private f f12700b;

    /* renamed from: c, reason: collision with root package name */
    private p f12701c;

    /* renamed from: d, reason: collision with root package name */
    private String f12702d;

    /* renamed from: e, reason: collision with root package name */
    private String f12703e;

    /* renamed from: f, reason: collision with root package name */
    private c<String> f12704f;

    /* renamed from: g, reason: collision with root package name */
    private String f12705g;

    /* renamed from: h, reason: collision with root package name */
    private String f12706h;

    /* renamed from: i, reason: collision with root package name */
    private String f12707i;

    /* renamed from: j, reason: collision with root package name */
    private long f12708j;

    /* renamed from: k, reason: collision with root package name */
    private String f12709k;

    /* renamed from: l, reason: collision with root package name */
    private c<String> f12710l;

    /* renamed from: m, reason: collision with root package name */
    private c<String> f12711m;

    /* renamed from: n, reason: collision with root package name */
    private c<String> f12712n;

    /* renamed from: o, reason: collision with root package name */
    private c<String> f12713o;

    /* renamed from: p, reason: collision with root package name */
    private c<Map<String, String>> f12714p;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        o f12715a;

        /* renamed from: b, reason: collision with root package name */
        boolean f12716b;

        public b() {
            this.f12715a = new o();
        }

        b(JSONObject jSONObject) {
            this.f12715a = new o();
            if (jSONObject != null) {
                c(jSONObject);
                this.f12716b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(JSONObject jSONObject, p pVar) {
            this(jSONObject);
            this.f12715a.f12701c = pVar;
        }

        private String b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        private void c(JSONObject jSONObject) {
            this.f12715a.f12703e = jSONObject.optString("generation");
            this.f12715a.f12699a = jSONObject.optString("name");
            this.f12715a.f12702d = jSONObject.optString("bucket");
            this.f12715a.f12705g = jSONObject.optString("metageneration");
            this.f12715a.f12706h = jSONObject.optString("timeCreated");
            this.f12715a.f12707i = jSONObject.optString("updated");
            this.f12715a.f12708j = jSONObject.optLong("size");
            this.f12715a.f12709k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    i(next, jSONObject2.getString(next));
                }
            }
            String b10 = b(jSONObject, "contentType");
            if (b10 != null) {
                h(b10);
            }
            String b11 = b(jSONObject, "cacheControl");
            if (b11 != null) {
                d(b11);
            }
            String b12 = b(jSONObject, "contentDisposition");
            if (b12 != null) {
                e(b12);
            }
            String b13 = b(jSONObject, "contentEncoding");
            if (b13 != null) {
                f(b13);
            }
            String b14 = b(jSONObject, "contentLanguage");
            if (b14 != null) {
                g(b14);
            }
        }

        public o a() {
            return new o(this.f12716b);
        }

        public b d(String str) {
            this.f12715a.f12710l = c.d(str);
            return this;
        }

        public b e(String str) {
            this.f12715a.f12711m = c.d(str);
            return this;
        }

        public b f(String str) {
            this.f12715a.f12712n = c.d(str);
            return this;
        }

        public b g(String str) {
            this.f12715a.f12713o = c.d(str);
            return this;
        }

        public b h(String str) {
            this.f12715a.f12704f = c.d(str);
            return this;
        }

        public b i(String str, String str2) {
            if (!this.f12715a.f12714p.b()) {
                this.f12715a.f12714p = c.d(new HashMap());
            }
            ((Map) this.f12715a.f12714p.a()).put(str, str2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c<T> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f12717a;

        /* renamed from: b, reason: collision with root package name */
        private final T f12718b;

        c(T t10, boolean z10) {
            this.f12717a = z10;
            this.f12718b = t10;
        }

        static <T> c<T> c(T t10) {
            return new c<>(t10, false);
        }

        static <T> c<T> d(T t10) {
            return new c<>(t10, true);
        }

        T a() {
            return this.f12718b;
        }

        boolean b() {
            return this.f12717a;
        }
    }

    public o() {
        this.f12699a = null;
        this.f12700b = null;
        this.f12701c = null;
        this.f12702d = null;
        this.f12703e = null;
        this.f12704f = c.c("");
        this.f12705g = null;
        this.f12706h = null;
        this.f12707i = null;
        this.f12709k = null;
        this.f12710l = c.c("");
        this.f12711m = c.c("");
        this.f12712n = c.c("");
        this.f12713o = c.c("");
        this.f12714p = c.c(Collections.emptyMap());
    }

    private o(o oVar, boolean z10) {
        this.f12699a = null;
        this.f12700b = null;
        this.f12701c = null;
        this.f12702d = null;
        this.f12703e = null;
        this.f12704f = c.c("");
        this.f12705g = null;
        this.f12706h = null;
        this.f12707i = null;
        this.f12709k = null;
        this.f12710l = c.c("");
        this.f12711m = c.c("");
        this.f12712n = c.c("");
        this.f12713o = c.c("");
        this.f12714p = c.c(Collections.emptyMap());
        com.google.android.gms.common.internal.s.j(oVar);
        this.f12699a = oVar.f12699a;
        this.f12700b = oVar.f12700b;
        this.f12701c = oVar.f12701c;
        this.f12702d = oVar.f12702d;
        this.f12704f = oVar.f12704f;
        this.f12710l = oVar.f12710l;
        this.f12711m = oVar.f12711m;
        this.f12712n = oVar.f12712n;
        this.f12713o = oVar.f12713o;
        this.f12714p = oVar.f12714p;
        if (z10) {
            this.f12709k = oVar.f12709k;
            this.f12708j = oVar.f12708j;
            this.f12707i = oVar.f12707i;
            this.f12706h = oVar.f12706h;
            this.f12705g = oVar.f12705g;
            this.f12703e = oVar.f12703e;
        }
    }

    public String A() {
        return this.f12703e;
    }

    public String B() {
        return this.f12709k;
    }

    public String C() {
        return this.f12705g;
    }

    public String D() {
        String E = E();
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        int lastIndexOf = E.lastIndexOf(47);
        return lastIndexOf != -1 ? E.substring(lastIndexOf + 1) : E;
    }

    public String E() {
        String str = this.f12699a;
        return str != null ? str : "";
    }

    public long F() {
        return this.f12708j;
    }

    public long G() {
        return gf.i.e(this.f12707i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject q() {
        HashMap hashMap = new HashMap();
        if (this.f12704f.b()) {
            hashMap.put("contentType", w());
        }
        if (this.f12714p.b()) {
            hashMap.put("metadata", new JSONObject(this.f12714p.a()));
        }
        if (this.f12710l.b()) {
            hashMap.put("cacheControl", s());
        }
        if (this.f12711m.b()) {
            hashMap.put("contentDisposition", t());
        }
        if (this.f12712n.b()) {
            hashMap.put("contentEncoding", u());
        }
        if (this.f12713o.b()) {
            hashMap.put("contentLanguage", v());
        }
        return new JSONObject(hashMap);
    }

    public String r() {
        return this.f12702d;
    }

    public String s() {
        return this.f12710l.a();
    }

    public String t() {
        return this.f12711m.a();
    }

    public String u() {
        return this.f12712n.a();
    }

    public String v() {
        return this.f12713o.a();
    }

    public String w() {
        return this.f12704f.a();
    }

    public long x() {
        return gf.i.e(this.f12706h);
    }

    public String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12714p.a().get(str);
    }

    public Set<String> z() {
        return this.f12714p.a().keySet();
    }
}
