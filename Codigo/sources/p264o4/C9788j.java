package p264o4;

import android.content.SharedPreferences;
import dk.C7018k0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9322n;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p303q4.C10269i;
import p450xk.C12525q;

/* renamed from: o4.j */
/* loaded from: classes.dex */
public final class C9788j {

    /* renamed from: b */
    private static SharedPreferences f24159b;

    /* renamed from: a */
    public static final C9788j f24158a = new C9788j();

    /* renamed from: c */
    private static final Set<String> f24160c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private static final Map<String, Long> f24161d = new ConcurrentHashMap();

    private C9788j() {
    }

    /* renamed from: d */
    public static final boolean m29402d() {
        if (C0033a.m107d(C9788j.class)) {
            return false;
        }
        try {
            f24158a.m29405g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f24159b;
            if (sharedPreferences == null) {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 != 0 && currentTimeMillis - j10 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f24159b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            C9322n.m27792p("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9788j.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m29403e(Map<String, JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (C0033a.m107d(C9788j.class)) {
            return;
        }
        try {
            C9322n.m27781e(purchaseDetailsMap, "purchaseDetailsMap");
            C9322n.m27781e(skuDetailsMap, "skuDetailsMap");
            C9788j c9788j = f24158a;
            c9788j.m29405g();
            c9788j.m29404f(c9788j.m29408c(c9788j.m29406a(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9788j.class);
        }
    }

    /* renamed from: f */
    private final void m29404f(Map<String, String> map) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    C10269i.m30758f(key, value, false);
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private final void m29405g() {
        List m41098u0;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            C9322n.m27780d(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f24159b = sharedPreferences3;
            Set<String> set = f24160c;
            if (sharedPreferences3 == null) {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            set.addAll(stringSet == null ? new HashSet<>() : stringSet);
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                m41098u0 = C12525q.m41098u0(it.next(), new String[]{";"}, false, 2, 2, null);
                f24161d.put(m41098u0.get(0), Long.valueOf(Long.parseLong((String) m41098u0.get(1))));
            }
            m29407b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: a */
    public final Map<String, JSONObject> m29406a(Map<String, JSONObject> purchaseDetailsMap) {
        Map m20432s;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9322n.m27781e(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            m20432s = C7018k0.m20432s(purchaseDetailsMap);
            for (Map.Entry entry : m20432s.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f24161d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = f24160c;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            set.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f24159b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f24160c).apply();
                return new HashMap(purchaseDetailsMap);
            }
            C9322n.m27792p("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    public final void m29407b() {
        Map m20432s;
        SharedPreferences.Editor putLong;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f24159b;
            if (sharedPreferences == null) {
                C9322n.m27792p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences2 = f24159b;
                if (sharedPreferences2 == null) {
                    C9322n.m27792p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else {
                if (currentTimeMillis - j10 <= 604800) {
                    return;
                }
                m20432s = C7018k0.m20432s(f24161d);
                for (Map.Entry entry : m20432s.entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        f24160c.remove(str + ';' + longValue);
                        f24161d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f24159b;
                if (sharedPreferences3 == null) {
                    C9322n.m27792p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f24160c).putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: c */
    public final Map<String, String> m29408c(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            C9322n.m27781e(purchaseDetailsMap, "purchaseDetailsMap");
            C9322n.m27781e(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            String jSONObject2 = value.toString();
                            C9322n.m27780d(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            C9322n.m27780d(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
