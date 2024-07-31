package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.C1521a;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C1546g;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p094f2.AbstractC7277j;
import p094f2.AbstractC7287t;
import p094f2.AbstractC7288u;
import p094f2.C7283p;
import p094f2.C7286s;
import p094f2.InterfaceC7280m;
import p114g2.C7441b;
import p170j2.C8953n;
import p192k2.C9124m;
import p192k2.C9132u;
import p211l2.AbstractRunnableC9348c;
import p211l2.C9361m;
import p211l2.C9366r;
import p211l2.RunnableC9368t;
import p211l2.RunnableC9370v;
import p211l2.RunnableC9371w;
import p230m2.InterfaceC9536b;

/* renamed from: androidx.work.impl.e0 */
/* loaded from: classes.dex */
public class C1553e0 extends AbstractC7287t {

    /* renamed from: k */
    private static final String f6652k = AbstractC7277j.m21769i("WorkManagerImpl");

    /* renamed from: l */
    private static C1553e0 f6653l = null;

    /* renamed from: m */
    private static C1553e0 f6654m = null;

    /* renamed from: n */
    private static final Object f6655n = new Object();

    /* renamed from: a */
    private Context f6656a;

    /* renamed from: b */
    private C1521a f6657b;

    /* renamed from: c */
    private WorkDatabase f6658c;

    /* renamed from: d */
    private InterfaceC9536b f6659d;

    /* renamed from: e */
    private List<InterfaceC1579t> f6660e;

    /* renamed from: f */
    private C1577r f6661f;

    /* renamed from: g */
    private C9366r f6662g;

    /* renamed from: h */
    private boolean f6663h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f6664i;

    /* renamed from: j */
    private final C8953n f6665j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.e0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static boolean m8700a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public C1553e0(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b) {
        this(context, c1521a, interfaceC9536b, context.getResources().getBoolean(C7283p.f16317a));
    }

    public C1553e0(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC7277j.m21768h(new AbstractC7277j.a(c1521a.m8515j()));
        C8953n c8953n = new C8953n(applicationContext, interfaceC9536b);
        this.f6665j = c8953n;
        List<InterfaceC1579t> m8685i = m8685i(applicationContext, c1521a, c8953n);
        m8678t(context, c1521a, interfaceC9536b, workDatabase, m8685i, new C1577r(context, c1521a, interfaceC9536b, workDatabase, m8685i));
    }

