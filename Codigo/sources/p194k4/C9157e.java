package p194k4;

import ck.C2017b;
import ck.C2027l;
import ck.C2033r;
import ck.C2037v;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import dk.C7018k0;
import dk.C7029q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.EnumC7823q0;
import p194k4.EnumC9153a;
import p450xk.C12523o;

/* renamed from: k4.e */
/* loaded from: classes.dex */
public final class C9157e {

    /* renamed from: a */
    public static final C9157e f22107a = new C9157e();

    /* renamed from: b */
    private static final Map<EnumC9154b, c> f22108b;

    /* renamed from: c */
    public static final Map<EnumC9165m, b> f22109c;

    /* renamed from: d */
    public static final Map<String, EnumC9162j> f22110d;

    /* renamed from: k4.e$a */
    /* loaded from: classes.dex */
    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");

        public static final C13220a Companion = new C13220a(null);
        private final String rawValue;

        /* renamed from: k4.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13220a {
            private C13220a() {
            }

            public /* synthetic */ C13220a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final a m27037a(String rawValue) {
                C9322n.m27781e(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (C9322n.m27777a(aVar.m27036h(), rawValue)) {
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

        /* renamed from: h */
        public final String m27036h() {
            return this.rawValue;
        }
    }

    /* renamed from: k4.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private EnumC9163k f22111a;

        /* renamed from: b */
        private EnumC9161i f22112b;

        public b(EnumC9163k enumC9163k, EnumC9161i field) {
            C9322n.m27781e(field, "field");
            this.f22111a = enumC9163k;
            this.f22112b = field;
        }

        /* renamed from: a */
        public final EnumC9161i m27038a() {
            return this.f22112b;
        }

        /* renamed from: b */
        public final EnumC9163k m27039b() {
            return this.f22111a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22111a == bVar.f22111a && this.f22112b == bVar.f22112b;
        }

        public int hashCode() {
            EnumC9163k enumC9163k = this.f22111a;
            return ((enumC9163k == null ? 0 : enumC9163k.hashCode()) * 31) + this.f22112b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f22111a + ", field=" + this.f22112b + ')';
        }
    }

    /* renamed from: k4.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private EnumC9163k f22113a;

        /* renamed from: b */
        private EnumC9164l f22114b;

        public c(EnumC9163k section, EnumC9164l enumC9164l) {
            C9322n.m27781e(section, "section");
            this.f22113a = section;
            this.f22114b = enumC9164l;
        }

        /* renamed from: a */
        public final EnumC9164l m27040a() {
            return this.f22114b;
        }

        /* renamed from: b */
        public final EnumC9163k m27041b() {
            return this.f22113a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22113a == cVar.f22113a && this.f22114b == cVar.f22114b;
        }

        public int hashCode() {
            int hashCode = this.f22113a.hashCode() * 31;
            EnumC9164l enumC9164l = this.f22114b;
            return hashCode + (enumC9164l == null ? 0 : enumC9164l.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f22113a + ", field=" + this.f22114b + ')';
        }
    }

    /* renamed from: k4.e$d */
    /* loaded from: classes.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;

        public static final a Companion = new a(null);

        /* renamed from: k4.e$d$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final d m27043a(String rawValue) {
                C9322n.m27781e(rawValue, "rawValue");
                if (C9322n.m27777a(rawValue, EnumC9154b.EXT_INFO.m27014h()) || C9322n.m27777a(rawValue, EnumC9154b.URL_SCHEMES.m27014h()) || C9322n.m27777a(rawValue, EnumC9165m.CONTENT_IDS.m27072h()) || C9322n.m27777a(rawValue, EnumC9165m.CONTENTS.m27072h()) || C9322n.m27777a(rawValue, a.OPTIONS.m27036h())) {
                    return d.ARRAY;
                }
                if (C9322n.m27777a(rawValue, EnumC9154b.ADV_TE.m27014h()) || C9322n.m27777a(rawValue, EnumC9154b.APP_TE.m27014h())) {
                    return d.BOOL;
                }
                if (C9322n.m27777a(rawValue, EnumC9165m.EVENT_TIME.m27072h())) {
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

    /* renamed from: k4.e$e */
    /* loaded from: classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22115a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22116b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f22117c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f22115a = iArr;
            int[] iArr2 = new int[EnumC9163k.valuesCustom().length];
            iArr2[EnumC9163k.APP_DATA.ordinal()] = 1;
            iArr2[EnumC9163k.USER_DATA.ordinal()] = 2;
            f22116b = iArr2;
            int[] iArr3 = new int[EnumC9153a.valuesCustom().length];
            iArr3[EnumC9153a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[EnumC9153a.CUSTOM.ordinal()] = 2;
            f22117c = iArr3;
        }
    }

    static {
        Map<EnumC9154b, c> m20424k;
        Map<EnumC9165m, b> m20424k2;
        Map<String, EnumC9162j> m20424k3;
        EnumC9154b enumC9154b = EnumC9154b.ANON_ID;
        EnumC9163k enumC9163k = EnumC9163k.USER_DATA;
        EnumC9154b enumC9154b2 = EnumC9154b.ADV_TE;
        EnumC9163k enumC9163k2 = EnumC9163k.APP_DATA;
        m20424k = C7018k0.m20424k(C2033r.m10353a(enumC9154b, new c(enumC9163k, EnumC9164l.ANON_ID)), C2033r.m10353a(EnumC9154b.APP_USER_ID, new c(enumC9163k, EnumC9164l.FB_LOGIN_ID)), C2033r.m10353a(EnumC9154b.ADVERTISER_ID, new c(enumC9163k, EnumC9164l.MAD_ID)), C2033r.m10353a(EnumC9154b.PAGE_ID, new c(enumC9163k, EnumC9164l.PAGE_ID)), C2033r.m10353a(EnumC9154b.PAGE_SCOPED_USER_ID, new c(enumC9163k, EnumC9164l.PAGE_SCOPED_USER_ID)), C2033r.m10353a(enumC9154b2, new c(enumC9163k2, EnumC9164l.ADV_TE)), C2033r.m10353a(EnumC9154b.APP_TE, new c(enumC9163k2, EnumC9164l.APP_TE)), C2033r.m10353a(EnumC9154b.CONSIDER_VIEWS, new c(enumC9163k2, EnumC9164l.CONSIDER_VIEWS)), C2033r.m10353a(EnumC9154b.DEVICE_TOKEN, new c(enumC9163k2, EnumC9164l.DEVICE_TOKEN)), C2033r.m10353a(EnumC9154b.EXT_INFO, new c(enumC9163k2, EnumC9164l.EXT_INFO)), C2033r.m10353a(EnumC9154b.INCLUDE_DWELL_DATA, new c(enumC9163k2, EnumC9164l.INCLUDE_DWELL_DATA)), C2033r.m10353a(EnumC9154b.INCLUDE_VIDEO_DATA, new c(enumC9163k2, EnumC9164l.INCLUDE_VIDEO_DATA)), C2033r.m10353a(EnumC9154b.INSTALL_REFERRER, new c(enumC9163k2, EnumC9164l.INSTALL_REFERRER)), C2033r.m10353a(EnumC9154b.INSTALLER_PACKAGE, new c(enumC9163k2, EnumC9164l.INSTALLER_PACKAGE)), C2033r.m10353a(EnumC9154b.RECEIPT_DATA, new c(enumC9163k2, EnumC9164l.RECEIPT_DATA)), C2033r.m10353a(EnumC9154b.URL_SCHEMES, new c(enumC9163k2, EnumC9164l.URL_SCHEMES)), C2033r.m10353a(EnumC9154b.USER_DATA, new c(enumC9163k, null)));
        f22108b = m20424k;
        EnumC9165m enumC9165m = EnumC9165m.VALUE_TO_SUM;
        EnumC9163k enumC9163k3 = EnumC9163k.CUSTOM_DATA;
        m20424k2 = C7018k0.m20424k(C2033r.m10353a(EnumC9165m.EVENT_TIME, new b(null, EnumC9161i.EVENT_TIME)), C2033r.m10353a(EnumC9165m.EVENT_NAME, new b(null, EnumC9161i.EVENT_NAME)), C2033r.m10353a(enumC9165m, new b(enumC9163k3, EnumC9161i.VALUE_TO_SUM)), C2033r.m10353a(EnumC9165m.CONTENT_IDS, new b(enumC9163k3, EnumC9161i.CONTENT_IDS)), C2033r.m10353a(EnumC9165m.CONTENTS, new b(enumC9163k3, EnumC9161i.CONTENTS)), C2033r.m10353a(EnumC9165m.CONTENT_TYPE, new b(enumC9163k3, EnumC9161i.CONTENT_TYPE)), C2033r.m10353a(EnumC9165m.CURRENCY, new b(enumC9163k3, EnumC9161i.CURRENCY)), C2033r.m10353a(EnumC9165m.DESCRIPTION, new b(enumC9163k3, EnumC9161i.DESCRIPTION)), C2033r.m10353a(EnumC9165m.LEVEL, new b(enumC9163k3, EnumC9161i.LEVEL)), C2033r.m10353a(EnumC9165m.MAX_RATING_VALUE, new b(enumC9163k3, EnumC9161i.MAX_RATING_VALUE)), C2033r.m10353a(EnumC9165m.NUM_ITEMS, new b(enumC9163k3, EnumC9161i.NUM_ITEMS)), C2033r.m10353a(EnumC9165m.PAYMENT_INFO_AVAILABLE, new b(enumC9163k3, EnumC9161i.PAYMENT_INFO_AVAILABLE)), C2033r.m10353a(EnumC9165m.REGISTRATION_METHOD, new b(enumC9163k3, EnumC9161i.REGISTRATION_METHOD)), C2033r.m10353a(EnumC9165m.SEARCH_STRING, new b(enumC9163k3, EnumC9161i.SEARCH_STRING)), C2033r.m10353a(EnumC9165m.SUCCESS, new b(enumC9163k3, EnumC9161i.SUCCESS)), C2033r.m10353a(EnumC9165m.ORDER_ID, new b(enumC9163k3, EnumC9161i.ORDER_ID)), C2033r.m10353a(EnumC9165m.AD_TYPE, new b(enumC9163k3, EnumC9161i.AD_TYPE)));
        f22109c = m20424k2;
        m20424k3 = C7018k0.m20424k(C2033r.m10353a("fb_mobile_achievement_unlocked", EnumC9162j.UNLOCKED_ACHIEVEMENT), C2033r.m10353a("fb_mobile_activate_app", EnumC9162j.ACTIVATED_APP), C2033r.m10353a("fb_mobile_add_payment_info", EnumC9162j.ADDED_PAYMENT_INFO), C2033r.m10353a("fb_mobile_add_to_cart", EnumC9162j.ADDED_TO_CART), C2033r.m10353a("fb_mobile_add_to_wishlist", EnumC9162j.ADDED_TO_WISHLIST), C2033r.m10353a("fb_mobile_complete_registration", EnumC9162j.COMPLETED_REGISTRATION), C2033r.m10353a("fb_mobile_content_view", EnumC9162j.VIEWED_CONTENT), C2033r.m10353a("fb_mobile_initiated_checkout", EnumC9162j.INITIATED_CHECKOUT), C2033r.m10353a("fb_mobile_level_achieved", EnumC9162j.ACHIEVED_LEVEL), C2033r.m10353a("fb_mobile_purchase", EnumC9162j.PURCHASED), C2033r.m10353a("fb_mobile_rate", EnumC9162j.RATED), C2033r.m10353a("fb_mobile_search", EnumC9162j.SEARCHED), C2033r.m10353a("fb_mobile_spent_credits", EnumC9162j.SPENT_CREDITS), C2033r.m10353a("fb_mobile_tutorial_completion", EnumC9162j.COMPLETED_TUTORIAL));
        f22110d = m20424k3;
    }

    private C9157e() {
    }

    /* renamed from: b */
    private final List<Map<String, Object>> m27023b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
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

    /* renamed from: c */
    private final List<Map<String, Object>> m27024c(Map<String, ? extends Object> map, Object obj) {
        List<Map<String, Object>> m20572e;
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(EnumC9161i.EVENT_NAME.m27064h(), EnumC9166n.MOBILE_APP_INSTALL.m27075h());
        linkedHashMap.put(EnumC9161i.EVENT_TIME.m27064h(), obj);
        m20572e = C7029q.m20572e(linkedHashMap);
        return m20572e;
    }

    /* renamed from: f */
    private final EnumC9153a m27025f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(EnumC9166n.EVENT.m27075h());
        EnumC9153a.a aVar = EnumC9153a.Companion;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        EnumC9153a m27012a = aVar.m27012a((String) obj);
        if (m27012a == EnumC9153a.OTHER) {
            return m27012a;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            EnumC9154b m27015a = EnumC9154b.Companion.m27015a(key);
            if (m27015a != null) {
                f22107a.m27034g(map2, map3, m27015a, value);
            } else {
                boolean m27777a = C9322n.m27777a(key, EnumC9163k.CUSTOM_EVENTS.m27068h());
                boolean z10 = value instanceof String;
                if (m27012a == EnumC9153a.CUSTOM && m27777a && z10) {
                    ArrayList<Map<String, Object>> m27029k = m27029k((String) value);
                    if (m27029k != null) {
                        arrayList.addAll(m27029k);
                    }
                } else if (a.Companion.m27037a(key) != null) {
                    map4.put(key, value);
                }
            }
        }
        return m27012a;
    }

