package p152i4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import ck.C2037v;
import com.facebook.appevents.C4570d0;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4610b0;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4622h0;
import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4636o0;
import com.facebook.internal.C4639q;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7026o0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7807i0;
import p152i4.C7827s0;
import p303q4.C10268h;
import p347s4.C10796c;
import p434x4.C12280g;
import p450xk.C12524p;

/* renamed from: i4.e0 */
/* loaded from: classes.dex */
public final class C7799e0 {

    /* renamed from: d */
    private static Executor f18604d;

    /* renamed from: e */
    private static volatile String f18605e;

    /* renamed from: f */
    private static volatile String f18606f;

    /* renamed from: g */
    private static volatile String f18607g;

    /* renamed from: h */
    private static volatile Boolean f18608h;

    /* renamed from: j */
    private static volatile boolean f18610j;

    /* renamed from: k */
    private static boolean f18611k;

    /* renamed from: l */
    private static C4610b0<File> f18612l;

    /* renamed from: m */
    private static Context f18613m;

    /* renamed from: q */
    public static boolean f18617q;

    /* renamed from: r */
    public static boolean f18618r;

    /* renamed from: s */
    public static boolean f18619s;

    /* renamed from: x */
    private static boolean f18624x;

    /* renamed from: a */
    public static final C7799e0 f18601a = new C7799e0();

    /* renamed from: b */
    private static final String f18602b = C7799e0.class.getCanonicalName();

    /* renamed from: c */
    private static final HashSet<EnumC7823q0> f18603c = C7026o0.m20513f(EnumC7823q0.DEVELOPER_ERRORS);

    /* renamed from: i */
    private static AtomicLong f18609i = new AtomicLong(65536);

    /* renamed from: n */
    private static int f18614n = 64206;

    /* renamed from: o */
    private static final ReentrantLock f18615o = new ReentrantLock();

    /* renamed from: p */
    private static String f18616p = C4622h0.m11210a();

    /* renamed from: t */
    private static final AtomicBoolean f18620t = new AtomicBoolean(false);

    /* renamed from: u */
    private static volatile String f18621u = "instagram.com";

    /* renamed from: v */
    private static volatile String f18622v = Constants.SIGN_IN_METHOD_FACEBOOK;

    /* renamed from: w */
    private static a f18623w = new a() { // from class: i4.c0
        @Override // p152i4.C7799e0.a
        /* renamed from: a */
        public final C7807i0 mo23800a(C7787a c7787a, String str, JSONObject jSONObject, C7807i0.b bVar) {
            C7807i0 m23830C;
            m23830C = C7799e0.m23830C(c7787a, str, jSONObject, bVar);
            return m23830C;
        }
    };

    /* renamed from: i4.e0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C7807i0 mo23800a(C7787a c7787a, String str, JSONObject jSONObject, C7807i0.b bVar);
    }

    /* renamed from: i4.e0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m23875a();
    }

    private C7799e0() {
    }

    /* renamed from: A */
    public static final long m23828A() {
        C4636o0.m11361l();
        return f18609i.get();
    }

    /* renamed from: B */
    public static final String m23829B() {
        return "17.0.0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final C7807i0 m23830C(C7787a c7787a, String str, JSONObject jSONObject, C7807i0.b bVar) {
        return C7807i0.f18658n.m23987A(c7787a, str, jSONObject, bVar);
    }

    /* renamed from: D */
    public static final boolean m23831D() {
        return f18610j;
    }

    /* renamed from: E */
    public static final synchronized boolean m23832E() {
        boolean z10;
        synchronized (C7799e0.class) {
            z10 = f18624x;
        }
        return z10;
    }

    /* renamed from: F */
    public static final boolean m23833F() {
        return f18620t.get();
    }

    /* renamed from: G */
    public static final boolean m23834G() {
        return f18611k;
    }

    /* renamed from: H */
    public static final boolean m23835H(EnumC7823q0 behavior) {
        boolean z10;
        C9322n.m27781e(behavior, "behavior");
        HashSet<EnumC7823q0> hashSet = f18603c;
        synchronized (hashSet) {
            if (m23831D()) {
                z10 = hashSet.contains(behavior);
            }
        }
        return z10;
    }

