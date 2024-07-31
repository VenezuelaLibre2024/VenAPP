package o4;

import android.content.SharedPreferences;
import dk.k0;
import i4.e0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import xk.q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f22226b;

    /* renamed from: a, reason: collision with root package name */
    public static final j f22225a = new j();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f22227c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Long> f22228d = new ConcurrentHashMap();

    private j() {
    }

    public static final boolean d() {
        if (a5.a.d(j.class)) {
            return false;
        }
        try {
            f22225a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f22226b;
            if (sharedPreferences == null) {
                n.p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 != 0 && currentTimeMillis - j10 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f22226b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            n.p("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            a5.a.b(th2, j.class);
            return false;
        }
    }

    public static final void e(Map<String, JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (a5.a.d(j.class)) {
            return;
        }
        try {
            n.e(purchaseDetailsMap, "purchaseDetailsMap");
            n.e(skuDetailsMap, "skuDetailsMap");
            j jVar = f22225a;
            jVar.g();
            jVar.f(jVar.c(jVar.a(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th2) {
            a5.a.b(th2, j.class);
        }
    }

    private final void f(Map<String, String> map) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    q4.i.f(key, value, false);
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g() {
        List u02;
        if (a5.a.d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = e0.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = e0.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = e0.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            n.d(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f22226b = sharedPreferences3;
            Set<String> set = f22227c;
            if (sharedPreferences3 == null) {
                n.p("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            set.addAll(stringSet == null ? new HashSet<>() : stringSet);
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                u02 = q.u0(it.next(), new String[]{";"}, false, 2, 2, null);
                f22228d.put(u02.get(0), Long.valueOf(Long.parseLong((String) u02.get(1))));
            }
            b();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final Map<String, JSONObject> a(Map<String, JSONObject> purchaseDetailsMap) {
        Map s10;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n.e(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            s10 = k0.s(purchaseDetailsMap);
            for (Map.Entry entry : s10.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f22228d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = f22227c;
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
            SharedPreferences sharedPreferences = f22226b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f22227c).apply();
                return new HashMap(purchaseDetailsMap);
            }
            n.p("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public final void b() {
        Map s10;
        SharedPreferences.Editor putLong;
        if (a5.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f22226b;
            if (sharedPreferences == null) {
                n.p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences2 = f22226b;
                if (sharedPreferences2 == null) {
                    n.p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else {
                if (currentTimeMillis - j10 <= 604800) {
                    return;
                }
                s10 = k0.s(f22228d);
                for (Map.Entry entry : s10.entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        f22227c.remove(str + ';' + longValue);
                        f22228d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f22226b;
                if (sharedPreferences3 == null) {
                    n.p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f22227c).putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final Map<String, String> c(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            n.e(purchaseDetailsMap, "purchaseDetailsMap");
            n.e(skuDetailsMap, "skuDetailsMap");
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
                            n.d(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            n.d(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }
}
