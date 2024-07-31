package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.utils.ForceStopRunnable;
import f2.j;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class e0 extends f2.t {

    /* renamed from: k */
    private static final String f5801k = f2.j.i("WorkManagerImpl");

    /* renamed from: l */
    private static e0 f5802l = null;

    /* renamed from: m */
    private static e0 f5803m = null;

    /* renamed from: n */
    private static final Object f5804n = new Object();

    /* renamed from: a */
    private Context f5805a;

    /* renamed from: b */
    private androidx.work.a f5806b;

    /* renamed from: c */
    private WorkDatabase f5807c;

    /* renamed from: d */
    private m2.b f5808d;

    /* renamed from: e */
    private List<t> f5809e;

    /* renamed from: f */
    private r f5810f;

    /* renamed from: g */
    private l2.r f5811g;

    /* renamed from: h */
    private boolean f5812h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f5813i;

    /* renamed from: j */
    private final j2.n f5814j;

    /* loaded from: classes.dex */
    public static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public e0(Context context, androidx.work.a aVar, m2.b bVar) {
        this(context, aVar, bVar, context.getResources().getBoolean(f2.p.f14894a));
    }

    public e0(Context context, androidx.work.a aVar, m2.b bVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        f2.j.h(new j.a(aVar.j()));
        j2.n nVar = new j2.n(applicationContext, bVar);
        this.f5814j = nVar;
        List<t> i10 = i(applicationContext, aVar, nVar);
        t(context, aVar, bVar, workDatabase, i10, new r(context, aVar, bVar, workDatabase, i10));
    }

    public e0(Context context, androidx.work.a aVar, m2.b bVar, boolean z10) {
        this(context, aVar, bVar, WorkDatabase.D(context.getApplicationContext(), bVar.b(), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.e0.f5803m != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.e0.f5803m = new androidx.work.impl.e0(r4, r5, new m2.c(r5.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.e0.f5802l = androidx.work.impl.e0.f5803m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.e0.f5804n
            monitor-enter(r0)
            androidx.work.impl.e0 r1 = androidx.work.impl.e0.f5802l     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.e0 r2 = androidx.work.impl.e0.f5803m     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0 r1 = androidx.work.impl.e0.f5803m     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.e0 r1 = new androidx.work.impl.e0     // Catch: java.lang.Throwable -> L34
            m2.c r2 = new m2.c     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.m()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0.f5803m = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.e0 r4 = androidx.work.impl.e0.f5803m     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.e0.f5802l = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.e0.g(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static e0 l() {
        synchronized (f5804n) {
            e0 e0Var = f5802l;
            if (e0Var != null) {
                return e0Var;
            }
            return f5803m;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e0 m(Context context) {
        e0 l10;
        synchronized (f5804n) {
            l10 = l();
            if (l10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                g(applicationContext, ((a.c) applicationContext).a());
                l10 = m(applicationContext);
            }
        }
        return l10;
    }

    private void t(Context context, androidx.work.a aVar, m2.b bVar, WorkDatabase workDatabase, List<t> list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5805a = applicationContext;
        this.f5806b = aVar;
        this.f5808d = bVar;
        this.f5807c = workDatabase;
        this.f5809e = list;
        this.f5810f = rVar;
        this.f5811g = new l2.r(workDatabase);
        this.f5812h = false;
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f5808d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(v vVar) {
        this.f5808d.c(new l2.w(this, vVar, false));
    }

    @Override // f2.t
    public f2.m a(String str) {
        l2.c d10 = l2.c.d(str, this);
        this.f5808d.c(d10);
        return d10.e();
    }

    @Override // f2.t
    public f2.m b(UUID uuid) {
        l2.c b10 = l2.c.b(uuid, this);
        this.f5808d.c(b10);
        return b10.e();
    }

    @Override // f2.t
    public f2.m d(List<? extends f2.u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    @Override // f2.t
    public LiveData<List<f2.s>> f(String str) {
        return l2.m.a(this.f5807c.J().s(str), k2.u.f20222w, this.f5808d);
    }

    @Override // f2.t
    public f2.m h() {
        l2.t tVar = new l2.t(this);
        this.f5808d.c(tVar);
        return tVar.a();
    }

    public List<t> i(Context context, androidx.work.a aVar, j2.n nVar) {
        return Arrays.asList(u.a(context, this), new g2.b(context, aVar, nVar, this));
    }

    public Context j() {
        return this.f5805a;
    }

    public androidx.work.a k() {
        return this.f5806b;
    }

    public l2.r n() {
        return this.f5811g;
    }

    public r o() {
        return this.f5810f;
    }

    public List<t> p() {
        return this.f5809e;
    }

    public j2.n q() {
        return this.f5814j;
    }

    public WorkDatabase r() {
        return this.f5807c;
    }

    public m2.b s() {
        return this.f5808d;
    }

    public void u() {
        synchronized (f5804n) {
            this.f5812h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f5813i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f5813i = null;
            }
        }
    }

    public void v() {
        androidx.work.impl.background.systemjob.g.b(j());
        r().J().m();
        u.b(k(), r(), p());
    }

    public void w(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5804n) {
            BroadcastReceiver.PendingResult pendingResult2 = this.f5813i;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.f5813i = pendingResult;
            if (this.f5812h) {
                pendingResult.finish();
                this.f5813i = null;
            }
        }
    }

    public void x(v vVar) {
        y(vVar, null);
    }

    public void y(v vVar, WorkerParameters.a aVar) {
        this.f5808d.c(new l2.v(this, vVar, aVar));
    }

    public void z(k2.m mVar) {
        this.f5808d.c(new l2.w(this, new v(mVar), true));
    }
}
