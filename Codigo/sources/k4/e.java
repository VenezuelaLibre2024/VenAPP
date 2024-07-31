package k4;

import ck.r;
import ck.v;
import com.facebook.internal.c0;
import com.facebook.internal.n0;
import dk.k0;
import dk.q;
import i4.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f20325a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<k4.b, c> f20326b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<m, b> f20327c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, j> f20328d;

    /* loaded from: classes.dex */
    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");

        public static final C0318a Companion = new C0318a(null);
        private final String rawValue;

        /* renamed from: k4.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0318a {
            private C0318a() {
            }

            public /* synthetic */ C0318a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(String rawValue) {
                kotlin.jvm.internal.n.e(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (kotlin.jvm.internal.n.a(aVar.h(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        a(String str) {
            this.rawValue = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String h() {
            return this.rawValue;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private k f20329a;

        /* renamed from: b, reason: collision with root package name */
        private i f20330b;

        public b(k kVar, i field) {
            kotlin.jvm.internal.n.e(field, "field");
            this.f20329a = kVar;
            this.f20330b = field;
        }

        public final i a() {
            return this.f20330b;
        }

        public final k b() {
            return this.f20329a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20329a == bVar.f20329a && this.f20330b == bVar.f20330b;
        }

        public int hashCode() {
            k kVar = this.f20329a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f20330b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f20329a + ", field=" + this.f20330b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private k f20331a;

        /* renamed from: b, reason: collision with root package name */
        private l f20332b;

        public c(k section, l lVar) {
            kotlin.jvm.internal.n.e(section, "section");
            this.f20331a = section;
            this.f20332b = lVar;
        }

        public final l a() {
            return this.f20332b;
        }

        public final k b() {
            return this.f20331a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20331a == cVar.f20331a && this.f20332b == cVar.f20332b;
        }

        public int hashCode() {
            int hashCode = this.f20331a.hashCode() * 31;
            l lVar = this.f20332b;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f20331a + ", field=" + this.f20332b + ')';
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;

        public static final a Companion = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final d a(String rawValue) {
                kotlin.jvm.internal.n.e(rawValue, "rawValue");
                if (kotlin.jvm.internal.n.a(rawValue, k4.b.EXT_INFO.h()) || kotlin.jvm.internal.n.a(rawValue, k4.b.URL_SCHEMES.h()) || kotlin.jvm.internal.n.a(rawValue, m.CONTENT_IDS.h()) || kotlin.jvm.internal.n.a(rawValue, m.CONTENTS.h()) || kotlin.jvm.internal.n.a(rawValue, a.OPTIONS.h())) {
                    return d.ARRAY;
                }
                if (kotlin.jvm.internal.n.a(rawValue, k4.b.ADV_TE.h()) || kotlin.jvm.internal.n.a(rawValue, k4.b.APP_TE.h())) {
                    return d.BOOL;
                }
                if (kotlin.jvm.internal.n.a(rawValue, m.EVENT_TIME.h())) {
                    return d.INT;
                }
                return null;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: k4.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0319e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20333a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20334b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f20335c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f20333a = iArr;
            int[] iArr2 = new int[k.valuesCustom().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            f20334b = iArr2;
            int[] iArr3 = new int[k4.a.valuesCustom().length];
            iArr3[k4.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[k4.a.CUSTOM.ordinal()] = 2;
            f20335c = iArr3;
        }
    }

    static {
        Map<k4.b, c> k10;
        Map<m, b> k11;
        Map<String, j> k12;
        k4.b bVar = k4.b.ANON_ID;
        k kVar = k.USER_DATA;
        k4.b bVar2 = k4.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        k10 = k0.k(r.a(bVar, new c(kVar, l.ANON_ID)), r.a(k4.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID)), r.a(k4.b.ADVERTISER_ID, new c(kVar, l.MAD_ID)), r.a(k4.b.PAGE_ID, new c(kVar, l.PAGE_ID)), r.a(k4.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID)), r.a(bVar2, new c(kVar2, l.ADV_TE)), r.a(k4.b.APP_TE, new c(kVar2, l.APP_TE)), r.a(k4.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), r.a(k4.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), r.a(k4.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), r.a(k4.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), r.a(k4.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), r.a(k4.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), r.a(k4.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), r.a(k4.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), r.a(k4.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), r.a(k4.b.USER_DATA, new c(kVar, null)));
        f20326b = k10;
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        k11 = k0.k(r.a(m.EVENT_TIME, new b(null, i.EVENT_TIME)), r.a(m.EVENT_NAME, new b(null, i.EVENT_NAME)), r.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), r.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), r.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), r.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), r.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), r.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), r.a(m.LEVEL, new b(kVar3, i.LEVEL)), r.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), r.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), r.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), r.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), r.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), r.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), r.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), r.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f20327c = k11;
        k12 = k0.k(r.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), r.a("fb_mobile_activate_app", j.ACTIVATED_APP), r.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), r.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), r.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), r.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), r.a("fb_mobile_content_view", j.VIEWED_CONTENT), r.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), r.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), r.a("fb_mobile_purchase", j.PURCHASED), r.a("fb_mobile_rate", j.RATED), r.a("fb_mobile_search", j.SEARCHED), r.a("fb_mobile_spent_credits", j.SPENT_CREDITS), r.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
        f20328d = k12;
    }

    private e() {
    }

    private final List<Map<String, Object>> b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> c(Map<String, ? extends Object> map, Object obj) {
        List<Map<String, Object>> e10;
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.h(), n.MOBILE_APP_INSTALL.h());
        linkedHashMap.put(i.EVENT_TIME.h(), obj);
        e10 = q.e(linkedHashMap);
        return e10;
    }

    private final k4.a f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(n.EVENT.h());
        a.C0317a c0317a = k4.a.Companion;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        k4.a a10 = c0317a.a((String) obj);
        if (a10 == k4.a.OTHER) {
            return a10;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            k4.b a11 = k4.b.Companion.a(key);
            if (a11 != null) {
                f20325a.g(map2, map3, a11, value);
            } else {
                boolean a12 = kotlin.jvm.internal.n.a(key, k.CUSTOM_EVENTS.h());
                boolean z10 = value instanceof String;
                if (a10 == k4.a.CUSTOM && a12 && z10) {
                    ArrayList<Map<String, Object>> k10 = k((String) value);
                    if (k10 != null) {
                        arrayList.addAll(k10);
                    }
                } else if (a.Companion.a(key) != null) {
                    map4.put(key, value);
                }
            }
        }
        return a10;
    }

    private final void h(Map<String, Object> map, k4.b bVar, Object obj) {
        c cVar = f20326b.get(bVar);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.h(), obj);
    }

    private final void i(Map<String, Object> map, k4.b bVar, Object obj) {
        if (bVar == k4.b.USER_DATA) {
            try {
                n0 n0Var = n0.f7780a;
                map.putAll(n0.o(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                c0.f7719e.c(q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = f20326b.get(bVar);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.h(), obj);
    }

    private final String j(String str) {
        Map<String, j> map = f20328d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = map.get(str);
        return jVar == null ? "" : jVar.h();
    }

    public static final ArrayList<Map<String, Object>> k(String appEvents) {
        String b10;
        Object l10;
        kotlin.jvm.internal.n.e(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            n0 n0Var = n0.f7780a;
            for (String str : n0.n(new JSONArray(appEvents))) {
                n0 n0Var2 = n0.f7780a;
                arrayList.add(n0.o(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a10 = m.Companion.a(str2);
                    b bVar = f20327c.get(a10);
                    if (a10 != null && bVar != null) {
                        k b11 = bVar.b();
                        if (b11 == null) {
                            try {
                                String h10 = bVar.a().h();
                                if (a10 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f20325a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    l10 = eVar.j((String) obj);
                                } else if (a10 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    l10 = l(str2, obj2);
                                    if (l10 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                linkedHashMap2.put(h10, l10);
                            } catch (ClassCastException e10) {
                                c0.a aVar = c0.f7719e;
                                q0 q0Var = q0.APP_EVENTS;
                                b10 = ck.b.b(e10);
                                aVar.c(q0Var, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", b10);
                            }
                        } else if (b11 == k.CUSTOM_DATA) {
                            String h11 = bVar.a().h();
                            Object obj3 = map.get(str2);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object l11 = l(str2, obj3);
                            if (l11 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(h11, l11);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.h(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            c0.f7719e.c(q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object l(String field, Object value) {
        Integer i10;
        Integer i11;
        kotlin.jvm.internal.n.e(field, "field");
        kotlin.jvm.internal.n.e(value, "value");
        d a10 = d.Companion.a(field);
        String str = value instanceof String ? (String) value : null;
        if (a10 == null || str == null) {
            return value;
        }
        int i12 = C0319e.f20333a[a10.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new ck.l();
                }
                i11 = xk.o.i(value.toString());
                return i11;
            }
            i10 = xk.o.i(str);
            if (i10 != null) {
                return Boolean.valueOf(i10.intValue() != 0);
            }
            return null;
        }
        try {
            n0 n0Var = n0.f7780a;
            List<String> n10 = n0.n(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = n10.iterator();
            while (it.hasNext()) {
                ?? r12 = (String) it.next();
                try {
                    try {
                        n0 n0Var2 = n0.f7780a;
                        r12 = n0.o(new JSONObject((String) r12));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    n0 n0Var3 = n0.f7780a;
                    r12 = n0.n(new JSONArray((String) r12));
                }
                arrayList.add(r12);
            }
            return arrayList;
        } catch (JSONException e10) {
            c0.f7719e.c(q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return v.f7137a;
        }
    }

    public final List<Map<String, Object>> a(k4.a eventType, Map<String, Object> userData, Map<String, Object> appData, Map<String, Object> restOfData, List<? extends Map<String, ? extends Object>> customEvents, Object obj) {
        kotlin.jvm.internal.n.e(eventType, "eventType");
        kotlin.jvm.internal.n.e(userData, "userData");
        kotlin.jvm.internal.n.e(appData, "appData");
        kotlin.jvm.internal.n.e(restOfData, "restOfData");
        kotlin.jvm.internal.n.e(customEvents, "customEvents");
        Map<String, Object> d10 = d(userData, appData, restOfData);
        int i10 = C0319e.f20335c[eventType.ordinal()];
        if (i10 == 1) {
            return c(d10, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(d10, customEvents);
    }

    public final Map<String, Object> d(Map<String, ? extends Object> userData, Map<String, ? extends Object> appData, Map<String, ? extends Object> restOfData) {
        kotlin.jvm.internal.n.e(userData, "userData");
        kotlin.jvm.internal.n.e(appData, "appData");
        kotlin.jvm.internal.n.e(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.h(), n.APP.h());
        linkedHashMap.put(k.USER_DATA.h(), userData);
        linkedHashMap.put(k.APP_DATA.h(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> e(Map<String, ? extends Object> parameters) {
        kotlin.jvm.internal.n.e(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        k4.a f10 = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f10 == k4.a.OTHER) {
            return null;
        }
        return a(f10, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.h()));
    }

    public final void g(Map<String, Object> userData, Map<String, Object> appData, k4.b field, Object value) {
        kotlin.jvm.internal.n.e(userData, "userData");
        kotlin.jvm.internal.n.e(appData, "appData");
        kotlin.jvm.internal.n.e(field, "field");
        kotlin.jvm.internal.n.e(value, "value");
        c cVar = f20326b.get(field);
        if (cVar == null) {
            return;
        }
        int i10 = C0319e.f20334b[cVar.b().ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }
}
