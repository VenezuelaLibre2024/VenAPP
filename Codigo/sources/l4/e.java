package l4;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import i4.i0;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import l4.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c */
    private static SensorManager f20935c;

    /* renamed from: d */
    private static l f20936d;

    /* renamed from: e */
    private static String f20937e;

    /* renamed from: h */
    private static volatile boolean f20940h;

    /* renamed from: a */
    public static final e f20933a = new e();

    /* renamed from: b */
    private static final m f20934b = new m();

    /* renamed from: f */
    private static final AtomicBoolean f20938f = new AtomicBoolean(true);

    /* renamed from: g */
    private static final AtomicBoolean f20939g = new AtomicBoolean(false);

    private e() {
    }

    private final void c(String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (f20940h) {
                return;
            }
            f20940h = true;
            e0.t().execute(new Runnable() { // from class: l4.d

                /* renamed from: a */
                public final /* synthetic */ String f20932a;

                public /* synthetic */ d(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.d(r1);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void d(String str) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.internal.a e10 = com.facebook.internal.a.f7697f.e(e0.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((e10 == null ? null : e10.h()) != null) {
                jSONArray.put(e10.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(q4.g.f() ? "1" : "0");
            Locale B = n0.B();
            jSONArray.put(B.getLanguage() + '_' + ((Object) B.getCountry()));
            String jSONArray2 = jSONArray.toString();
            n.d(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", jSONArray2);
            i0.c cVar = i0.f17005n;
            a0 a0Var = a0.f20743a;
            boolean z10 = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            n.d(format, "java.lang.String.format(locale, format, *args)");
            JSONObject c10 = cVar.B(null, format, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f20939g;
            if (c10 == null || !c10.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f20936d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f20937e = null;
            }
            f20940h = false;
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void e() {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            f20938f.set(false);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void f() {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            f20938f.set(true);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final String g() {
        if (a5.a.d(e.class)) {
            return null;
        }
        try {
            if (f20937e == null) {
                f20937e = UUID.randomUUID().toString();
            }
            String str = f20937e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (a5.a.d(e.class)) {
            return false;
        }
        try {
            return f20939g.get();
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return false;
        }
    }

    private final boolean i() {
        a5.a.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(activity, "activity");
            g.f20942f.a().f(activity);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(activity, "activity");
            if (f20938f.get()) {
                g.f20942f.a().h(activity);
                l lVar = f20936d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f20935c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f20934b);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void l(Activity activity) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(activity, "activity");
            if (f20938f.get()) {
                g.f20942f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                String m10 = e0.m();
                r f10 = v.f(m10);
                if (n.a(f10 == null ? null : Boolean.valueOf(f10.c()), Boolean.TRUE) || f20933a.i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f20935c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    l lVar = new l(activity);
                    f20936d = lVar;
                    m mVar = f20934b;
                    mVar.a(new m.b() { // from class: l4.c

                        /* renamed from: b */
                        public final /* synthetic */ String f20931b;

                        public /* synthetic */ c(String m102) {
                            r2 = m102;
                        }

                        @Override // l4.m.b
                        public final void a() {
                            e.m(r.this, r2);
                        }
                    });
                    sensorManager.registerListener(mVar, defaultSensor, 2);
                    if (f10 != null && f10.c()) {
                        lVar.h();
                    }
                }
                e eVar = f20933a;
                if (!eVar.i() || f20939g.get()) {
                    return;
                }
                eVar.c(m102);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void m(r rVar, String appId) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(appId, "$appId");
            boolean z10 = rVar != null && rVar.c();
            boolean z11 = e0.s();
            if (z10 && z11) {
                f20933a.c(appId);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public static final void n(boolean z10) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            f20939g.set(z10);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }
}
