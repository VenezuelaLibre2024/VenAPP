package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.s;
import com.google.firebase.iid.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import pd.a;

@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j */
    private static u f11865j;

    /* renamed from: l */
    static ScheduledExecutorService f11867l;

    /* renamed from: a */
    final Executor f11868a;

    /* renamed from: b */
    private final zb.g f11869b;

    /* renamed from: c */
    private final n f11870c;

    /* renamed from: d */
    private final k f11871d;

    /* renamed from: e */
    private final s f11872e;

    /* renamed from: f */
    private final fe.f f11873f;

    /* renamed from: g */
    private boolean f11874g;

    /* renamed from: h */
    private final List<a.InterfaceC0378a> f11875h;

    /* renamed from: i */
    private static final long f11864i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k */
    private static final Pattern f11866k = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(zb.g gVar, n nVar, Executor executor, Executor executor2, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this.f11874g = false;
        this.f11875h = new ArrayList();
        if (n.c(gVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f11865j == null) {
                f11865j = new u(gVar.m());
            }
        }
        this.f11869b = gVar;
        this.f11870c = nVar;
        this.f11871d = new k(gVar, nVar, bVar, bVar2, fVar);
        this.f11868a = executor2;
        this.f11872e = new s(executor);
        this.f11873f = fVar;
    }

    public FirebaseInstanceId(zb.g gVar, ee.b<ye.i> bVar, ee.b<od.j> bVar2, fe.f fVar) {
        this(gVar, new n(gVar.m()), b.b(), b.b(), bVar, bVar2, fVar);
    }

    private static String A(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private <T> T b(Task<T> task) {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    B();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e10);
        }
    }

    private static <T> T c(Task<T> task) {
        com.google.android.gms.common.internal.s.k(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(d.f11882a, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.e

            /* renamed from: a */
            private final CountDownLatch f11883a;

            public e(CountDownLatch countDownLatch2) {
                this.f11883a = countDownLatch2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                this.f11883a.countDown();
            }
        });
        countDownLatch2.await(30000L, TimeUnit.MILLISECONDS);
        return (T) l(task);
    }

    private static void e(zb.g gVar) {
        com.google.android.gms.common.internal.s.g(gVar.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        com.google.android.gms.common.internal.s.g(gVar.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        com.google.android.gms.common.internal.s.g(gVar.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        com.google.android.gms.common.internal.s.b(u(gVar.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.s.b(t(gVar.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(zb.g gVar) {
        e(gVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) gVar.k(FirebaseInstanceId.class);
        com.google.android.gms.common.internal.s.k(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private Task<l> k(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.f11868a, new Continuation(this, str, A(str2)) { // from class: com.google.firebase.iid.c

            /* renamed from: a */
            private final FirebaseInstanceId f11879a;

            /* renamed from: b */
            private final String f11880b;

            /* renamed from: c */
            private final String f11881c;

            public c(FirebaseInstanceId this, String str3, String str4) {
                this.f11879a = this;
                this.f11880b = str3;
                this.f11881c = str4;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return this.f11879a.z(this.f11880b, this.f11881c, task);
            }
        });
    }

    private static <T> T l(Task<T> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    private String m() {
        return "[DEFAULT]".equals(this.f11869b.q()) ? "" : this.f11869b.s();
    }

    public static boolean r() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    static boolean t(String str) {
        return f11866k.matcher(str).matches();
    }

    static boolean u(String str) {
        return str.contains(":");
    }

    synchronized void B() {
        f11865j.d();
    }

    public synchronized void C(boolean z10) {
        this.f11874g = z10;
    }

    synchronized void D() {
        if (this.f11874g) {
            return;
        }
        E(0L);
    }

    public synchronized void E(long j10) {
        g(new v(this, Math.min(Math.max(30L, j10 + j10), f11864i)), j10);
        this.f11874g = true;
    }

    public boolean F(u.a aVar) {
        return aVar == null || aVar.c(this.f11870c.a());
    }

    public void a(a.InterfaceC0378a interfaceC0378a) {
        this.f11875h.add(interfaceC0378a);
    }

    public String d() {
        return o(n.c(this.f11869b), "*");
    }

    @Deprecated
    public void f(String str, String str2) {
        e(this.f11869b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String A = A(str2);
        b(this.f11871d.b(i(), str, A));
        f11865j.e(m(), str, A);
    }

    public void g(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f11867l == null) {
                f11867l = new ScheduledThreadPoolExecutor(1, new ma.b("FirebaseInstanceId"));
            }
            f11867l.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public zb.g h() {
        return this.f11869b;
    }

    String i() {
        try {
            f11865j.j(this.f11869b.s());
            return (String) c(this.f11873f.getId());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Deprecated
    public Task<l> j() {
        e(this.f11869b);
        return k(n.c(this.f11869b), "*");
    }

    @Deprecated
    public String n() {
        e(this.f11869b);
        u.a p10 = p();
        if (F(p10)) {
            D();
        }
        return u.a.b(p10);
    }

    @Deprecated
    public String o(String str, String str2) {
        e(this.f11869b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l) b(k(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public u.a p() {
        return q(n.c(this.f11869b), "*");
    }

    u.a q(String str, String str2) {
        return f11865j.g(m(), str, str2);
    }

    public boolean s() {
        return this.f11870c.g();
    }

    public final /* synthetic */ Task w(String str, String str2, String str3, String str4) {
        f11865j.i(m(), str, str2, str4, this.f11870c.a());
        return Tasks.forResult(new m(str3, str4));
    }

    public final /* synthetic */ void x(u.a aVar, l lVar) {
        String a10 = lVar.a();
        if (aVar == null || !a10.equals(aVar.f11924a)) {
            Iterator<a.InterfaceC0378a> it = this.f11875h.iterator();
            while (it.hasNext()) {
                it.next().a(a10);
            }
        }
    }

    public final /* synthetic */ Task y(String str, String str2, String str3, u.a aVar) {
        return this.f11871d.e(str, str2, str3).onSuccessTask(this.f11868a, new SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.g

            /* renamed from: a */
            private final FirebaseInstanceId f11889a;

            /* renamed from: b */
            private final String f11890b;

            /* renamed from: c */
            private final String f11891c;

            /* renamed from: d */
            private final String f11892d;

            public g(FirebaseInstanceId this, String str22, String str32, String str4) {
                this.f11889a = this;
                this.f11890b = str22;
                this.f11891c = str32;
                this.f11892d = str4;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                return this.f11889a.w(this.f11890b, this.f11891c, this.f11892d, (String) obj);
            }
        }).addOnSuccessListener(h.f11893a, new OnSuccessListener(this, aVar) { // from class: com.google.firebase.iid.i

            /* renamed from: a */
            private final FirebaseInstanceId f11894a;

            /* renamed from: b */
            private final u.a f11895b;

            public i(FirebaseInstanceId this, u.a aVar2) {
                this.f11894a = this;
                this.f11895b = aVar2;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f11894a.x(this.f11895b, (l) obj);
            }
        });
    }

    public final /* synthetic */ Task z(String str, String str2, Task task) {
        String i10 = i();
        u.a q10 = q(str, str2);
        return !F(q10) ? Tasks.forResult(new m(i10, q10.f11924a)) : this.f11872e.a(str, str2, new s.a(this, i10, str, str2, q10) { // from class: com.google.firebase.iid.f

            /* renamed from: a */
            private final FirebaseInstanceId f11884a;

            /* renamed from: b */
            private final String f11885b;

            /* renamed from: c */
            private final String f11886c;

            /* renamed from: d */
            private final String f11887d;

            /* renamed from: e */
            private final u.a f11888e;

            public f(FirebaseInstanceId this, String i102, String str3, String str22, u.a q102) {
                this.f11884a = this;
                this.f11885b = i102;
                this.f11886c = str3;
                this.f11887d = str22;
                this.f11888e = q102;
            }

            @Override // com.google.firebase.iid.s.a
            public Task start() {
                return this.f11884a.y(this.f11885b, this.f11886c, this.f11887d, this.f11888e);
            }
        });
    }
}
