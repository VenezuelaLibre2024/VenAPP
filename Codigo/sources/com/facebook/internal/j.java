package com.facebook.internal;

import i4.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: g */
    public static final a f7760g = new a(null);

    /* renamed from: h */
    private static j f7761h;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f7762a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f7763b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f7764c;

    /* renamed from: d */
    private final String f7765d;

    /* renamed from: e */
    private final String f7766e;

    /* renamed from: f */
    private final String f7767f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final j c() {
            HashMap j10;
            HashMap j11;
            j10 = dk.k0.j(ck.r.a(2, null), ck.r.a(4, null), ck.r.a(9, null), ck.r.a(17, null), ck.r.a(341, null));
            j11 = dk.k0.j(ck.r.a(102, null), ck.r.a(190, null), ck.r.a(412, null));
            return new j(null, j10, j11, null, null, null);
        }

        private final Map<Integer, Set<Integer>> d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int optInt2 = optJSONArray2.optInt(i12);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return hashMap;
        }

        public final j a(JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            boolean r10;
            boolean r11;
            boolean r12;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        r10 = xk.p.r(optString, "other", true);
                        if (r10) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = d(optJSONObject);
                        } else {
                            r11 = xk.p.r(optString, "transient", true);
                            if (r11) {
                                str5 = optJSONObject.optString("recovery_message", null);
                                map5 = d(optJSONObject);
                            } else {
                                r12 = xk.p.r(optString, "login_recoverable", true);
                                if (r12) {
                                    str6 = optJSONObject.optString("recovery_message", null);
                                    map6 = d(optJSONObject);
                                }
                            }
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new j(map, map2, map3, str, str2, str3);
        }

        public final synchronized j b() {
            j jVar;
            if (j.f7761h == null) {
                j.f7761h = c();
            }
            jVar = j.f7761h;
            if (jVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return jVar;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7768a;

        static {
            int[] iArr = new int[u.a.valuesCustom().length];
            iArr[u.a.OTHER.ordinal()] = 1;
            iArr[u.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[u.a.TRANSIENT.ordinal()] = 3;
            f7768a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f7762a = map;
        this.f7763b = map2;
        this.f7764c = map3;
        this.f7765d = str;
        this.f7766e = str2;
        this.f7767f = str3;
    }

    public final u.a c(int i10, int i11, boolean z10) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z10) {
            return u.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f7762a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = this.f7762a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return u.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f7764c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = this.f7764c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return u.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f7763b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = this.f7763b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? u.a.TRANSIENT : u.a.OTHER;
    }

    public final String d(u.a aVar) {
        int i10 = aVar == null ? -1 : b.f7768a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f7765d;
        }
        if (i10 == 2) {
            return this.f7767f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f7766e;
    }
}
