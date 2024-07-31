package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f16927a = new c1();

    /* renamed from: b, reason: collision with root package name */
    private static final String f16928b = c1.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f16929c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f16930d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private static final a f16931e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f, reason: collision with root package name */
    private static final a f16932f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g, reason: collision with root package name */
    private static final a f16933g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h, reason: collision with root package name */
    private static final a f16934h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i, reason: collision with root package name */
    private static final a f16935i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j, reason: collision with root package name */
    private static SharedPreferences f16936j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16937a;

        /* renamed from: b, reason: collision with root package name */
        private String f16938b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f16939c;

        /* renamed from: d, reason: collision with root package name */
        private long f16940d;

        public a(boolean z10, String key) {
            kotlin.jvm.internal.n.e(key, "key");
            this.f16937a = z10;
            this.f16938b = key;
        }

        public final boolean a() {
            return this.f16937a;
        }

        public final String b() {
            return this.f16938b;
        }

        public final long c() {
            return this.f16940d;
        }

        public final Boolean d() {
            return this.f16939c;
        }

        public final boolean e() {
            Boolean bool = this.f16939c;
            return bool == null ? this.f16937a : bool.booleanValue();
        }

        public final void f(long j10) {
            this.f16940d = j10;
        }

        public final void g(Boolean bool) {
            this.f16939c = bool;
        }
    }

    private c1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0008, B:8:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:21:0x003d, B:23:0x0042, B:25:0x0047), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0008, B:8:0x000f, B:13:0x001b, B:15:0x0022, B:17:0x0034, B:21:0x003d, B:23:0x0042, B:25:0x0047), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean b() {
        /*
            r5 = this;
            boolean r0 = a5.a.d(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Map r0 = com.facebook.internal.v.g()     // Catch: java.lang.Throwable -> L4c
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
            i4.c1$a r0 = i4.c1.f16932f     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            return r0
        L22:
            java.lang.String r3 = "auto_log_app_events_enabled"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "auto_log_app_events_default"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L47
            java.lang.Boolean r3 = r5.c()     // Catch: java.lang.Throwable -> L4c
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
            a5.a.b(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.c1.b():boolean");
    }

    private final Boolean c() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            Boolean q10 = q();
            if (q10 != null) {
                return Boolean.valueOf(q10.booleanValue());
            }
            Boolean l10 = l();
            if (l10 == null) {
                return null;
            }
            return Boolean.valueOf(l10.booleanValue());
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final boolean d() {
        if (a5.a.d(c1.class)) {
            return false;
        }
        try {
            f16927a.j();
            return f16933g.e();
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
            return false;
        }
    }

    public static final boolean e() {
        if (a5.a.d(c1.class)) {
            return false;
        }
        try {
            f16927a.j();
            return f16931e.e();
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
            return false;
        }
    }

    public static final boolean f() {
        if (a5.a.d(c1.class)) {
            return false;
        }
        try {
            c1 c1Var = f16927a;
            c1Var.j();
            return c1Var.b();
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
            return false;
        }
    }

    public static final boolean g() {
        if (a5.a.d(c1.class)) {
            return false;
        }
        try {
            f16927a.j();
            return f16934h.e();
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
            return false;
        }
    }

    private final void h() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            a aVar = f16934h;
            r(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f16930d.compareAndSet(false, true)) {
                    e0.t().execute(new Runnable() { // from class: i4.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1.i(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(long j10) {
        if (a5.a.d(c1.class)) {
            return;
        }
        try {
            if (f16933g.e()) {
                com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
                com.facebook.internal.r q10 = com.facebook.internal.v.q(e0.m(), false);
                if (q10 != null && q10.c()) {
                    com.facebook.internal.a e10 = com.facebook.internal.a.f7697f.e(e0.l());
                    String h10 = (e10 == null || e10.h() == null) ? null : e10.h();
                    if (h10 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h10);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        i0 x10 = i0.f17005n.x(null, "app", null);
                        x10.H(bundle);
                        JSONObject c10 = x10.k().c();
                        if (c10 != null) {
                            a aVar = f16934h;
                            aVar.g(Boolean.valueOf(c10.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j10);
                            f16927a.t(aVar);
                        }
                    }
                }
            }
            f16930d.set(false);
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
        }
    }

    private final void j() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (e0.F() && f16929c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = e0.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                kotlin.jvm.internal.n.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f16936j = sharedPreferences;
                k(f16932f, f16933g, f16931e);
                h();
                p();
                o();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void k(a... aVarArr) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            int length = aVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = aVarArr[i10];
                i10++;
                if (aVar == f16934h) {
                    h();
                } else if (aVar.d() == null) {
                    r(aVar);
                    if (aVar.d() == null) {
                        m(aVar);
                    }
                } else {
                    t(aVar);
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final Boolean l() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            s();
            try {
                Context l10 = e0.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
                kotlin.jvm.internal.n.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f16932f;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.j0(f16928b, e10);
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final void m(a aVar) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                Context l10 = e0.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
                kotlin.jvm.internal.n.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            } catch (PackageManager.NameNotFoundException e10) {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.j0(f16928b, e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void n() {
        if (a5.a.d(c1.class)) {
            return;
        }
        try {
            Context l10 = e0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
            kotlin.jvm.internal.n.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.h0 h0Var = new com.facebook.appevents.h0(l10);
            Bundle bundle2 = new Bundle();
            if (!com.facebook.internal.n0.V()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f16928b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            h0Var.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
        }
    }

    private final void o() {
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (f16929c.get() && e0.F()) {
                Context l10 = e0.l();
                int i12 = 0;
                int i13 = ((f16931e.e() ? 1 : 0) << 0) | 0 | ((f16932f.e() ? 1 : 0) << 1) | ((f16933g.e() ? 1 : 0) << 2) | ((f16935i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f16936j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.p("userSettingPref");
                    throw null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = f16936j;
                    if (sharedPreferences2 == null) {
                        kotlin.jvm.internal.n.p("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
                        kotlin.jvm.internal.n.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i10 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i11 = 0;
                        com.facebook.appevents.h0 h0Var = new com.facebook.appevents.h0(l10);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i12);
                        bundle.putInt("initial", i11);
                        bundle.putInt("previous", i14);
                        bundle.putInt("current", i13);
                        h0Var.b(bundle);
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
                            com.facebook.appevents.h0 h0Var2 = new com.facebook.appevents.h0(l10);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i12);
                            bundle2.putInt("initial", i11);
                            bundle2.putInt("previous", i14);
                            bundle2.putInt("current", i13);
                            h0Var2.b(bundle2);
                        }
                    }
                    i12 = i10;
                    com.facebook.appevents.h0 h0Var22 = new com.facebook.appevents.h0(l10);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i12);
                    bundle22.putInt("initial", i11);
                    bundle22.putInt("previous", i14);
                    bundle22.putInt("current", i13);
                    h0Var22.b(bundle22);
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void p() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Context l10 = e0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
            kotlin.jvm.internal.n.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f16928b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (d()) {
                    return;
                }
                Log.w(f16928b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private static final Boolean q() {
        SharedPreferences sharedPreferences;
        String str = "";
        if (a5.a.d(c1.class)) {
            return null;
        }
        try {
            f16927a.s();
            try {
                sharedPreferences = f16936j;
            } catch (JSONException e10) {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.j0(f16928b, e10);
            }
            if (sharedPreferences == null) {
                kotlin.jvm.internal.n.p("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(f16932f.b(), "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, c1.class);
            return null;
        }
    }

    private final void r(a aVar) {
        String str = "";
        if (a5.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                SharedPreferences sharedPreferences = f16936j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.p("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.j0(f16928b, e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void s() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (f16929c.get()) {
            } else {
                throw new f0("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void t(a aVar) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f16936j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.n.p("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                o();
            } catch (Exception e10) {
                com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
                com.facebook.internal.n0.j0(f16928b, e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
