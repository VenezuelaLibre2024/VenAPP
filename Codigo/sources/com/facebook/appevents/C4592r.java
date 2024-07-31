package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import ck.C2037v;
import com.facebook.appevents.C4589o;
import com.facebook.appevents.C4592r;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.facebook.internal.C4639q;
import com.facebook.internal.C4648v;
import com.facebook.internal.C4651y;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import p007a5.C0033a;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7824r;
import p152i4.EnumC7823q0;
import p287p4.C10054a;
import p287p4.C10056c;
import p287p4.C10057d;
import p303q4.C10266f;
import p347s4.C10796c;

/* renamed from: com.facebook.appevents.r */
/* loaded from: classes.dex */
public final class C4592r {

    /* renamed from: c */
    public static final a f8640c = new a(null);

    /* renamed from: d */
    private static final String f8641d;

    /* renamed from: e */
    private static ScheduledThreadPoolExecutor f8642e;

    /* renamed from: f */
    private static C4589o.b f8643f;

    /* renamed from: g */
    private static final Object f8644g;

    /* renamed from: h */
    private static String f8645h;

    /* renamed from: i */
    private static boolean f8646i;

    /* renamed from: j */
    private static String f8647j;

    /* renamed from: a */
    private final String f8648a;

    /* renamed from: b */
    private C4563a f8649b;

