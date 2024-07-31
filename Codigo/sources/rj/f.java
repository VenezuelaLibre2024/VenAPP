package rj;

import dj.p;
import dj.q;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T, U> extends rj.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends p<? extends U>> f24972b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f24973c;

    /* renamed from: d, reason: collision with root package name */
    final int f24974d;

    /* renamed from: e, reason: collision with root package name */
    final int f24975e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<gj.b> implements q<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a, reason: collision with root package name */
        final long f24976a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f24977b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f24978c;

        /* renamed from: d, reason: collision with root package name */
        volatile mj.j<U> f24979d;

        /* renamed from: e, reason: collision with root package name */
        int f24980e;

        a(b<T, U> bVar, long j10) {
            this.f24976a = j10;
            this.f24977b = bVar;
        }

        @Override // dj.q
        public void a() {
            this.f24978c = true;
            this.f24977b.g();
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.o(this, bVar) && (bVar instanceof mj.e)) {
                mj.e eVar = (mj.e) bVar;
                int l10 = eVar.l(7);
                if (l10 == 1) {
                    this.f24980e = l10;
                    this.f24979d = eVar;
                    this.f24978c = true;
                    this.f24977b.g();
                    return;
                }
                if (l10 == 2) {
                    this.f24980e = l10;
                    this.f24979d = eVar;
                }
            }
        }

        @Override // dj.q
        public void c(U u10) {
            if (this.f24980e == 0) {
                this.f24977b.l(u10, this);
            } else {
                this.f24977b.g();
            }
        }

        public void d() {
            kj.b.b(this);
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (!this.f24977b.f24988s.a(th2)) {
                yj.a.q(th2);
                return;
            }
            b<T, U> bVar = this.f24977b;
            if (!bVar.f24983c) {
                bVar.f();
            }
            this.f24978c = true;
            this.f24977b.g();
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends AtomicInteger implements gj.b, q<T> {
        static final a<?, ?>[] B = new a[0];
        static final a<?, ?>[] C = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        int A;

        /* renamed from: a, reason: collision with root package name */
        final q<? super U> f24981a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends p<? extends U>> f24982b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f24983c;

        /* renamed from: d, reason: collision with root package name */
        final int f24984d;

        /* renamed from: e, reason: collision with root package name */
        final int f24985e;

        /* renamed from: f, reason: collision with root package name */
        volatile mj.i<U> f24986f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f24987r;

        /* renamed from: s, reason: collision with root package name */
        final xj.c f24988s = new xj.c();

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f24989t;

        /* renamed from: u, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f24990u;

        /* renamed from: v, reason: collision with root package name */
        gj.b f24991v;

        /* renamed from: w, reason: collision with root package name */
        long f24992w;

        /* renamed from: x, reason: collision with root package name */
        long f24993x;

        /* renamed from: y, reason: collision with root package name */
        int f24994y;

        /* renamed from: z, reason: collision with root package name */
        Queue<p<? extends U>> f24995z;

        b(q<? super U> qVar, jj.e<? super T, ? extends p<? extends U>> eVar, boolean z10, int i10, int i11) {
            this.f24981a = qVar;
            this.f24982b = eVar;
            this.f24983c = z10;
            this.f24984d = i10;
            this.f24985e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f24995z = new ArrayDeque(i10);
            }
            this.f24990u = new AtomicReference<>(B);
        }

        @Override // dj.q
        public void a() {
            if (this.f24987r) {
                return;
            }
            this.f24987r = true;
            g();
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24991v, bVar)) {
                this.f24991v = bVar;
                this.f24981a.b(this);
            }
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f24987r) {
                return;
            }
            try {
                p<? extends U> pVar = (p) lj.b.d(this.f24982b.apply(t10), "The mapper returned a null ObservableSource");
                if (this.f24984d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.A;
                        if (i10 == this.f24984d) {
                            this.f24995z.offer(pVar);
                            return;
                        }
                        this.A = i10 + 1;
                    }
                }
                k(pVar);
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24991v.dispose();
                onError(th2);
            }
        }

        boolean d(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f24990u.get();
                if (aVarArr == C) {
                    aVar.d();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!e2.c.a(this.f24990u, aVarArr, aVarArr2));
            return true;
        }

        @Override // gj.b
        public void dispose() {
            Throwable b10;
            if (this.f24989t) {
                return;
            }
            this.f24989t = true;
            if (!f() || (b10 = this.f24988s.b()) == null || b10 == xj.g.f31385a) {
                return;
            }
            yj.a.q(b10);
        }

        boolean e() {
            if (this.f24989t) {
                return true;
            }
            Throwable th2 = this.f24988s.get();
            if (this.f24983c || th2 == null) {
                return false;
            }
            f();
            Throwable b10 = this.f24988s.b();
            if (b10 != xj.g.f31385a) {
                this.f24981a.onError(b10);
            }
            return true;
        }

        boolean f() {
            a<?, ?>[] andSet;
            this.f24991v.dispose();
            a<?, ?>[] aVarArr = this.f24990u.get();
            a<?, ?>[] aVarArr2 = C;
            if (aVarArr == aVarArr2 || (andSet = this.f24990u.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.d();
            }
            return true;
        }

        void g() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        @Override // gj.b
        public boolean h() {
            return this.f24989t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00ce A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00f9 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void i() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rj.f.b.i():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void j(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f24990u.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = B;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!e2.c.a(this.f24990u, aVarArr, aVarArr2));
        }

        void k(p<? extends U> pVar) {
            boolean z10;
            while (pVar instanceof Callable) {
                if (!m((Callable) pVar) || this.f24984d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    pVar = this.f24995z.poll();
                    if (pVar == null) {
                        z10 = true;
                        this.A--;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    g();
                    return;
                }
            }
            long j10 = this.f24992w;
            this.f24992w = 1 + j10;
            a<T, U> aVar = new a<>(this, j10);
            if (d(aVar)) {
                pVar.d(aVar);
            }
        }

        void l(U u10, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f24981a.c(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                mj.j jVar = aVar.f24979d;
                if (jVar == null) {
                    jVar = new tj.b(this.f24985e);
                    aVar.f24979d = jVar;
                }
                jVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            i();
        }

        boolean m(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f24981a.c(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    mj.i<U> iVar = this.f24986f;
                    if (iVar == null) {
                        iVar = this.f24984d == Integer.MAX_VALUE ? new tj.b<>(this.f24985e) : new tj.a<>(this.f24984d);
                        this.f24986f = iVar;
                    }
                    if (!iVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                i();
                return true;
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24988s.a(th2);
                g();
                return true;
            }
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (this.f24987r) {
                yj.a.q(th2);
            } else if (!this.f24988s.a(th2)) {
                yj.a.q(th2);
            } else {
                this.f24987r = true;
                g();
            }
        }
    }

    public f(p<T> pVar, jj.e<? super T, ? extends p<? extends U>> eVar, boolean z10, int i10, int i11) {
        super(pVar);
        this.f24972b = eVar;
        this.f24973c = z10;
        this.f24974d = i10;
        this.f24975e = i11;
    }

    @Override // dj.o
    public void s(q<? super U> qVar) {
        if (l.b(this.f24957a, qVar, this.f24972b)) {
            return;
        }
        this.f24957a.d(new b(qVar, this.f24972b, this.f24973c, this.f24974d, this.f24975e));
    }
}
