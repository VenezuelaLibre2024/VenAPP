package p213l4;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p213l4.C9397m;
import p303q4.C10267g;

/* renamed from: l4.e */
/* loaded from: classes.dex */
public final class C9389e {

    /* renamed from: c */
    private static SensorManager f22757c;

    /* renamed from: d */
    private static C9396l f22758d;

    /* renamed from: e */
    private static String f22759e;

    /* renamed from: h */
    private static volatile boolean f22762h;

    /* renamed from: a */
    public static final C9389e f22755a = new C9389e();

    /* renamed from: b */
    private static final C9397m f22756b = new C9397m();

    /* renamed from: f */
    private static final AtomicBoolean f22760f = new AtomicBoolean(true);

    /* renamed from: g */
    private static final AtomicBoolean f22761g = new AtomicBoolean(false);

    private C9389e() {
    }

    /* renamed from: c */
    private final void m27932c(final String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (f22762h) {
                return;
            }
            f22762h = true;
            C7799e0.m23868t().execute(new Runnable() { // from class: l4.d
                @Override // java.lang.Runnable
                public final void run() {
                    C9389e.m27933d(str);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m27933d(String str) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            C4607a m11114e = C4607a.f8672f.m11114e(C7799e0.m23860l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((m11114e == null ? null : m11114e.m11104h()) != null) {
                jSONArray.put(m11114e.m11104h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(C10267g.m30749f() ? "1" : "0");
            Locale m11263B = C4634n0.m11263B();
            jSONArray.put(m11263B.getLanguage() + '_' + ((Object) m11263B.getCountry()));
            String jSONArray2 = jSONArray.toString();
            C9322n.m27780d(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", m27936g());
            bundle.putString("extinfo", jSONArray2);
            C7807i0.c cVar = C7807i0.f18658n;
            C9308a0 c9308a0 = C9308a0.f22565a;
            boolean z10 = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            JSONObject m24062c = cVar.m23988B(null, format, bundle, null).m23949k().m24062c();
            AtomicBoolean atomicBoolean = f22761g;
            if (m24062c == null || !m24062c.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                C9396l c9396l = f22758d;
                if (c9396l != null) {
                    c9396l.m27979h();
                }
            } else {
                f22759e = null;
            }
            f22762h = false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: e */
    public static final void m27934e() {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            f22760f.set(false);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: f */
    public static final void m27935f() {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            f22760f.set(true);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: g */
    public static final String m27936g() {
        if (C0033a.m107d(C9389e.class)) {
            return null;
        }
        try {
            if (f22759e == null) {
                f22759e = UUID.randomUUID().toString();
            }
            String str = f22759e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final boolean m27937h() {
        if (C0033a.m107d(C9389e.class)) {
            return false;
        }
        try {
            return f22761g.get();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
            return false;
        }
    }

    /* renamed from: i */
    private final boolean m27938i() {
        C0033a.m107d(this);
        return false;
    }

    /* renamed from: j */
    public static final void m27939j(Activity activity) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            C9391g.f22764f.m27954a().m27952f(activity);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: k */
    public static final void m27940k(Activity activity) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            if (f22760f.get()) {
                C9391g.f22764f.m27954a().m27953h(activity);
                C9396l c9396l = f22758d;
                if (c9396l != null) {
                    c9396l.m27980l();
                }
                SensorManager sensorManager = f22757c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f22756b);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: l */
    public static final void m27941l(Activity activity) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            if (f22760f.get()) {
                C9391g.f22764f.m27954a().m27951e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String m23861m = C7799e0.m23861m();
                final C4641r m11447f = C4648v.m11447f(m23861m);
                if (C9322n.m27777a(m11447f == null ? null : Boolean.valueOf(m11447f.m11377c()), Boolean.TRUE) || f22755a.m27938i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f22757c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    C9396l c9396l = new C9396l(activity);
                    f22758d = c9396l;
                    C9397m c9397m = f22756b;
                    c9397m.m27985a(new C9397m.b() { // from class: l4.c
                        @Override // p213l4.C9397m.b
                        /* renamed from: a */
                        public final void mo27929a() {
                            C9389e.m27942m(C4641r.this, m23861m);
                        }
                    });
                    sensorManager.registerListener(c9397m, defaultSensor, 2);
                    if (m11447f != null && m11447f.m11377c()) {
                        c9396l.m27979h();
                    }
                }
                C9389e c9389e = f22755a;
                if (!c9389e.m27938i() || f22761g.get()) {
                    return;
                }
                c9389e.m27932c(m23861m);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m27942m(C4641r c4641r, String appId) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            C9322n.m27781e(appId, "$appId");
            boolean z10 = c4641r != null && c4641r.m11377c();
            boolean z11 = C7799e0.m23867s();
            if (z10 && z11) {
                f22755a.m27932c(appId);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }

    /* renamed from: n */
    public static final void m27943n(boolean z10) {
        if (C0033a.m107d(C9389e.class)) {
            return;
        }
        try {
            f22761g.set(z10);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9389e.class);
        }
    }
}
