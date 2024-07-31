package com.facebook.internal;

import ck.C2033r;
import dk.C7018k0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import org.json.JSONArray;
import org.json.JSONObject;
import p152i4.C7830u;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.j */
/* loaded from: classes.dex */
public final class C4625j {

    /* renamed from: g */
    public static final a f8737g = new a(null);

    /* renamed from: h */
    private static C4625j f8738h;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f8739a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f8740b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f8741c;

    /* renamed from: d */
    private final String f8742d;

    /* renamed from: e */
    private final String f8743e;

    /* renamed from: f */
    private final String f8744f;

    /* renamed from: com.facebook.internal.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: c */
        private final C4625j m11237c() {
            HashMap m20423j;
            HashMap m20423j2;
            m20423j = C7018k0.m20423j(C2033r.m10353a(2, null), C2033r.m10353a(4, null), C2033r.m10353a(9, null), C2033r.m10353a(17, null), C2033r.m10353a(341, null));
            m20423j2 = C7018k0.m20423j(C2033r.m10353a(102, null), C2033r.m10353a(190, null), C2033r.m10353a(412, null));
            return new C4625j(null, m20423j, m20423j2, null, null, null);
        }

        /* renamed from: d */
        private final Map<Integer, Set<Integer>> m11238d(JSONObject jSONObject) {
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

        /* renamed from: a */
        public final C4625j m11239a(JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            boolean m41037r;
            boolean m41037r2;
            boolean m41037r3;
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
                        m41037r = C12524p.m41037r(optString, "other", true);
                        if (m41037r) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = m11238d(optJSONObject);
                        } else {
                            m41037r2 = C12524p.m41037r(optString, "transient", true);
                            if (m41037r2) {
                                str5 = optJSONObject.optString("recovery_message", null);
                                map5 = m11238d(optJSONObject);
                            } else {
                                m41037r3 = C12524p.m41037r(optString, "login_recoverable", true);
                                if (m41037r3) {
                                    str6 = optJSONObject.optString("recovery_message", null);
                                    map6 = m11238d(optJSONObject);
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
            return new C4625j(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C4625j m11240b() {
            C4625j c4625j;
            if (C4625j.f8738h == null) {
                C4625j.f8738h = m11237c();
            }
            c4625j = C4625j.f8738h;
            if (c4625j == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return c4625j;
        }
    }

    /* renamed from: com.facebook.internal.j$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8745a;

        static {
            int[] iArr = new int[C7830u.a.valuesCustom().length];
            iArr[C7830u.a.OTHER.ordinal()] = 1;
            iArr[C7830u.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[C7830u.a.TRANSIENT.ordinal()] = 3;
            f8745a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4625j(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f8739a = map;
        this.f8740b = map2;
        this.f8741c = map3;
        this.f8742d = str;
        this.f8743e = str2;
        this.f8744f = str3;
    }

    /* renamed from: c */
    public final C7830u.a m11235c(int i10, int i11, boolean z10) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z10) {
            return C7830u.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f8739a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = this.f8739a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return C7830u.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f8741c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = this.f8741c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return C7830u.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f8740b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = this.f8740b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? C7830u.a.TRANSIENT : C7830u.a.OTHER;
    }

    /* renamed from: d */
    public final String m11236d(C7830u.a aVar) {
        int i10 = aVar == null ? -1 : b.f8745a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f8742d;
        }
        if (i10 == 2) {
            return this.f8744f;
        }
        if (i10 != 3) {
            return null;
        }
        return this.f8743e;
    }
}
