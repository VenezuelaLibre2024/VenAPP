package bb;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
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
import la.i;
import la.t;
import la.v;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: r */
    private static final long f6373r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f6374s = null;

    /* renamed from: t */
    private static final Object f6375t = new Object();

    /* renamed from: u */
    private static volatile e f6376u = new c();

    /* renamed from: a */
    private final Object f6377a;

    /* renamed from: b */
    private final PowerManager.WakeLock f6378b;

    /* renamed from: c */
    private int f6379c;

    /* renamed from: d */
    private Future<?> f6380d;

    /* renamed from: e */
    private long f6381e;

    /* renamed from: f */
    private final Set<f> f6382f;

    /* renamed from: g */
    private boolean f6383g;

    /* renamed from: h */
    private int f6384h;

    /* renamed from: i */
    zzb f6385i;

    /* renamed from: j */
    private la.f f6386j;

    /* renamed from: k */
    private WorkSource f6387k;

    /* renamed from: l */
    private final String f6388l;

    /* renamed from: m */
    private final String f6389m;

    /* renamed from: n */
    private final Context f6390n;

    /* renamed from: o */
    private final Map<String, d> f6391o;

    /* renamed from: p */
    private AtomicInteger f6392p;

    /* renamed from: q */
    private final ScheduledExecutorService f6393q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f6377a = new Object();
        this.f6379c = 0;
        this.f6382f = new HashSet();
        this.f6383g = true;
        this.f6386j = i.d();
        this.f6391o = new HashMap();
        this.f6392p = new AtomicInteger(0);
        s.k(context, "WakeLock: context must not be null");
        s.g(str, "WakeLock: wakeLockName must not be empty");
        this.f6390n = context.getApplicationContext();
        this.f6389m = str;
        this.f6385i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f6388l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f6388l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f6378b = newWakeLock;
        if (v.c(context)) {
            WorkSource b10 = v.b(context, t.b(packageName) ? context.getPackageName() : packageName);
            this.f6387k = b10;
            if (b10 != null) {
                i(newWakeLock, b10);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f6374s;
        if (scheduledExecutorService == null) {
            synchronized (f6375t) {
                scheduledExecutorService = f6374s;
                if (scheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f6374s = scheduledExecutorService;
                }
            }
        }
        this.f6393q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f6377a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f6388l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.f6379c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f6383g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f6382f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f6382f);
        this.f6382f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r5.f6385i != null) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f6377a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        Lb:
            boolean r0 = r5.f6383g     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.f6379c     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + (-1)
            r5.f6379c = r0     // Catch: java.lang.Throwable -> La2
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        L1b:
            r5.f6379c = r1     // Catch: java.lang.Throwable -> La2
        L1d:
            r5.g()     // Catch: java.lang.Throwable -> La2
            java.util.Map<java.lang.String, bb.d> r0 = r5.f6391o     // Catch: java.lang.Throwable -> La2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La2
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La2
            bb.d r2 = (bb.d) r2     // Catch: java.lang.Throwable -> La2
            r2.f6395a = r1     // Catch: java.lang.Throwable -> La2
            goto L2a
        L39:
            java.util.Map<java.lang.String, bb.d> r0 = r5.f6391o     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.Future<?> r0 = r5.f6380d     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La2
            r5.f6380d = r2     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r5.f6381e = r3     // Catch: java.lang.Throwable -> La2
        L4c:
            r5.f6384h = r1     // Catch: java.lang.Throwable -> La2
            android.os.PowerManager$WakeLock r0 = r5.f6378b     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L8f
            android.os.PowerManager$WakeLock r0 = r5.f6378b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            com.google.android.gms.internal.stats.zzb r0 = r5.f6385i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
        L5f:
            r5.f6385i = r2     // Catch: java.lang.Throwable -> La2
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
            java.lang.String r3 = r5.f6388l     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.stats.zzb r0 = r5.f6385i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
            goto L5f
        L87:
            throw r0     // Catch: java.lang.Throwable -> L62
        L88:
            com.google.android.gms.internal.stats.zzb r1 = r5.f6385i     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8e
            r5.f6385i = r2     // Catch: java.lang.Throwable -> La2
        L8e:
            throw r0     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f6388l     // Catch: java.lang.Throwable -> La2
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
        throw new UnsupportedOperationException("Method not decompiled: bb.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f6392p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f6373r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f6377a) {
            if (!b()) {
                this.f6385i = zzb.zza(false, null);
                this.f6378b.acquire();
                this.f6386j.b();
            }
            this.f6379c++;
            this.f6384h++;
            f(null);
            d dVar = this.f6391o.get(null);
            if (dVar == null) {
                dVar = new d(null);
                this.f6391o.put(null, dVar);
            }
            dVar.f6395a++;
            long b10 = this.f6386j.b();
            long j11 = Long.MAX_VALUE - b10 > max ? b10 + max : Long.MAX_VALUE;
            if (j11 > this.f6381e) {
                this.f6381e = j11;
                Future<?> future = this.f6380d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f6380d = this.f6393q.schedule(new Runnable() { // from class: bb.b
                    public /* synthetic */ b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e(a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f6377a) {
            z10 = this.f6379c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f6392p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f6388l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f6377a) {
            f(null);
            if (this.f6391o.containsKey(null)) {
                d dVar = this.f6391o.get(null);
                if (dVar != null) {
                    int i10 = dVar.f6395a - 1;
                    dVar.f6395a = i10;
                    if (i10 == 0) {
                        this.f6391o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f6388l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z10) {
        synchronized (this.f6377a) {
            this.f6383g = z10;
        }
    }
}
