package i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.appevents.o;
import com.facebook.internal.c0;
import com.facebook.internal.n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.i0;
import i4.s0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import q4.h;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public static final e0 f16948a = new e0();

    /* renamed from: b */
    private static final String f16949b = e0.class.getCanonicalName();

    /* renamed from: c */
    private static final HashSet<q0> f16950c;

    /* renamed from: d */
    private static Executor f16951d;

    /* renamed from: e */
    private static volatile String f16952e;

    /* renamed from: f */
    private static volatile String f16953f;

    /* renamed from: g */
    private static volatile String f16954g;

    /* renamed from: h */
    private static volatile Boolean f16955h;

    /* renamed from: i */
    private static AtomicLong f16956i;

    /* renamed from: j */
    private static volatile boolean f16957j;

    /* renamed from: k */
    private static boolean f16958k;

    /* renamed from: l */
    private static com.facebook.internal.b0<File> f16959l;

    /* renamed from: m */
    private static Context f16960m;

    /* renamed from: n */
    private static int f16961n;

    /* renamed from: o */
    private static final ReentrantLock f16962o;

    /* renamed from: p */
    private static String f16963p;

    /* renamed from: q */
    public static boolean f16964q;

    /* renamed from: r */
    public static boolean f16965r;

    /* renamed from: s */
    public static boolean f16966s;

    /* renamed from: t */
    private static final AtomicBoolean f16967t;

    /* renamed from: u */
    private static volatile String f16968u;

    /* renamed from: v */
    private static volatile String f16969v;

    /* renamed from: w */
    private static a f16970w;

    /* renamed from: x */
    private static boolean f16971x;

    /* loaded from: classes.dex */
    public interface a {
        i0 a(i4.a aVar, String str, JSONObject jSONObject, i0.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    static {
        HashSet<q0> f10;
        f10 = dk.q0.f(q0.DEVELOPER_ERRORS);
        f16950c = f10;
        f16956i = new AtomicLong(65536L);
        f16961n = 64206;
        f16962o = new ReentrantLock();
        f16963p = com.facebook.internal.h0.a();
        f16967t = new AtomicBoolean(false);
        f16968u = "instagram.com";
        f16969v = Constants.SIGN_IN_METHOD_FACEBOOK;
        f16970w = new a() { // from class: i4.c0
            @Override // i4.e0.a
            public final i0 a(a aVar, String str, JSONObject jSONObject, i0.b bVar) {
                i0 C;
                C = e0.C(aVar, str, jSONObject, bVar);
                return C;
            }
        };
    }

    private e0() {
    }

    public static final long A() {
        com.facebook.internal.o0.l();
        return f16956i.get();
    }

    public static final String B() {
        return "17.0.0";
    }

    public static final i0 C(i4.a aVar, String str, JSONObject jSONObject, i0.b bVar) {
        return i0.f17005n.A(aVar, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f16957j;
    }

    public static final synchronized boolean E() {
        boolean z10;
        synchronized (e0.class) {
            z10 = f16971x;
        }
        return z10;
    }

    public static final boolean F() {
        return f16967t.get();
    }

    public static final boolean G() {
        return f16958k;
    }

    public static final boolean H(q0 behavior) {
        boolean z10;
        kotlin.jvm.internal.n.e(behavior, "behavior");
        HashSet<q0> hashSet = f16950c;
        synchronized (hashSet) {
            if (D()) {
                z10 = hashSet.contains(behavior);
            }
        }
        return z10;
    }

    public static final void I(Context context) {
        boolean E;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
            kotlin.jvm.internal.n.d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f16952e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.n.d(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.n.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    E = xk.p.E(lowerCase, "fb", false, 2, null);
                    if (E) {
                        str = str.substring(2);
                        kotlin.jvm.internal.n.d(str, "(this as java.lang.String).substring(startIndex)");
                    }
                    f16952e = str;
                } else if (obj instanceof Number) {
                    throw new r("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f16953f == null) {
                f16953f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f16954g == null) {
                f16954g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f16961n == 64206) {
                f16961n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f16955h == null) {
                f16955h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void J(Context context, String str) {
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                com.facebook.internal.a e10 = com.facebook.internal.a.f7697f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String k10 = kotlin.jvm.internal.n.k(str, "ping");
                long j10 = sharedPreferences.getLong(k10, 0L);
                try {
                    q4.h hVar = q4.h.f23522a;
                    JSONObject a10 = q4.h.a(h.a.MOBILE_INSTALL_EVENT, e10, com.facebook.appevents.o.f7660b.b(context), z(context), context);
                    kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                    i0 a11 = f16970w.a(null, format, a10, null);
                    if (j10 == 0 && a11.k().b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(k10, System.currentTimeMillis());
                        edit.apply();
                        c0.a aVar = com.facebook.internal.c0.f7719e;
                        q0 q0Var = q0.APP_EVENTS;
                        String TAG = f16949b;
                        kotlin.jvm.internal.n.d(TAG, "TAG");
                        aVar.b(q0Var, TAG, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e11) {
                    throw new r("An error occurred while publishing install.", e11);
                }
            } catch (Exception e12) {
                com.facebook.internal.n0.j0("Facebook-publish", e12);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void K(Context context, String applicationId) {
        if (a5.a.d(e0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(applicationId, "applicationId");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            com.facebook.internal.q qVar = com.facebook.internal.q.f7797a;
            if (!com.facebook.internal.q.d("app_events_killswitch", m(), false)) {
                t().execute(new Runnable() { // from class: i4.d0

                    /* renamed from: a */
                    public final /* synthetic */ Context f16945a;

                    /* renamed from: b */
                    public final /* synthetic */ String f16946b;

                    public /* synthetic */ d0(Context applicationContext2, String applicationId2) {
                        r1 = applicationContext2;
                        r2 = applicationId2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.L(r1, r2);
                    }
                });
            }
            com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
            if (com.facebook.internal.n.g(n.b.OnDeviceEventProcessing) && s4.c.d()) {
                s4.c.g(applicationId2, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e0.class);
        }
    }

    public static final void L(Context applicationContext, String applicationId) {
        kotlin.jvm.internal.n.e(applicationContext, "$applicationContext");
        kotlin.jvm.internal.n.e(applicationId, "$applicationId");
        f16948a.J(applicationContext, applicationId);
    }

    public static final synchronized void M(Context applicationContext) {
        synchronized (e0.class) {
            kotlin.jvm.internal.n.e(applicationContext, "applicationContext");
            N(applicationContext, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0107, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:13:0x0019, B:15:0x0034, B:17:0x003c, B:22:0x0048, B:24:0x004c, B:27:0x0055, B:29:0x005e, B:30:0x0061, B:32:0x0065, B:34:0x0069, B:36:0x006f, B:38:0x0075, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:43:0x008f, B:46:0x00e5, B:47:0x00ea, B:48:0x00eb, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:53:0x00f9, B:54:0x0100, B:56:0x0101, B:57:0x0106), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[Catch: all -> 0x0107, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:13:0x0019, B:15:0x0034, B:17:0x003c, B:22:0x0048, B:24:0x004c, B:27:0x0055, B:29:0x005e, B:30:0x0061, B:32:0x0065, B:34:0x0069, B:36:0x006f, B:38:0x0075, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:43:0x008f, B:46:0x00e5, B:47:0x00ea, B:48:0x00eb, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:53:0x00f9, B:54:0x0100, B:56:0x0101, B:57:0x0106), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void N(android.content.Context r5, i4.e0.b r6) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e0.N(android.content.Context, i4.e0$b):void");
    }

    public static final File O() {
        Context context = f16960m;
        if (context != null) {
            return context.getCacheDir();
        }
        kotlin.jvm.internal.n.p("applicationContext");
        throw null;
    }

    public static final void P(boolean z10) {
        if (z10) {
            x4.g.d();
        }
    }

    public static final void Q(boolean z10) {
        if (z10) {
            com.facebook.appevents.d0.a();
        }
    }

    public static final void R(boolean z10) {
        if (z10) {
            f16964q = true;
        }
    }

    public static final void S(boolean z10) {
        if (z10) {
            f16965r = true;
        }
    }

    public static final void T(boolean z10) {
        if (z10) {
            f16966s = true;
        }
    }

    public static final Void U(b bVar) {
        g.f16980f.e().j();
        u0.f17122d.a().d();
        if (i4.a.f16899w.g()) {
            s0.b bVar2 = s0.f17093s;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        o.a aVar = com.facebook.appevents.o.f7660b;
        aVar.e(l(), f16952e);
        c1.n();
        Context applicationContext = l().getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "getApplicationContext().applicationContext");
        aVar.f(applicationContext).a();
        return null;
    }

    public static final void j() {
        f16971x = true;
    }

    public static final boolean k() {
        return c1.d();
    }

    public static final Context l() {
        com.facebook.internal.o0.l();
        Context context = f16960m;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.n.p("applicationContext");
        throw null;
    }

    public static final String m() {
        com.facebook.internal.o0.l();
        String str = f16952e;
        if (str != null) {
            return str;
        }
        throw new r("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        com.facebook.internal.o0.l();
        return f16953f;
    }

    public static final boolean o() {
        return c1.e();
    }

    public static final boolean p() {
        return c1.f();
    }

    public static final int q() {
        com.facebook.internal.o0.l();
        return f16961n;
    }

    public static final String r() {
        com.facebook.internal.o0.l();
        String str = f16954g;
        if (str != null) {
            return str;
        }
        throw new r("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return c1.g();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f16962o;
        reentrantLock.lock();
        try {
            if (f16951d == null) {
                f16951d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            ck.v vVar = ck.v.f7137a;
            reentrantLock.unlock();
            Executor executor = f16951d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String u() {
        return f16969v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
        String str = f16949b;
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f16963p}, 1));
        kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
        com.facebook.internal.n0.k0(str, format);
        return f16963p;
    }

    public static final String x() {
        i4.a e10 = i4.a.f16899w.e();
        return com.facebook.internal.n0.F(e10 != null ? e10.i() : null);
    }

    public static final String y() {
        return f16968u;
    }

    public static final boolean z(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        com.facebook.internal.o0.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
