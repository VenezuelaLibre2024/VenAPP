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

/* loaded from: classes2.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    private static final Date f12450h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f12451a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f12452b;

    /* renamed from: c, reason: collision with root package name */
    private Date f12453c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f12454d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f12455e;

    /* renamed from: f, reason: collision with root package name */
    private long f12456f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f12457g;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f12458a;

        /* renamed from: b, reason: collision with root package name */
        private Date f12459b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f12460c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f12461d;

        /* renamed from: e, reason: collision with root package name */
        private long f12462e;

        /* renamed from: f, reason: collision with root package name */
        private JSONArray f12463f;

        private b() {
            this.f12458a = new JSONObject();
            this.f12459b = g.f12450h;
            this.f12460c = new JSONArray();
            this.f12461d = new JSONObject();
            this.f12462e = 0L;
            this.f12463f = new JSONArray();
        }

        public g a() {
            return new g(this.f12458a, this.f12459b, this.f12460c, this.f12461d, this.f12462e, this.f12463f);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f12458a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f12460c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f12459b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f12461d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b f(JSONArray jSONArray) {
            try {
                this.f12463f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j10) {
            this.f12462e = j10;
            return this;
        }
    }

    private g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f12452b = jSONObject;
        this.f12453c = date;
        this.f12454d = jSONArray;
        this.f12455e = jSONObject2;
        this.f12456f = j10;
        this.f12457g = jSONArray2;
        this.f12451a = jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    private Map<String, Map<String, String>> c() {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < j().length(); i10++) {
            JSONObject jSONObject = j().getJSONObject(i10);
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

    private static g d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.f12454d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f12451a.toString().equals(((g) obj).toString());
        }
        return false;
    }

    public Set<String> f(g gVar) {
        JSONObject g10 = d(gVar.f12451a).g();
        Map<String, Map<String, String>> c10 = c();
        Map<String, Map<String, String>> c11 = gVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (gVar.g().has(next) && g().get(next).equals(gVar.g().get(next)) && ((!i().has(next) || gVar.i().has(next)) && ((i().has(next) || !gVar.i().has(next)) && !((i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) || c10.containsKey(next) != c11.containsKey(next) || (c10.containsKey(next) && c11.containsKey(next) && !c10.get(next).equals(c11.get(next))))))) {
                g10.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = g10.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f12452b;
    }

    public Date h() {
        return this.f12453c;
    }

    public int hashCode() {
        return this.f12451a.hashCode();
    }

    public JSONObject i() {
        return this.f12455e;
    }

    public JSONArray j() {
        return this.f12457g;
    }

    public long k() {
        return this.f12456f;
    }

    public String toString() {
        return this.f12451a.toString();
    }
}
