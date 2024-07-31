package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.x;

/* loaded from: classes.dex */
public final class w implements k {

    /* renamed from: t, reason: collision with root package name */
    public static final b f4971t = new b(null);

    /* renamed from: u, reason: collision with root package name */
    private static final w f4972u = new w();

    /* renamed from: a, reason: collision with root package name */
    private int f4973a;

    /* renamed from: b, reason: collision with root package name */
    private int f4974b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f4977e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4975c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4976d = true;

    /* renamed from: f, reason: collision with root package name */
    private final l f4978f = new l(this);

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f4979r = new Runnable() { // from class: androidx.lifecycle.u
        @Override // java.lang.Runnable
        public final void run() {
            w.i(w.this);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final x.a f4980s = new d();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4981a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.n.e(activity, "activity");
            kotlin.jvm.internal.n.e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final k a() {
            return w.f4972u;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            w.f4972u.h(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends androidx.lifecycle.c {

        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.c {
            final /* synthetic */ w this$0;

            a(w wVar) {
                this.this$0 = wVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.n.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.n.e(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                x.f4983b.b(activity).f(w.this.f4980s);
            }
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            w.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.e(activity, "activity");
            a.a(activity, new a(w.this));
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            w.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements x.a {
        d() {
        }

        @Override // androidx.lifecycle.x.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.x.a
        public void onResume() {
            w.this.e();
        }

        @Override // androidx.lifecycle.x.a
        public void onStart() {
            w.this.f();
        }
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(w this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final k l() {
        return f4971t.a();
    }

    public final void d() {
        int i10 = this.f4974b - 1;
        this.f4974b = i10;
        if (i10 == 0) {
            Handler handler = this.f4977e;
            kotlin.jvm.internal.n.b(handler);
            handler.postDelayed(this.f4979r, 700L);
        }
    }

    public final void e() {
        int i10 = this.f4974b + 1;
        this.f4974b = i10;
        if (i10 == 1) {
            if (this.f4975c) {
                this.f4978f.h(f.a.ON_RESUME);
                this.f4975c = false;
            } else {
                Handler handler = this.f4977e;
                kotlin.jvm.internal.n.b(handler);
                handler.removeCallbacks(this.f4979r);
            }
        }
    }

    public final void f() {
        int i10 = this.f4973a + 1;
        this.f4973a = i10;
        if (i10 == 1 && this.f4976d) {
            this.f4978f.h(f.a.ON_START);
            this.f4976d = false;
        }
    }

    public final void g() {
        this.f4973a--;
        k();
    }

    @Override // androidx.lifecycle.k
    public f getLifecycle() {
        return this.f4978f;
    }

    public final void h(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        this.f4977e = new Handler();
        this.f4978f.h(f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f4974b == 0) {
            this.f4975c = true;
            this.f4978f.h(f.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f4973a == 0 && this.f4975c) {
            this.f4978f.h(f.a.ON_STOP);
            this.f4976d = true;
        }
    }
}
