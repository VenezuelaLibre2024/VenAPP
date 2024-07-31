package o4;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import xk.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    private static h f22193u;

    /* renamed from: a, reason: collision with root package name */
    private final Context f22197a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22198b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f22199c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f22200d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f22201e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f22202f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f22203g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f22204h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<?> f22205i;

    /* renamed from: j, reason: collision with root package name */
    private final Method f22206j;

    /* renamed from: k, reason: collision with root package name */
    private final Method f22207k;

    /* renamed from: l, reason: collision with root package name */
    private final Method f22208l;

    /* renamed from: m, reason: collision with root package name */
    private final Method f22209m;

    /* renamed from: n, reason: collision with root package name */
    private final Method f22210n;

    /* renamed from: o, reason: collision with root package name */
    private final Method f22211o;

    /* renamed from: p, reason: collision with root package name */
    private final Method f22212p;

    /* renamed from: q, reason: collision with root package name */
    private final l f22213q;

    /* renamed from: r, reason: collision with root package name */
    private final Set<String> f22214r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f22191s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f22192t = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicBoolean f22194v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    private static final Map<String, JSONObject> f22195w = new ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    private static final Map<String, JSONObject> f22196x = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            boolean q10;
            if (a5.a.d(this)) {
                return null;
            }
            try {
                n.e(proxy, "proxy");
                n.e(m10, "m");
                if (n.a(m10.getName(), "onBillingSetupFinished")) {
                    h.f22191s.f().set(true);
                } else {
                    String name = m10.getName();
                    n.d(name, "m.name");
                    q10 = p.q(name, "onBillingServiceDisconnected", false, 2, null);
                    if (q10) {
                        h.f22191s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final Object a(Context context, Class<?> cls) {
            Object e10;
            Object e11;
            Object e12;
            Class<?> a10 = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> a11 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a10 == null || a11 == null) {
                return null;
            }
            Method d10 = m.d(cls, "newBuilder", Context.class);
            Method d11 = m.d(a10, "enablePendingPurchases", new Class[0]);
            Method d12 = m.d(a10, "setListener", a11);
            Method d13 = m.d(a10, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null || (e10 = m.e(cls, d10, null, context)) == null || (e11 = m.e(a10, d12, e10, Proxy.newProxyInstance(a11.getClassLoader(), new Class[]{a11}, new d()))) == null || (e12 = m.e(a10, d11, e11, new Object[0])) == null) {
                return null;
            }
            return m.e(a10, d13, e12, new Object[0]);
        }

        private final void b(Context context) {
            Object a10;
            l b10 = l.f22231g.b();
            if (b10 == null) {
                return;
            }
            Class<?> a11 = m.a("com.android.billingclient.api.BillingClient");
            Class<?> a12 = m.a("com.android.billingclient.api.Purchase");
            Class<?> a13 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> a14 = m.a("com.android.billingclient.api.SkuDetails");
            Class<?> a15 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> a16 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> a17 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a11 == null || a13 == null || a12 == null || a14 == null || a16 == null || a15 == null || a17 == null) {
                return;
            }
            Method d10 = m.d(a11, "queryPurchases", String.class);
            Method d11 = m.d(a13, "getPurchasesList", new Class[0]);
            Method d12 = m.d(a12, "getOriginalJson", new Class[0]);
            Method d13 = m.d(a14, "getOriginalJson", new Class[0]);
            Method d14 = m.d(a15, "getOriginalJson", new Class[0]);
            Method d15 = m.d(a11, "querySkuDetailsAsync", b10.e(), a16);
            Method d16 = m.d(a11, "queryPurchaseHistoryAsync", String.class, a17);
            if (d10 == null || d11 == null || d12 == null || d13 == null || d14 == null || d15 == null || d16 == null || (a10 = a(context, a11)) == null) {
                return;
            }
            h.m(new h(context, a10, a11, a13, a12, a14, a15, a16, a17, d10, d11, d12, d13, d14, d15, d16, b10, null));
            h g10 = h.g();
            if (g10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            h.n(g10);
        }

        public final synchronized h c(Context context) {
            n.e(context, "context");
            if (h.f().get()) {
                return h.g();
            }
            b(context);
            h.f().set(true);
            return h.g();
        }

        public final Map<String, JSONObject> d() {
            return h.h();
        }

        public final Map<String, JSONObject> e() {
            return h.k();
        }

        public final AtomicBoolean f() {
            return h.l();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f22215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f22216b;

        public c(h this$0, Runnable runnable) {
            n.e(this$0, "this$0");
            n.e(runnable, "runnable");
            this.f22216b = this$0;
            this.f22215a = runnable;
        }

        private final void a(List<?> list) {
            if (a5.a.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f22240a;
                        Object e10 = m.e(h.i(this.f22216b), h.c(this.f22216b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", h.b(this.f22216b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                h.e(this.f22216b).add(skuID);
                                Map<String, JSONObject> d10 = h.f22191s.d();
                                n.d(skuID, "skuID");
                                d10.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f22215a.run();
            } catch (Throwable th2) {
                a5.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                n.e(proxy, "proxy");
                n.e(method, "method");
                if (n.a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                n.e(proxy, "proxy");
                n.e(m10, "m");
                return null;
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f22217a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f22218b;

        public e(h this$0, Runnable runnable) {
            n.e(this$0, "this$0");
            n.e(runnable, "runnable");
            this.f22218b = this$0;
            this.f22217a = runnable;
        }

        public final void a(List<?> skuDetailsObjectList) {
            if (a5.a.d(this)) {
                return;
            }
            try {
                n.e(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        m mVar = m.f22240a;
                        Object e10 = m.e(h.j(this.f22218b), h.d(this.f22218b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                Map<String, JSONObject> e11 = h.f22191s.e();
                                n.d(skuID, "skuID");
                                e11.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f22217a.run();
            } catch (Throwable th2) {
                a5.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                n.e(proxy, "proxy");
                n.e(m10, "m");
                if (n.a(m10.getName(), "onSkuDetailsResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return null;
            }
        }
    }

    private h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f22197a = context;
        this.f22198b = obj;
        this.f22199c = cls;
        this.f22200d = cls2;
        this.f22201e = cls3;
        this.f22202f = cls4;
        this.f22203g = cls5;
        this.f22204h = cls6;
        this.f22205i = cls7;
        this.f22206j = method;
        this.f22207k = method2;
        this.f22208l = method3;
        this.f22209m = method4;
        this.f22210n = method5;
        this.f22211o = method6;
        this.f22212p = method7;
        this.f22213q = lVar;
        this.f22214r = new CopyOnWriteArraySet();
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, kotlin.jvm.internal.g gVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22197a;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22210n;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22209m;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22214r;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return f22192t;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return f22193u;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return f22195w;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22203g;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f22202f;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return f22196x;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (a5.a.d(h.class)) {
            return null;
        }
        try {
            return f22194v;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (a5.a.d(h.class)) {
            return;
        }
        try {
            f22193u = hVar;
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (a5.a.d(h.class)) {
            return;
        }
        try {
            hVar.t();
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (a5.a.d(h.class)) {
            return;
        }
        try {
            n.e(this$0, "this$0");
            n.e(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.s("inapp", new ArrayList(this$0.f22214r), queryPurchaseHistoryRunnable);
        } catch (Throwable th2) {
            a5.a.b(th2, h.class);
        }
    }

    private final void r(String str, Runnable runnable) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f22205i.getClassLoader(), new Class[]{this.f22205i}, new c(this, runnable));
            m mVar = m.f22240a;
            m.e(this.f22199c, this.f22212p, this.f22198b, str, newProxyInstance);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void s(String str, List<String> list, Runnable runnable) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f22204h.getClassLoader(), new Class[]{this.f22204h}, new e(this, runnable));
            Object d10 = this.f22213q.d(str, list);
            m mVar = m.f22240a;
            m.e(this.f22199c, this.f22211o, this.f22198b, d10, newProxyInstance);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void t() {
        Method d10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            Class<?> a10 = m.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (d10 = m.d(this.f22199c, "startConnection", a10)) == null) {
                return;
            }
            m.e(this.f22199c, d10, this.f22198b, Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a()));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void o(String skuType, Runnable querySkuRunnable) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(skuType, "skuType");
            n.e(querySkuRunnable, "querySkuRunnable");
            m mVar = m.f22240a;
            Object e10 = m.e(this.f22200d, this.f22207k, m.e(this.f22199c, this.f22206j, this.f22198b, "inapp"), new Object[0]);
            List list = e10 instanceof List ? (List) e10 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f22240a;
                    Object e11 = m.e(this.f22201e, this.f22208l, obj, new Object[0]);
                    String str = e11 instanceof String ? (String) e11 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            Map<String, JSONObject> map = f22195w;
                            n.d(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                s(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void p(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(skuType, "skuType");
            n.e(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            r(skuType, new Runnable() { // from class: o4.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(h.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
