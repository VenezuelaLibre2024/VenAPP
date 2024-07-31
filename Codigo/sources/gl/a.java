package gl;

import ck.v;
import com.google.android.gms.common.api.a;
import el.c0;
import el.h0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.x;
import zk.o0;

/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* renamed from: s */
    public static final C0269a f16295s = new C0269a(null);

    /* renamed from: t */
    private static final AtomicLongFieldUpdater f16296t = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: u */
    private static final AtomicLongFieldUpdater f16297u = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: v */
    private static final AtomicIntegerFieldUpdater f16298v = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: w */
    public static final h0 f16299w = new h0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a */
    public final int f16300a;

    /* renamed from: b */
    public final int f16301b;

    /* renamed from: c */
    public final long f16302c;
    private volatile long controlState;

    /* renamed from: d */
    public final String f16303d;

    /* renamed from: e */
    public final gl.d f16304e;

    /* renamed from: f */
    public final gl.d f16305f;
    private volatile long parkedWorkersStack;

    /* renamed from: r */
    public final c0<c> f16306r;

    /* renamed from: gl.a$a */
    /* loaded from: classes3.dex */
    public static final class C0269a {
        private C0269a() {
        }

        public /* synthetic */ C0269a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16307a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16307a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends Thread {

        /* renamed from: t */
        private static final AtomicIntegerFieldUpdater f16308t = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a */
        public final n f16309a;

        /* renamed from: b */
        private final x<h> f16310b;

        /* renamed from: c */
        public d f16311c;

        /* renamed from: d */
        private long f16312d;

        /* renamed from: e */
        private long f16313e;

        /* renamed from: f */
        private int f16314f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: r */
        public boolean f16315r;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f16309a = new n();
            this.f16310b = new x<>();
            this.f16311c = d.DORMANT;
            this.nextParkedWorker = a.f16299w;
            this.f16314f = sk.c.f25684a.c();
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f16297u.addAndGet(a.this, -2097152L);
            if (this.f16311c != d.TERMINATED) {
                this.f16311c = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.I();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f16327b.b();
            k(b10);
            c(b10);
            a.this.B(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h o10;
            h o11;
            if (z10) {
                boolean z11 = m(a.this.f16300a * 2) == 0;
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f16309a.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f16309a.h();
            if (h10 != null) {
                return h10;
            }
            h d10 = a.this.f16305f.d();
            return d10 == null ? v(1) : d10;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f16308t;
        }

        private final void k(int i10) {
            this.f16312d = 0L;
            if (this.f16311c == d.PARKING) {
                this.f16311c = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f16299w;
        }

        private final void n() {
            if (this.f16312d == 0) {
                this.f16312d = System.nanoTime() + a.this.f16302c;
            }
            LockSupport.parkNanos(a.this.f16302c);
            if (System.nanoTime() - this.f16312d >= 0) {
                this.f16312d = 0L;
                w();
            }
        }

        private final h o() {
            gl.d dVar;
            if (m(2) == 0) {
                h d10 = a.this.f16304e.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f16305f;
            } else {
                h d11 = a.this.f16305f.d();
                if (d11 != null) {
                    return d11;
                }
                dVar = a.this.f16304e;
            }
            return dVar.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f16311c != d.TERMINATED) {
                    h g10 = g(this.f16315r);
                    if (g10 != null) {
                        this.f16313e = 0L;
                        d(g10);
                    } else {
                        this.f16315r = false;
                        if (this.f16313e == 0) {
                            t();
                        } else if (z10) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f16313e);
                            this.f16313e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f16311c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f16297u;
            while (true) {
                long j10 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    z10 = false;
                    break;
                }
                if (a.f16297u.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
            this.f16311c = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.q(this);
                return;
            }
            f16308t.set(this, -1);
            while (l() && f16308t.get(this) == -1 && !a.this.isTerminated() && this.f16311c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f16297u.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c b10 = aVar.f16306r.b(m10);
                if (b10 != null && b10 != this) {
                    long n10 = b10.f16309a.n(i10, this.f16310b);
                    if (n10 == -1) {
                        x<h> xVar = this.f16310b;
                        h hVar = xVar.f20759a;
                        xVar.f20759a = null;
                        return hVar;
                    }
                    if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f16313e = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f16306r) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f16297u.get(aVar) & 2097151)) <= aVar.f16300a) {
                    return;
                }
                if (f16308t.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    q(0);
                    aVar.y(this, i10, 0);
                    int andDecrement = (int) (a.f16297u.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c b10 = aVar.f16306r.b(andDecrement);
                        kotlin.jvm.internal.n.b(b10);
                        c cVar = b10;
                        aVar.f16306r.c(i10, cVar);
                        cVar.q(i10);
                        aVar.y(cVar, andDecrement, i10);
                    }
                    aVar.f16306r.c(andDecrement, null);
                    v vVar = v.f7137a;
                    this.f16311c = d.TERMINATED;
                }
            }
        }

        public final h g(boolean z10) {
            return s() ? e(z10) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f16314f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f16314f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & a.e.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f16303d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f16311c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f16297u.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f16311c = dVar;
            }
            return z10;
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f16300a = i10;
        this.f16301b = i11;
        this.f16302c = j10;
        this.f16303d = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f16304e = new gl.d();
        this.f16305f = new gl.d();
        this.f16306r = new c0<>((i10 + 1) * 2);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    private final void H(long j10, boolean z10) {
        if (z10 || S() || Q(j10)) {
            return;
        }
        S();
    }

    private final h O(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f16311c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f16327b.b() == 0 && cVar.f16311c == d.BLOCKING) {
            return hVar;
        }
        cVar.f16315r = true;
        return cVar.f16309a.a(hVar, z10);
    }

    private final boolean Q(long j10) {
        int b10;
        b10 = uk.l.b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (b10 < this.f16300a) {
            int e10 = e();
            if (e10 == 1 && this.f16300a > 1) {
                e();
            }
            if (e10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean R(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f16297u.get(aVar);
        }
        return aVar.Q(j10);
    }

    private final boolean S() {
        c o10;
        do {
            o10 = o();
            if (o10 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(o10, -1, 0));
        LockSupport.unpark(o10);
        return true;
    }

    private final boolean b(h hVar) {
        return (hVar.f16327b.b() == 1 ? this.f16305f : this.f16304e).a(hVar);
    }

    private final int e() {
        int b10;
        synchronized (this.f16306r) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16297u;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            b10 = uk.l.b(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (b10 >= this.f16300a) {
                return 0;
            }
            if (i10 >= this.f16301b) {
                return 0;
            }
            int i11 = ((int) (f16297u.get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f16306r.b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f16306r.c(i11, cVar);
            if (!(i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = b10 + 1;
            cVar.start();
            return i12;
        }
    }

    private final c g() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !kotlin.jvm.internal.n.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f16336g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.i(runnable, iVar, z10);
    }

    private final int n(c cVar) {
        int h10;
        do {
            Object i10 = cVar.i();
            if (i10 == f16299w) {
                return -1;
            }
            if (i10 == null) {
                return 0;
            }
            cVar = (c) i10;
            h10 = cVar.h();
        } while (h10 == 0);
        return h10;
    }

    private final c o() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16296t;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f16306r.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int n10 = n(b10);
            if (n10 >= 0 && f16296t.compareAndSet(this, j10, n10 | j11)) {
                b10.r(f16299w);
                return b10;
            }
        }
    }

    public final void B(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void E(long j10) {
        int i10;
        h d10;
        if (f16298v.compareAndSet(this, 0, 1)) {
            c g10 = g();
            synchronized (this.f16306r) {
                i10 = (int) (f16297u.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f16306r.b(i11);
                    kotlin.jvm.internal.n.b(b10);
                    c cVar = b10;
                    if (cVar != g10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f16309a.f(this.f16305f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f16305f.b();
            this.f16304e.b();
            while (true) {
                if (g10 != null) {
                    d10 = g10.g(true);
                    if (d10 != null) {
                        continue;
                        B(d10);
                    }
                }
                d10 = this.f16304e.d();
                if (d10 == null && (d10 = this.f16305f.d()) == null) {
                    break;
                }
                B(d10);
            }
            if (g10 != null) {
                g10.u(d.TERMINATED);
            }
            f16296t.set(this, 0L);
            f16297u.set(this, 0L);
        }
    }

    public final void I() {
        if (S() || R(this, 0L, 1, null)) {
            return;
        }
        S();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        E(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final h f(Runnable runnable, i iVar) {
        long a10 = l.f16335f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a10, iVar);
        }
        h hVar = (h) runnable;
        hVar.f16326a = a10;
        hVar.f16327b = iVar;
        return hVar;
    }

    public final void i(Runnable runnable, i iVar, boolean z10) {
        zk.c.a();
        h f10 = f(runnable, iVar);
        boolean z11 = false;
        boolean z12 = f10.f16327b.b() == 1;
        long addAndGet = z12 ? f16297u.addAndGet(this, 2097152L) : 0L;
        c g10 = g();
        h O = O(g10, f10, z10);
        if (O != null && !b(O)) {
            throw new RejectedExecutionException(this.f16303d + " was terminated");
        }
        if (z10 && g10 != null) {
            z11 = true;
        }
        if (z12) {
            H(addAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            I();
        }
    }

    public final boolean isTerminated() {
        return f16298v.get(this) != 0;
    }

    public final boolean q(c cVar) {
        long j10;
        int h10;
        if (cVar.i() != f16299w) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16296t;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            h10 = cVar.h();
            cVar.r(this.f16306r.b((int) (2097151 & j10)));
        } while (!f16296t.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | h10));
        return true;
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f16306r.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f16306r.b(i15);
            if (b10 != null) {
                int e10 = b10.f16309a.e();
                int i16 = b.f16307a[b10.f16311c.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(e10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(e10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (e10 > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(e10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = f16297u.get(this);
        return this.f16303d + '@' + o0.b(this) + "[Pool Size {core = " + this.f16300a + ", max = " + this.f16301b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f16304e.c() + ", global blocking queue size = " + this.f16305f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f16300a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void y(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16296t;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? n(cVar) : i11;
            }
            if (i12 >= 0 && f16296t.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }
}
