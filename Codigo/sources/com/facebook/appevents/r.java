package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.appevents.o;
import com.facebook.appevents.r;
import com.facebook.internal.n;
import com.facebook.internal.n0;
import com.facebook.internal.o0;
import com.facebook.internal.y;
import i4.q0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c */
    public static final a f7665c = new a(null);

    /* renamed from: d */
    private static final String f7666d;

    /* renamed from: e */
    private static ScheduledThreadPoolExecutor f7667e;

    /* renamed from: f */
    private static o.b f7668f;

    /* renamed from: g */
    private static final Object f7669g;

    /* renamed from: h */
    private static String f7670h;

    /* renamed from: i */
    private static boolean f7671i;

    /* renamed from: j */
    private static String f7672j;

    /* renamed from: a */
    private final String f7673a;

    /* renamed from: b */
    private com.facebook.appevents.a f7674b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: com.facebook.appevents.r$a$a */
        /* loaded from: classes.dex */
        public static final class C0134a implements y.a {
            C0134a() {
            }

            @Override // com.facebook.internal.y.a
            public void a(String str) {
                r.f7665c.t(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final void n(Context context, r logger) {
            kotlin.jvm.internal.n.e(context, "$context");
            kotlin.jvm.internal.n.e(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                } else {
                    i10 = i12;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                logger.o("fb_sdk_initialize", null, bundle);
            }
        }

        public final void o() {
            synchronized (r.e()) {
                if (r.b() != null) {
                    return;
                }
                r.i(new ScheduledThreadPoolExecutor(1));
                ck.v vVar = ck.v.f7137a;
                p pVar = new Runnable() { // from class: com.facebook.appevents.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.p();
                    }
                };
                ScheduledThreadPoolExecutor b10 = r.b();
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b10.scheduleAtFixedRate(pVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        public static final void p() {
            HashSet hashSet = new HashSet();
            Iterator<com.facebook.appevents.a> it = m.p().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().b());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                com.facebook.internal.v.q((String) it2.next(), true);
            }
        }

        public final void q(d dVar, com.facebook.appevents.a aVar) {
            m.g(aVar, dVar);
            com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
            if (com.facebook.internal.n.g(n.b.OnDevicePostInstallEventProcessing) && s4.c.d()) {
                s4.c.e(aVar.b(), dVar);
            }
            if (dVar.c() || r.f()) {
                return;
            }
            if (kotlin.jvm.internal.n.a(dVar.f(), "fb_mobile_activate_app")) {
                r.g(true);
            } else {
                com.facebook.internal.c0.f7719e.b(q0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public final void r(String str) {
            com.facebook.internal.c0.f7719e.b(q0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void f(Application application, String str) {
            kotlin.jvm.internal.n.e(application, "application");
            if (!i4.e0.F()) {
                throw new i4.r("The Facebook sdk must be initialized before calling activateApp");
            }
            c.d();
            l0.e();
            if (str == null) {
                str = i4.e0.m();
            }
            i4.e0.K(application, str);
            q4.f.x(application, str);
        }

        public final void g() {
            if (j() != o.b.EXPLICIT_ONLY) {
                m mVar = m.f7651a;
                m.l(e0.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor h() {
            if (r.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor b10 = r.b();
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String i(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            if (r.a() == null) {
                synchronized (r.e()) {
                    if (r.a() == null) {
                        r.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (r.a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            kotlin.jvm.internal.n.d(randomUUID, "randomUUID()");
                            r.h(kotlin.jvm.internal.n.k("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", r.a()).apply();
                        }
                    }
                    ck.v vVar = ck.v.f7137a;
                }
            }
            String a10 = r.a();
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final o.b j() {
            o.b c10;
            synchronized (r.e()) {
                c10 = r.c();
            }
            return c10;
        }

        public final String k() {
            com.facebook.internal.y yVar = com.facebook.internal.y.f7883a;
            com.facebook.internal.y.d(new C0134a());
            return i4.e0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            String d10;
            synchronized (r.e()) {
                d10 = r.d();
            }
            return d10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.appevents.q.<init>(android.content.Context, com.facebook.appevents.r):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        public final void m(android.content.Context r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.n.e(r3, r0)
                boolean r0 = i4.e0.p()
                if (r0 != 0) goto Lc
                return
            Lc:
                com.facebook.appevents.r r0 = new com.facebook.appevents.r
                r1 = 0
                r0.<init>(r3, r4, r1)
                java.util.concurrent.ScheduledThreadPoolExecutor r4 = com.facebook.appevents.r.b()
                if (r4 == 0) goto L21
                com.facebook.appevents.q r1 = new com.facebook.appevents.q
                r1.<init>()
                r4.execute(r1)
                return
            L21:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Required value was null."
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.r.a.m(android.content.Context, java.lang.String):void");
        }

        public final void s() {
            m.s();
        }

        public final void t(String str) {
            SharedPreferences sharedPreferences = i4.e0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = r.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f7666d = canonicalName;
        f7668f = o.b.AUTO;
        f7669g = new Object();
    }

    public r(Context context, String str, i4.a aVar) {
        this(n0.u(context), str, aVar);
    }

    public r(String activityName, String str, i4.a aVar) {
        com.facebook.appevents.a aVar2;
        kotlin.jvm.internal.n.e(activityName, "activityName");
        o0.l();
        this.f7673a = activityName;
        aVar = aVar == null ? i4.a.f16899w.e() : aVar;
        if (aVar == null || aVar.o() || !(str == null || kotlin.jvm.internal.n.a(str, aVar.c()))) {
            if (str == null) {
                n0 n0Var = n0.f7780a;
                str = n0.K(i4.e0.l());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            aVar2 = new com.facebook.appevents.a(null, str);
        } else {
            aVar2 = new com.facebook.appevents.a(aVar);
        }
        this.f7674b = aVar2;
        f7665c.o();
    }

    public static final /* synthetic */ String a() {
        if (a5.a.d(r.class)) {
            return null;
        }
        try {
            return f7670h;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (a5.a.d(r.class)) {
            return null;
        }
        try {
            return f7667e;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ o.b c() {
        if (a5.a.d(r.class)) {
            return null;
        }
        try {
            return f7668f;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (a5.a.d(r.class)) {
            return null;
        }
        try {
            return f7672j;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (a5.a.d(r.class)) {
            return null;
        }
        try {
            return f7669g;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (a5.a.d(r.class)) {
            return false;
        }
        try {
            return f7671i;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        if (a5.a.d(r.class)) {
            return;
        }
        try {
            f7671i = z10;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (a5.a.d(r.class)) {
            return;
        }
        try {
            f7670h = str;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (a5.a.d(r.class)) {
            return;
        }
        try {
            f7667e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            a5.a.b(th2, r.class);
        }
    }

    public final void j() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            m mVar = m.f7651a;
            m.l(e0.EXPLICIT);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void k(String str, double d10, Bundle bundle) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            m(str, Double.valueOf(d10), bundle, false, q4.f.m());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void l(String str, Bundle bundle) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            m(str, null, bundle, false, q4.f.m());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void m(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (a5.a.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            com.facebook.internal.q qVar = com.facebook.internal.q.f7797a;
            if (com.facebook.internal.q.d("app_events_killswitch", i4.e0.m(), false)) {
                com.facebook.internal.c0.f7719e.c(q0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            if (p4.a.b(str)) {
                return;
            }
            try {
                p4.c.h(bundle, str);
                p4.d.e(bundle);
                f7665c.q(new d(this.f7673a, str, d10, bundle, z10, q4.f.o(), uuid), this.f7674b);
            } catch (i4.r e10) {
                com.facebook.internal.c0.f7719e.c(q0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e10.toString());
            } catch (JSONException e11) {
                com.facebook.internal.c0.f7719e.c(q0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void n(String str, String str2) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void o(String str, Double d10, Bundle bundle) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            m(str, d10, bundle, true, q4.f.m());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                n0 n0Var = n0.f7780a;
                n0.k0(f7666d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, q4.f.m());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f7665c.r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f7665c.r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, q4.f.m());
            f7665c.g();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            q(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
