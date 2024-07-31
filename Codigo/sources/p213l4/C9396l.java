package p213l4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4652z;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.EnumC7823q0;
import p213l4.C9396l;
import p232m4.C9544e;
import p232m4.C9545f;
import p303q4.C10267g;

/* renamed from: l4.l */
/* loaded from: classes.dex */
public final class C9396l {

    /* renamed from: e */
    public static final a f22790e = new a(null);

    /* renamed from: f */
    private static final String f22791f;

    /* renamed from: g */
    private static C9396l f22792g;

    /* renamed from: a */
    private final Handler f22793a;

    /* renamed from: b */
    private final WeakReference<Activity> f22794b;

    /* renamed from: c */
    private Timer f22795c;

    /* renamed from: d */
    private String f22796d;

    /* renamed from: l4.l$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m27982c(C7817n0 it) {
            C9322n.m27781e(it, "it");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C9396l.m27972d(), "App index sent to FB!");
        }

        /* renamed from: b */
        public final C7807i0 m27983b(String str, C7787a c7787a, String str2, String requestType) {
            C9322n.m27781e(requestType, "requestType");
            if (str == null) {
                return null;
            }
            C7807i0.c cVar = C7807i0.f18658n;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C9322n.m27780d(format, "java.lang.String.format(locale, format, *args)");
            C7807i0 m23987A = cVar.m23987A(c7787a, format, null, null);
            Bundle m23956u = m23987A.m23956u();
            if (m23956u == null) {
                m23956u = new Bundle();
            }
            m23956u.putString("tree", str);
            m23956u.putString("app_version", C10267g.m30747d());
            m23956u.putString("platform", "android");
            m23956u.putString("request_type", requestType);
            if (C9322n.m27777a(requestType, "app_indexing")) {
                m23956u.putString("device_session_id", C9389e.m27936g());
            }
            m23987A.m23947H(m23956u);
            m23987A.m23943D(new C7807i0.b() { // from class: l4.k
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C9396l.a.m27982c(c7817n0);
                }
            });
            return m23987A;
        }
    }

    /* renamed from: l4.l$b */
    /* loaded from: classes.dex */
    private static final class b implements Callable<String> {

        /* renamed from: a */
        private final WeakReference<View> f22797a;

        public b(View rootView) {
            C9322n.m27781e(rootView, "rootView");
            this.f22797a = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f22797a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C9322n.m27780d(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* renamed from: l4.l$c */
    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) C9396l.m27971c(C9396l.this).get();
                View m30748e = C10267g.m30748e(activity);
                if (activity != null && m30748e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (C9389e.m27937h()) {
                        if (C4652z.m11469b()) {
                            C9544e.m28410a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(m30748e));
                        C9396l.m27973e(C9396l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e10) {
                            Log.e(C9396l.m27972d(), "Failed to take screenshot.", e10);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(C9545f.m28417d(m30748e));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(C9396l.m27972d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        C9322n.m27780d(jSONObject2, "viewTree.toString()");
                        C9396l.m27974f(C9396l.this, jSONObject2);
                    }
                }
            } catch (Exception e11) {
                Log.e(C9396l.m27972d(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = C9396l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f22791f = canonicalName;
    }

    public C9396l(Activity activity) {
        C9322n.m27781e(activity, "activity");
        this.f22794b = new WeakReference<>(activity);
        this.f22796d = null;
        this.f22793a = new Handler(Looper.getMainLooper());
        f22792g = this;
    }

    /* renamed from: c */
    public static final /* synthetic */ WeakReference m27971c(C9396l c9396l) {
        if (C0033a.m107d(C9396l.class)) {
            return null;
        }
        try {
            return c9396l.f22794b;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m27972d() {
        if (C0033a.m107d(C9396l.class)) {
            return null;
        }
        try {
            return f22791f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Handler m27973e(C9396l c9396l) {
        if (C0033a.m107d(C9396l.class)) {
            return null;
        }
        try {
            return c9396l.f22793a;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m27974f(C9396l c9396l, String str) {
        if (C0033a.m107d(C9396l.class)) {
            return;
        }
        try {
            c9396l.m27976j(str);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m27975i(C9396l this$0, TimerTask indexingTask) {
        if (C0033a.m107d(C9396l.class)) {
            return;
        }
        try {
            C9322n.m27781e(this$0, "this$0");
            C9322n.m27781e(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f22795c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f22796d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f22795c = timer2;
            } catch (Exception e10) {
                Log.e(f22791f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
        }
    }

    /* renamed from: j */
    private final void m27976j(final String str) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C7799e0.m23868t().execute(new Runnable() { // from class: l4.j
                @Override // java.lang.Runnable
                public final void run() {
                    C9396l.m27977k(str, this);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m27977k(String tree, C9396l this$0) {
        if (C0033a.m107d(C9396l.class)) {
            return;
        }
        try {
            C9322n.m27781e(tree, "$tree");
            C9322n.m27781e(this$0, "this$0");
            String m11320n0 = C4634n0.m11320n0(tree);
            C7787a m23782e = C7787a.f18552w.m23782e();
            if (m11320n0 == null || !C9322n.m27777a(m11320n0, this$0.f22796d)) {
                this$0.m27978g(f22790e.m27983b(tree, m23782e, C7799e0.m23861m(), "app_indexing"), m11320n0);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9396l.class);
        }
    }

    /* renamed from: g */
    public final void m27978g(C7807i0 c7807i0, String str) {
        if (C0033a.m107d(this) || c7807i0 == null) {
            return;
        }
        try {
            C7817n0 m23949k = c7807i0.m23949k();
            try {
                JSONObject m24062c = m23949k.m24062c();
                if (m24062c == null) {
                    Log.e(f22791f, C9322n.m27787k("Error sending UI component tree to Facebook: ", m23949k.m24061b()));
                    return;
                }
                if (C9322n.m27777a("true", m24062c.optString("success"))) {
                    C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, f22791f, "Successfully send UI component tree to server");
                    this.f22796d = str;
                }
                if (m24062c.has("is_app_indexing_enabled")) {
                    C9389e.m27943n(m24062c.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f22791f, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: h */
    public final void m27979h() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                C7799e0.m23868t().execute(new Runnable() { // from class: l4.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9396l.m27975i(C9396l.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f22791f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: l */
    public final void m27980l() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (this.f22794b.get() == null) {
                return;
            }
            try {
                Timer timer = this.f22795c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f22795c = null;
            } catch (Exception e10) {
                Log.e(f22791f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
