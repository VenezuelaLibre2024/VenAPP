package bb;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import la.C9464i;
import la.C9475t;
import la.C9477v;
import la.InterfaceC9461f;

/* renamed from: bb.a */
/* loaded from: classes2.dex */
public class C1715a {

    /* renamed from: r */
    private static final long f7295r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f7296s = null;

    /* renamed from: t */
    private static final Object f7297t = new Object();

    /* renamed from: u */
    private static volatile InterfaceC1719e f7298u = new C1717c();

    /* renamed from: a */
    private final Object f7299a;

    /* renamed from: b */
    private final PowerManager.WakeLock f7300b;

    /* renamed from: c */
    private int f7301c;

    /* renamed from: d */
    private Future<?> f7302d;

    /* renamed from: e */
    private long f7303e;

    /* renamed from: f */
    private final Set<C1720f> f7304f;

    /* renamed from: g */
    private boolean f7305g;

    /* renamed from: h */
    private int f7306h;

    /* renamed from: i */
    zzb f7307i;

    /* renamed from: j */
    private InterfaceC9461f f7308j;

    /* renamed from: k */
    private WorkSource f7309k;

    /* renamed from: l */
    private final String f7310l;

    /* renamed from: m */
    private final String f7311m;

    /* renamed from: n */
    private final Context f7312n;

    /* renamed from: o */
    private final Map<String, C1718d> f7313o;

    /* renamed from: p */
    private AtomicInteger f7314p;

    /* renamed from: q */
    private final ScheduledExecutorService f7315q;

    public C1715a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f7299a = new Object();
        this.f7301c = 0;
        this.f7304f = new HashSet();
        this.f7305g = true;
        this.f7308j = C9464i.m28142d();
        this.f7313o = new HashMap();
        this.f7314p = new AtomicInteger(0);
        C5276s.m13325k(context, "WakeLock: context must not be null");
        C5276s.m13321g(str, "WakeLock: wakeLockName must not be empty");
        this.f7312n = context.getApplicationContext();
        this.f7311m = str;
        this.f7307i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f7310l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f7310l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f7300b = newWakeLock;
        if (C9477v.m28185c(context)) {
            WorkSource m28184b = C9477v.m28184b(context, C9475t.m28180b(packageName) ? context.getPackageName() : packageName);
            this.f7309k = m28184b;
            if (m28184b != null) {
                m9324i(newWakeLock, m28184b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f7296s;
        if (scheduledExecutorService == null) {
            synchronized (f7297t) {
                scheduledExecutorService = f7296s;
                if (scheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f7296s = scheduledExecutorService;
                }
            }
        }
        this.f7315q = scheduledExecutorService;
    }

    /* renamed from: e */
    public static /* synthetic */ void m9320e(C1715a c1715a) {
        synchronized (c1715a.f7299a) {
            if (c1715a.m9326b()) {
                Log.e("WakeLock", String.valueOf(c1715a.f7310l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c1715a.m9322g();
                if (c1715a.m9326b()) {
                    c1715a.f7301c = 1;
                    c1715a.m9323h(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m9321f(String str) {
        if (this.f7305g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m9322g() {
        if (this.f7304f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f7304f);
        this.f7304f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r5.f7307i != null) goto L28;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m9323h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f7299a
            monitor-enter(r6)
            boolean r0 = r5.m9326b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        Lb:
            boolean r0 = r5.f7305g     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.f7301c     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + (-1)
            r5.f7301c = r0     // Catch: java.lang.Throwable -> La2
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        L1b:
            r5.f7301c = r1     // Catch: java.lang.Throwable -> La2
        L1d:
            r5.m9322g()     // Catch: java.lang.Throwable -> La2
            java.util.Map<java.lang.String, bb.d> r0 = r5.f7313o     // Catch: java.lang.Throwable -> La2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La2
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La2
            bb.d r2 = (bb.C1718d) r2     // Catch: java.lang.Throwable -> La2
            r2.f7317a = r1     // Catch: java.lang.Throwable -> La2
            goto L2a
        L39:
            java.util.Map<java.lang.String, bb.d> r0 = r5.f7313o     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.Future<?> r0 = r5.f7302d     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La2
            r5.f7302d = r2     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r5.f7303e = r3     // Catch: java.lang.Throwable -> La2
        L4c:
            r5.f7306h = r1     // Catch: java.lang.Throwable -> La2
            android.os.PowerManager$WakeLock r0 = r5.f7300b     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L8f
            android.os.PowerManager$WakeLock r0 = r5.f7300b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            com.google.android.gms.internal.stats.zzb r0 = r5.f7307i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
        L5f:
            r5.f7307i = r2     // Catch: java.lang.Throwable -> La2
            goto La0
        L62:
            r0 = move-exception
            goto L88
        L64:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L87
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f7310l     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.stats.zzb r0 = r5.f7307i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
            goto L5f
        L87:
            throw r0     // Catch: java.lang.Throwable -> L62
        L88:
            com.google.android.gms.internal.stats.zzb r1 = r5.f7307i     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8e
            r5.f7307i = r2     // Catch: java.lang.Throwable -> La2
        L8e:
            throw r0     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f7310l     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> La2
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        La2:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C1715a.m9323h(int):void");
    }

    /* renamed from: i */
    private static void m9324i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    /* renamed from: a */
    public void m9325a(long j10) {
        this.f7314p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f7295r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f7299a) {
            if (!m9326b()) {
                this.f7307i = zzb.zza(false, null);
                this.f7300b.acquire();
                this.f7308j.mo28131b();
            }
            this.f7301c++;
            this.f7306h++;
            m9321f(null);
            C1718d c1718d = this.f7313o.get(null);
            if (c1718d == null) {
                c1718d = new C1718d(null);
                this.f7313o.put(null, c1718d);
            }
            c1718d.f7317a++;
            long mo28131b = this.f7308j.mo28131b();
            long j11 = Long.MAX_VALUE - mo28131b > max ? mo28131b + max : Long.MAX_VALUE;
            if (j11 > this.f7303e) {
                this.f7303e = j11;
                Future<?> future = this.f7302d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f7302d = this.f7315q.schedule(new Runnable() { // from class: bb.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1715a.m9320e(C1715a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean m9326b() {
        boolean z10;
        synchronized (this.f7299a) {
            z10 = this.f7301c > 0;
        }
        return z10;
    }

    /* renamed from: c */
    public void m9327c() {
        if (this.f7314p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f7310l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f7299a) {
            m9321f(null);
            if (this.f7313o.containsKey(null)) {
                C1718d c1718d = this.f7313o.get(null);
                if (c1718d != null) {
                    int i10 = c1718d.f7317a - 1;
                    c1718d.f7317a = i10;
                    if (i10 == 0) {
                        this.f7313o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f7310l).concat(" counter does not exist"));
            }
            m9323h(0);
        }
    }

    /* renamed from: d */
    public void m9328d(boolean z10) {
        synchronized (this.f7299a) {
            this.f7305g = z10;
        }
    }
}
