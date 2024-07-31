package il;

import ck.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import ok.p;
import zk.b3;
import zk.m;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17831c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f17832d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17833e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f17834f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17835g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f17836a;

    /* renamed from: b, reason: collision with root package name */
    private final l<Throwable, v> f17837b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends k implements p<Long, f, f> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17838a = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f a(long j10, f fVar) {
            f h10;
            h10 = e.h(j10, fVar);
            return h10;
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ f invoke(Long l10, f fVar) {
            return a(l10.longValue(), fVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends o implements l<Throwable, v> {
        b() {
            super(1);
        }

        public final void a(Throwable th2) {
            d.this.i();
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends k implements p<Long, f, f> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f17840a = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f a(long j10, f fVar) {
            f h10;
            h10 = e.h(j10, fVar);
            return h10;
        }

        @Override // ok.p
        public /* bridge */ /* synthetic */ f invoke(Long l10, f fVar) {
            return a(l10.longValue(), fVar);
        }
    }

    public d(int i10, int i11) {
        this.f17836a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i10 - i11;
        this.f17837b = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean e(zk.b3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = il.d.f17833e
            java.lang.Object r3 = r2.get(r0)
            il.f r3 = (il.f) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = il.d.f17834f
            long r4 = r4.getAndIncrement(r0)
            il.d$a r6 = il.d.a.f17838a
            int r7 = il.e.f()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = el.d.c(r3, r7, r6)
            boolean r10 = el.f0.c(r9)
            if (r10 != 0) goto L5e
            el.e0 r10 = el.f0.b(r9)
        L29:
            java.lang.Object r13 = r2.get(r0)
            el.e0 r13 = (el.e0) r13
            long r14 = r13.f14765c
            long r11 = r10.f14765c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L39
        L37:
            r10 = 1
            goto L51
        L39:
            boolean r11 = r10.q()
            if (r11 != 0) goto L41
            r10 = 0
            goto L51
        L41:
            boolean r11 = androidx.concurrent.futures.b.a(r2, r0, r13, r10)
            if (r11 == 0) goto L54
            boolean r10 = r13.m()
            if (r10 == 0) goto L37
            r13.k()
            goto L37
        L51:
            if (r10 == 0) goto L1b
            goto L5e
        L54:
            boolean r11 = r10.m()
            if (r11 == 0) goto L29
            r10.k()
            goto L29
        L5e:
            el.e0 r2 = el.f0.b(r9)
            il.f r2 = (il.f) r2
            int r3 = il.e.f()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.r()
            r5 = 0
            boolean r4 = bl.h.a(r4, r3, r5, r1)
            if (r4 == 0) goto L7b
            r1.f(r2, r3)
            r1 = 1
            return r1
        L7b:
            el.h0 r4 = il.e.e()
            el.h0 r5 = il.e.g()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.r()
            boolean r2 = bl.h.a(r2, r3, r4, r5)
            if (r2 == 0) goto Lc9
            boolean r2 = r1 instanceof zk.m
            if (r2 == 0) goto La1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.n.c(r1, r2)
            zk.m r1 = (zk.m) r1
            ck.v r2 = ck.v.f7137a
            ok.l<java.lang.Throwable, ck.v> r3 = r0.f17837b
            r1.c(r2, r3)
        L9f:
            r1 = 1
            goto Lad
        La1:
            boolean r2 = r1 instanceof hl.b
            if (r2 == 0) goto Lae
            hl.b r1 = (hl.b) r1
            ck.v r2 = ck.v.f7137a
            r1.a(r2)
            goto L9f
        Lad:
            return r1
        Lae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il.d.e(zk.b3):boolean");
    }

    private final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f17835g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f17836a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f17835g.getAndDecrement(this);
        } while (andDecrement > this.f17836a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (!(obj instanceof m)) {
            if (obj instanceof hl.b) {
                return ((hl.b) obj).c(this, v.f7137a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        m mVar = (m) obj;
        Object l10 = mVar.l(v.f7137a, null, this.f17837b);
        if (l10 == null) {
            return false;
        }
        mVar.o(l10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = il.d.f17831c
            java.lang.Object r2 = r1.get(r15)
            il.f r2 = (il.f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = il.d.f17832d
            long r3 = r3.getAndIncrement(r15)
            int r5 = il.e.f()
            long r5 = (long) r5
            long r5 = r3 / r5
            il.d$c r7 = il.d.c.f17840a
        L18:
            java.lang.Object r8 = el.d.c(r2, r5, r7)
            boolean r9 = el.f0.c(r8)
            if (r9 != 0) goto L5b
            el.e0 r9 = el.f0.b(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            el.e0 r12 = (el.e0) r12
            long r13 = r12.f14765c
            long r10 = r9.f14765c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L4e
        L36:
            boolean r10 = r9.q()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L4e
        L3e:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r15, r12, r9)
            if (r10 == 0) goto L51
            boolean r9 = r12.m()
            if (r9 == 0) goto L34
            r12.k()
            goto L34
        L4e:
            if (r9 == 0) goto L18
            goto L5b
        L51:
            boolean r10 = r9.m()
            if (r10 == 0) goto L26
            r9.k()
            goto L26
        L5b:
            el.e0 r1 = el.f0.b(r8)
            il.f r1 = (il.f) r1
            r1.b()
            long r7 = r1.f14765c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            r2 = 0
            return r2
        L6c:
            int r2 = il.e.f()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            el.h0 r3 = il.e.e()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Laf
            int r3 = il.e.d()
            r10 = 0
        L86:
            if (r10 >= r3) goto L9c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            el.h0 r5 = il.e.g()
            if (r4 != r5) goto L98
            r4 = 1
            return r4
        L98:
            r4 = 1
            int r10 = r10 + 1
            goto L86
        L9c:
            r4 = 1
            el.h0 r3 = il.e.e()
            el.h0 r5 = il.e.b()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = bl.h.a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Laf:
            el.h0 r1 = il.e.c()
            if (r3 != r1) goto Lb7
            r1 = 0
            return r1
        Lb7:
            boolean r1 = r15.k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il.d.l():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(m<? super v> mVar) {
        while (g() <= 0) {
            n.c(mVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((b3) mVar)) {
                return;
            }
        }
        mVar.c(v.f7137a, this.f17837b);
    }

    public int h() {
        return Math.max(f17835g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = f17835g.getAndIncrement(this);
            if (andIncrement >= this.f17836a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f17836a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17835g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f17836a) {
                f();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
