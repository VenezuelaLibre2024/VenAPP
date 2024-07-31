package p089el;

import androidx.concurrent.futures.C0741b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9315g;

/* renamed from: el.u */
/* loaded from: classes3.dex */
public final class C7245u<E> {

    /* renamed from: e */
    public static final a f16234e = new a(null);

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f16235f = AtomicReferenceFieldUpdater.newUpdater(C7245u.class, Object.class, "_next");

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f16236g = AtomicLongFieldUpdater.newUpdater(C7245u.class, "_state");

    /* renamed from: h */
    public static final C7223h0 f16237h = new C7223h0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    private final int f16238a;

    /* renamed from: b */
    private final boolean f16239b;

    /* renamed from: c */
    private final int f16240c;

    /* renamed from: d */
    private final AtomicReferenceArray f16241d;

    /* renamed from: el.u$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final int m21675a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m21676b(long j10, int i10) {
            return m21678d(j10, 1073741823L) | (i10 << 0);
        }

        /* renamed from: c */
        public final long m21677c(long j10, int i10) {
            return m21678d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m21678d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* renamed from: el.u$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final int f16242a;

        public b(int i10) {
            this.f16242a = i10;
        }
    }

    public C7245u(int i10, boolean z10) {
        this.f16238a = i10;
        this.f16239b = z10;
        int i11 = i10 - 1;
        this.f16240c = i11;
        this.f16241d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C7245u<E> m21664b(long j10) {
        C7245u<E> c7245u = new C7245u<>(this.f16238a * 2, this.f16239b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f16240c;
            if ((i10 & i12) == (i11 & i12)) {
                f16236g.set(c7245u, f16234e.m21678d(j10, 1152921504606846976L));
                return c7245u;
            }
            Object obj = this.f16241d.get(i12 & i10);
            if (obj == null) {
                obj = new b(i10);
            }
            c7245u.f16241d.set(c7245u.f16240c & i10, obj);
            i10++;
        }
    }

    /* renamed from: c */
    private final C7245u<E> m21665c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16235f;
        while (true) {
            C7245u<E> c7245u = (C7245u) atomicReferenceFieldUpdater.get(this);
            if (c7245u != null) {
                return c7245u;
            }
            C0741b.m3751a(f16235f, this, null, m21664b(j10));
        }
    }

    /* renamed from: e */
    private final C7245u<E> m21666e(int i10, E e10) {
        Object obj = this.f16241d.get(this.f16240c & i10);
        if (!(obj instanceof b) || ((b) obj).f16242a != i10) {
            return null;
        }
        this.f16241d.set(i10 & this.f16240c, e10);
        return this;
    }

    /* renamed from: h */
    private final long m21667h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16236g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    /* renamed from: k */
    private final C7245u<E> m21668k(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16236g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return m21673i();
            }
        } while (!f16236g.compareAndSet(this, j10, f16234e.m21676b(j10, i11)));
        this.f16241d.set(this.f16240c & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m21669a(E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p089el.C7245u.f16236g
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            el.u$a r14 = p089el.C7245u.f16234e
            int r14 = r14.m21675a(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f16240c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r13.f16239b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f16241d
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L51
            int r2 = r13.f16238a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L50
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p089el.C7245u.f16236g
            el.u$a r5 = p089el.C7245u.f16234e
            long r5 = r5.m21677c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f16241d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p089el.C7245u.f16236g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L83
            el.u r0 = r0.m21673i()
            el.u r0 = r0.m21666e(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p089el.C7245u.m21669a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m21670d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16236g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m21671f() {
        long j10 = f16236g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean m21672g() {
        long j10 = f16236g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C7245u<E> m21673i() {
        return m21665c(m21667h());
    }

    /* renamed from: j */
    public final Object m21674j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16236g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f16237h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = this.f16240c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i10 & i11)) {
                return null;
            }
            Object obj = this.f16241d.get(i11 & i10);
            if (obj == null) {
                if (this.f16239b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f16236g.compareAndSet(this, j10, f16234e.m21676b(j10, i12))) {
                    this.f16241d.set(this.f16240c & i10, null);
                    return obj;
                }
                if (this.f16239b) {
                    C7245u<E> c7245u = this;
                    do {
                        c7245u = c7245u.m21668k(i10, i12);
                    } while (c7245u != null);
                    return obj;
                }
            }
        }
    }
}
