package com.google.firebase.storage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import gf.C7567i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.firebase.storage.o */
/* loaded from: classes2.dex */
public class C6400o {

    /* renamed from: a */
    private String f13938a;

    /* renamed from: b */
    private C6382f f13939b;

    /* renamed from: c */
    private C6401p f13940c;

    /* renamed from: d */
    private String f13941d;

    /* renamed from: e */
    private String f13942e;

    /* renamed from: f */
    private c<String> f13943f;

    /* renamed from: g */
    private String f13944g;

    /* renamed from: h */
    private String f13945h;

    /* renamed from: i */
    private String f13946i;

    /* renamed from: j */
    private long f13947j;

    /* renamed from: k */
    private String f13948k;

    /* renamed from: l */
    private c<String> f13949l;

    /* renamed from: m */
    private c<String> f13950m;

    /* renamed from: n */
    private c<String> f13951n;

    /* renamed from: o */
    private c<String> f13952o;

    /* renamed from: p */
    private c<Map<String, String>> f13953p;

    /* renamed from: com.google.firebase.storage.o$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        C6400o f13954a;

        /* renamed from: b */
        boolean f13955b;

        public b() {
            this.f13954a = new C6400o();
        }

        b(JSONObject jSONObject) {
            this.f13954a = new C6400o();
            if (jSONObject != null) {
                m17976c(jSONObject);
                this.f13955b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(JSONObject jSONObject, C6401p c6401p) {
            this(jSONObject);
            this.f13954a.f13940c = c6401p;
        }

        /* renamed from: b */
        private String m17975b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        /* renamed from: c */
        private void m17976c(JSONObject jSONObject) {
            this.f13954a.f13942e = jSONObject.optString("generation");
            this.f13954a.f13938a = jSONObject.optString("name");
            this.f13954a.f13941d = jSONObject.optString("bucket");
            this.f13954a.f13944g = jSONObject.optString("metageneration");
            this.f13954a.f13945h = jSONObject.optString("timeCreated");
            this.f13954a.f13946i = jSONObject.optString("updated");
            this.f13954a.f13947j = jSONObject.optLong("size");
            this.f13954a.f13948k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m17983i(next, jSONObject2.getString(next));
                }
            }
            String m17975b = m17975b(jSONObject, "contentType");
            if (m17975b != null) {
                m17982h(m17975b);
            }
            String m17975b2 = m17975b(jSONObject, "cacheControl");
            if (m17975b2 != null) {
                m17978d(m17975b2);
            }
            String m17975b3 = m17975b(jSONObject, "contentDisposition");
            if (m17975b3 != null) {
                m17979e(m17975b3);
            }
            String m17975b4 = m17975b(jSONObject, "contentEncoding");
            if (m17975b4 != null) {
                m17980f(m17975b4);
            }
            String m17975b5 = m17975b(jSONObject, "contentLanguage");
            if (m17975b5 != null) {
                m17981g(m17975b5);
            }
        }

        /* renamed from: a */
        public C6400o m17977a() {
            return new C6400o(this.f13955b);
        }

        /* renamed from: d */
        public b m17978d(String str) {
            this.f13954a.f13949l = c.m17985d(str);
            return this;
        }

        /* renamed from: e */
        public b m17979e(String str) {
            this.f13954a.f13950m = c.m17985d(str);
            return this;
        }

        /* renamed from: f */
        public b m17980f(String str) {
            this.f13954a.f13951n = c.m17985d(str);
            return this;
        }

        /* renamed from: g */
        public b m17981g(String str) {
            this.f13954a.f13952o = c.m17985d(str);
            return this;
        }

        /* renamed from: h */
        public b m17982h(String str) {
            this.f13954a.f13943f = c.m17985d(str);
            return this;
        }