    public C1553e0(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b, boolean z10) {
        this(context, c1521a, interfaceC9536b, WorkDatabase.m8554D(context.getApplicationContext(), interfaceC9536b.mo28364b(), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.C1553e0.f6654m != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.C1553e0.f6654m = new androidx.work.impl.C1553e0(r4, r5, new p230m2.C9537c(r5.m8518m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.C1553e0.f6653l = androidx.work.impl.C1553e0.f6654m;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m8675g(android.content.Context r4, androidx.work.C1521a r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.C1553e0.f6655n
            monitor-enter(r0)
            androidx.work.impl.e0 r1 = androidx.work.impl.C1553e0.f6653l     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.e0 r2 = androidx.work.impl.C1553e0.f6654m     // Catch: java.lang.Throwable -> L34
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
            androidx.work.impl.e0 r1 = androidx.work.impl.C1553e0.f6654m     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.e0 r1 = new androidx.work.impl.e0     // Catch: java.lang.Throwable -> L34
            m2.c r2 = new m2.c     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.m8518m()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.C1553e0.f6654m = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.e0 r4 = androidx.work.impl.C1553e0.f6654m     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.C1553e0.f6653l = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1553e0.m8675g(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    /* renamed from: l */
    public static C1553e0 m8676l() {
        synchronized (f6655n) {
            C1553e0 c1553e0 = f6653l;
            if (c1553e0 != null) {
                return c1553e0;
            }
            return f6654m;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static C1553e0 m8677m(Context context) {
        C1553e0 m8676l;
        synchronized (f6655n) {
            m8676l = m8676l();
            if (m8676l == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C1521a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m8675g(applicationContext, ((C1521a.c) applicationContext).m8522a());
                m8676l = m8677m(applicationContext);
            }
        }
        return m8676l;
    }

    /* renamed from: t */
    private void m8678t(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b, WorkDatabase workDatabase, List<InterfaceC1579t> list, C1577r c1577r) {
        Context applicationContext = context.getApplicationContext();
        this.f6656a = applicationContext;
        this.f6657b = c1521a;
        this.f6659d = interfaceC9536b;
        this.f6658c = workDatabase;
        this.f6660e = list;
        this.f6661f = c1577r;
        this.f6662g = new C9366r(workDatabase);
        this.f6663h = false;
        if (a.m8700a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f6659d.m28365c(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: A */
    public void m8679A(C1584v c1584v) {
        this.f6659d.m28365c(new RunnableC9371w(this, c1584v, false));
    }

    @Override // p094f2.AbstractC7287t
    /* renamed from: a */
    public InterfaceC7280m mo8680a(String str) {
        AbstractRunnableC9348c m27842d = AbstractRunnableC9348c.m27842d(str, this);
        this.f6659d.m28365c(m27842d);
        return m27842d.m27845e();
    }

    @Override // p094f2.AbstractC7287t
    /* renamed from: b */
    public InterfaceC7280m mo8681b(UUID uuid) {
        AbstractRunnableC9348c m27840b = AbstractRunnableC9348c.m27840b(uuid, this);
        this.f6659d.m28365c(m27840b);
        return m27840b.m27845e();
    }

    @Override // p094f2.AbstractC7287t
    /* renamed from: d */
    public InterfaceC7280m mo8682d(List<? extends AbstractC7288u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C1586x(this, list).m8815a();
    }

    @Override // p094f2.AbstractC7287t
    /* renamed from: f */
    public LiveData<List<C7286s>> mo8683f(String str) {
        return C9361m.m27872a(this.f6658c.mo8560J().mo26920s(str), C9132u.f22004w, this.f6659d);
    }

    @Override // p094f2.AbstractC7287t
    /* renamed from: h */
    public InterfaceC7280m mo8684h() {
        RunnableC9368t runnableC9368t = new RunnableC9368t(this);
        this.f6659d.m28365c(runnableC9368t);
        return runnableC9368t.m27886a();
    }

    /* renamed from: i */
    public List<InterfaceC1579t> m8685i(Context context, C1521a c1521a, C8953n c8953n) {
        return Arrays.asList(C1580u.m8764a(context, this), new C7441b(context, c1521a, c8953n, this));
    }

    /* renamed from: j */
    public Context m8686j() {
        return this.f6656a;
    }

    /* renamed from: k */
    public C1521a m8687k() {
        return this.f6657b;
    }

    /* renamed from: n */
    public C9366r m8688n() {
        return this.f6662g;
    }

    /* renamed from: o */
    public C1577r m8689o() {
        return this.f6661f;
    }

    /* renamed from: p */
    public List<InterfaceC1579t> m8690p() {
        return this.f6660e;
    }

    /* renamed from: q */
    public C8953n m8691q() {
        return this.f6665j;
    }

    /* renamed from: r */
    public WorkDatabase m8692r() {
        return this.f6658c;
    }

    /* renamed from: s */
    public InterfaceC9536b m8693s() {
        return this.f6659d;
    }

    /* renamed from: u */
    public void m8694u() {
        synchronized (f6655n) {
            this.f6663h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f6664i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f6664i = null;
            }
        }
    }

    /* renamed from: v */
    public void m8695v() {
        C1546g.m8658b(m8686j());
        m8692r().mo8560J().mo26914m();
        C1580u.m8765b(m8687k(), m8692r(), m8690p());
    }

    /* renamed from: w */
    public void m8696w(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f6655n) {
            BroadcastReceiver.PendingResult pendingResult2 = this.f6664i;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.f6664i = pendingResult;
            if (this.f6663h) {
                pendingResult.finish();
                this.f6664i = null;
            }
        }
    }

    /* renamed from: x */
    public void m8697x(C1584v c1584v) {
        m8698y(c1584v, null);
    }

    /* renamed from: y */
    public void m8698y(C1584v c1584v, WorkerParameters.C1520a c1520a) {
        this.f6659d.m28365c(new RunnableC9370v(this, c1584v, c1520a));
    }

    /* renamed from: z */
    public void m8699z(C9124m c9124m) {
        this.f6659d.m28365c(new RunnableC9371w(this, new C1584v(c9124m), true));
    }
}