    /* renamed from: h */
    private final void m27026h(Map<String, Object> map, EnumC9154b enumC9154b, Object obj) {
        c cVar = f22108b.get(enumC9154b);
        EnumC9164l m27040a = cVar == null ? null : cVar.m27040a();
        if (m27040a == null) {
            return;
        }
        map.put(m27040a.m27070h(), obj);
    }

    /* renamed from: i */
    private final void m27027i(Map<String, Object> map, EnumC9154b enumC9154b, Object obj) {
        if (enumC9154b == EnumC9154b.USER_DATA) {
            try {
                C4634n0 c4634n0 = C4634n0.f8760a;
                map.putAll(C4634n0.m11321o(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = f22108b.get(enumC9154b);
        EnumC9164l m27040a = cVar == null ? null : cVar.m27040a();
        if (m27040a == null) {
            return;
        }
        map.put(m27040a.m27070h(), obj);
    }

    /* renamed from: j */
    private final String m27028j(String str) {
        Map<String, EnumC9162j> map = f22110d;
        if (!map.containsKey(str)) {
            return str;
        }
        EnumC9162j enumC9162j = map.get(str);
        return enumC9162j == null ? "" : enumC9162j.m27066h();
    }

    /* renamed from: k */
    public static final ArrayList<Map<String, Object>> m27029k(String appEvents) {
        String m10329b;
        Object m27030l;
        C9322n.m27781e(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            C4634n0 c4634n0 = C4634n0.f8760a;
            for (String str : C4634n0.m11319n(new JSONArray(appEvents))) {
                C4634n0 c4634n02 = C4634n0.f8760a;
                arrayList.add(C4634n0.m11321o(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    EnumC9165m m27073a = EnumC9165m.Companion.m27073a(str2);
                    b bVar = f22109c.get(m27073a);
                    if (m27073a != null && bVar != null) {
                        EnumC9163k m27039b = bVar.m27039b();
                        if (m27039b == null) {
                            try {
                                String m27064h = bVar.m27038a().m27064h();
                                if (m27073a == EnumC9165m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    C9157e c9157e = f22107a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    m27030l = c9157e.m27028j((String) obj);
                                } else if (m27073a == EnumC9165m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    m27030l = m27030l(str2, obj2);
                                    if (m27030l == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                linkedHashMap2.put(m27064h, m27030l);
                            } catch (ClassCastException e10) {
                                C4612c0.a aVar = C4612c0.f8694e;
                                EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
                                m10329b = C2017b.m10329b(e10);
                                aVar.m11139c(enumC7823q0, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", m10329b);
                            }
                        } else if (m27039b == EnumC9163k.CUSTOM_DATA) {
                            String m27064h2 = bVar.m27038a().m27064h();
                            Object obj3 = map.get(str2);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object m27030l2 = m27030l(str2, obj3);
                            if (m27030l2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(m27064h2, m27030l2);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(EnumC9163k.CUSTOM_DATA.m27068h(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    /* renamed from: l */
    public static final Object m27030l(String field, Object value) {
        Integer m41023i;
        Integer m41023i2;
        C9322n.m27781e(field, "field");
        C9322n.m27781e(value, "value");
        d m27043a = d.Companion.m27043a(field);
        String str = value instanceof String ? (String) value : null;
        if (m27043a == null || str == null) {
            return value;
        }
        int i10 = e.f22115a[m27043a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C2027l();
                }
                m41023i2 = C12523o.m41023i(value.toString());
                return m41023i2;
            }
            m41023i = C12523o.m41023i(str);
            if (m41023i != null) {
                return Boolean.valueOf(m41023i.intValue() != 0);
            }
            return null;
        }
        try {
            C4634n0 c4634n0 = C4634n0.f8760a;
            List<String> m11319n = C4634n0.m11319n(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = m11319n.iterator();
            while (it.hasNext()) {
                ?? r12 = (String) it.next();
                try {
                    try {
                        C4634n0 c4634n02 = C4634n0.f8760a;
                        r12 = C4634n0.m11321o(new JSONObject((String) r12));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    C4634n0 c4634n03 = C4634n0.f8760a;
                    r12 = C4634n0.m11319n(new JSONArray((String) r12));
                }
                arrayList.add(r12);
            }
            return arrayList;
        } catch (JSONException e10) {
            C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return C2037v.f8089a;
        }
    }

    /* renamed from: a */
    public final List<Map<String, Object>> m27031a(EnumC9153a eventType, Map<String, Object> userData, Map<String, Object> appData, Map<String, Object> restOfData, List<? extends Map<String, ? extends Object>> customEvents, Object obj) {
        C9322n.m27781e(eventType, "eventType");
        C9322n.m27781e(userData, "userData");
        C9322n.m27781e(appData, "appData");
        C9322n.m27781e(restOfData, "restOfData");
        C9322n.m27781e(customEvents, "customEvents");
        Map<String, Object> m27032d = m27032d(userData, appData, restOfData);
        int i10 = e.f22117c[eventType.ordinal()];
        if (i10 == 1) {
            return m27024c(m27032d, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return m27023b(m27032d, customEvents);
    }

    /* renamed from: d */
    public final Map<String, Object> m27032d(Map<String, ? extends Object> userData, Map<String, ? extends Object> appData, Map<String, ? extends Object> restOfData) {
        C9322n.m27781e(userData, "userData");
        C9322n.m27781e(appData, "appData");
        C9322n.m27781e(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC9166n.ACTION_SOURCE.m27075h(), EnumC9166n.APP.m27075h());
        linkedHashMap.put(EnumC9163k.USER_DATA.m27068h(), userData);
        linkedHashMap.put(EnumC9163k.APP_DATA.m27068h(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List<Map<String, Object>> m27033e(Map<String, ? extends Object> parameters) {
        C9322n.m27781e(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        EnumC9153a m27025f = m27025f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (m27025f == EnumC9153a.OTHER) {
            return null;
        }
        return m27031a(m27025f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(EnumC9166n.INSTALL_EVENT_TIME.m27075h()));
    }

    /* renamed from: g */
    public final void m27034g(Map<String, Object> userData, Map<String, Object> appData, EnumC9154b field, Object value) {
        C9322n.m27781e(userData, "userData");
        C9322n.m27781e(appData, "appData");
        C9322n.m27781e(field, "field");
        C9322n.m27781e(value, "value");
        c cVar = f22108b.get(field);
        if (cVar == null) {
            return;
        }
        int i10 = e.f22116b[cVar.m27041b().ordinal()];
        if (i10 == 1) {
            m27026h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            m27027i(userData, field, value);
        }
    }
}
