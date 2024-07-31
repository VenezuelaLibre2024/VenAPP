package u4;

import android.app.Activity;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import r4.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final e f27085a = new e();

    /* renamed from: b */
    private static final AtomicBoolean f27086b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final Set<String> f27087c = new LinkedHashSet();

    /* renamed from: d */
    private static final Set<String> f27088d = new LinkedHashSet();

    private e() {
    }

    public static final synchronized void b() {
        synchronized (e.class) {
            if (a5.a.d(e.class)) {
                return;
            }
            try {
                e0.t().execute(new Runnable() { // from class: u4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c();
                    }
                });
            } catch (Throwable th2) {
                a5.a.b(th2, e.class);
            }
        }
    }

    public static final void c() {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f27086b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f27085a.d();
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    private final void d() {
        String p10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            r q10 = v.q(e0.m(), false);
            if (q10 == null || (p10 = q10.p()) == null) {
                return;
            }
            g(p10);
            if ((!f27087c.isEmpty()) || (!f27088d.isEmpty())) {
                r4.f fVar = r4.f.f24717a;
                File l10 = r4.f.l(f.a.MTML_APP_EVENT_PREDICTION);
                if (l10 == null) {
                    return;
                }
                a.d(l10);
                Activity l11 = q4.f.l();
                if (l11 != null) {
                    h(l11);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final boolean e(String event) {
        if (a5.a.d(e.class)) {
            return false;
        }
        try {
            n.e(event, "event");
            return f27088d.contains(event);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (a5.a.d(e.class)) {
            return false;
        }
        try {
            n.e(event, "event");
            return f27087c.contains(event);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(activity, "activity");
            try {
                if (f27086b.get() && a.f() && (!f27087c.isEmpty() || !f27088d.isEmpty())) {
                    g.f27090d.a(activity);
                } else {
                    g.f27090d.b(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (a5.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set<String> set = f27087c;
                    String string = jSONArray2.getString(i11);
                    n.d(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                Set<String> set2 = f27088d;
                String string2 = jSONArray.getString(i10);
                n.d(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