        /* renamed from: i */
        public b m17983i(String str, String str2) {
            if (!this.f13954a.f13953p.m17987b()) {
                this.f13954a.f13953p = c.m17985d(new HashMap());
            }
            ((Map) this.f13954a.f13953p.m17986a()).put(str, str2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.storage.o$c */
    /* loaded from: classes2.dex */
    public static class c<T> {

        /* renamed from: a */
        private final boolean f13956a;

        /* renamed from: b */
        private final T f13957b;

        c(T t10, boolean z10) {
            this.f13956a = z10;
            this.f13957b = t10;
        }

        /* renamed from: c */
        static <T> c<T> m17984c(T t10) {
            return new c<>(t10, false);
        }

        /* renamed from: d */
        static <T> c<T> m17985d(T t10) {
            return new c<>(t10, true);
        }

        /* renamed from: a */
        T m17986a() {
            return this.f13957b;
        }

        /* renamed from: b */
        boolean m17987b() {
            return this.f13956a;
        }
    }

    public C6400o() {
        this.f13938a = null;
        this.f13939b = null;
        this.f13940c = null;
        this.f13941d = null;
        this.f13942e = null;
        this.f13943f = c.m17984c("");
        this.f13944g = null;
        this.f13945h = null;
        this.f13946i = null;
        this.f13948k = null;
        this.f13949l = c.m17984c("");
        this.f13950m = c.m17984c("");
        this.f13951n = c.m17984c("");
        this.f13952o = c.m17984c("");
        this.f13953p = c.m17984c(Collections.emptyMap());
    }

    private C6400o(C6400o c6400o, boolean z10) {
        this.f13938a = null;
        this.f13939b = null;
        this.f13940c = null;
        this.f13941d = null;
        this.f13942e = null;
        this.f13943f = c.m17984c("");
        this.f13944g = null;
        this.f13945h = null;
        this.f13946i = null;
        this.f13948k = null;
        this.f13949l = c.m17984c("");
        this.f13950m = c.m17984c("");
        this.f13951n = c.m17984c("");
        this.f13952o = c.m17984c("");
        this.f13953p = c.m17984c(Collections.emptyMap());
        C5276s.m13324j(c6400o);
        this.f13938a = c6400o.f13938a;
        this.f13939b = c6400o.f13939b;
        this.f13940c = c6400o.f13940c;
        this.f13941d = c6400o.f13941d;
        this.f13943f = c6400o.f13943f;
        this.f13949l = c6400o.f13949l;
        this.f13950m = c6400o.f13950m;
        this.f13951n = c6400o.f13951n;
        this.f13952o = c6400o.f13952o;
        this.f13953p = c6400o.f13953p;
        if (z10) {
            this.f13948k = c6400o.f13948k;
            this.f13947j = c6400o.f13947j;
            this.f13946i = c6400o.f13946i;
            this.f13945h = c6400o.f13945h;
            this.f13944g = c6400o.f13944g;
            this.f13942e = c6400o.f13942e;
        }
    }

    /* renamed from: A */
    public String m17958A() {
        return this.f13942e;
    }

    /* renamed from: B */
    public String m17959B() {
        return this.f13948k;
    }

    /* renamed from: C */
    public String m17960C() {
        return this.f13944g;
    }

    /* renamed from: D */
    public String m17961D() {
        String m17962E = m17962E();
        if (TextUtils.isEmpty(m17962E)) {
            return null;
        }
        int lastIndexOf = m17962E.lastIndexOf(47);
        return lastIndexOf != -1 ? m17962E.substring(lastIndexOf + 1) : m17962E;
    }

    /* renamed from: E */
    public String m17962E() {
        String str = this.f13938a;
        return str != null ? str : "";
    }

    /* renamed from: F */
    public long m17963F() {
        return this.f13947j;
    }

    /* renamed from: G */
    public long m17964G() {
        return C7567i.m22973e(this.f13946i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public JSONObject m17965q() {
        HashMap hashMap = new HashMap();
        if (this.f13943f.m17987b()) {
            hashMap.put("contentType", m17971w());
        }
        if (this.f13953p.m17987b()) {
            hashMap.put("metadata", new JSONObject(this.f13953p.m17986a()));
        }
        if (this.f13949l.m17987b()) {
            hashMap.put("cacheControl", m17967s());
        }
        if (this.f13950m.m17987b()) {
            hashMap.put("contentDisposition", m17968t());
        }
        if (this.f13951n.m17987b()) {
            hashMap.put("contentEncoding", m17969u());
        }
        if (this.f13952o.m17987b()) {
            hashMap.put("contentLanguage", m17970v());
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: r */
    public String m17966r() {
        return this.f13941d;
    }

    /* renamed from: s */
    public String m17967s() {
        return this.f13949l.m17986a();
    }

    /* renamed from: t */
    public String m17968t() {
        return this.f13950m.m17986a();
    }

    /* renamed from: u */
    public String m17969u() {
        return this.f13951n.m17986a();
    }

    /* renamed from: v */
    public String m17970v() {
        return this.f13952o.m17986a();
    }

    /* renamed from: w */
    public String m17971w() {
        return this.f13943f.m17986a();
    }

    /* renamed from: x */
    public long m17972x() {
        return C7567i.m22973e(this.f13945h);
    }

    /* renamed from: y */
    public String m17973y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f13953p.m17986a().get(str);
    }

    /* renamed from: z */
    public Set<String> m17974z() {
        return this.f13953p.m17986a().keySet();
    }
}
