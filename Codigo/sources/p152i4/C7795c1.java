package p152i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.C4578h0;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;

/* renamed from: i4.c1 */
/* loaded from: classes.dex */
public final class C7795c1 {

    /* renamed from: a */
    public static final C7795c1 f18580a = new C7795c1();

    /* renamed from: b */
    private static final String f18581b = C7795c1.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f18582c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final AtomicBoolean f18583d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final a f18584e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f */
    private static final a f18585f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g */
    private static final a f18586g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h */
    private static final a f18587h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i */
    private static final a f18588i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j */
    private static SharedPreferences f18589j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.c1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f18590a;

        /* renamed from: b */
        private String f18591b;

        /* renamed from: c */
        private Boolean f18592c;

        /* renamed from: d */
        private long f18593d;

        public a(boolean z10, String key) {
            C9322n.m27781e(key, "key");
            this.f18590a = z10;
            this.f18591b = key;
        }

        /* renamed from: a */
        public final boolean m23821a() {
            return this.f18590a;
        }

        /* renamed from: b */
        public final String m23822b() {
            return this.f18591b;
        }

        /* renamed from: c */
        public final long m23823c() {
            return this.f18593d;
        }

        /* renamed from: d */
        public final Boolean m23824d() {
            return this.f18592c;
        }

        /* renamed from: e */
        public final boolean m23825e() {
            Boolean bool = this.f18592c;
            return bool == null ? this.f18590a : bool.booleanValue();
        }

        /* renamed from: f */
        public final void m23826f(long j10) {
            this.f18593d = j10;
        }

