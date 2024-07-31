package p264o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p450xk.C12525q;

/* renamed from: o4.i */
/* loaded from: classes.dex */
public final class C9787i {

    /* renamed from: a */
    public static final C9787i f24152a = new C9787i();

    /* renamed from: b */
    private static final HashMap<String, Method> f24153b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Class<?>> f24154c = new HashMap<>();

    /* renamed from: d */
    private static final String f24155d = C7799e0.m23860l().getPackageName();

    /* renamed from: e */
    private static final SharedPreferences f24156e = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f */
    private static final SharedPreferences f24157f = C7799e0.m23860l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private C9787i() {
    }

    /* renamed from: a */
    public static final Object m29385a(Context context, IBinder iBinder) {
        if (C0033a.m107d(C9787i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            return f24152a.m29397n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m29386b() {
        SharedPreferences.Editor putLong;
        if (C0033a.m107d(C9787i.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f24156e;
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                putLong = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else if (currentTimeMillis - j10 <= 604800) {
                return;
            } else {
                putLong = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
        }
    }

    /* renamed from: c */
    private final ArrayList<String> m29387c(ArrayList<String> arrayList) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f24157f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j10 / 1000) <= 86400 && !C9322n.m27777a(f24157f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    private final Class<?> m29388d(Context context, String str) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f24154c;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class<?> m29420b = C9791m.m29420b(context, str);
            if (m29420b != null) {
                hashMap.put(str, m29420b);
            }
            return m29420b;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private final Method m29389e(Class<?> cls, String str) {
        Class[] clsArr;
        Method m29421c;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f24153b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (!str.equals("getPurchases")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE = Integer.TYPE;
                        C9322n.m27780d(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE2 = Integer.TYPE;
                        C9322n.m27780d(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE3 = Integer.TYPE;
                        C9322n.m27780d(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE4 = Integer.TYPE;
                        C9322n.m27780d(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                m29421c = C9791m.m29421c(cls, str, null);
            } else {
                C9791m c9791m = C9791m.f24173a;
                m29421c = C9791m.m29421c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (m29421c != null) {
                hashMap.put(str, m29421c);
            }
            return m29421c;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    private final ArrayList<String> m29390f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m29398o(context, obj, str)) {
                String str2 = null;
                int i10 = 0;
                boolean z10 = false;
                do {
                    Object m29397n = m29397n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f24155d, str, str2, new Bundle()});
                    if (m29397n != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) m29397n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z10 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i10++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i10 < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i10 < 30) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: g */
    public static final ArrayList<String> m29391g(Context context, Object obj) {
        C9787i c9787i;
        Class<?> m29388d;
        if (C0033a.m107d(C9787i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (m29388d = (c9787i = f24152a).m29388d(context, "com.android.vending.billing.IInAppBillingService")) == null || c9787i.m29389e(m29388d, "getPurchaseHistory") == null) ? arrayList : c9787i.m29387c(c9787i.m29390f(context, obj, "inapp"));
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EDGE_INSN: B:24:0x0062->B:28:0x0062 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList<java.lang.String> m29392h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = p007a5.C0033a.m107d(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.m29398o(r13, r14, r15)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L62
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L63
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r11[r2] = r6     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = p264o4.C9787i.f24155d     // Catch: java.lang.Throwable -> L63
            r7 = 1
            r11[r7] = r6     // Catch: java.lang.Throwable -> L63
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L63
            r11[r5] = r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.m29397n(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L5b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L62
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L63
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L63
            goto L5c
        L5b:
            r3 = r1
        L5c:
            r5 = 30
            if (r4 >= r5) goto L62
            if (r3 != 0) goto L19
        L62:
            return r0
        L63:
            r13 = move-exception
            p007a5.C0033a.m105b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p264o4.C9787i.m29392h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    public static final ArrayList<String> m29393i(Context context, Object obj) {
        if (C0033a.m107d(C9787i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            C9787i c9787i = f24152a;
            return c9787i.m29387c(c9787i.m29392h(context, obj, "inapp"));
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final ArrayList<String> m29394j(Context context, Object obj) {
        if (C0033a.m107d(C9787i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            C9787i c9787i = f24152a;
            return c9787i.m29387c(c9787i.m29392h(context, obj, "subs"));
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final Map<String, String> m29395k(Context context, ArrayList<String> skuList, Object obj, boolean z10) {
        if (C0033a.m107d(C9787i.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(skuList, "skuList");
            Map<String, String> m29399p = f24152a.m29399p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = skuList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!m29399p.containsKey(next)) {
                    arrayList.add(next);
                }
            }
            m29399p.putAll(f24152a.m29396l(context, arrayList, obj, z10));
            return m29399p;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9787i.class);
            return null;
        }
    }

    /* renamed from: l */
    private final Map<String, String> m29396l(Context context, ArrayList<String> arrayList, Object obj, boolean z10) {
        int size;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i10 = 0;
                objArr[0] = 3;
                objArr[1] = f24155d;
                objArr[2] = z10 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object m29397n = m29397n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (m29397n != null) {
                    Bundle bundle2 = (Bundle) m29397n;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                String str = arrayList.get(i10);
                                C9322n.m27780d(str, "skuList[i]");
                                String str2 = stringArrayList.get(i10);
                                C9322n.m27780d(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                                if (i11 > size) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        m29400q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: n */
    private final Object m29397n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method m29389e;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Class<?> m29388d = m29388d(context, str);
            if (m29388d == null || (m29389e = m29389e(m29388d, str2)) == null) {
                return null;
            }
            C9791m c9791m = C9791m.f24173a;
            return C9791m.m29423e(m29388d, m29389e, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: o */
    private final boolean m29398o(Context context, Object obj, String str) {
        if (C0033a.m107d(this) || obj == null) {
            return false;
        }
        try {
            Object m29397n = m29397n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f24155d, str});
            if (m29397n != null) {
                return ((Integer) m29397n).intValue() == 0;
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: p */
    private final Map<String, String> m29399p(ArrayList<String> arrayList) {
        List m41098u0;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = it.next();
                String string = f24156e.getString(sku, null);
                if (string != null) {
                    m41098u0 = C12525q.m41098u0(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) m41098u0.get(0)) < 43200) {
                        C9322n.m27780d(sku, "sku");
                        linkedHashMap.put(sku, m41098u0.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: q */
    private final void m29400q(Map<String, String> map) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f24156e.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: m */
    public final boolean m29401m(String skuDetail) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            C9322n.m27781e(skuDetail, "skuDetail");
            try {
                String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}
