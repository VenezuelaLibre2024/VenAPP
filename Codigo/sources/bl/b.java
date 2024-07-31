package bl;

import ck.n;
import ck.v;
import el.e0;
import el.f0;
import el.g0;
import el.h0;
import el.q0;
import el.z;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ok.q;
import zk.b3;

/* loaded from: classes3.dex */
public class b<E> implements d<E> {

    /* renamed from: e */
    private static final AtomicLongFieldUpdater f6719e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f6720f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f6721g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: h */
    private static final AtomicLongFieldUpdater f6722h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f6723i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f6724j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f6725k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f6726l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: m */
    private static final AtomicReferenceFieldUpdater f6727m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b */
    private final int f6728b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c */
    public final ok.l<E, v> f6729c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d */
    private final q<hl.b<?>, Object, Object, ok.l<Throwable, v>> f6730d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* loaded from: classes3.dex */
    public final class a implements e<E>, b3 {

        /* renamed from: a */
        private Object f6731a;

        /* renamed from: b */
        private zk.n<? super Boolean> f6732b;

        public a() {
            h0 h0Var;
            h0Var = bl.c.f6755p;
            this.f6731a = h0Var;
        }

        private final Object e(i<E> iVar, int i10, long j10, Continuation<? super Boolean> continuation) {
            Continuation b10;
            h0 h0Var;
            h0 h0Var2;
            Boolean a10;
            h0 h0Var3;
            h0 h0Var4;
            h0 h0Var5;
            Object c10;
            b<E> bVar = b.this;
            b10 = hk.c.b(continuation);
            zk.n b11 = zk.p.b(b10);
            try {
                this.f6732b = b11;
                Object r02 = bVar.r0(iVar, i10, j10, this);
                h0Var = bl.c.f6752m;
                if (r02 == h0Var) {
                    bVar.e0(this, iVar, i10);
                } else {
                    h0Var2 = bl.c.f6754o;
                    ok.l<Throwable, v> lVar = null;
                    if (r02 == h0Var2) {
                        if (j10 < bVar.I()) {
                            iVar.b();
                        }
                        i iVar2 = (i) b.f6724j.get(bVar);
                        while (true) {
                            if (bVar.P()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f6720f.getAndIncrement(bVar);
                            int i11 = bl.c.f6741b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (iVar2.f14765c != j11) {
                                i B = bVar.B(j11, iVar2);
                                if (B != null) {
                                    iVar2 = B;
                                }
                            }
                            Object r03 = bVar.r0(iVar2, i12, andIncrement, this);
                            h0Var3 = bl.c.f6752m;
                            if (r03 == h0Var3) {
                                bVar.e0(this, iVar2, i12);
                                break;
                            }
                            h0Var4 = bl.c.f6754o;
                            if (r03 != h0Var4) {
                                h0Var5 = bl.c.f6753n;
                                if (r03 == h0Var5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.b();
                                this.f6731a = r03;
                                this.f6732b = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                ok.l<E, v> lVar2 = bVar.f6729c;
                                if (lVar2 != null) {
                                    lVar = z.a(lVar2, r03, b11.getContext());
                                }
                            } else if (andIncrement < bVar.I()) {
                                iVar2.b();
                            }
                        }
                    } else {
                        iVar.b();
                        this.f6731a = r02;
                        this.f6732b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        ok.l<E, v> lVar3 = bVar.f6729c;
                        if (lVar3 != null) {
                            lVar = z.a(lVar3, r02, b11.getContext());
                        }
                    }
                    b11.c(a10, lVar);
                }
                Object w10 = b11.w();
                c10 = hk.d.c();
                if (w10 == c10) {
                    kotlin.coroutines.jvm.internal.h.c(continuation);
                }
                return w10;
            } catch (Throwable th2) {
                b11.I();
                throw th2;
            }
        }

        private final boolean g() {
            this.f6731a = bl.c.z();
            Throwable E = b.this.E();
            if (E == null) {
                return false;
            }
            throw g0.a(E);
        }

        public final void h() {
            Object a10;
            zk.n<? super Boolean> nVar = this.f6732b;
            kotlin.jvm.internal.n.b(nVar);
            this.f6732b = null;
            this.f6731a = bl.c.z();
            Throwable E = b.this.E();
            if (E == null) {
                n.a aVar = ck.n.f7126b;
                a10 = Boolean.FALSE;
            } else {
                n.a aVar2 = ck.n.f7126b;
                a10 = ck.o.a(E);
            }
            nVar.resumeWith(ck.n.b(a10));
        }

        @Override // bl.e
        public Object a(Continuation<? super Boolean> continuation) {
            boolean g10;
            i<E> iVar;
            h0 h0Var;
            h0 h0Var2;
            h0 h0Var3;
            b<E> bVar = b.this;
            i<E> iVar2 = (i) b.f6724j.get(bVar);
            while (true) {
                if (bVar.P()) {
                    g10 = g();
                    break;
                }
                long andIncrement = b.f6720f.getAndIncrement(bVar);
                int i10 = bl.c.f6741b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (iVar2.f14765c != j10) {
                    i<E> B = bVar.B(j10, iVar2);
                    if (B == null) {
                        continue;
                    } else {
                        iVar = B;
                    }
                } else {
                    iVar = iVar2;
                }
                Object r02 = bVar.r0(iVar, i11, andIncrement, null);
                h0Var = bl.c.f6752m;
                if (r02 == h0Var) {
                    throw new IllegalStateException("unreachable".toString());
                }
                h0Var2 = bl.c.f6754o;
                if (r02 == h0Var2) {
                    if (andIncrement < bVar.I()) {
                        iVar.b();
                    }
                    iVar2 = iVar;
                } else {
                    h0Var3 = bl.c.f6753n;
                    if (r02 == h0Var3) {
                        return e(iVar, i11, andIncrement, continuation);
                    }
                    iVar.b();
                    this.f6731a = r02;
                    g10 = true;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g10);
        }

        @Override // zk.b3
        public void f(e0<?> e0Var, int i10) {
            zk.n<? super Boolean> nVar = this.f6732b;
            if (nVar != null) {
                nVar.f(e0Var, i10);
            }
        }

        public final boolean i(E e10) {
            boolean B;
            zk.n<? super Boolean> nVar = this.f6732b;
            kotlin.jvm.internal.n.b(nVar);
            this.f6732b = null;
            this.f6731a = e10;
            Boolean bool = Boolean.TRUE;
            ok.l<E, v> lVar = b.this.f6729c;
            B = bl.c.B(nVar, bool, lVar != null ? z.a(lVar, e10, nVar.getContext()) : null);
            return B;
        }

        public final void j() {
            Object a10;
            zk.n<? super Boolean> nVar = this.f6732b;
            kotlin.jvm.internal.n.b(nVar);
            this.f6732b = null;
            this.f6731a = bl.c.z();
            Throwable E = b.this.E();
            if (E == null) {
                n.a aVar = ck.n.f7126b;
                a10 = Boolean.FALSE;
            } else {
                n.a aVar2 = ck.n.f7126b;
                a10 = ck.o.a(E);
            }
            nVar.resumeWith(ck.n.b(a10));
        }

        @Override // bl.e
        public E next() {
            h0 h0Var;
            h0 h0Var2;
            E e10 = (E) this.f6731a;
            h0Var = bl.c.f6755p;
            if (!(e10 != h0Var)) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            h0Var2 = bl.c.f6755p;
            this.f6731a = h0Var2;
            if (e10 != bl.c.z()) {
                return e10;
            }
            throw g0.a(b.this.F());
        }
    }

    /* renamed from: bl.b$b */
    /* loaded from: classes3.dex */
    public static final class C0110b implements b3 {

        /* renamed from: a */
        private final zk.m<Boolean> f6734a;

        /* renamed from: b */
        private final /* synthetic */ zk.n<Boolean> f6735b;

        public final zk.m<Boolean> a() {
            return this.f6734a;
        }

        @Override // zk.b3
        public void f(e0<?> e0Var, int i10) {
            this.f6735b.f(e0Var, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.o implements q<hl.b<?>, Object, Object, ok.l<? super Throwable, ? extends v>> {

        /* renamed from: a */
        final /* synthetic */ b<E> f6736a;

        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.o implements ok.l<Throwable, v> {

            /* renamed from: a */
            final /* synthetic */ Object f6737a;

            /* renamed from: b */
            final /* synthetic */ b<E> f6738b;

            /* renamed from: c */
            final /* synthetic */ hl.b<?> f6739c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, hl.b<?> bVar2) {
                super(1);
                this.f6737a = obj;
                this.f6738b = bVar;
                this.f6739c = bVar2;
            }

            public final void a(Throwable th2) {
                if (this.f6737a != bl.c.z()) {
                    z.b(this.f6738b.f6729c, this.f6737a, this.f6739c.getContext());
                }
            }

            @Override // ok.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f7137a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f6736a = bVar;
        }

        @Override // ok.q
        /* renamed from: a */
        public final ok.l<Throwable, v> m(hl.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.f6736a, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, ok.l<? super E, v> lVar) {
        long A;
        h0 h0Var;
        this.f6728b = i10;
        this.f6729c = lVar;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        A = bl.c.A(i10);
        this.bufferEnd = A;
        this.completedExpandBuffersAndPauseFlag = D();
        i iVar = new i(0L, null, this, 3);
        this.sendSegment = iVar;
        this.receiveSegment = iVar;
        if (U()) {
            iVar = bl.c.f6740a;
            kotlin.jvm.internal.n.c(iVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = iVar;
        this.f6730d = lVar != 0 ? new c(this) : null;
        h0Var = bl.c.f6758s;
        this._closeCause = h0Var;
    }

    private final i<E> A(long j10, i<E> iVar, long j11) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6725k;
        ok.p pVar = (ok.p) bl.c.y();
        do {
            c10 = el.d.c(iVar, j10, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f14765c >= b10.f14765c) {
                    break;
                }
                if (!b10.q()) {
                    z10 = false;
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                    if (e0Var.m()) {
                        e0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z10 = true;
        } while (!z10);
        if (f0.c(c10)) {
            x();
            Z(j10, iVar);
        } else {
            i<E> iVar2 = (i) f0.b(c10);
            long j12 = iVar2.f14765c;
            if (j12 <= j10) {
                return iVar2;
            }
            int i10 = bl.c.f6741b;
            if (f6721g.compareAndSet(this, j11 + 1, i10 * j12)) {
                K((iVar2.f14765c * i10) - j11);
                return null;
            }
        }
        L(this, 0L, 1, null);
        return null;
    }

    public final i<E> B(long j10, i<E> iVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6724j;
        ok.p pVar = (ok.p) bl.c.y();
        do {
            c10 = el.d.c(iVar, j10, pVar);
            if (!f0.c(c10)) {
                e0 b10 = f0.b(c10);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (e0Var.f14765c >= b10.f14765c) {
                        break;
                    }
                    if (!b10.q()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (f0.c(c10)) {
            x();
            if (iVar.f14765c * bl.c.f6741b >= I()) {
                return null;
            }
        } else {
            iVar = (i) f0.b(c10);
            if (!U() && j10 <= D() / bl.c.f6741b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6725k;
                while (true) {
                    e0 e0Var2 = (e0) atomicReferenceFieldUpdater2.get(this);
                    if (e0Var2.f14765c >= iVar.f14765c || !iVar.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, e0Var2, iVar)) {
                        if (e0Var2.m()) {
                            e0Var2.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
            }
            long j11 = iVar.f14765c;
            if (j11 <= j10) {
                return iVar;
            }
            int i10 = bl.c.f6741b;
            v0(j11 * i10);
            if (iVar.f14765c * i10 >= I()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    public final i<E> C(long j10, i<E> iVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6723i;
        ok.p pVar = (ok.p) bl.c.y();
        do {
            c10 = el.d.c(iVar, j10, pVar);
            if (!f0.c(c10)) {
                e0 b10 = f0.b(c10);
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (e0Var.f14765c >= b10.f14765c) {
                        break;
                    }
                    if (!b10.q()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (f0.c(c10)) {
            x();
            if (iVar.f14765c * bl.c.f6741b >= G()) {
                return null;
            }
        } else {
            iVar = (i) f0.b(c10);
            long j11 = iVar.f14765c;
            if (j11 <= j10) {
                return iVar;
            }
            int i10 = bl.c.f6741b;
            w0(j11 * i10);
            if (iVar.f14765c * i10 >= G()) {
                return null;
            }
        }
        iVar.b();
        return null;
    }

    private final long D() {
        return f6721g.get(this);
    }

    public final Throwable F() {
        Throwable E = E();
        return E == null ? new j("Channel was closed") : E;
    }

    private final void K(long j10) {
        if (!((f6722h.addAndGet(this, j10) & 4611686018427387904L) != 0)) {
            return;
        }
        do {
        } while ((f6722h.get(this) & 4611686018427387904L) != 0);
    }

    static /* synthetic */ void L(b bVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bVar.K(j10);
    }

    private final void M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6727m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? bl.c.f6756q : bl.c.f6757r));
        if (obj == null) {
            return;
        }
        ((ok.l) obj).invoke(E());
    }

    private final boolean N(i<E> iVar, int i10, long j10) {
        Object w10;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        h0 h0Var7;
        do {
            w10 = iVar.w(i10);
            if (w10 != null) {
                h0Var2 = bl.c.f6744e;
                if (w10 != h0Var2) {
                    if (w10 == bl.c.f6743d) {
                        return true;
                    }
                    h0Var3 = bl.c.f6749j;
                    if (w10 == h0Var3 || w10 == bl.c.z()) {
                        return false;
                    }
                    h0Var4 = bl.c.f6748i;
                    if (w10 == h0Var4) {
                        return false;
                    }
                    h0Var5 = bl.c.f6747h;
                    if (w10 == h0Var5) {
                        return false;
                    }
                    h0Var6 = bl.c.f6746g;
                    if (w10 == h0Var6) {
                        return true;
                    }
                    h0Var7 = bl.c.f6745f;
                    return w10 != h0Var7 && j10 == G();
                }
            }
            h0Var = bl.c.f6747h;
        } while (!iVar.r(i10, w10, h0Var));
        z();
        return false;
    }

    private final boolean O(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            w(j10 & 1152921504606846975L);
            if (z10 && J()) {
                return false;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
            v(j10 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean Q(long j10) {
        return O(j10, true);
    }

    public final boolean S(long j10) {
        return O(j10, false);
    }

    private final boolean U() {
        long D = D();
        return D == 0 || D == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (bl.i) r8.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long V(bl.i<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = bl.c.f6741b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f14765c
            int r5 = bl.c.f6741b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.G()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            el.h0 r2 = bl.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            el.h0 r2 = bl.c.f6743d
            if (r1 != r2) goto L39
            return r3
        L2c:
            el.h0 r2 = bl.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            el.e r8 = r8.g()
            bl.i r8 = (bl.i) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.V(bl.i):long");
    }

    private final void W() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6719e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                w10 = bl.c.w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void X() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6719e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w10 = bl.c.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void Y() {
        long j10;
        long j11;
        int i10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6719e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else {
                if (i11 != 1) {
                    return;
                }
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            }
            w10 = bl.c.w(j11, i10);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Z(long j10, i<E> iVar) {
        boolean z10;
        i<E> iVar2;
        i<E> iVar3;
        while (iVar.f14765c < j10 && (iVar3 = (i) iVar.e()) != null) {
            iVar = iVar3;
        }
        while (true) {
            if (!iVar.h() || (iVar2 = (i) iVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6725k;
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (e0Var.f14765c >= iVar.f14765c) {
                        break;
                    }
                    if (!iVar.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, iVar)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (iVar.m()) {
                        iVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                iVar = iVar2;
            }
        }
    }

    public final void b0(zk.m<? super E> mVar) {
        n.a aVar = ck.n.f7126b;
        mVar.resumeWith(ck.n.b(ck.o.a(F())));
    }

    public final void e0(b3 b3Var, i<E> iVar, int i10) {
        d0();
        b3Var.f(iVar, i10);
    }

    public final void f0(b3 b3Var, i<E> iVar, int i10) {
        b3Var.f(iVar, i10 + bl.c.f6741b);
    }

    static /* synthetic */ <E> Object g0(b<E> bVar, Continuation<? super E> continuation) {
        i<E> iVar;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        i<E> iVar2 = (i) f6724j.get(bVar);
        while (!bVar.P()) {
            long andIncrement = f6720f.getAndIncrement(bVar);
            int i10 = bl.c.f6741b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (iVar2.f14765c != j10) {
                i<E> B = bVar.B(j10, iVar2);
                if (B == null) {
                    continue;
                } else {
                    iVar = B;
                }
            } else {
                iVar = iVar2;
            }
            Object r02 = bVar.r0(iVar, i11, andIncrement, null);
            h0Var = bl.c.f6752m;
            if (r02 == h0Var) {
                throw new IllegalStateException("unexpected".toString());
            }
            h0Var2 = bl.c.f6754o;
            if (r02 != h0Var2) {
                h0Var3 = bl.c.f6753n;
                if (r02 == h0Var3) {
                    return bVar.h0(iVar, i11, andIncrement, continuation);
                }
                iVar.b();
                return r02;
            }
            if (andIncrement < bVar.I()) {
                iVar.b();
            }
            iVar2 = iVar;
        }
        throw g0.a(bVar.F());
    }

    private final Object h0(i<E> iVar, int i10, long j10, Continuation<? super E> continuation) {
        Continuation b10;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        Object c10;
        b10 = hk.c.b(continuation);
        zk.n b11 = zk.p.b(b10);
        try {
            Object r02 = r0(iVar, i10, j10, b11);
            h0Var = bl.c.f6752m;
            if (r02 == h0Var) {
                e0(b11, iVar, i10);
            } else {
                h0Var2 = bl.c.f6754o;
                ok.l<Throwable, v> lVar = null;
                lVar = null;
                if (r02 == h0Var2) {
                    if (j10 < I()) {
                        iVar.b();
                    }
                    i iVar2 = (i) f6724j.get(this);
                    while (true) {
                        if (P()) {
                            b0(b11);
                            break;
                        }
                        long andIncrement = f6720f.getAndIncrement(this);
                        int i11 = bl.c.f6741b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (iVar2.f14765c != j11) {
                            i B = B(j11, iVar2);
                            if (B != null) {
                                iVar2 = B;
                            }
                        }
                        r02 = r0(iVar2, i12, andIncrement, b11);
                        h0Var3 = bl.c.f6752m;
                        if (r02 == h0Var3) {
                            zk.n nVar = b11 instanceof b3 ? b11 : null;
                            if (nVar != null) {
                                e0(nVar, iVar2, i12);
                            }
                        } else {
                            h0Var4 = bl.c.f6754o;
                            if (r02 != h0Var4) {
                                h0Var5 = bl.c.f6753n;
                                if (r02 == h0Var5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                iVar2.b();
                                ok.l<E, v> lVar2 = this.f6729c;
                                if (lVar2 != null) {
                                    lVar = z.a(lVar2, r02, b11.getContext());
                                }
                            } else if (andIncrement < I()) {
                                iVar2.b();
                            }
                        }
                    }
                } else {
                    iVar.b();
                    ok.l<E, v> lVar3 = this.f6729c;
                    if (lVar3 != null) {
                        lVar = z.a(lVar3, r02, b11.getContext());
                    }
                }
                b11.c(r02, lVar);
            }
            Object w10 = b11.w();
            c10 = hk.d.c();
            if (w10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return w10;
        } catch (Throwable th2) {
            b11.I();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00aa, code lost:
    
        r12 = (bl.i) r12.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i0(bl.i<E> r12) {
        /*
            r11 = this;
            ok.l<E, ck.v> r0 = r11.f6729c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = el.n.b(r1, r2, r1)
        L8:
            int r4 = bl.c.f6741b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Laa
            long r6 = r12.f14765c
            int r8 = bl.c.f6741b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            el.h0 r9 = bl.c.f()
            if (r8 == r9) goto Lb2
            el.h0 r9 = bl.c.f6743d
            if (r8 != r9) goto L47
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            el.h0 r9 = bl.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            el.q0 r1 = el.z.c(r0, r5, r1)
        L40:
            r12.s(r4)
        L43:
            r12.p()
            goto La6
        L47:
            el.h0 r9 = bl.c.k()
            if (r8 == r9) goto L9b
            if (r8 != 0) goto L50
            goto L9b
        L50:
            boolean r9 = r8 instanceof zk.b3
            if (r9 != 0) goto L6d
            boolean r9 = r8 instanceof bl.p
            if (r9 == 0) goto L59
            goto L6d
        L59:
            el.h0 r9 = bl.c.p()
            if (r8 == r9) goto Lb2
            el.h0 r9 = bl.c.q()
            if (r8 != r9) goto L66
            goto Lb2
        L66:
            el.h0 r9 = bl.c.p()
            if (r8 == r9) goto L16
            goto La6
        L6d:
            long r9 = r11.G()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lb2
            boolean r9 = r8 instanceof bl.p
            if (r9 == 0) goto L7f
            r9 = r8
            bl.p r9 = (bl.p) r9
            zk.b3 r9 = r9.f6772a
            goto L82
        L7f:
            r9 = r8
            zk.b3 r9 = (zk.b3) r9
        L82:
            el.h0 r10 = bl.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L96
            java.lang.Object r5 = r12.v(r4)
            el.q0 r1 = el.z.c(r0, r5, r1)
        L96:
            java.lang.Object r3 = el.n.c(r3, r9)
            goto L40
        L9b:
            el.h0 r9 = bl.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            goto L43
        La6:
            int r4 = r4 + (-1)
            goto Lb
        Laa:
            el.e r12 = r12.g()
            bl.i r12 = (bl.i) r12
            if (r12 != 0) goto L8
        Lb2:
            if (r3 == 0) goto Ld8
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lbe
            zk.b3 r3 = (zk.b3) r3
            r11.k0(r3)
            goto Ld8
        Lbe:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.n.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Lca:
            if (r5 >= r12) goto Ld8
            java.lang.Object r0 = r3.get(r12)
            zk.b3 r0 = (zk.b3) r0
            r11.k0(r0)
            int r12 = r12 + (-1)
            goto Lca
        Ld8:
            if (r1 != 0) goto Ldb
            return
        Ldb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.i0(bl.i):void");
    }

    private final void j0(b3 b3Var) {
        l0(b3Var, true);
    }

    private final void k0(b3 b3Var) {
        l0(b3Var, false);
    }

    private final void l0(b3 b3Var, boolean z10) {
        Continuation continuation;
        Object b10;
        if (b3Var instanceof C0110b) {
            continuation = ((C0110b) b3Var).a();
            n.a aVar = ck.n.f7126b;
            b10 = Boolean.FALSE;
        } else if (b3Var instanceof zk.m) {
            continuation = (Continuation) b3Var;
            n.a aVar2 = ck.n.f7126b;
            b10 = ck.o.a(z10 ? F() : H());
        } else {
            if (!(b3Var instanceof m)) {
                if (b3Var instanceof a) {
                    ((a) b3Var).j();
                    return;
                } else {
                    if (b3Var instanceof hl.b) {
                        ((hl.b) b3Var).c(this, bl.c.z());
                        return;
                    }
                    throw new IllegalStateException(("Unexpected waiter: " + b3Var).toString());
                }
            }
            continuation = ((m) b3Var).f6771a;
            n.a aVar3 = ck.n.f7126b;
            b10 = g.b(g.f6763b.a(E()));
        }
        continuation.resumeWith(ck.n.b(b10));
    }

    private final boolean m0(long j10) {
        if (S(j10)) {
            return false;
        }
        return !r(j10 & 1152921504606846975L);
    }

    private final boolean n0(Object obj, E e10) {
        boolean B;
        boolean B2;
        if (obj instanceof hl.b) {
            return ((hl.b) obj).c(this, e10);
        }
        if (obj instanceof m) {
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            m mVar = (m) obj;
            zk.n<g<? extends E>> nVar = mVar.f6771a;
            g b10 = g.b(g.f6763b.c(e10));
            ok.l<E, v> lVar = this.f6729c;
            B2 = bl.c.B(nVar, b10, lVar != null ? z.a(lVar, e10, mVar.f6771a.getContext()) : null);
            return B2;
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (!(obj instanceof zk.m)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        zk.m mVar2 = (zk.m) obj;
        ok.l<E, v> lVar2 = this.f6729c;
        B = bl.c.B(mVar2, e10, lVar2 != null ? z.a(lVar2, e10, mVar2.getContext()) : null);
        return B;
    }

    private final boolean o0(Object obj, i<E> iVar, int i10) {
        zk.m<Boolean> a10;
        Object obj2;
        if (obj instanceof zk.m) {
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            a10 = (zk.m) obj;
            obj2 = v.f7137a;
        } else {
            if (obj instanceof hl.b) {
                kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                hl.d h10 = ((hl.a) obj).h(this, v.f7137a);
                if (h10 == hl.d.REREGISTER) {
                    iVar.s(i10);
                }
                return h10 == hl.d.SUCCESSFUL;
            }
            if (!(obj instanceof C0110b)) {
                throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
            }
            a10 = ((C0110b) obj).a();
            obj2 = Boolean.TRUE;
        }
        return bl.c.C(a10, obj2, null, 2, null);
    }

    private final boolean p0(i<E> iVar, int i10, long j10) {
        h0 h0Var;
        h0 h0Var2;
        Object w10 = iVar.w(i10);
        if ((w10 instanceof b3) && j10 >= f6720f.get(this)) {
            h0Var = bl.c.f6746g;
            if (iVar.r(i10, w10, h0Var)) {
                if (o0(w10, iVar, i10)) {
                    iVar.A(i10, bl.c.f6743d);
                    return true;
                }
                h0Var2 = bl.c.f6749j;
                iVar.A(i10, h0Var2);
                iVar.x(i10, false);
                return false;
            }
        }
        return q0(iVar, i10, j10);
    }

    private final boolean q0(i<E> iVar, int i10, long j10) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        h0 h0Var7;
        h0 h0Var8;
        while (true) {
            Object w10 = iVar.w(i10);
            if (!(w10 instanceof b3)) {
                h0Var3 = bl.c.f6749j;
                if (w10 != h0Var3) {
                    if (w10 != null) {
                        if (w10 != bl.c.f6743d) {
                            h0Var5 = bl.c.f6747h;
                            if (w10 == h0Var5) {
                                break;
                            }
                            h0Var6 = bl.c.f6748i;
                            if (w10 == h0Var6) {
                                break;
                            }
                            h0Var7 = bl.c.f6750k;
                            if (w10 == h0Var7 || w10 == bl.c.z()) {
                                return true;
                            }
                            h0Var8 = bl.c.f6745f;
                            if (w10 != h0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        h0Var4 = bl.c.f6744e;
                        if (iVar.r(i10, w10, h0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f6720f.get(this)) {
                h0Var = bl.c.f6746g;
                if (iVar.r(i10, w10, h0Var)) {
                    if (o0(w10, iVar, i10)) {
                        iVar.A(i10, bl.c.f6743d);
                        return true;
                    }
                    h0Var2 = bl.c.f6749j;
                    iVar.A(i10, h0Var2);
                    iVar.x(i10, false);
                    return false;
                }
            } else if (iVar.r(i10, w10, new p((b3) w10))) {
                return true;
            }
        }
    }

    private final boolean r(long j10) {
        return j10 < D() || j10 < G() + ((long) this.f6728b);
    }

    public final Object r0(i<E> iVar, int i10, long j10, Object obj) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f6719e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    h0Var3 = bl.c.f6753n;
                    return h0Var3;
                }
                if (iVar.r(i10, w10, obj)) {
                    z();
                    h0Var2 = bl.c.f6752m;
                    return h0Var2;
                }
            }
        } else if (w10 == bl.c.f6743d) {
            h0Var = bl.c.f6748i;
            if (iVar.r(i10, w10, h0Var)) {
                z();
                return iVar.y(i10);
            }
        }
        return s0(iVar, i10, j10, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        r0 = el.n.c(r0, r4);
        r9.x(r3, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(bl.i<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = el.n.b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = bl.c.f6741b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f14765c
            int r6 = bl.c.f6741b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L50
            el.h0 r5 = bl.c.k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof bl.p
            if (r5 == 0) goto L41
            el.h0 r5 = bl.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            bl.p r4 = (bl.p) r4
            zk.b3 r4 = r4.f6772a
        L39:
            java.lang.Object r0 = el.n.c(r0, r4)
            r9.x(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof zk.b3
            if (r5 == 0) goto L5d
            el.h0 r5 = bl.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            el.h0 r5 = bl.c.z()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.p()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            el.e r9 = r9.g()
            bl.i r9 = (bl.i) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            zk.b3 r0 = (zk.b3) r0
            r8.j0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.n.c(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            zk.b3 r10 = (zk.b3) r10
            r8.j0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.s(bl.i, long):void");
    }

    private final Object s0(i<E> iVar, int i10, long j10, Object obj) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        h0 h0Var7;
        h0 h0Var8;
        h0 h0Var9;
        h0 h0Var10;
        h0 h0Var11;
        h0 h0Var12;
        h0 h0Var13;
        h0 h0Var14;
        h0 h0Var15;
        h0 h0Var16;
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 != null) {
                h0Var5 = bl.c.f6744e;
                if (w10 != h0Var5) {
                    if (w10 == bl.c.f6743d) {
                        h0Var6 = bl.c.f6748i;
                        if (iVar.r(i10, w10, h0Var6)) {
                            z();
                            return iVar.y(i10);
                        }
                    } else {
                        h0Var7 = bl.c.f6749j;
                        if (w10 == h0Var7) {
                            h0Var8 = bl.c.f6754o;
                            return h0Var8;
                        }
                        h0Var9 = bl.c.f6747h;
                        if (w10 == h0Var9) {
                            h0Var10 = bl.c.f6754o;
                            return h0Var10;
                        }
                        if (w10 == bl.c.z()) {
                            z();
                            h0Var11 = bl.c.f6754o;
                            return h0Var11;
                        }
                        h0Var12 = bl.c.f6746g;
                        if (w10 != h0Var12) {
                            h0Var13 = bl.c.f6745f;
                            if (iVar.r(i10, w10, h0Var13)) {
                                boolean z10 = w10 instanceof p;
                                if (z10) {
                                    w10 = ((p) w10).f6772a;
                                }
                                if (o0(w10, iVar, i10)) {
                                    h0Var16 = bl.c.f6748i;
                                    iVar.A(i10, h0Var16);
                                    z();
                                    return iVar.y(i10);
                                }
                                h0Var14 = bl.c.f6749j;
                                iVar.A(i10, h0Var14);
                                iVar.x(i10, false);
                                if (z10) {
                                    z();
                                }
                                h0Var15 = bl.c.f6754o;
                                return h0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j10 < (f6719e.get(this) & 1152921504606846975L)) {
                h0Var = bl.c.f6747h;
                if (iVar.r(i10, w10, h0Var)) {
                    z();
                    h0Var2 = bl.c.f6754o;
                    return h0Var2;
                }
            } else {
                if (obj == null) {
                    h0Var3 = bl.c.f6753n;
                    return h0Var3;
                }
                if (iVar.r(i10, w10, obj)) {
                    z();
                    h0Var4 = bl.c.f6752m;
                    return h0Var4;
                }
            }
        }
    }

    private final i<E> t() {
        Object obj = f6725k.get(this);
        i iVar = (i) f6723i.get(this);
        if (iVar.f14765c > ((i) obj).f14765c) {
            obj = iVar;
        }
        i iVar2 = (i) f6724j.get(this);
        if (iVar2.f14765c > ((i) obj).f14765c) {
            obj = iVar2;
        }
        return (i) el.d.b((el.e) obj);
    }

    public final int t0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        iVar.B(i10, e10);
        if (z10) {
            return u0(iVar, i10, e10, j10, obj, z10);
        }
        Object w10 = iVar.w(i10);
        if (w10 == null) {
            if (r(j10)) {
                if (iVar.r(i10, null, bl.c.f6743d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (iVar.r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (w10 instanceof b3) {
            iVar.s(i10);
            if (n0(w10, e10)) {
                h0Var3 = bl.c.f6748i;
                iVar.A(i10, h0Var3);
                c0();
                return 0;
            }
            h0Var = bl.c.f6750k;
            Object t10 = iVar.t(i10, h0Var);
            h0Var2 = bl.c.f6750k;
            if (t10 != h0Var2) {
                iVar.x(i10, true);
            }
            return 5;
        }
        return u0(iVar, i10, e10, j10, obj, z10);
    }

    private final int u0(i<E> iVar, int i10, E e10, long j10, Object obj, boolean z10) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        h0 h0Var5;
        h0 h0Var6;
        h0 h0Var7;
        while (true) {
            Object w10 = iVar.w(i10);
            if (w10 != null) {
                h0Var2 = bl.c.f6744e;
                if (w10 != h0Var2) {
                    h0Var3 = bl.c.f6750k;
                    if (w10 == h0Var3) {
                        iVar.s(i10);
                        return 5;
                    }
                    h0Var4 = bl.c.f6747h;
                    if (w10 == h0Var4) {
                        iVar.s(i10);
                        return 5;
                    }
                    h0 z11 = bl.c.z();
                    iVar.s(i10);
                    if (w10 == z11) {
                        x();
                        return 4;
                    }
                    if (w10 instanceof p) {
                        w10 = ((p) w10).f6772a;
                    }
                    if (n0(w10, e10)) {
                        h0Var7 = bl.c.f6748i;
                        iVar.A(i10, h0Var7);
                        c0();
                        return 0;
                    }
                    h0Var5 = bl.c.f6750k;
                    Object t10 = iVar.t(i10, h0Var5);
                    h0Var6 = bl.c.f6750k;
                    if (t10 != h0Var6) {
                        iVar.x(i10, true);
                    }
                    return 5;
                }
                if (iVar.r(i10, w10, bl.c.f6743d)) {
                    return 1;
                }
            } else if (!r(j10) || z10) {
                if (z10) {
                    h0Var = bl.c.f6749j;
                    if (iVar.r(i10, null, h0Var)) {
                        iVar.x(i10, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (iVar.r(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (iVar.r(i10, null, bl.c.f6743d)) {
                return 1;
            }
        }
    }

    private final void v(long j10) {
        i0(w(j10));
    }

    private final void v0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6720f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f6720f.compareAndSet(this, j11, j10));
    }

    private final i<E> w(long j10) {
        i<E> t10 = t();
        if (T()) {
            long V = V(t10);
            if (V != -1) {
                y(V);
            }
        }
        s(t10, j10);
        return t10;
    }

    private final void w0(long j10) {
        long j11;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6719e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            } else {
                w10 = bl.c.w(j12, (int) (j11 >> 60));
            }
        } while (!f6719e.compareAndSet(this, j11, w10));
    }

    private final void x() {
        R();
    }

    private final void z() {
        if (U()) {
            return;
        }
        i<E> iVar = (i) f6725k.get(this);
        while (true) {
            long andIncrement = f6721g.getAndIncrement(this);
            int i10 = bl.c.f6741b;
            long j10 = andIncrement / i10;
            long I = I();
            long j11 = iVar.f14765c;
            if (I <= andIncrement) {
                if (j11 < j10 && iVar.e() != 0) {
                    Z(j10, iVar);
                }
                L(this, 0L, 1, null);
                return;
            }
            if (j11 != j10) {
                i<E> A = A(j10, iVar, andIncrement);
                if (A == null) {
                    continue;
                } else {
                    iVar = A;
                }
            }
            boolean p02 = p0(iVar, (int) (andIncrement % i10), andIncrement);
            L(this, 0L, 1, null);
            if (p02) {
                return;
            }
        }
    }

    protected final Throwable E() {
        return (Throwable) f6726l.get(this);
    }

    public final long G() {
        return f6720f.get(this);
    }

    public final Throwable H() {
        Throwable E = E();
        return E == null ? new k("Channel was closed") : E;
    }

    public final long I() {
        return f6719e.get(this) & 1152921504606846975L;
    }

    public final boolean J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6724j;
            i<E> iVar = (i) atomicReferenceFieldUpdater.get(this);
            long G = G();
            if (I() <= G) {
                return false;
            }
            int i10 = bl.c.f6741b;
            long j10 = G / i10;
            if (iVar.f14765c == j10 || (iVar = B(j10, iVar)) != null) {
                iVar.b();
                if (N(iVar, (int) (G % i10), G)) {
                    return true;
                }
                f6720f.compareAndSet(this, G, G + 1);
            } else if (((i) atomicReferenceFieldUpdater.get(this)).f14765c < j10) {
                return false;
            }
        }
    }

    public boolean P() {
        return Q(f6719e.get(this));
    }

    public boolean R() {
        return S(f6719e.get(this));
    }

    protected boolean T() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return bl.g.f6763b.c(ck.v.f7137a);
     */
    @Override // bl.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = bl.b.f6719e
            long r0 = r0.get(r14)
            boolean r0 = r14.m0(r0)
            if (r0 == 0) goto L13
            bl.g$b r15 = bl.g.f6763b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            el.h0 r8 = bl.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = j()
            java.lang.Object r0 = r0.get(r14)
            bl.i r0 = (bl.i) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = k()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = l(r14, r1)
            int r1 = bl.c.f6741b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f14765c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            bl.i r1 = f(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = q(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.p()
        L8e:
            bl.g$b r15 = bl.g.f6763b
            java.lang.Throwable r0 = r14.H()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof zk.b3
            if (r15 == 0) goto La0
            zk.b3 r8 = (zk.b3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            o(r14, r8, r13, r12)
        La6:
            r13.p()
            bl.g$b r15 = bl.g.f6763b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            bl.g$b r15 = bl.g.f6763b
            ck.v r0 = ck.v.f7137a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.a(java.lang.Object):java.lang.Object");
    }

    protected void a0() {
    }

    @Override // bl.n
    public Object b(Continuation<? super E> continuation) {
        return g0(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl.n
    public Object c() {
        Object obj;
        i iVar;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        long j10 = f6720f.get(this);
        long j11 = f6719e.get(this);
        if (Q(j11)) {
            return g.f6763b.a(E());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return g.f6763b.b();
        }
        obj = bl.c.f6750k;
        i iVar2 = (i) f6724j.get(this);
        while (!P()) {
            long andIncrement = f6720f.getAndIncrement(this);
            int i10 = bl.c.f6741b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (iVar2.f14765c != j12) {
                i B = B(j12, iVar2);
                if (B == null) {
                    continue;
                } else {
                    iVar = B;
                }
            } else {
                iVar = iVar2;
            }
            Object r02 = r0(iVar, i11, andIncrement, obj);
            h0Var = bl.c.f6752m;
            if (r02 == h0Var) {
                b3 b3Var = obj instanceof b3 ? (b3) obj : null;
                if (b3Var != null) {
                    e0(b3Var, iVar, i11);
                }
                x0(andIncrement);
                iVar.p();
                return g.f6763b.b();
            }
            h0Var2 = bl.c.f6754o;
            if (r02 != h0Var2) {
                h0Var3 = bl.c.f6753n;
                if (r02 == h0Var3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                iVar.b();
                return g.f6763b.c(r02);
            }
            if (andIncrement < I()) {
                iVar.b();
            }
            iVar2 = iVar;
        }
        return g.f6763b.a(E());
    }

    protected void c0() {
    }

    @Override // bl.o
    public boolean d(Throwable th2) {
        return u(th2, false);
    }

    protected void d0() {
    }

    @Override // bl.n
    public e<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01db, code lost:
    
        r3 = (bl.i) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e2, code lost:
    
        if (r3 != null) goto L221;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.b.toString():java.lang.String");
    }

    protected boolean u(Throwable th2, boolean z10) {
        h0 h0Var;
        if (z10) {
            W();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6726l;
        h0Var = bl.c.f6758s;
        boolean a10 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h0Var, th2);
        if (z10) {
            X();
        } else {
            Y();
        }
        x();
        a0();
        if (a10) {
            M();
        }
        return a10;
    }

    public final void x0(long j10) {
        int i10;
        long j11;
        long v10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v11;
        long j12;
        long v12;
        if (U()) {
            return;
        }
        do {
        } while (D() <= j10);
        i10 = bl.c.f6742c;
        for (int i11 = 0; i11 < i10; i11++) {
            long D = D();
            if (D == (4611686018427387903L & f6722h.get(this)) && D == D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6722h;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
            v10 = bl.c.v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, v10));
        while (true) {
            long D2 = D();
            atomicLongFieldUpdater = f6722h;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j13) != 0;
            if (D2 == j14 && D2 == D()) {
                break;
            } else if (!z10) {
                v11 = bl.c.v(j14, true);
                atomicLongFieldUpdater.compareAndSet(this, j13, v11);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            v12 = bl.c.v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, v12));
    }

    public final void y(long j10) {
        h0 h0Var;
        q0 d10;
        i<E> iVar = (i) f6724j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6720f;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f6728b + j11, D())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = bl.c.f6741b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (iVar.f14765c != j12) {
                    i<E> B = B(j12, iVar);
                    if (B == null) {
                        continue;
                    } else {
                        iVar = B;
                    }
                }
                Object r02 = r0(iVar, i11, j11, null);
                h0Var = bl.c.f6754o;
                if (r02 != h0Var) {
                    iVar.b();
                    ok.l<E, v> lVar = this.f6729c;
                    if (lVar != null && (d10 = z.d(lVar, r02, null, 2, null)) != null) {
                        throw d10;
                    }
                } else if (j11 < I()) {
                    iVar.b();
                }
            }
        }
    }
}
