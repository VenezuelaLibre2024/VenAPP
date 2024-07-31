package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.g */
/* loaded from: classes2.dex */
public class C6351g {

    /* renamed from: h */
    private static final Date f13682h = new Date(0);

    /* renamed from: a */
    private JSONObject f13683a;

    /* renamed from: b */
    private JSONObject f13684b;

    /* renamed from: c */
    private Date f13685c;

    /* renamed from: d */
    private JSONArray f13686d;

    /* renamed from: e */
    private JSONObject f13687e;

    /* renamed from: f */
    private long f13688f;

    /* renamed from: g */
    private JSONArray f13689g;

    /* renamed from: com.google.firebase.remoteconfig.internal.g$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private JSONObject f13690a;

        /* renamed from: b */
        private Date f13691b;

        /* renamed from: c */
        private JSONArray f13692c;

        /* renamed from: d */
        private JSONObject f13693d;

        /* renamed from: e */
        private long f13694e;

        /* renamed from: f */
        private JSONArray f13695f;

        private b() {
            this.f13690a = new JSONObject();
            this.f13691b = C6351g.f13682h;
            this.f13692c = new JSONArray();
            this.f13693d = new JSONObject();
            this.f13694e = 0L;
            this.f13695f = new JSONArray();
        }

        /* renamed from: a */
        public C6351g m17637a() {
            return new C6351g(this.f13690a, this.f13691b, this.f13692c, this.f13693d, this.f13694e, this.f13695f);
        }

        /* renamed from: b */
        public b m17638b(JSONObject jSONObject) {
            try {
                this.f13690a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public b m17639c(JSONArray jSONArray) {
            try {
                this.f13692c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public b m17640d(Date date) {
            this.f13691b = date;
            return this;
        }

        /* renamed from: e */
        public b m17641e(JSONObject jSONObject) {
            try {
                this.f13693d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: f */
        public b m17642f(JSONArray jSONArray) {
            try {
                this.f13695f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: g */
        public b m17643g(long j10) {
            this.f13694e = j10;
            return this;
        }
    }

    private C6351g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f13684b = jSONObject;
        this.f13685c = date;
        this.f13686d = jSONArray;
        this.f13687e = jSONObject2;
        this.f13688f = j10;
        this.f13689g = jSONArray2;
        this.f13683a = jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6351g m17626b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new C6351g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* renamed from: c */
    private Map<String, Map<String, String>> m17627c() {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < m17635j().length(); i10++) {
            JSONObject jSONObject = m17635j().getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                String string3 = jSONArray.getString(i11);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    private static C6351g m17628d(JSONObject jSONObject) {
        return m17626b(new JSONObject(jSONObject.toString()));
    }

    /* renamed from: l */
    public static b m17629l() {
        return new b();
    }

    /* renamed from: e */
    public JSONArray m17630e() {
        return this.f13686d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6351g) {
            return this.f13683a.toString().equals(((C6351g) obj).toString());
        }
        return false;
    }

    /* renamed from: f */
    public Set<String> m17631f(C6351g c6351g) {
        JSONObject m17632g = m17628d(c6351g.f13683a).m17632g();
        Map<String, Map<String, String>> m17627c = m17627c();
        Map<String, Map<String, String>> m17627c2 = c6351g.m17627c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = m17632g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (c6351g.m17632g().has(next) && m17632g().get(next).equals(c6351g.m17632g().get(next)) && ((!m17634i().has(next) || c6351g.m17634i().has(next)) && ((m17634i().has(next) || !c6351g.m17634i().has(next)) && !((m17634i().has(next) && c6351g.m17634i().has(next) && !m17634i().getJSONObject(next).toString().equals(c6351g.m17634i().getJSONObject(next).toString())) || m17627c.containsKey(next) != m17627c2.containsKey(next) || (m17627c.containsKey(next) && m17627c2.containsKey(next) && !m17627c.get(next).equals(m17627c2.get(next))))))) {
                m17632g.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = m17632g.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    /* renamed from: g */
    public JSONObject m17632g() {
        return this.f13684b;
    }

    /* renamed from: h */
    public Date m17633h() {
        return this.f13685c;
    }

    public int hashCode() {
        return this.f13683a.hashCode();
    }

    /* renamed from: i */
    public JSONObject m17634i() {
        return this.f13687e;
    }

    /* renamed from: j */
    public JSONArray m17635j() {
        return this.f13689g;
    }

    /* renamed from: k */
    public long m17636k() {
        return this.f13688f;
    }

    public String toString() {
        return this.f13683a.toString();
    }
}
