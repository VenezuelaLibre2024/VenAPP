package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u0;
import com.google.firebase.messaging.z0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pd.a;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o */
    private static final long f12001o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p */
    private static z0 f12002p;

    /* renamed from: q */
    static f6.g f12003q;

    /* renamed from: r */
    static ScheduledExecutorService f12004r;

    /* renamed from: a */
    private final zb.g f12005a;

    /* renamed from: b */
    private final pd.a f12006b;

    /* renamed from: c */
    private final fe.f f12007c;

    /* renamed from: d */
    private final Context f12008d;

    /* renamed from: e */
    private final e0 f12009e;

    /* renamed from: f */
    private final u0 f12010f;

    /* renamed from: g */
    private final a f12011g;

    /* renamed from: h */
    private final Executor f12012h;

    /* renamed from: i */
    private final Executor f12013i;

    /* renamed from: j */
    private final Executor f12014j;

    /* renamed from: k */
    private final Task<e1> f12015k;

    /* renamed from: l */
    private final j0 f12016l;

    /* renamed from: m */
    private boolean f12017m;

    /* renamed from: n */
    private final Application.ActivityLifecycleCallbacks f12018n;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private final nd.d f12019a;

        /* renamed from: b */
        private boolean f12020b;

        /* renamed from: c */
        private nd.b<zb.b> f12021c;

        /* renamed from: d */
        private Boolean f12022d;

        a(nd.d dVar) {
            this.f12019a = dVar;
        }

        public /* synthetic */ void d(nd.a aVar) {
            if (c()) {
                FirebaseMessaging.this.Q();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m10 = FirebaseMessaging.this.f12005a.m();
            SharedPreferences sharedPreferences = m10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m10.getPackageName(), RecognitionOptions.ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f12020b) {
                return;
            }
            Boolean e10 = e();
            this.f12022d = e10;
            if (e10 == null) {
                b0 b0Var = new nd.b() { // from class: com.google.firebase.messaging.b0
                    public /* synthetic */ b0() {
                    }

                    @Override // nd.b
                    public final void a(nd.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f12021c = b0Var;
                this.f12019a.b(zb.b.class, b0Var);
            }
            this.f12020b = true;
        }

        synchronized boolean c() {
            Boolean bool;
            b();
            bool = this.f12022d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f12005a.x();
        }

        synchronized void f(boolean z10) {
            b();
            nd.b<zb.b> bVar = this.f12021c;
            if (bVar != null) {
                this.f12019a.c(zb.b.class, bVar);
                this.f12021c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f12005a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.Q();
            }
            this.f12022d = Boolean.valueOf(z10);
        }
    }

    public FirebaseMessaging(zb.g gVar, pd.a aVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar, f6.g gVar2, nd.d dVar) {
        this(gVar, aVar, bVar, bVar2, fVar, gVar2, dVar, new j0(gVar.m()));
    }

    FirebaseMessaging(zb.g gVar, pd.a aVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar, f6.g gVar2, nd.d dVar, j0 j0Var) {
        this(gVar, aVar, fVar, gVar2, dVar, j0Var, new e0(gVar, j0Var, bVar, bVar2, fVar), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(zb.g gVar, pd.a aVar, fe.f fVar, f6.g gVar2, nd.d dVar, j0 j0Var, e0 e0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f12017m = false;
        f12003q = gVar2;
        this.f12005a = gVar;
        this.f12006b = aVar;
        this.f12007c = fVar;
        this.f12011g = new a(dVar);
        Context m10 = gVar.m();
        this.f12008d = m10;
        p pVar = new p();
        this.f12018n = pVar;
        this.f12016l = j0Var;
        this.f12013i = executor;
        this.f12009e = e0Var;
        this.f12010f = new u0(executor);
        this.f12012h = executor2;
        this.f12014j = executor3;
        Context m11 = gVar.m();
        if (m11 instanceof Application) {
            ((Application) m11).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + m11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c(new a.InterfaceC0378a() { // from class: com.google.firebase.messaging.s
                public /* synthetic */ s() {
                }

                @Override // pd.a.InterfaceC0378a
                public final void a(String str) {
                    FirebaseMessaging.this.F(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            public /* synthetic */ t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.G();
            }
        });
        Task<e1> f10 = e1.f(this, j0Var, e0Var, m10, n.g());
        this.f12015k = f10;
        f10.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.u
            public /* synthetic */ u() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.H((e1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            public /* synthetic */ v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I();
            }
        });
    }

    public /* synthetic */ Task A(String str, z0.a aVar) {
        return this.f12009e.f().onSuccessTask(this.f12014j, new SuccessContinuation() { // from class: com.google.firebase.messaging.r

            /* renamed from: b */
            public final /* synthetic */ String f12154b;

            /* renamed from: c */
            public final /* synthetic */ z0.a f12155c;

            public /* synthetic */ r(String str2, z0.a aVar2) {
                r2 = str2;
                r3 = aVar2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task B;
                B = FirebaseMessaging.this.B(r2, r3, (String) obj);
                return B;
            }
        });
    }

    public /* synthetic */ Task B(String str, z0.a aVar, String str2) {
        s(this.f12008d).g(t(), str, str2, this.f12016l.a());
        if (aVar == null || !str2.equals(aVar.f12217a)) {
            F(str2);
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ void C(TaskCompletionSource taskCompletionSource) {
        try {
            this.f12006b.b(j0.c(this.f12005a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void D(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f12009e.c());
            s(this.f12008d).d(t(), j0.c(this.f12005a));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(n());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void G() {
        if (y()) {
            Q();
        }
    }

    public /* synthetic */ void H(e1 e1Var) {
        if (y()) {
            e1Var.q();
        }
    }

    public /* synthetic */ void I() {
        p0.c(this.f12008d);
    }

    public static /* synthetic */ Task J(String str, e1 e1Var) {
        return e1Var.r(str);
    }

    public static /* synthetic */ Task K(String str, e1 e1Var) {
        return e1Var.u(str);
    }

    private synchronized void P() {
        if (!this.f12017m) {
            S(0L);
        }
    }

    public void Q() {
        pd.a aVar = this.f12006b;
        if (aVar != null) {
            aVar.a();
        } else if (T(v())) {
            P();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(zb.g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.k(FirebaseMessaging.class);
            com.google.android.gms.common.internal.s.k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(zb.g.o());
        }
        return firebaseMessaging;
    }

    private static synchronized z0 s(Context context) {
        z0 z0Var;
        synchronized (FirebaseMessaging.class) {
            if (f12002p == null) {
                f12002p = new z0(context);
            }
            z0Var = f12002p;
        }
        return z0Var;
    }

    private String t() {
        return "[DEFAULT]".equals(this.f12005a.q()) ? "" : this.f12005a.s();
    }

    public static f6.g w() {
        return f12003q;
    }

    /* renamed from: x */
    public void F(String str) {
        if ("[DEFAULT]".equals(this.f12005a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f12005a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(Constants.TOKEN, str);
            new m(this.f12008d).k(intent);
        }
    }

    @Deprecated
    public void L(r0 r0Var) {
        if (TextUtils.isEmpty(r0Var.D1())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f12008d, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        r0Var.F1(intent);
        this.f12008d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void M(boolean z10) {
        this.f12011g.f(z10);
    }

    public void N(boolean z10) {
        i0.y(z10);
    }

    public synchronized void O(boolean z10) {
        this.f12017m = z10;
    }

    public Task<Void> R(String str) {
        return this.f12015k.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.w

            /* renamed from: a */
            public final /* synthetic */ String f12196a;

            public /* synthetic */ w(String str2) {
                r1 = str2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task J;
                J = FirebaseMessaging.J(r1, (e1) obj);
                return J;
            }
        });
    }

    public synchronized void S(long j10) {
        p(new a1(this, Math.min(Math.max(30L, 2 * j10), f12001o)), j10);
        this.f12017m = true;
    }

    boolean T(z0.a aVar) {
        return aVar == null || aVar.b(this.f12016l.a());
    }

    public Task<Void> U(String str) {
        return this.f12015k.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.q

            /* renamed from: a */
            public final /* synthetic */ String f12152a;

            public /* synthetic */ q(String str2) {
                r1 = str2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task K;
                K = FirebaseMessaging.K(r1, (e1) obj);
                return K;
            }
        });
    }

    public String n() {
        pd.a aVar = this.f12006b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.d());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        z0.a v10 = v();
        if (!T(v10)) {
            return v10.f12217a;
        }
        String c10 = j0.c(this.f12005a);
        try {
            return (String) Tasks.await(this.f12010f.b(c10, new u0.a() { // from class: com.google.firebase.messaging.a0

                /* renamed from: b */
                public final /* synthetic */ String f12046b;

                /* renamed from: c */
                public final /* synthetic */ z0.a f12047c;

                public /* synthetic */ a0(String c102, z0.a v102) {
                    r2 = c102;
                    r3 = v102;
                }

                @Override // com.google.firebase.messaging.u0.a
                public final Task start() {
                    Task A;
                    A = FirebaseMessaging.this.A(r2, r3);
                    return A;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public Task<Void> o() {
        if (this.f12006b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f12012h.execute(new Runnable() { // from class: com.google.firebase.messaging.x

                /* renamed from: b */
                public final /* synthetic */ TaskCompletionSource f12203b;

                public /* synthetic */ x(TaskCompletionSource taskCompletionSource2) {
                    r2 = taskCompletionSource2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.C(r2);
                }
            });
            return taskCompletionSource2.getTask();
        }
        if (v() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        n.e().execute(new Runnable() { // from class: com.google.firebase.messaging.y

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f12206b;

            public /* synthetic */ y(TaskCompletionSource taskCompletionSource22) {
                r2 = taskCompletionSource22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.D(r2);
            }
        });
        return taskCompletionSource22.getTask();
    }

    public void p(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f12004r == null) {
                f12004r = new ScheduledThreadPoolExecutor(1, new ma.b("TAG"));
            }
            f12004r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public Context q() {
        return this.f12008d;
    }

    public Task<String> u() {
        pd.a aVar = this.f12006b;
        if (aVar != null) {
            return aVar.d();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12012h.execute(new Runnable() { // from class: com.google.firebase.messaging.z

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f12214b;

            public /* synthetic */ z(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    z0.a v() {
        return s(this.f12008d).e(t(), j0.c(this.f12005a));
    }

    public boolean y() {
        return this.f12011g.c();
    }

    public boolean z() {
        return this.f12016l.g();
    }
}