        /* renamed from: g */
        public final void m23827g(Boolean bool) {
            this.f18592c = bool;
        }
    }

    private C7795c1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0008, B:8:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:21:0x003d, B:23:0x0042, B:25:0x0047), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0008, B:8:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:21:0x003d, B:23:0x0042, B:25:0x0047), top: B:5:0x0008 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m23802b() {
        /*
            r5 = this;
            boolean r0 = p007a5.C0033a.m107d(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Map r0 = com.facebook.internal.C4648v.m11448g()     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            if (r0 == 0) goto L18
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L16
            goto L18
        L16:
            r3 = r1
            goto L19
        L18:
            r3 = r2
        L19:
            if (r3 == 0) goto L22
            i4.c1$a r0 = p152i4.C7795c1.f18585f     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.m23825e()     // Catch: java.lang.Throwable -> L4c
            return r0
        L22:
            java.lang.String r3 = "auto_log_app_events_enabled"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "auto_log_app_events_default"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L47
            java.lang.Boolean r3 = r5.m23803c()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L42
            if (r0 != 0) goto L3d
            return r2
        L3d:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            return r0
        L42:
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            return r0
        L47:
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            return r0
        L4c:
            r0 = move-exception
            p007a5.C0033a.m105b(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7795c1.m23802b():boolean");
    }

    /* renamed from: c */
    private final Boolean m23803c() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Boolean m23817q = m23817q();
            if (m23817q != null) {
                return Boolean.valueOf(m23817q.booleanValue());
            }
            Boolean m23812l = m23812l();
            if (m23812l == null) {
                return null;
            }
            return Boolean.valueOf(m23812l.booleanValue());
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public static final boolean m23804d() {
        if (C0033a.m107d(C7795c1.class)) {
            return false;
        }
        try {
            f18580a.m23810j();
            return f18586g.m23825e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m23805e() {
        if (C0033a.m107d(C7795c1.class)) {
            return false;
        }
        try {
            f18580a.m23810j();
            return f18584e.m23825e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m23806f() {
        if (C0033a.m107d(C7795c1.class)) {
            return false;
        }
        try {
            C7795c1 c7795c1 = f18580a;
            c7795c1.m23810j();
            return c7795c1.m23802b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m23807g() {
        if (C0033a.m107d(C7795c1.class)) {
            return false;
        }
        try {
            f18580a.m23810j();
            return f18587h.m23825e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
            return false;
        }
    }

    /* renamed from: h */
    private final void m23808h() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            a aVar = f18587h;
            m23818r(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.m23824d() == null || currentTimeMillis - aVar.m23823c() >= 604800000) {
                aVar.m23827g(null);
                aVar.m23826f(0L);
                if (f18583d.compareAndSet(false, true)) {
                    C7799e0.m23868t().execute(new Runnable() { // from class: i4.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7795c1.m23809i(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m23809i(long j10) {
        if (C0033a.m107d(C7795c1.class)) {
            return;
        }
        try {
            if (f18586g.m23825e()) {
                C4648v c4648v = C4648v.f8854a;
                C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
                if (m11457q != null && m11457q.m11377c()) {
                    C4607a m11114e = C4607a.f8672f.m11114e(C7799e0.m23860l());
                    String m11104h = (m11114e == null || m11114e.m11104h() == null) ? null : m11114e.m11104h();
                    if (m11104h != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", m11104h);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        C7807i0 m24001x = C7807i0.f18658n.m24001x(null, "app", null);
                        m24001x.m23947H(bundle);
                        JSONObject m24062c = m24001x.m23949k().m24062c();
                        if (m24062c != null) {
                            a aVar = f18587h;
                            aVar.m23827g(Boolean.valueOf(m24062c.optBoolean("auto_event_setup_enabled", false)));
                            aVar.m23826f(j10);
                            f18580a.m23820t(aVar);
                        }
                    }
                }
            }
            f18583d.set(false);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
        }
    }

    /* renamed from: j */
    private final void m23810j() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C7799e0.m23833F() && f18582c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                C9322n.m27780d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f18589j = sharedPreferences;
                m23811k(f18585f, f18586g, f18584e);
                m23808h();
                m23816p();
                m23815o();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: k */
    private final void m23811k(a... aVarArr) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            int length = aVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = aVarArr[i10];
                i10++;
                if (aVar == f18587h) {
                    m23808h();
                } else if (aVar.m23824d() == null) {
                    m23818r(aVar);
                    if (aVar.m23824d() == null) {
                        m23813m(aVar);
                    }
                } else {
                    m23820t(aVar);
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: l */
    private final Boolean m23812l() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            m23819s();
            try {
                Context m23860l = C7799e0.m23860l();
                ApplicationInfo applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
                C9322n.m27780d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f18585f;
                    if (bundle.containsKey(aVar.m23822b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.m23822b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f18581b, e10);
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: m */
    private final void m23813m(a aVar) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m23819s();
            try {
                Context m23860l = C7799e0.m23860l();
                ApplicationInfo applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
                C9322n.m27780d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.m23822b())) {
                    return;
                }
                aVar.m23827g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.m23822b(), aVar.m23821a())));
            } catch (PackageManager.NameNotFoundException e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f18581b, e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: n */
    public static final void m23814n() {
        if (C0033a.m107d(C7795c1.class)) {
            return;
        }
        try {
            Context m23860l = C7799e0.m23860l();
            ApplicationInfo applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
            C9322n.m27780d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            C4578h0 c4578h0 = new C4578h0(m23860l);
            Bundle bundle2 = new Bundle();
            if (!C4634n0.m11288V()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f18581b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c4578h0.m10996d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
        }
    }

    /* renamed from: o */
    private final void m23815o() {
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (f18582c.get() && C7799e0.m23833F()) {
                Context m23860l = C7799e0.m23860l();
                int i12 = 0;
                int i13 = ((f18584e.m23825e() ? 1 : 0) << 0) | 0 | ((f18585f.m23825e() ? 1 : 0) << 1) | ((f18586g.m23825e() ? 1 : 0) << 2) | ((f18588i.m23825e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f18589j;
                if (sharedPreferences == null) {
                    C9322n.m27792p("userSettingPref");
                    throw null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = f18589j;
                    if (sharedPreferences2 == null) {
                        C9322n.m27792p("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
                        C9322n.m27780d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i10 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i11 = 0;
                        C4578h0 c4578h0 = new C4578h0(m23860l);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i12);
                        bundle.putInt("initial", i11);
                        bundle.putInt("previous", i14);
                        bundle.putInt("current", i13);
                        c4578h0.m10994b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    int i15 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        try {
                            i10 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                            i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                            if (i16 > 3) {
                                break;
                            } else {
                                i15 = i16;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i12 = i11;
                            i11 = i12;
                            i12 = i10;
                            C4578h0 c4578h02 = new C4578h0(m23860l);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i12);
                            bundle2.putInt("initial", i11);
                            bundle2.putInt("previous", i14);
                            bundle2.putInt("current", i13);
                            c4578h02.m10994b(bundle2);
                        }
                    }
                    i12 = i10;
                    C4578h0 c4578h022 = new C4578h0(m23860l);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i12);
                    bundle22.putInt("initial", i11);
                    bundle22.putInt("previous", i14);
                    bundle22.putInt("current", i13);
                    c4578h022.m10994b(bundle22);
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: p */
    private final void m23816p() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Context m23860l = C7799e0.m23860l();
            ApplicationInfo applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
            C9322n.m27780d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f18581b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (m23804d()) {
                    return;
                }
                Log.w(f18581b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: q */
    private static final Boolean m23817q() {
        SharedPreferences sharedPreferences;
        String str = "";
        if (C0033a.m107d(C7795c1.class)) {
            return null;
        }
        try {
            f18580a.m23819s();
            try {
                sharedPreferences = f18589j;
            } catch (JSONException e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f18581b, e10);
            }
            if (sharedPreferences == null) {
                C9322n.m27792p("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(f18585f.m23822b(), "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7795c1.class);
            return null;
        }
    }

    /* renamed from: r */
    private final void m23818r(a aVar) {
        String str = "";
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m23819s();
            try {
                SharedPreferences sharedPreferences = f18589j;
                if (sharedPreferences == null) {
                    C9322n.m27792p("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.m23822b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.m23827g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.m23826f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f18581b, e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: s */
    private final void m23819s() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (f18582c.get()) {
            } else {
                throw new C7801f0("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: t */
    private final void m23820t(a aVar) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m23819s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.m23824d());
                jSONObject.put("last_timestamp", aVar.m23823c());
                SharedPreferences sharedPreferences = f18589j;
                if (sharedPreferences == null) {
                    C9322n.m27792p("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.m23822b(), jSONObject.toString()).apply();
                m23815o();
            } catch (Exception e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f18581b, e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
