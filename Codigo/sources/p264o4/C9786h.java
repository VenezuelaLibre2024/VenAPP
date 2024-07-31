package p264o4;

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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p450xk.C12524p;

/* renamed from: o4.h */
/* loaded from: classes.dex */
public final class C9786h {

    /* renamed from: u */
    private static C9786h f24126u;

    /* renamed from: a */
    private final Context f24130a;

    /* renamed from: b */
    private final Object f24131b;

    /* renamed from: c */
    private final Class<?> f24132c;

    /* renamed from: d */
    private final Class<?> f24133d;

    /* renamed from: e */
    private final Class<?> f24134e;

    /* renamed from: f */
    private final Class<?> f24135f;

    /* renamed from: g */
    private final Class<?> f24136g;

    /* renamed from: h */
    private final Class<?> f24137h;

    /* renamed from: i */
    private final Class<?> f24138i;

    /* renamed from: j */
    private final Method f24139j;

    /* renamed from: k */
    private final Method f24140k;

    /* renamed from: l */
    private final Method f24141l;

    /* renamed from: m */
    private final Method f24142m;

    /* renamed from: n */
    private final Method f24143n;

    /* renamed from: o */
    private final Method f24144o;

    /* renamed from: p */
    private final Method f24145p;

    /* renamed from: q */
    private final C9790l f24146q;

    /* renamed from: r */
    private final Set<String> f24147r;

    /* renamed from: s */
    public static final b f24124s = new b(null);

    /* renamed from: t */
    private static final AtomicBoolean f24125t = new AtomicBoolean(false);

    /* renamed from: v */
    private static final AtomicBoolean f24127v = new AtomicBoolean(false);

    /* renamed from: w */
    private static final Map<String, JSONObject> f24128w = new ConcurrentHashMap();

    /* renamed from: x */
    private static final Map<String, JSONObject> f24129x = new ConcurrentHashMap();

    /* renamed from: o4.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            boolean m41036q;
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                C9322n.m27781e(proxy, "proxy");
                C9322n.m27781e(m10, "m");
                if (C9322n.m27777a(m10.getName(), "onBillingSetupFinished")) {
                    C9786h.f24124s.m29382f().set(true);
                } else {
                    String name = m10.getName();
                    C9322n.m27780d(name, "m.name");
                    m41036q = C12524p.m41036q(name, "onBillingServiceDisconnected", false, 2, null);
                    if (m41036q) {
                        C9786h.f24124s.m29382f().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return null;
            }
        }
    }

    /* renamed from: o4.h$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final Object m29377a(Context context, Class<?> cls) {
            Object m29423e;
            Object m29423e2;
            Object m29423e3;
            Class<?> m29419a = C9791m.m29419a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> m29419a2 = C9791m.m29419a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (m29419a == null || m29419a2 == null) {
                return null;
            }
            Method m29422d = C9791m.m29422d(cls, "newBuilder", Context.class);
            Method m29422d2 = C9791m.m29422d(m29419a, "enablePendingPurchases", new Class[0]);
            Method m29422d3 = C9791m.m29422d(m29419a, "setListener", m29419a2);
            Method m29422d4 = C9791m.m29422d(m29419a, "build", new Class[0]);
            if (m29422d == null || m29422d2 == null || m29422d3 == null || m29422d4 == null || (m29423e = C9791m.m29423e(cls, m29422d, null, context)) == null || (m29423e2 = C9791m.m29423e(m29419a, m29422d3, m29423e, Proxy.newProxyInstance(m29419a2.getClassLoader(), new Class[]{m29419a2}, new d()))) == null || (m29423e3 = C9791m.m29423e(m29419a, m29422d2, m29423e2, new Object[0])) == null) {
                return null;
            }
            return C9791m.m29423e(m29419a, m29422d4, m29423e3, new Object[0]);
        }

        /* renamed from: b */
        private final void m29378b(Context context) {
            Object m29377a;
            C9790l m29418b = C9790l.f24164g.m29418b();
            if (m29418b == null) {
                return;
            }
            Class<?> m29419a = C9791m.m29419a("com.android.billingclient.api.BillingClient");
            Class<?> m29419a2 = C9791m.m29419a("com.android.billingclient.api.Purchase");
            Class<?> m29419a3 = C9791m.m29419a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> m29419a4 = C9791m.m29419a("com.android.billingclient.api.SkuDetails");
            Class<?> m29419a5 = C9791m.m29419a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> m29419a6 = C9791m.m29419a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> m29419a7 = C9791m.m29419a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (m29419a == null || m29419a3 == null || m29419a2 == null || m29419a4 == null || m29419a6 == null || m29419a5 == null || m29419a7 == null) {
                return;
            }
            Method m29422d = C9791m.m29422d(m29419a, "queryPurchases", String.class);
            Method m29422d2 = C9791m.m29422d(m29419a3, "getPurchasesList", new Class[0]);
            Method m29422d3 = C9791m.m29422d(m29419a2, "getOriginalJson", new Class[0]);
            Method m29422d4 = C9791m.m29422d(m29419a4, "getOriginalJson", new Class[0]);
            Method m29422d5 = C9791m.m29422d(m29419a5, "getOriginalJson", new Class[0]);
            Method m29422d6 = C9791m.m29422d(m29419a, "querySkuDetailsAsync", m29418b.m29416e(), m29419a6);
            Method m29422d7 = C9791m.m29422d(m29419a, "queryPurchaseHistoryAsync", String.class, m29419a7);
            if (m29422d == null || m29422d2 == null || m29422d3 == null || m29422d4 == null || m29422d5 == null || m29422d6 == null || m29422d7 == null || (m29377a = m29377a(context, m29419a)) == null) {
                return;
            }
            C9786h.m29369m(new C9786h(context, m29377a, m29419a, m29419a3, m29419a2, m29419a4, m29419a5, m29419a6, m29419a7, m29422d, m29422d2, m29422d3, m29422d4, m29422d5, m29422d6, m29422d7, m29418b, null));
            C9786h m29363g = C9786h.m29363g();
            if (m29363g == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            C9786h.m29370n(m29363g);
        }

        /* renamed from: c */
        public final synchronized C9786h m29379c(Context context) {
            C9322n.m27781e(context, "context");
            if (C9786h.m29362f().get()) {
                return C9786h.m29363g();
            }
            m29378b(context);
            C9786h.m29362f().set(true);
            return C9786h.m29363g();
        }

        /* renamed from: d */
        public final Map<String, JSONObject> m29380d() {
            return C9786h.m29364h();
        }

        /* renamed from: e */
        public final Map<String, JSONObject> m29381e() {
            return C9786h.m29367k();
        }

        /* renamed from: f */
        public final AtomicBoolean m29382f() {
            return C9786h.m29368l();
        }
    }

