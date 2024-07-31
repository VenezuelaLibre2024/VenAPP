package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.FragmentC1326x;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public final class C1325w implements InterfaceC1310k {

    /* renamed from: t */
    public static final b f5725t = new b(null);

    /* renamed from: u */
    private static final C1325w f5726u = new C1325w();

    /* renamed from: a */
    private int f5727a;

    /* renamed from: b */
    private int f5728b;

    /* renamed from: e */
    private Handler f5731e;

    /* renamed from: c */
    private boolean f5729c = true;

    /* renamed from: d */
    private boolean f5730d = true;

    /* renamed from: f */
    private final C1312l f5732f = new C1312l(this);

    /* renamed from: r */
    private final Runnable f5733r = new Runnable() { // from class: androidx.lifecycle.u
        @Override // java.lang.Runnable
        public final void run() {
            C1325w.m7382i(C1325w.this);
        }
    };

    /* renamed from: s */
    private final FragmentC1326x.a f5734s = new d();

    /* renamed from: androidx.lifecycle.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f5735a = new a();

        private a() {
        }

        /* renamed from: a */
        public static final void m7391a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            C9322n.m27781e(activity, "activity");
            C9322n.m27781e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* renamed from: androidx.lifecycle.w$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC1310k m7392a() {
            return C1325w.f5726u;
        }

        /* renamed from: b */
        public final void m7393b(Context context) {
            C9322n.m27781e(context, "context");
            C1325w.f5726u.m7388h(context);
        }
    }

    /* renamed from: androidx.lifecycle.w$c */
    /* loaded from: classes.dex */
    public static final class c extends C1294c {

        /* renamed from: androidx.lifecycle.w$c$a */
        /* loaded from: classes.dex */
        public static final class a extends C1294c {
            final /* synthetic */ C1325w this$0;

            a(C1325w c1325w) {
                this.this$0 = c1325w;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C9322n.m27781e(activity, "activity");
                this.this$0.m7385e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C9322n.m27781e(activity, "activity");
                this.this$0.m7386f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.C1294c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1326x.f5737b.m7401b(activity).m7399f(C1325w.this.f5734s);
            }
        }

        @Override // androidx.lifecycle.C1294c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C1325w.this.m7384d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            a.m7391a(activity, new a(C1325w.this));
        }

        @Override // androidx.lifecycle.C1294c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C1325w.this.m7387g();
        }
    }

    /* renamed from: androidx.lifecycle.w$d */
    /* loaded from: classes.dex */
    public static final class d implements FragmentC1326x.a {
        d() {
        }

        @Override // androidx.lifecycle.FragmentC1326x.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.FragmentC1326x.a
        public void onResume() {
            C1325w.this.m7385e();
        }

        @Override // androidx.lifecycle.FragmentC1326x.a
        public void onStart() {
            C1325w.this.m7386f();
        }
    }

    private C1325w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m7382i(C1325w this$0) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m7389j();
        this$0.m7390k();
    }

    /* renamed from: l */
    public static final InterfaceC1310k m7383l() {
        return f5725t.m7392a();
    }

    /* renamed from: d */
    public final void m7384d() {
        int i10 = this.f5728b - 1;
        this.f5728b = i10;
        if (i10 == 0) {
            Handler handler = this.f5731e;
            C9322n.m27778b(handler);
            handler.postDelayed(this.f5733r, 700L);
        }
    }

    /* renamed from: e */
    public final void m7385e() {
        int i10 = this.f5728b + 1;
        this.f5728b = i10;
        if (i10 == 1) {
            if (this.f5729c) {
                this.f5732f.m7360h(AbstractC1300f.a.ON_RESUME);
                this.f5729c = false;
            } else {
                Handler handler = this.f5731e;
                C9322n.m27778b(handler);
                handler.removeCallbacks(this.f5733r);
            }
        }
    }

    /* renamed from: f */
    public final void m7386f() {
        int i10 = this.f5727a + 1;
        this.f5727a = i10;
        if (i10 == 1 && this.f5730d) {
            this.f5732f.m7360h(AbstractC1300f.a.ON_START);
            this.f5730d = false;
        }
    }

    /* renamed from: g */
    public final void m7387g() {
        this.f5727a--;
        m7390k();
    }

    @Override // androidx.lifecycle.InterfaceC1310k
    public AbstractC1300f getLifecycle() {
        return this.f5732f;
    }

    /* renamed from: h */
    public final void m7388h(Context context) {
        C9322n.m27781e(context, "context");
        this.f5731e = new Handler();
        this.f5732f.m7360h(AbstractC1300f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C9322n.m27779c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: j */
    public final void m7389j() {
        if (this.f5728b == 0) {
            this.f5729c = true;
            this.f5732f.m7360h(AbstractC1300f.a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void m7390k() {
        if (this.f5727a == 0 && this.f5729c) {
            this.f5732f.m7360h(AbstractC1300f.a.ON_STOP);
            this.f5730d = true;
        }
    }
}
