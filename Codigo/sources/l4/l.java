package l4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.internal.c0;
import com.facebook.internal.z;
import i4.e0;
import i4.i0;
import i4.n0;
import i4.q0;
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
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import l4.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f20968e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final String f20969f;

    /* renamed from: g, reason: collision with root package name */
    private static l f20970g;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f20971a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Activity> f20972b;

    /* renamed from: c, reason: collision with root package name */
    private Timer f20973c;

    /* renamed from: d, reason: collision with root package name */
    private String f20974d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(n0 it) {
            n.e(it, "it");
            c0.f7719e.b(q0.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final i0 b(String str, i4.a aVar, String str2, String requestType) {
            n.e(requestType, "requestType");
            if (str == null) {
                return null;
            }
            i0.c cVar = i0.f17005n;
            a0 a0Var = a0.f20743a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            n.d(format, "java.lang.String.format(locale, format, *args)");
            i0 A = cVar.A(aVar, format, null, null);
            Bundle u10 = A.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("tree", str);
            u10.putString("app_version", q4.g.d());
            u10.putString("platform", "android");
            u10.putString("request_type", requestType);
            if (n.a(requestType, "app_indexing")) {
                u10.putString("device_session_id", e.g());
            }
            A.H(u10);
            A.D(new i0.b() { // from class: l4.k
                @Override // i4.i0.b
                public final void b(n0 n0Var) {
                    l.a.c(n0Var);
                }
            });
            return A;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f20975a;

        public b(View rootView) {
            n.e(rootView, "rootView");
            this.f20975a = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f20975a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            n.d(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View e10 = q4.g.e(activity);
                if (activity != null && e10 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (z.b()) {
                            m4.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e10));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            Log.e(l.d(), "Failed to take screenshot.", e11);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(m4.f.d(e10));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        n.d(jSONObject2, "viewTree.toString()");
                        l.f(l.this, jSONObject2);
                    }
                }
            } catch (Exception e12) {
                Log.e(l.d(), "UI Component tree indexing failure!", e12);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f20969f = canonicalName;
    }

    public l(Activity activity) {
        n.e(activity, "activity");
        this.f20972b = new WeakReference<>(activity);
        this.f20974d = null;
        this.f20971a = new Handler(Looper.getMainLooper());
        f20970g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (a5.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f20972b;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (a5.a.d(l.class)) {
            return null;
        }
        try {
            return f20969f;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (a5.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f20971a;
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (a5.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l this$0, TimerTask indexingTask) {
        if (a5.a.d(l.class)) {
            return;
        }
        try {
            n.e(this$0, "this$0");
            n.e(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f20973c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f20974d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f20973c = timer2;
            } catch (Exception e10) {
                Log.e(f20969f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
        }
    }

    private final void j(final String str) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            e0.t().execute(new Runnable() { // from class: l4.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String tree, l this$0) {
        if (a5.a.d(l.class)) {
            return;
        }
        try {
            n.e(tree, "$tree");
            n.e(this$0, "this$0");
            String n02 = com.facebook.internal.n0.n0(tree);
            i4.a e10 = i4.a.f16899w.e();
            if (n02 == null || !n.a(n02, this$0.f20974d)) {
                this$0.g(f20968e.b(tree, e10, e0.m(), "app_indexing"), n02);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, l.class);
        }
    }

    public final void g(i0 i0Var, String str) {
        if (a5.a.d(this) || i0Var == null) {
            return;
        }
        try {
            n0 k10 = i0Var.k();
            try {
                JSONObject c10 = k10.c();
                if (c10 == null) {
                    Log.e(f20969f, n.k("Error sending UI component tree to Facebook: ", k10.b()));
                    return;
                }
                if (n.a("true", c10.optString("success"))) {
                    c0.f7719e.b(q0.APP_EVENTS, f20969f, "Successfully send UI component tree to server");
                    this.f20974d = str;
                }
                if (c10.has("is_app_indexing_enabled")) {
                    e.n(c10.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f20969f, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void h() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                e0.t().execute(new Runnable() { // from class: l4.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(l.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f20969f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void l() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (this.f20972b.get() == null) {
                return;
            }
            try {
                Timer timer = this.f20973c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f20973c = null;
            } catch (Exception e10) {
                Log.e(f20969f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