    /* renamed from: com.facebook.appevents.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: com.facebook.appevents.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13180a implements C4651y.a {
            C13180a() {
            }

            @Override // com.facebook.internal.C4651y.a
            /* renamed from: a */
            public void mo11096a(String str) {
                C4592r.f8640c.m11095t(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m11081n(Context context, C4592r logger) {
            C9322n.m27781e(context, "$context");
            C9322n.m27781e(logger, "$logger");
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
                logger.m11072o("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m11082o() {
            synchronized (C4592r.m11062e()) {
                if (C4592r.m11059b() != null) {
                    return;
                }
                C4592r.m11066i(new ScheduledThreadPoolExecutor(1));
                C2037v c2037v = C2037v.f8089a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4592r.a.m11083p();
                    }
                };
                ScheduledThreadPoolExecutor m11059b = C4592r.m11059b();
                if (m11059b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                m11059b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static final void m11083p() {
            HashSet hashSet = new HashSet();
            Iterator<C4563a> it = C4587m.m11040p().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m10934b());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C4648v.m11457q((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public final void m11084q(C4569d c4569d, C4563a c4563a) {
            C4587m.m11031g(c4563a, c4569d);
            C4633n c4633n = C4633n.f8754a;
            if (C4633n.m11254g(C4633n.b.OnDevicePostInstallEventProcessing) && C10796c.m32893d()) {
                C10796c.m32894e(c4563a.m10934b(), c4569d);
            }
            if (c4569d.m10945c() || C4592r.m11063f()) {
                return;
            }
            if (C9322n.m27777a(c4569d.m10947f(), "fb_mobile_activate_app")) {
                C4592r.m11064g(true);
            } else {
                C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final void m11085r(String str) {
            C4612c0.f8694e.m11138b(EnumC7823q0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        /* renamed from: f */
        public final void m11086f(Application application, String str) {
            C9322n.m27781e(application, "application");
            if (!C7799e0.m23833F()) {
                throw new C7824r("The Facebook sdk must be initialized before calling activateApp");
            }
            C4567c.m10939d();
            C4586l0.m11020e();
            if (str == null) {
                str = C7799e0.m23861m();
            }
            C7799e0.m23838K(application, str);
            C10266f.m30742x(application, str);
        }

        /* renamed from: g */
        public final void m11087g() {
            if (m11090j() != C4589o.b.EXPLICIT_ONLY) {
                C4587m c4587m = C4587m.f8626a;
                C4587m.m11036l(EnumC4572e0.EAGER_FLUSHING_EVENT);
            }
        }

        /* renamed from: h */
        public final Executor m11088h() {
            if (C4592r.m11059b() == null) {
                m11082o();
            }
            ScheduledThreadPoolExecutor m11059b = C4592r.m11059b();
            if (m11059b != null) {
                return m11059b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: i */
        public final String m11089i(Context context) {
            C9322n.m27781e(context, "context");
            if (C4592r.m11058a() == null) {
                synchronized (C4592r.m11062e()) {
                    if (C4592r.m11058a() == null) {
                        C4592r.m11065h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (C4592r.m11058a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            C9322n.m27780d(randomUUID, "randomUUID()");
                            C4592r.m11065h(C9322n.m27787k("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C4592r.m11058a()).apply();
                        }
                    }
                    C2037v c2037v = C2037v.f8089a;
                }
            }
            String m11058a = C4592r.m11058a();
            if (m11058a != null) {
                return m11058a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: j */
        public final C4589o.b m11090j() {
            C4589o.b m11060c;
            synchronized (C4592r.m11062e()) {
                m11060c = C4592r.m11060c();
            }
            return m11060c;
        }

        /* renamed from: k */
        public final String m11091k() {
            C4651y c4651y = C4651y.f8863a;
            C4651y.m11466d(new C13180a());
            return C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        /* renamed from: l */
        public final String m11092l() {
            String m11061d;
            synchronized (C4592r.m11062e()) {
                m11061d = C4592r.m11061d();
            }
            return m11061d;
        }

        /* renamed from: m */
        public final void m11093m(final Context context, String str) {
            C9322n.m27781e(context, "context");
            if (C7799e0.m23864p()) {
                final C4592r c4592r = new C4592r(context, str, (C7787a) null);
                ScheduledThreadPoolExecutor m11059b = C4592r.m11059b();
                if (m11059b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                m11059b.execute(new Runnable() { // from class: com.facebook.appevents.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4592r.a.m11081n(context, c4592r);
                    }
                });
            }
        }

        /* renamed from: s */
        public final void m11094s() {
            C4587m.m11043s();
        }

        /* renamed from: t */
        public final void m11095t(String str) {
            SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = C4592r.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f8641d = canonicalName;
        f8643f = C4589o.b.AUTO;
        f8644g = new Object();
    }

    public C4592r(Context context, String str, C7787a c7787a) {
        this(C4634n0.m11333u(context), str, c7787a);
    }

    public C4592r(String activityName, String str, C7787a c7787a) {
        C4563a c4563a;
        C9322n.m27781e(activityName, "activityName");
        C4636o0.m11361l();
        this.f8648a = activityName;
        c7787a = c7787a == null ? C7787a.f18552w.m23782e() : c7787a;
        if (c7787a == null || c7787a.m23772o() || !(str == null || C9322n.m27777a(str, c7787a.m23761c()))) {
            if (str == null) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                str = C4634n0.m11278K(C7799e0.m23860l());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c4563a = new C4563a(null, str);
        } else {
            c4563a = new C4563a(c7787a);
        }
        this.f8649b = c4563a;
        f8640c.m11082o();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m11058a() {
        if (C0033a.m107d(C4592r.class)) {
            return null;
        }
        try {
            return f8645h;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m11059b() {
        if (C0033a.m107d(C4592r.class)) {
            return null;
        }
        try {
            return f8642e;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C4589o.b m11060c() {
        if (C0033a.m107d(C4592r.class)) {
            return null;
        }
        try {
            return f8643f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m11061d() {
        if (C0033a.m107d(C4592r.class)) {
            return null;
        }
        try {
            return f8647j;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m11062e() {
        if (C0033a.m107d(C4592r.class)) {
            return null;
        }
        try {
            return f8644g;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m11063f() {
        if (C0033a.m107d(C4592r.class)) {
            return false;
        }
        try {
            return f8646i;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m11064g(boolean z10) {
        if (C0033a.m107d(C4592r.class)) {
            return;
        }
        try {
            f8646i = z10;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m11065h(String str) {
        if (C0033a.m107d(C4592r.class)) {
            return;
        }
        try {
            f8645h = str;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m11066i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (C0033a.m107d(C4592r.class)) {
            return;
        }
        try {
            f8642e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4592r.class);
        }
    }

    /* renamed from: j */
    public final void m11067j() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4587m c4587m = C4587m.f8626a;
            C4587m.m11036l(EnumC4572e0.EXPLICIT);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: k */
    public final void m11068k(String str, double d10, Bundle bundle) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m11070m(str, Double.valueOf(d10), bundle, false, C10266f.m30731m());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: l */
    public final void m11069l(String str, Bundle bundle) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m11070m(str, null, bundle, false, C10266f.m30731m());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: m */
    public final void m11070m(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (C0033a.m107d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            C4639q c4639q = C4639q.f8777a;
            if (C4639q.m11365d("app_events_killswitch", C7799e0.m23861m(), false)) {
                C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            if (C10054a.m29974b(str)) {
                return;
            }
            try {
                C10056c.m29987h(bundle, str);
                C10057d.m29993e(bundle);
                f8640c.m11084q(new C4569d(this.f8648a, str, d10, bundle, z10, C10266f.m30733o(), uuid), this.f8649b);
            } catch (C7824r e10) {
                C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e10.toString());
            } catch (JSONException e11) {
                C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: n */
    public final void m11071n(String str, String str2) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            m11069l(str, bundle);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: o */
    public final void m11072o(String str, Double d10, Bundle bundle) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m11070m(str, d10, bundle, true, C10266f.m30731m());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: p */
    public final void m11073p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11314k0(f8641d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m11070m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C10266f.m30731m());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: q */
    public final void m11074q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f8640c.m11085r("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f8640c.m11085r("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m11070m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, C10266f.m30731m());
            f8640c.m11087g();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: r */
    public final void m11075r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m11074q(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