    /* renamed from: o4.h$c */
    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a */
        private Runnable f24148a;

        /* renamed from: b */
        final /* synthetic */ C9786h f24149b;

        public c(C9786h this$0, Runnable runnable) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(runnable, "runnable");
            this.f24149b = this$0;
            this.f24148a = runnable;
        }

        /* renamed from: a */
        private final void m29383a(List<?> list) {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        C9791m c9791m = C9791m.f24173a;
                        Object m29423e = C9791m.m29423e(C9786h.m29365i(this.f24149b), C9786h.m29359c(this.f24149b), obj, new Object[0]);
                        String str = m29423e instanceof String ? (String) m29423e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", C9786h.m29358b(this.f24149b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                C9786h.m29361e(this.f24149b).add(skuID);
                                Map<String, JSONObject> m29380d = C9786h.f24124s.m29380d();
                                C9322n.m27780d(skuID, "skuID");
                                m29380d.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f24148a.run();
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                C9322n.m27781e(proxy, "proxy");
                C9322n.m27781e(method, "method");
                if (C9322n.m27777a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        m29383a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return null;
            }
        }
    }

    /* renamed from: o4.h$d */
    /* loaded from: classes.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                C9322n.m27781e(proxy, "proxy");
                C9322n.m27781e(m10, "m");
                return null;
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return null;
            }
        }
    }

    /* renamed from: o4.h$e */
    /* loaded from: classes.dex */
    public final class e implements InvocationHandler {

        /* renamed from: a */
        private Runnable f24150a;

        /* renamed from: b */
        final /* synthetic */ C9786h f24151b;

        public e(C9786h this$0, Runnable runnable) {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(runnable, "runnable");
            this.f24151b = this$0;
            this.f24150a = runnable;
        }

        /* renamed from: a */
        public final void m29384a(List<?> skuDetailsObjectList) {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                C9322n.m27781e(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        C9791m c9791m = C9791m.f24173a;
                        Object m29423e = C9791m.m29423e(C9786h.m29366j(this.f24151b), C9786h.m29360d(this.f24151b), obj, new Object[0]);
                        String str = m29423e instanceof String ? (String) m29423e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                Map<String, JSONObject> m29381e = C9786h.f24124s.m29381e();
                                C9322n.m27780d(skuID, "skuID");
                                m29381e.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f24150a.run();
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                C9322n.m27781e(proxy, "proxy");
                C9322n.m27781e(m10, "m");
                if (C9322n.m27777a(m10.getName(), "onSkuDetailsResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        m29384a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return null;
            }
        }
    }

    private C9786h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C9790l c9790l) {
        this.f24130a = context;
        this.f24131b = obj;
        this.f24132c = cls;
        this.f24133d = cls2;
        this.f24134e = cls3;
        this.f24135f = cls4;
        this.f24136g = cls5;
        this.f24137h = cls6;
        this.f24138i = cls7;
        this.f24139j = method;
        this.f24140k = method2;
        this.f24141l = method3;
        this.f24142m = method4;
        this.f24143n = method5;
        this.f24144o = method6;
        this.f24145p = method7;
        this.f24146q = c9790l;
        this.f24147r = new CopyOnWriteArraySet();
    }

    public /* synthetic */ C9786h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C9790l c9790l, C9315g c9315g) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c9790l);
    }

    /* renamed from: b */
    public static final /* synthetic */ Context m29358b(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24130a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ Method m29359c(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24143n;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ Method m29360d(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24142m;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Set m29361e(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24147r;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ AtomicBoolean m29362f() {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return f24125t;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ C9786h m29363g() {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return f24126u;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ Map m29364h() {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return f24128w;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ Class m29365i(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24136g;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final /* synthetic */ Class m29366j(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return c9786h.f24135f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ Map m29367k() {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return f24129x;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final /* synthetic */ AtomicBoolean m29368l() {
        if (C0033a.m107d(C9786h.class)) {
            return null;
        }
        try {
            return f24127v;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
            return null;
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ void m29369m(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return;
        }
        try {
            f24126u = c9786h;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m29370n(C9786h c9786h) {
        if (C0033a.m107d(C9786h.class)) {
            return;
        }
        try {
            c9786h.m29374t();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m29371q(C9786h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (C0033a.m107d(C9786h.class)) {
            return;
        }
        try {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.m29373s("inapp", new ArrayList(this$0.f24147r), queryPurchaseHistoryRunnable);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9786h.class);
        }
    }

    /* renamed from: r */
    private final void m29372r(String str, Runnable runnable) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f24138i.getClassLoader(), new Class[]{this.f24138i}, new c(this, runnable));
            C9791m c9791m = C9791m.f24173a;
            C9791m.m29423e(this.f24132c, this.f24145p, this.f24131b, str, newProxyInstance);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: s */
    private final void m29373s(String str, List<String> list, Runnable runnable) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f24137h.getClassLoader(), new Class[]{this.f24137h}, new e(this, runnable));
            Object m29415d = this.f24146q.m29415d(str, list);
            C9791m c9791m = C9791m.f24173a;
            C9791m.m29423e(this.f24132c, this.f24144o, this.f24131b, m29415d, newProxyInstance);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: t */
    private final void m29374t() {
        Method m29422d;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Class<?> m29419a = C9791m.m29419a("com.android.billingclient.api.BillingClientStateListener");
            if (m29419a == null || (m29422d = C9791m.m29422d(this.f24132c, "startConnection", m29419a)) == null) {
                return;
            }
            C9791m.m29423e(this.f24132c, m29422d, this.f24131b, Proxy.newProxyInstance(m29419a.getClassLoader(), new Class[]{m29419a}, new a()));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: o */
    public final void m29375o(String skuType, Runnable querySkuRunnable) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(skuType, "skuType");
            C9322n.m27781e(querySkuRunnable, "querySkuRunnable");
            C9791m c9791m = C9791m.f24173a;
            Object m29423e = C9791m.m29423e(this.f24133d, this.f24140k, C9791m.m29423e(this.f24132c, this.f24139j, this.f24131b, "inapp"), new Object[0]);
            List list = m29423e instanceof List ? (List) m29423e : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C9791m c9791m2 = C9791m.f24173a;
                    Object m29423e2 = C9791m.m29423e(this.f24134e, this.f24141l, obj, new Object[0]);
                    String str = m29423e2 instanceof String ? (String) m29423e2 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            Map<String, JSONObject> map = f24128w;
                            C9322n.m27780d(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                m29373s(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: p */
    public final void m29376p(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(skuType, "skuType");
            C9322n.m27781e(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            m29372r(skuType, new Runnable() { // from class: o4.g
                @Override // java.lang.Runnable
                public final void run() {
                    C9786h.m29371q(C9786h.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
