package p374u4;

import android.app.Activity;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p303q4.C10266f;
import p325r4.C10618f;

/* renamed from: u4.e */
/* loaded from: classes.dex */
public final class C11320e {

    /* renamed from: a */
    public static final C11320e f29387a = new C11320e();

    /* renamed from: b */
    private static final AtomicBoolean f29388b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final Set<String> f29389c = new LinkedHashSet();

    /* renamed from: d */
    private static final Set<String> f29390d = new LinkedHashSet();

    private C11320e() {
    }

    /* renamed from: b */
    public static final synchronized void m35383b() {
        synchronized (C11320e.class) {
            if (C0033a.m107d(C11320e.class)) {
                return;
            }
            try {
                C7799e0.m23868t().execute(new Runnable() { // from class: u4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11320e.m35384c();
                    }
                });
            } catch (Throwable th2) {
                C0033a.m105b(th2, C11320e.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m35384c() {
        if (C0033a.m107d(C11320e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f29388b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f29387a.m35385d();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11320e.class);
        }
    }

    /* renamed from: d */
    private final void m35385d() {
        String m11390p;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null || (m11390p = m11457q.m11390p()) == null) {
                return;
            }
            m35389g(m11390p);
            if ((!f29389c.isEmpty()) || (!f29390d.isEmpty())) {
                C10618f c10618f = C10618f.f26831a;
                File m32332l = C10618f.m32332l(C10618f.a.MTML_APP_EVENT_PREDICTION);
                if (m32332l == null) {
                    return;
                }
                C11316a.m35362d(m32332l);
                Activity m30730l = C10266f.m30730l();
                if (m30730l != null) {
                    m35388h(m30730l);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: e */
    public static final boolean m35386e(String event) {
        if (C0033a.m107d(C11320e.class)) {
            return false;
        }
        try {
            C9322n.m27781e(event, "event");
            return f29390d.contains(event);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11320e.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m35387f(String event) {
        if (C0033a.m107d(C11320e.class)) {
            return false;
        }
        try {
            C9322n.m27781e(event, "event");
            return f29389c.contains(event);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11320e.class);
            return false;
        }
    }

    /* renamed from: h */
    public static final void m35388h(Activity activity) {
        if (C0033a.m107d(C11320e.class)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            try {
                if (f29388b.get() && C11316a.m35364f() && (!f29389c.isEmpty() || !f29390d.isEmpty())) {
                    ViewTreeObserverOnGlobalLayoutListenerC11322g.f29392d.m35398a(activity);
                } else {
                    ViewTreeObserverOnGlobalLayoutListenerC11322g.f29392d.m35399b(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11320e.class);
        }
    }

    /* renamed from: g */
    public final void m35389g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set<String> set = f29389c;
                    String string = jSONArray2.getString(i11);
                    C9322n.m27780d(string, "jsonArray.getString(i)");
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
                Set<String> set2 = f29390d;
                String string2 = jSONArray.getString(i10);
                C9322n.m27780d(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
