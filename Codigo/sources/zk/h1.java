package zk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zk.t0;

/* loaded from: classes3.dex */
public abstract class h1 extends i1 implements t0 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f32895f = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_queue");

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f32896r = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_delayed");

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f32897s = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends b {

        /* renamed from: c */
        private final Runnable f32898c;

        public a(long j10, Runnable runnable) {
            super(j10);
            this.f32898c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32898c.run();
        }

        @Override // zk.h1.b
        public String toString() {
            return super.toString() + this.f32898c;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b implements Runnable, Comparable<b>, c1, el.o0 {
        private volatile Object _heap;

        /* renamed from: a */
        public long f32899a;

        /* renamed from: b */
        private int f32900b = -1;

        public b(long j10) {
            this.f32899a = j10;
        }

        @Override // el.o0
        public void b(el.n0<?> n0Var) {
            el.h0 h0Var;
            Object obj = this._heap;
            h0Var = k1.f32905a;
            if (!(obj != h0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = n0Var;
        }

        @Override // zk.c1
        public final void dispose() {
            el.h0 h0Var;
            el.h0 h0Var2;
            synchronized (this) {
                Object obj = this._heap;
                h0Var = k1.f32905a;
                if (obj == h0Var) {
                    return;
                }
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    cVar.g(this);
                }
                h0Var2 = k1.f32905a;
                this._heap = h0Var2;
                ck.v vVar = ck.v.f7137a;
            }
        }

        @Override // el.o0
        public int getIndex() {
            return this.f32900b;
        }

        @Override // el.o0
        public el.n0<?> i() {
            Object obj = this._heap;
            if (obj instanceof el.n0) {
                return (el.n0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: l */
        public int compareTo(b bVar) {
            long j10 = this.f32899a - bVar.f32899a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:10:0x000d, B:17:0x0021, B:18:0x0037, B:20:0x0040, B:21:0x0042, B:26:0x0024, B:29:0x002e), top: B:9:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m(long r8, zk.h1.c r10, zk.h1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4c
                el.h0 r1 = zk.k1.b()     // Catch: java.lang.Throwable -> L4c
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4c
                el.o0 r0 = r10.b()     // Catch: java.lang.Throwable -> L49
                zk.h1$b r0 = (zk.h1.b) r0     // Catch: java.lang.Throwable -> L49
                boolean r11 = zk.h1.x1(r11)     // Catch: java.lang.Throwable -> L49
                if (r11 == 0) goto L1d
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f32901c = r8     // Catch: java.lang.Throwable -> L49
                goto L37
            L24:
                long r3 = r0.f32899a     // Catch: java.lang.Throwable -> L49
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f32901c     // Catch: java.lang.Throwable -> L49
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f32899a     // Catch: java.lang.Throwable -> L49
                long r3 = r10.f32901c     // Catch: java.lang.Throwable -> L49
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f32899a = r3     // Catch: java.lang.Throwable -> L49
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L49
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r7)
                r8 = 0
                return r8
            L49:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                throw r8     // Catch: java.lang.Throwable -> L4c
            L4c:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zk.h1.b.m(long, zk.h1$c, zk.h1):int");
        }

        public final boolean n(long j10) {
            return j10 - this.f32899a >= 0;
        }

        @Override // el.o0
        public void setIndex(int i10) {
            this.f32900b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f32899a + ']';
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends el.n0<b> {

        /* renamed from: c */
        public long f32901c;

        public c(long j10) {
            this.f32901c = j10;
        }
    }

    private final boolean B1(Runnable runnable) {
        el.h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32895f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (C1()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f32895f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof el.u) {
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                el.u uVar = (el.u) obj;
                int a10 = uVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f32895f, this, obj, uVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                h0Var = k1.f32906b;
                if (obj == h0Var) {
                    return false;
                }
                el.u uVar2 = new el.u(8, true);
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.a((Runnable) obj);
                uVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f32895f, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    public final boolean C1() {
        return f32897s.get(this) != 0;
    }

    private final void E1() {
        b i10;
        zk.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f32896r.get(this);
            if (cVar == null || (i10 = cVar.i()) == null) {
                return;
            } else {
                v1(nanoTime, i10);
            }
        }
    }

    private final int H1(long j10, b bVar) {
        if (C1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32896r;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new c(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.n.b(obj);
            cVar = (c) obj;
        }
        return bVar.m(j10, cVar, this);
    }

    private final void J1(boolean z10) {
        f32897s.set(this, z10 ? 1 : 0);
    }

    private final boolean K1(b bVar) {
        c cVar = (c) f32896r.get(this);
        return (cVar != null ? cVar.e() : null) == bVar;
    }

    private final void y1() {
        el.h0 h0Var;
        el.h0 h0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32895f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f32895f;
                h0Var = k1.f32906b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, h0Var)) {
                    return;
                }
            } else {
                if (obj instanceof el.u) {
                    ((el.u) obj).d();
                    return;
                }
                h0Var2 = k1.f32906b;
                if (obj == h0Var2) {
                    return;
                }
                el.u uVar = new el.u(8, true);
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f32895f, this, obj, uVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable z1() {
        el.h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32895f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof el.u) {
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                el.u uVar = (el.u) obj;
                Object j10 = uVar.j();
                if (j10 != el.u.f14814h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f32895f, this, obj, uVar.i());
            } else {
                h0Var = k1.f32906b;
                if (obj == h0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f32895f, this, obj, null)) {
                    kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void A1(Runnable runnable) {
        if (B1(runnable)) {
            w1();
        } else {
            p0.f32919t.A1(runnable);
        }
    }

    @Override // zk.h0
    public final void D0(gk.f fVar, Runnable runnable) {
        A1(runnable);
    }

    public boolean D1() {
        el.h0 h0Var;
        if (!b1()) {
            return false;
        }
        c cVar = (c) f32896r.get(this);
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = f32895f.get(this);
        if (obj != null) {
            if (obj instanceof el.u) {
                return ((el.u) obj).g();
            }
            h0Var = k1.f32906b;
            if (obj != h0Var) {
                return false;
            }
        }
        return true;
    }

    public final void F1() {
        f32895f.set(this, null);
        f32896r.set(this, null);
    }

    public final void G1(long j10, b bVar) {
        int H1 = H1(j10, bVar);
        if (H1 == 0) {
            if (K1(bVar)) {
                w1();
            }
        } else if (H1 == 1) {
            v1(j10, bVar);
        } else if (H1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final c1 I1(long j10, Runnable runnable) {
        long c10 = k1.c(j10);
        if (c10 >= 4611686018427387903L) {
            return j2.f32904a;
        }
        zk.c.a();
        long nanoTime = System.nanoTime();
        a aVar = new a(c10 + nanoTime, runnable);
        G1(nanoTime, aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zk.g1
    public long T0() {
        b e10;
        long c10;
        el.h0 h0Var;
        if (super.T0() == 0) {
            return 0L;
        }
        Object obj = f32895f.get(this);
        if (obj != null) {
            if (!(obj instanceof el.u)) {
                h0Var = k1.f32906b;
                return obj == h0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((el.u) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) f32896r.get(this);
        if (cVar == null || (e10 = cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f32899a;
        zk.c.a();
        c10 = uk.l.c(j10 - System.nanoTime(), 0L);
        return c10;
    }

    @Override // zk.g1
    public long c1() {
        b bVar;
        if (j1()) {
            return 0L;
        }
        c cVar = (c) f32896r.get(this);
        if (cVar != null && !cVar.d()) {
            zk.c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    b b10 = cVar.b();
                    bVar = null;
                    if (b10 != null) {
                        b bVar2 = b10;
                        if (bVar2.n(nanoTime) ? B1(bVar2) : false) {
                            bVar = cVar.h(0);
                        }
                    }
                }
            } while (bVar != null);
        }
        Runnable z12 = z1();
        if (z12 == null) {
            return T0();
        }
        z12.run();
        return 0L;
    }

    @Override // zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        return t0.a.a(this, j10, runnable, fVar);
    }

    @Override // zk.g1
    public void shutdown() {
        s2.f32928a.c();
        J1(true);
        y1();
        do {
        } while (c1() <= 0);
        E1();
    }
}