    /* renamed from: I */
    public static final void m23836I(Context context) {
        boolean m41031E;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF);
            C9322n.m27780d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f18605e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    C9322n.m27780d(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    m41031E = C12524p.m41031E(lowerCase, "fb", false, 2, null);
                    if (m41031E) {
                        str = str.substring(2);
                        C9322n.m27780d(str, "(this as java.lang.String).substring(startIndex)");
                    }
                    f18605e = str;
                } else if (obj instanceof Number) {
                    throw new C7824r("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f18606f == null) {
                f18606f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f18607g == null) {
                f18607g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f18614n == 64206) {
                f18614n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f18608h == null) {
                f18608h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: J */
    private final void m23837J(Context context, String str) {
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                C4607a m11114e = C4607a.f8672f.m11114e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String m27787k = C9322n.m27787k(str, "ping");
                long j10 = sharedPreferences.getLong(m27787k, 0L);
                try {
                    C10268h c10268h = C10268h.f25490a;
                    JSONObject m30751a = C10268h.m30751a(C10268h.a.MOBILE_INSTALL_EVENT, m11114e, C4589o.f8635b.m11051b(context), m23874z(context), context);
                    C9308a0 c9308a0 = C9308a0.f22565a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                    C7807i0 mo23800a = f18623w.mo23800a(null, format, m30751a, null);
                    if (j10 == 0 && mo23800a.m23949k().m24061b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(m27787k, System.currentTimeMillis());
                        edit.apply();
                        C4612c0.a aVar = C4612c0.f8694e;
                        EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
                        String TAG = f18602b;
                        C9322n.m27780d(TAG, "TAG");
                        aVar.m11138b(enumC7823q0, TAG, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e10) {
                    throw new C7824r("An error occurred while publishing install.", e10);
                }
            } catch (Exception e11) {
                C4634n0.m11312j0("Facebook-publish", e11);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: K */
    public static final void m23838K(Context context, final String applicationId) {
        if (C0033a.m107d(C7799e0.class)) {
            return;
        }
        try {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            C4639q c4639q = C4639q.f8777a;
            if (!C4639q.m11365d("app_events_killswitch", m23861m(), false)) {
                m23868t().execute(new Runnable() { // from class: i4.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7799e0.m23839L(applicationContext, applicationId);
                    }
                });
            }
            C4633n c4633n = C4633n.f8754a;
            if (C4633n.m11254g(C4633n.b.OnDeviceEventProcessing) && C10796c.m32893d()) {
                C10796c.m32896g(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C7799e0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m23839L(Context applicationContext, String applicationId) {
        C9322n.m27781e(applicationContext, "$applicationContext");
        C9322n.m27781e(applicationId, "$applicationId");
        f18601a.m23837J(applicationContext, applicationId);
    }

    /* renamed from: M */
    public static final synchronized void m23840M(Context applicationContext) {
        synchronized (C7799e0.class) {
            C9322n.m27781e(applicationContext, "applicationContext");
            m23841N(applicationContext, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0107, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:13:0x0019, B:15:0x0034, B:17:0x003c, B:22:0x0048, B:24:0x004c, B:27:0x0055, B:29:0x005e, B:30:0x0061, B:32:0x0065, B:34:0x0069, B:36:0x006f, B:38:0x0075, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:43:0x008f, B:46:0x00e5, B:47:0x00ea, B:48:0x00eb, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:53:0x00f9, B:54:0x0100, B:56:0x0101, B:57:0x0106), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[Catch: all -> 0x0107, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x0013, B:13:0x0019, B:15:0x0034, B:17:0x003c, B:22:0x0048, B:24:0x004c, B:27:0x0055, B:29:0x005e, B:30:0x0061, B:32:0x0065, B:34:0x0069, B:36:0x006f, B:38:0x0075, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:43:0x008f, B:46:0x00e5, B:47:0x00ea, B:48:0x00eb, B:49:0x00f0, B:50:0x00f1, B:51:0x00f8, B:53:0x00f9, B:54:0x0100, B:56:0x0101, B:57:0x0106), top: B:3:0x0003 }] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void m23841N(android.content.Context r5, final p152i4.C7799e0.b r6) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7799e0.m23841N(android.content.Context, i4.e0$b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final File m23842O() {
        Context context = f18613m;
        if (context != null) {
            return context.getCacheDir();
        }
        C9322n.m27792p("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m23843P(boolean z10) {
        if (z10) {
            C12280g.m39543d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m23844Q(boolean z10) {
        if (z10) {
            C4570d0.m10954a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m23845R(boolean z10) {
        if (z10) {
            f18617q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m23846S(boolean z10) {
        if (z10) {
            f18618r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m23847T(boolean z10) {
        if (z10) {
            f18619s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final Void m23848U(b bVar) {
        C7802g.f18633f.m23903e().m23895j();
        C7831u0.f18782d.m24119a().m24117d();
        if (C7787a.f18552w.m23784g()) {
            C7827s0.b bVar2 = C7827s0.f18752s;
            if (bVar2.m24093b() == null) {
                bVar2.m24092a();
            }
        }
        if (bVar != null) {
            bVar.m23875a();
        }
        C4589o.a aVar = C4589o.f8635b;
        aVar.m11054e(m23860l(), f18605e);
        C7795c1.m23814n();
        Context applicationContext = m23860l().getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext().applicationContext");
        aVar.m11055f(applicationContext).m11048a();
        return null;
    }

    /* renamed from: j */
    public static final void m23858j() {
        f18624x = true;
    }

    /* renamed from: k */
    public static final boolean m23859k() {
        return C7795c1.m23804d();
    }

    /* renamed from: l */
    public static final Context m23860l() {
        C4636o0.m11361l();
        Context context = f18613m;
        if (context != null) {
            return context;
        }
        C9322n.m27792p("applicationContext");
        throw null;
    }

    /* renamed from: m */
    public static final String m23861m() {
        C4636o0.m11361l();
        String str = f18605e;
        if (str != null) {
            return str;
        }
        throw new C7824r("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* renamed from: n */
    public static final String m23862n() {
        C4636o0.m11361l();
        return f18606f;
    }

    /* renamed from: o */
    public static final boolean m23863o() {
        return C7795c1.m23805e();
    }

    /* renamed from: p */
    public static final boolean m23864p() {
        return C7795c1.m23806f();
    }

    /* renamed from: q */
    public static final int m23865q() {
        C4636o0.m11361l();
        return f18614n;
    }

    /* renamed from: r */
    public static final String m23866r() {
        C4636o0.m11361l();
        String str = f18607g;
        if (str != null) {
            return str;
        }
        throw new C7824r("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* renamed from: s */
    public static final boolean m23867s() {
        return C7795c1.m23807g();
    }

    /* renamed from: t */
    public static final Executor m23868t() {
        ReentrantLock reentrantLock = f18615o;
        reentrantLock.lock();
        try {
            if (f18604d == null) {
                f18604d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C2037v c2037v = C2037v.f8089a;
            reentrantLock.unlock();
            Executor executor = f18604d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: u */
    public static final String m23869u() {
        return f18622v;
    }

    /* renamed from: v */
    public static final String m23870v() {
        return "fb.gg";
    }

    /* renamed from: w */
    public static final String m23871w() {
        C4634n0 c4634n0 = C4634n0.f8760a;
        String str = f18602b;
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f18616p}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        C4634n0.m11314k0(str, format);
        return f18616p;
    }

    /* renamed from: x */
    public static final String m23872x() {
        C7787a m23782e = C7787a.f18552w.m23782e();
        return C4634n0.m11270F(m23782e != null ? m23782e.m23766i() : null);
    }

    /* renamed from: y */
    public static final String m23873y() {
        return f18621u;
    }

    /* renamed from: z */
    public static final boolean m23874z(Context context) {
        C9322n.m27781e(context, "context");
        C4636o0.m11361l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
