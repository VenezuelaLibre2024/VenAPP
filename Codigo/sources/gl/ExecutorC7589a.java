package gl;

import ck.C2037v;
import com.google.android.gms.common.api.C5101a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import p089el.C7213c0;
import p089el.C7223h0;
import p494zk.C13042c;
import p494zk.C13092o0;
import sk.AbstractC10933c;
import uk.C11585l;

/* renamed from: gl.a */
/* loaded from: classes3.dex */
public final class ExecutorC7589a implements Executor, Closeable {

    /* renamed from: s */
    public static final a f17932s = new a(null);

    /* renamed from: t */
    private static final AtomicLongFieldUpdater f17933t = AtomicLongFieldUpdater.newUpdater(ExecutorC7589a.class, "parkedWorkersStack");

    /* renamed from: u */
    private static final AtomicLongFieldUpdater f17934u = AtomicLongFieldUpdater.newUpdater(ExecutorC7589a.class, "controlState");

    /* renamed from: v */
    private static final AtomicIntegerFieldUpdater f17935v = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7589a.class, "_isTerminated");

    /* renamed from: w */
    public static final C7223h0 f17936w = new C7223h0("NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: a */
    public final int f17937a;

    /* renamed from: b */
    public final int f17938b;

    /* renamed from: c */
    public final long f17939c;
    private volatile long controlState;

    /* renamed from: d */
    public final String f17940d;

    /* renamed from: e */
    public final C7592d f17941e;

    /* renamed from: f */
    public final C7592d f17942f;
    private volatile long parkedWorkersStack;

    /* renamed from: r */
    public final C7213c0<c> f17943r;

    /* renamed from: gl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: gl.a$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17944a;

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
            f17944a = iArr;
        }
    }

    /* renamed from: gl.a$c */
    /* loaded from: classes3.dex */
    public final class c extends Thread {

        /* renamed from: t */
        private static final AtomicIntegerFieldUpdater f17945t = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a */
        public final C7602n f17946a;

        /* renamed from: b */
        private final C9332x<AbstractRunnableC7596h> f17947b;

        /* renamed from: c */
        public d f17948c;

        /* renamed from: d */
        private long f17949d;

        /* renamed from: e */
        private long f17950e;

        /* renamed from: f */
        private int f17951f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: r */
        public boolean f17952r;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f17946a = new C7602n();
            this.f17947b = new C9332x<>();
            this.f17948c = d.DORMANT;
            this.nextParkedWorker = ExecutorC7589a.f17936w;
            this.f17951f = AbstractC10933c.f27828a.mo33397c();
        }

        public c(ExecutorC7589a executorC7589a, int i10) {
            this();
            m23086q(i10);
        }

        /* renamed from: b */
        private final void m23067b(int i10) {
            if (i10 == 0) {
                return;
            }
            ExecutorC7589a.f17934u.addAndGet(ExecutorC7589a.this, -2097152L);
            if (this.f17948c != d.TERMINATED) {
                this.f17948c = d.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m23068c(int i10) {
            if (i10 != 0 && m23088u(d.BLOCKING)) {
                ExecutorC7589a.this.m23061I();
            }
        }

        /* renamed from: d */
        private final void m23069d(AbstractRunnableC7596h abstractRunnableC7596h) {
            int mo23094b = abstractRunnableC7596h.f17964b.mo23094b();
            m23073k(mo23094b);
            m23068c(mo23094b);
            ExecutorC7589a.this.m23059B(abstractRunnableC7596h);
            m23067b(mo23094b);
        }

        /* renamed from: e */
        private final AbstractRunnableC7596h m23070e(boolean z10) {
            AbstractRunnableC7596h m23076o;
            AbstractRunnableC7596h m23076o2;
            if (z10) {
                boolean z11 = m23085m(ExecutorC7589a.this.f17937a * 2) == 0;
                if (z11 && (m23076o2 = m23076o()) != null) {
                    return m23076o2;
                }
                AbstractRunnableC7596h m23108g = this.f17946a.m23108g();
                if (m23108g != null) {
                    return m23108g;
                }
                if (!z11 && (m23076o = m23076o()) != null) {
                    return m23076o;
                }
            } else {
                AbstractRunnableC7596h m23076o3 = m23076o();
                if (m23076o3 != null) {
                    return m23076o3;
                }
            }
            return m23080v(3);
        }

        /* renamed from: f */
        private final AbstractRunnableC7596h m23071f() {
            AbstractRunnableC7596h m23109h = this.f17946a.m23109h();
            if (m23109h != null) {
                return m23109h;
            }
            AbstractRunnableC7596h m21663d = ExecutorC7589a.this.f17942f.m21663d();
            return m21663d == null ? m23080v(1) : m21663d;
        }

        /* renamed from: j */
        public static final AtomicIntegerFieldUpdater m23072j() {
            return f17945t;
        }

        /* renamed from: k */
        private final void m23073k(int i10) {
            this.f17949d = 0L;
            if (this.f17948c == d.PARKING) {
                this.f17948c = d.BLOCKING;
            }
        }

        /* renamed from: l */
        private final boolean m23074l() {
            return this.nextParkedWorker != ExecutorC7589a.f17936w;
        }

        /* renamed from: n */
        private final void m23075n() {
            if (this.f17949d == 0) {
                this.f17949d = System.nanoTime() + ExecutorC7589a.this.f17939c;
            }
            LockSupport.parkNanos(ExecutorC7589a.this.f17939c);
            if (System.nanoTime() - this.f17949d >= 0) {
                this.f17949d = 0L;
                m23081w();
            }
        }

        /* renamed from: o */
        private final AbstractRunnableC7596h m23076o() {
            C7592d c7592d;
            if (m23085m(2) == 0) {
                AbstractRunnableC7596h m21663d = ExecutorC7589a.this.f17941e.m21663d();
                if (m21663d != null) {
                    return m21663d;
                }
                c7592d = ExecutorC7589a.this.f17942f;
            } else {
                AbstractRunnableC7596h m21663d2 = ExecutorC7589a.this.f17942f.m21663d();
                if (m21663d2 != null) {
                    return m21663d2;
                }
                c7592d = ExecutorC7589a.this.f17941e;
            }
            return c7592d.m21663d();
        }

        /* renamed from: p */
        private final void m23077p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC7589a.this.isTerminated() && this.f17948c != d.TERMINATED) {
                    AbstractRunnableC7596h m23082g = m23082g(this.f17952r);
                    if (m23082g != null) {
                        this.f17950e = 0L;
                        m23069d(m23082g);
                    } else {
                        this.f17952r = false;
                        if (this.f17950e == 0) {
                            m23079t();
                        } else if (z10) {
                            m23088u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f17950e);
                            this.f17950e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            m23088u(d.TERMINATED);
        }

        /* renamed from: s */
        private final boolean m23078s() {
            boolean z10;
            if (this.f17948c == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC7589a executorC7589a = ExecutorC7589a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7589a.f17934u;
            while (true) {
                long j10 = atomicLongFieldUpdater.get(executorC7589a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    z10 = false;
                    break;
                }
                if (ExecutorC7589a.f17934u.compareAndSet(executorC7589a, j10, j10 - 4398046511104L)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return false;
            }
            this.f17948c = d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: t */
        private final void m23079t() {
            if (!m23074l()) {
                ExecutorC7589a.this.m23064q(this);
                return;
            }
            f17945t.set(this, -1);
            while (m23074l() && f17945t.get(this) == -1 && !ExecutorC7589a.this.isTerminated() && this.f17948c != d.TERMINATED) {
                m23088u(d.PARKING);
                Thread.interrupted();
                m23075n();
            }
        }

        /* renamed from: v */
        private final AbstractRunnableC7596h m23080v(int i10) {
            int i11 = (int) (ExecutorC7589a.f17934u.get(ExecutorC7589a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m23085m = m23085m(i11);
            ExecutorC7589a executorC7589a = ExecutorC7589a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m23085m++;
                if (m23085m > i11) {
                    m23085m = 1;
                }
                c m21545b = executorC7589a.f17943r.m21545b(m23085m);
                if (m21545b != null && m21545b != this) {
                    long m23110n = m21545b.f17946a.m23110n(i10, this.f17947b);
                    if (m23110n == -1) {
                        C9332x<AbstractRunnableC7596h> c9332x = this.f17947b;
                        AbstractRunnableC7596h abstractRunnableC7596h = c9332x.f22581a;
                        c9332x.f22581a = null;
                        return abstractRunnableC7596h;
                    }
                    if (m23110n > 0) {
                        j10 = Math.min(j10, m23110n);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f17950e = j10;
            return null;
        }

        /* renamed from: w */
        private final void m23081w() {
            ExecutorC7589a executorC7589a = ExecutorC7589a.this;
            synchronized (executorC7589a.f17943r) {
                if (executorC7589a.isTerminated()) {
                    return;
                }
                if (((int) (ExecutorC7589a.f17934u.get(executorC7589a) & 2097151)) <= executorC7589a.f17937a) {
                    return;
                }
                if (f17945t.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    m23086q(0);
                    executorC7589a.m23065y(this, i10, 0);
                    int andDecrement = (int) (ExecutorC7589a.f17934u.getAndDecrement(executorC7589a) & 2097151);
                    if (andDecrement != i10) {
                        c m21545b = executorC7589a.f17943r.m21545b(andDecrement);
                        C9322n.m27778b(m21545b);
                        c cVar = m21545b;
                        executorC7589a.f17943r.m21546c(i10, cVar);
                        cVar.m23086q(i10);
                        executorC7589a.m23065y(cVar, andDecrement, i10);
                    }
                    executorC7589a.f17943r.m21546c(andDecrement, null);
                    C2037v c2037v = C2037v.f8089a;
                    this.f17948c = d.TERMINATED;
                }
            }
        }

        /* renamed from: g */
        public final AbstractRunnableC7596h m23082g(boolean z10) {
            return m23078s() ? m23070e(z10) : m23071f();
        }

        /* renamed from: h */
        public final int m23083h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m23084i() {
            return this.nextParkedWorker;
        }

        /* renamed from: m */
        public final int m23085m(int i10) {
            int i11 = this.f17951f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f17951f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & C5101a.e.API_PRIORITY_OTHER) % i10;
        }

        /* renamed from: q */
        public final void m23086q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC7589a.this.f17940d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: r */
        public final void m23087r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m23077p();
        }

        /* renamed from: u */
        public final boolean m23088u(d dVar) {
            d dVar2 = this.f17948c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                ExecutorC7589a.f17934u.addAndGet(ExecutorC7589a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f17948c = dVar;
            }
            return z10;
        }
    }

    /* renamed from: gl.a$d */
    /* loaded from: classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC7589a(int i10, int i11, long j10, String str) {
        this.f17937a = i10;
        this.f17938b = i11;
        this.f17939c = j10;
        this.f17940d = str;
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
        this.f17941e = new C7592d();
        this.f17942f = new C7592d();
        this.f17943r = new C7213c0<>((i10 + 1) * 2);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: H */
    private final void m23047H(long j10, boolean z10) {
        if (z10 || m23051S() || m23049Q(j10)) {
            return;
        }
        m23051S();
    }

    /* renamed from: O */
    private final AbstractRunnableC7596h m23048O(c cVar, AbstractRunnableC7596h abstractRunnableC7596h, boolean z10) {
        if (cVar == null || cVar.f17948c == d.TERMINATED) {
            return abstractRunnableC7596h;
        }
        if (abstractRunnableC7596h.f17964b.mo23094b() == 0 && cVar.f17948c == d.BLOCKING) {
            return abstractRunnableC7596h;
        }
        cVar.f17952r = true;
        return cVar.f17946a.m23105a(abstractRunnableC7596h, z10);
    }

    /* renamed from: Q */
    private final boolean m23049Q(long j10) {
        int m36293b;
        m36293b = C11585l.m36293b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (m36293b < this.f17937a) {
            int m23054e = m23054e();
            if (m23054e == 1 && this.f17937a > 1) {
                m23054e();
            }
            if (m23054e > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    static /* synthetic */ boolean m23050R(ExecutorC7589a executorC7589a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f17934u.get(executorC7589a);
        }
        return executorC7589a.m23049Q(j10);
    }

    /* renamed from: S */
    private final boolean m23051S() {
        c m23058o;
        do {
            m23058o = m23058o();
            if (m23058o == null) {
                return false;
            }
        } while (!c.m23072j().compareAndSet(m23058o, -1, 0));
        LockSupport.unpark(m23058o);
        return true;
    }

    /* renamed from: b */
    private final boolean m23053b(AbstractRunnableC7596h abstractRunnableC7596h) {
        return (abstractRunnableC7596h.f17964b.mo23094b() == 1 ? this.f17942f : this.f17941e).m21660a(abstractRunnableC7596h);
    }

    /* renamed from: e */
    private final int m23054e() {
        int m36293b;
        synchronized (this.f17943r) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17934u;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            m36293b = C11585l.m36293b(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (m36293b >= this.f17937a) {
                return 0;
            }
            if (i10 >= this.f17938b) {
                return 0;
            }
            int i11 = ((int) (f17934u.get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f17943r.m21545b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f17943r.m21546c(i11, cVar);
            if (!(i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = m36293b + 1;
            cVar.start();
            return i12;
        }
    }

    /* renamed from: g */
    private final c m23055g() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !C9322n.m27777a(ExecutorC7589a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: j */
    public static /* synthetic */ void m23056j(ExecutorC7589a executorC7589a, Runnable runnable, InterfaceC7597i interfaceC7597i, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC7597i = C7600l.f17973g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC7589a.m23063i(runnable, interfaceC7597i, z10);
    }

    /* renamed from: n */
    private final int m23057n(c cVar) {
        int m23083h;
        do {
            Object m23084i = cVar.m23084i();
            if (m23084i == f17936w) {
                return -1;
            }
            if (m23084i == null) {
                return 0;
            }
            cVar = (c) m23084i;
            m23083h = cVar.m23083h();
        } while (m23083h == 0);
        return m23083h;
    }

    /* renamed from: o */
    private final c m23058o() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17933t;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c m21545b = this.f17943r.m21545b((int) (2097151 & j10));
            if (m21545b == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int m23057n = m23057n(m21545b);
            if (m23057n >= 0 && f17933t.compareAndSet(this, j10, m23057n | j11)) {
                m21545b.m23087r(f17936w);
                return m21545b;
            }
        }
    }

    /* renamed from: B */
    public final void m23059B(AbstractRunnableC7596h abstractRunnableC7596h) {
        try {
            abstractRunnableC7596h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: E */
    public final void m23060E(long j10) {
        int i10;
        AbstractRunnableC7596h m21663d;
        if (f17935v.compareAndSet(this, 0, 1)) {
            c m23055g = m23055g();
            synchronized (this.f17943r) {
                i10 = (int) (f17934u.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c m21545b = this.f17943r.m21545b(i11);
                    C9322n.m27778b(m21545b);
                    c cVar = m21545b;
                    if (cVar != m23055g) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f17946a.m23107f(this.f17942f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f17942f.m21661b();
            this.f17941e.m21661b();
            while (true) {
                if (m23055g != null) {
                    m21663d = m23055g.m23082g(true);
                    if (m21663d != null) {
                        continue;
                        m23059B(m21663d);
                    }
                }
                m21663d = this.f17941e.m21663d();
                if (m21663d == null && (m21663d = this.f17942f.m21663d()) == null) {
                    break;
                }
                m23059B(m21663d);
            }
            if (m23055g != null) {
                m23055g.m23088u(d.TERMINATED);
            }
            f17933t.set(this, 0L);
            f17934u.set(this, 0L);
        }
    }

    /* renamed from: I */
    public final void m23061I() {
        if (m23051S() || m23050R(this, 0L, 1, null)) {
            return;
        }
        m23051S();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m23060E(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m23056j(this, runnable, null, false, 6, null);
    }

    /* renamed from: f */
    public final AbstractRunnableC7596h m23062f(Runnable runnable, InterfaceC7597i interfaceC7597i) {
        long mo23090a = C7600l.f17972f.mo23090a();
        if (!(runnable instanceof AbstractRunnableC7596h)) {
            return new C7599k(runnable, mo23090a, interfaceC7597i);
        }
        AbstractRunnableC7596h abstractRunnableC7596h = (AbstractRunnableC7596h) runnable;
        abstractRunnableC7596h.f17963a = mo23090a;
        abstractRunnableC7596h.f17964b = interfaceC7597i;
        return abstractRunnableC7596h;
    }

    /* renamed from: i */
    public final void m23063i(Runnable runnable, InterfaceC7597i interfaceC7597i, boolean z10) {
        C13042c.m43062a();
        AbstractRunnableC7596h m23062f = m23062f(runnable, interfaceC7597i);
        boolean z11 = false;
        boolean z12 = m23062f.f17964b.mo23094b() == 1;
        long addAndGet = z12 ? f17934u.addAndGet(this, 2097152L) : 0L;
        c m23055g = m23055g();
        AbstractRunnableC7596h m23048O = m23048O(m23055g, m23062f, z10);
        if (m23048O != null && !m23053b(m23048O)) {
            throw new RejectedExecutionException(this.f17940d + " was terminated");
        }
        if (z10 && m23055g != null) {
            z11 = true;
        }
        if (z12) {
            m23047H(addAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            m23061I();
        }
    }

    public final boolean isTerminated() {
        return f17935v.get(this) != 0;
    }

    /* renamed from: q */
    public final boolean m23064q(c cVar) {
        long j10;
        int m23083h;
        if (cVar.m23084i() != f17936w) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17933t;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            m23083h = cVar.m23083h();
            cVar.m23087r(this.f17943r.m21545b((int) (2097151 & j10)));
        } while (!f17933t.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | m23083h));
        return true;
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int m21544a = this.f17943r.m21544a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < m21544a; i15++) {
            c m21545b = this.f17943r.m21545b(i15);
            if (m21545b != null) {
                int m23106e = m21545b.f17946a.m23106e();
                int i16 = b.f17944a[m21545b.f17948c.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(m23106e);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(m23106e);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (m23106e > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(m23106e);
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
        long j10 = f17934u.get(this);
        return this.f17940d + '@' + C13092o0.m43274b(this) + "[Pool Size {core = " + this.f17937a + ", max = " + this.f17938b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f17941e.m21662c() + ", global blocking queue size = " + this.f17942f.m21662c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f17937a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: y */
    public final void m23065y(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17933t;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? m23057n(cVar) : i11;
            }
            if (i12 >= 0 && f17933t.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }
}
