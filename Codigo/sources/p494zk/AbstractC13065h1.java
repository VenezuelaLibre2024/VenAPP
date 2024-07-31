package p494zk;

import androidx.concurrent.futures.C0741b;
import ck.C2037v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9322n;
import p089el.C7223h0;
import p089el.C7235n0;
import p089el.C7245u;
import p089el.InterfaceC7237o0;
import p124gk.InterfaceC7587f;
import p494zk.InterfaceC13112t0;
import uk.C11585l;

/* renamed from: zk.h1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13065h1 extends AbstractC13069i1 implements InterfaceC13112t0 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f35446f = AtomicReferenceFieldUpdater.newUpdater(AbstractC13065h1.class, Object.class, "_queue");

    /* renamed from: r */
    private static final AtomicReferenceFieldUpdater f35447r = AtomicReferenceFieldUpdater.newUpdater(AbstractC13065h1.class, Object.class, "_delayed");

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f35448s = AtomicIntegerFieldUpdater.newUpdater(AbstractC13065h1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: zk.h1$a */
    /* loaded from: classes3.dex */
    private static final class a extends b {

        /* renamed from: c */
        private final Runnable f35449c;

        public a(long j10, Runnable runnable) {
            super(j10);
            this.f35449c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35449c.run();
        }

        @Override // p494zk.AbstractC13065h1.b
        public String toString() {
            return super.toString() + this.f35449c;
        }
    }

    /* renamed from: zk.h1$b */
    /* loaded from: classes3.dex */
    public static abstract class b implements Runnable, Comparable<b>, InterfaceC13044c1, InterfaceC7237o0 {
        private volatile Object _heap;

        /* renamed from: a */
        public long f35450a;

        /* renamed from: b */
        private int f35451b = -1;

        public b(long j10) {
            this.f35450a = j10;
        }

        @Override // p089el.InterfaceC7237o0
        /* renamed from: b */
        public void mo21638b(C7235n0<?> c7235n0) {
            C7223h0 c7223h0;
            Object obj = this._heap;
            c7223h0 = C13077k1.f35456a;
            if (!(obj != c7223h0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = c7235n0;
        }

        @Override // p494zk.InterfaceC13044c1
        public final void dispose() {
            C7223h0 c7223h0;
            C7223h0 c7223h02;
            synchronized (this) {
                Object obj = this._heap;
                c7223h0 = C13077k1.f35456a;
                if (obj == c7223h0) {
                    return;
                }
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    cVar.m21631g(this);
                }
                c7223h02 = C13077k1.f35456a;
                this._heap = c7223h02;
                C2037v c2037v = C2037v.f8089a;
            }
        }

        @Override // p089el.InterfaceC7237o0
        public int getIndex() {
            return this.f35451b;
        }

        @Override // p089el.InterfaceC7237o0
        /* renamed from: i */
        public C7235n0<?> mo21639i() {
            Object obj = this._heap;
            if (obj instanceof C7235n0) {
                return (C7235n0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f35450a - bVar.f35450a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:10:0x000d, B:17:0x0021, B:18:0x0037, B:20:0x0040, B:21:0x0042, B:26:0x0024, B:29:0x002e), top: B:9:0x000d, outer: #1 }] */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m43208m(long r8, p494zk.AbstractC13065h1.c r10, p494zk.AbstractC13065h1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4c
                el.h0 r1 = p494zk.C13077k1.m43225b()     // Catch: java.lang.Throwable -> L4c
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4c
                el.o0 r0 = r10.m21627b()     // Catch: java.lang.Throwable -> L49
                zk.h1$b r0 = (p494zk.AbstractC13065h1.b) r0     // Catch: java.lang.Throwable -> L49
                boolean r11 = p494zk.AbstractC13065h1.m43199x1(r11)     // Catch: java.lang.Throwable -> L49
                if (r11 == 0) goto L1d
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f35452c = r8     // Catch: java.lang.Throwable -> L49
                goto L37
            L24:
                long r3 = r0.f35450a     // Catch: java.lang.Throwable -> L49
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f35452c     // Catch: java.lang.Throwable -> L49
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f35450a     // Catch: java.lang.Throwable -> L49
                long r3 = r10.f35452c     // Catch: java.lang.Throwable -> L49
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f35450a = r3     // Catch: java.lang.Throwable -> L49
            L42:
                r10.m21626a(r7)     // Catch: java.lang.Throwable -> L49
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
            throw new UnsupportedOperationException("Method not decompiled: p494zk.AbstractC13065h1.b.m43208m(long, zk.h1$c, zk.h1):int");
        }

        /* renamed from: n */
        public final boolean m43209n(long j10) {
            return j10 - this.f35450a >= 0;
        }

        @Override // p089el.InterfaceC7237o0
        public void setIndex(int i10) {
            this.f35451b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f35450a + ']';
        }
    }

    /* renamed from: zk.h1$c */
    /* loaded from: classes3.dex */
    public static final class c extends C7235n0<b> {

        /* renamed from: c */
        public long f35452c;

        public c(long j10) {
            this.f35452c = j10;
        }
    }

    /* renamed from: B1 */
    private final boolean m43193B1(Runnable runnable) {
        C7223h0 c7223h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35446f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m43194C1()) {
                return false;
            }
            if (obj == null) {
                if (C0741b.m3751a(f35446f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C7245u) {
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C7245u c7245u = (C7245u) obj;
                int m21669a = c7245u.m21669a(runnable);
                if (m21669a == 0) {
                    return true;
                }
                if (m21669a == 1) {
                    C0741b.m3751a(f35446f, this, obj, c7245u.m21673i());
                } else if (m21669a == 2) {
                    return false;
                }
            } else {
                c7223h0 = C13077k1.f35457b;
                if (obj == c7223h0) {
                    return false;
                }
                C7245u c7245u2 = new C7245u(8, true);
                C9322n.m27779c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c7245u2.m21669a((Runnable) obj);
                c7245u2.m21669a(runnable);
                if (C0741b.m3751a(f35446f, this, obj, c7245u2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public final boolean m43194C1() {
        return f35448s.get(this) != 0;
    }

    /* renamed from: E1 */
    private final void m43195E1() {
        b m21633i;
        C13042c.m43062a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f35447r.get(this);
            if (cVar == null || (m21633i = cVar.m21633i()) == null) {
                return;
            } else {
                mo43213v1(nanoTime, m21633i);
            }
        }
    }

    /* renamed from: H1 */
    private final int m43196H1(long j10, b bVar) {
        if (m43194C1()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35447r;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar == null) {
            C0741b.m3751a(atomicReferenceFieldUpdater, this, null, new c(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            C9322n.m27778b(obj);
            cVar = (c) obj;
        }
        return bVar.m43208m(j10, cVar, this);
    }

    /* renamed from: J1 */
    private final void m43197J1(boolean z10) {
        f35448s.set(this, z10 ? 1 : 0);
    }

    /* renamed from: K1 */
    private final boolean m43198K1(b bVar) {
        c cVar = (c) f35447r.get(this);
        return (cVar != null ? cVar.m21630e() : null) == bVar;
    }

    /* renamed from: y1 */
    private final void m43200y1() {
        C7223h0 c7223h0;
        C7223h0 c7223h02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35446f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f35446f;
                c7223h0 = C13077k1.f35457b;
                if (C0741b.m3751a(atomicReferenceFieldUpdater2, this, null, c7223h0)) {
                    return;
                }
            } else {
                if (obj instanceof C7245u) {
                    ((C7245u) obj).m21670d();
                    return;
                }
                c7223h02 = C13077k1.f35457b;
                if (obj == c7223h02) {
                    return;
                }
                C7245u c7245u = new C7245u(8, true);
                C9322n.m27779c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c7245u.m21669a((Runnable) obj);
                if (C0741b.m3751a(f35446f, this, obj, c7245u)) {
                    return;
                }
            }
        }
    }

    /* renamed from: z1 */
    private final Runnable m43201z1() {
        C7223h0 c7223h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35446f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C7245u) {
                C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C7245u c7245u = (C7245u) obj;
                Object m21674j = c7245u.m21674j();
                if (m21674j != C7245u.f16237h) {
                    return (Runnable) m21674j;
                }
                C0741b.m3751a(f35446f, this, obj, c7245u.m21673i());
            } else {
                c7223h0 = C13077k1.f35457b;
                if (obj == c7223h0) {
                    return null;
                }
                if (C0741b.m3751a(f35446f, this, obj, null)) {
                    C9322n.m27779c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: A1 */
    public void mo43202A1(Runnable runnable) {
        if (m43193B1(runnable)) {
            m43214w1();
        } else {
            RunnableC13096p0.f35470t.mo43202A1(runnable);
        }
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public final void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        mo43202A1(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D1 */
    public boolean m43203D1() {
        C7223h0 c7223h0;
        if (!m43181b1()) {
            return false;
        }
        c cVar = (c) f35447r.get(this);
        if (cVar != null && !cVar.m21629d()) {
            return false;
        }
        Object obj = f35446f.get(this);
        if (obj != null) {
            if (obj instanceof C7245u) {
                return ((C7245u) obj).m21672g();
            }
            c7223h0 = C13077k1.f35457b;
            if (obj != c7223h0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F1 */
    public final void m43204F1() {
        f35446f.set(this, null);
        f35447r.set(this, null);
    }

    /* renamed from: G1 */
    public final void m43205G1(long j10, b bVar) {
        int m43196H1 = m43196H1(j10, bVar);
        if (m43196H1 == 0) {
            if (m43198K1(bVar)) {
                m43214w1();
            }
        } else if (m43196H1 == 1) {
            mo43213v1(j10, bVar);
        } else if (m43196H1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I1 */
    public final InterfaceC13044c1 m43206I1(long j10, Runnable runnable) {
        long m43226c = C13077k1.m43226c(j10);
        if (m43226c >= 4611686018427387903L) {
            return C13074j2.f35455a;
        }
        C13042c.m43062a();
        long nanoTime = System.nanoTime();
        a aVar = new a(m43226c + nanoTime, runnable);
        m43205G1(nanoTime, aVar);
        return aVar;
    }

    @Override // p494zk.AbstractC13061g1
    /* renamed from: T0 */
    protected long mo43178T0() {
        b m21630e;
        long m36294c;
        C7223h0 c7223h0;
        if (super.mo43178T0() == 0) {
            return 0L;
        }
        Object obj = f35446f.get(this);
        if (obj != null) {
            if (!(obj instanceof C7245u)) {
                c7223h0 = C13077k1.f35457b;
                return obj == c7223h0 ? Long.MAX_VALUE : 0L;
            }
            if (!((C7245u) obj).m21672g()) {
                return 0L;
            }
        }
        c cVar = (c) f35447r.get(this);
        if (cVar == null || (m21630e = cVar.m21630e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = m21630e.f35450a;
        C13042c.m43062a();
        m36294c = C11585l.m36294c(j10 - System.nanoTime(), 0L);
        return m36294c;
    }

    @Override // p494zk.AbstractC13061g1
    /* renamed from: c1 */
    public long mo43182c1() {
        b bVar;
        if (m43183j1()) {
            return 0L;
        }
        c cVar = (c) f35447r.get(this);
        if (cVar != null && !cVar.m21629d()) {
            C13042c.m43062a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    b m21627b = cVar.m21627b();
                    bVar = null;
                    if (m21627b != null) {
                        b bVar2 = m21627b;
                        if (bVar2.m43209n(nanoTime) ? m43193B1(bVar2) : false) {
                            bVar = cVar.m21632h(0);
                        }
                    }
                }
            } while (bVar != null);
        }
        Runnable m43201z1 = m43201z1();
        if (m43201z1 == null) {
            return mo43178T0();
        }
        m43201z1.run();
        return 0L;
    }

    @Override // p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, Runnable runnable, InterfaceC7587f interfaceC7587f) {
        return InterfaceC13112t0.a.m43300a(this, j10, runnable, interfaceC7587f);
    }

    @Override // p494zk.AbstractC13061g1
    public void shutdown() {
        C13110s2.f35479a.m43298c();
        m43197J1(true);
        m43200y1();
        do {
        } while (mo43182c1() <= 0);
        m43195E1();
    }
}
