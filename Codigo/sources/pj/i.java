package pj;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i<T, U> extends pj.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final jj.e<? super T, ? extends im.a<? extends U>> f23127c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23128d;

    /* renamed from: e, reason: collision with root package name */
    final int f23129e;

    /* renamed from: f, reason: collision with root package name */
    final int f23130f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T, U> extends AtomicReference<im.c> implements dj.i<U>, gj.b {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: a, reason: collision with root package name */
        final long f23131a;

        /* renamed from: b, reason: collision with root package name */
        final b<T, U> f23132b;

        /* renamed from: c, reason: collision with root package name */
        final int f23133c;

        /* renamed from: d, reason: collision with root package name */
        final int f23134d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f23135e;

        /* renamed from: f, reason: collision with root package name */
        volatile mj.j<U> f23136f;

        /* renamed from: r, reason: collision with root package name */
        long f23137r;

        /* renamed from: s, reason: collision with root package name */
        int f23138s;

        a(b<T, U> bVar, long j10) {
            this.f23131a = j10;
            this.f23132b = bVar;
            int i10 = bVar.f23143e;
            this.f23134d = i10;
            this.f23133c = i10 >> 2;
        }

        @Override // im.b
        public void a() {
            this.f23135e = true;
            this.f23132b.j();
        }

        void b(long j10) {
            if (this.f23138s != 1) {
                long j11 = this.f23137r + j10;
                if (j11 < this.f23133c) {
                    this.f23137r = j11;
                } else {
                    this.f23137r = 0L;
                    get().i(j11);
                }
            }
        }

        @Override // im.b
        public void c(U u10) {
            if (this.f23138s != 2) {
                this.f23132b.p(u10, this);
            } else {
                this.f23132b.j();
            }
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.o(this, cVar)) {
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(7);
                    if (l10 == 1) {
                        this.f23138s = l10;
                        this.f23136f = gVar;
                        this.f23135e = true;
                        this.f23132b.j();
                        return;
                    }
                    if (l10 == 2) {
                        this.f23138s = l10;
                        this.f23136f = gVar;
                    }
                }
                cVar.i(this.f23134d);
            }
        }

        @Override // gj.b
        public void dispose() {
            wj.g.b(this);
        }

        @Override // gj.b
        public boolean h() {
            return get() == wj.g.CANCELLED;
        }

        @Override // im.b
        public void onError(Throwable th2) {
            lazySet(wj.g.CANCELLED);
            this.f23132b.n(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, U> extends AtomicInteger implements dj.i<T>, im.c {
        static final a<?, ?>[] C = new a[0];
        static final a<?, ?>[] D = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        int A;
        final int B;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super U> f23139a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends im.a<? extends U>> f23140b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f23141c;

        /* renamed from: d, reason: collision with root package name */
        final int f23142d;

        /* renamed from: e, reason: collision with root package name */
        final int f23143e;

        /* renamed from: f, reason: collision with root package name */
        volatile mj.i<U> f23144f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f23145r;

        /* renamed from: s, reason: collision with root package name */
        final xj.c f23146s = new xj.c();

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f23147t;

        /* renamed from: u, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f23148u;

        /* renamed from: v, reason: collision with root package name */
        final AtomicLong f23149v;

        /* renamed from: w, reason: collision with root package name */
        im.c f23150w;

        /* renamed from: x, reason: collision with root package name */
        long f23151x;

        /* renamed from: y, reason: collision with root package name */
        long f23152y;

        /* renamed from: z, reason: collision with root package name */
        int f23153z;

        b(im.b<? super U> bVar, jj.e<? super T, ? extends im.a<? extends U>> eVar, boolean z10, int i10, int i11) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f23148u = atomicReference;
            this.f23149v = new AtomicLong();
            this.f23139a = bVar;
            this.f23140b = eVar;
            this.f23141c = z10;
            this.f23142d = i10;
            this.f23143e = i11;
            this.B = Math.max(1, i10 >> 1);
            atomicReference.lazySet(C);
        }

        @Override // im.b
        public void a() {
            if (this.f23145r) {
                return;
            }
            this.f23145r = true;
            j();
        }

        boolean b(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f23148u.get();
                if (aVarArr == D) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!e2.c.a(this.f23148u, aVarArr, aVarArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // im.b
        public void c(T t10) {
            if (this.f23145r) {
                return;
            }
            try {
                im.a aVar = (im.a) lj.b.d(this.f23140b.apply(t10), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    long j10 = this.f23151x;
                    this.f23151x = 1 + j10;
                    a aVar2 = new a(this, j10);
                    if (b(aVar2)) {
                        aVar.a(aVar2);
                        return;
                    }
                    return;
                }
                try {
                    Object call = ((Callable) aVar).call();
                    if (call != null) {
                        q(call);
                        return;
                    }
                    if (this.f23142d == Integer.MAX_VALUE || this.f23147t) {
                        return;
                    }
                    int i10 = this.A + 1;
                    this.A = i10;
                    int i11 = this.B;
                    if (i10 == i11) {
                        this.A = 0;
                        this.f23150w.i(i11);
                    }
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    this.f23146s.a(th2);
                    j();
                }
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f23150w.cancel();
                onError(th3);
            }
        }

        @Override // im.c
        public void cancel() {
            mj.i<U> iVar;
            if (this.f23147t) {
                return;
            }
            this.f23147t = true;
            this.f23150w.cancel();
            h();
            if (getAndIncrement() != 0 || (iVar = this.f23144f) == null) {
                return;
            }
            iVar.clear();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23150w, cVar)) {
                this.f23150w = cVar;
                this.f23139a.d(this);
                if (this.f23147t) {
                    return;
                }
                int i10 = this.f23142d;
                cVar.i(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        boolean e() {
            if (this.f23147t) {
                g();
                return true;
            }
            if (this.f23141c || this.f23146s.get() == null) {
                return false;
            }
            g();
            Throwable b10 = this.f23146s.b();
            if (b10 != xj.g.f31385a) {
                this.f23139a.onError(b10);
            }
            return true;
        }

        void g() {
            mj.i<U> iVar = this.f23144f;
            if (iVar != null) {
                iVar.clear();
            }
        }

        void h() {
            a<?, ?>[] andSet;
            a<?, ?>[] aVarArr = this.f23148u.get();
            a<?, ?>[] aVarArr2 = D;
            if (aVarArr == aVarArr2 || (andSet = this.f23148u.getAndSet(aVarArr2)) == aVarArr2) {
                return;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            Throwable b10 = this.f23146s.b();
            if (b10 == null || b10 == xj.g.f31385a) {
                return;
            }
            yj.a.q(b10);
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this.f23149v, j10);
                j();
            }
        }

        void j() {
            if (getAndIncrement() == 0) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void k() {
            long j10;
            long j11;
            boolean z10;
            int i10;
            long j12;
            Object obj;
            im.b<? super U> bVar = this.f23139a;
            int i11 = 1;
            while (!e()) {
                mj.i<U> iVar = this.f23144f;
                long j13 = this.f23149v.get();
                boolean z11 = j13 == Long.MAX_VALUE;
                long j14 = 0;
                long j15 = 0;
                if (iVar != null) {
                    do {
                        long j16 = 0;
                        obj = null;
                        while (true) {
                            if (j13 == 0) {
                                break;
                            }
                            U poll = iVar.poll();
                            if (e()) {
                                return;
                            }
                            if (poll == null) {
                                obj = poll;
                                break;
                            }
                            bVar.c(poll);
                            j15++;
                            j16++;
                            j13--;
                            obj = poll;
                        }
                        if (j16 != 0) {
                            j13 = z11 ? Long.MAX_VALUE : this.f23149v.addAndGet(-j16);
                        }
                        if (j13 == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.f23145r;
                mj.i<U> iVar2 = this.f23144f;
                a<?, ?>[] aVarArr = this.f23148u.get();
                int length = aVarArr.length;
                if (z12 && ((iVar2 == null || iVar2.isEmpty()) && length == 0)) {
                    Throwable b10 = this.f23146s.b();
                    if (b10 != xj.g.f31385a) {
                        if (b10 == null) {
                            bVar.a();
                            return;
                        } else {
                            bVar.onError(b10);
                            return;
                        }
                    }
                    return;
                }
                int i12 = i11;
                if (length != 0) {
                    long j17 = this.f23152y;
                    int i13 = this.f23153z;
                    if (length <= i13 || aVarArr[i13].f23131a != j17) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && aVarArr[i13].f23131a != j17; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.f23153z = i13;
                        this.f23152y = aVarArr[i13].f23131a;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (e()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i15];
                        Object obj2 = null;
                        while (!e()) {
                            mj.j<U> jVar = aVar.f23136f;
                            int i17 = length;
                            if (jVar != null) {
                                Object obj3 = obj2;
                                long j18 = j14;
                                while (true) {
                                    if (j13 == j14) {
                                        break;
                                    }
                                    try {
                                        U poll2 = jVar.poll();
                                        if (poll2 == null) {
                                            obj3 = poll2;
                                            j14 = 0;
                                            break;
                                        }
                                        bVar.c(poll2);
                                        if (e()) {
                                            return;
                                        }
                                        j13--;
                                        j18++;
                                        obj3 = poll2;
                                        j14 = 0;
                                    } catch (Throwable th2) {
                                        hj.b.b(th2);
                                        aVar.dispose();
                                        this.f23146s.a(th2);
                                        if (!this.f23141c) {
                                            this.f23150w.cancel();
                                        }
                                        if (e()) {
                                            return;
                                        }
                                        o(aVar);
                                        i16++;
                                        z13 = true;
                                        i10 = 1;
                                    }
                                }
                                if (j18 != j14) {
                                    j13 = !z11 ? this.f23149v.addAndGet(-j18) : Long.MAX_VALUE;
                                    aVar.b(j18);
                                    j12 = 0;
                                } else {
                                    j12 = j14;
                                }
                                if (j13 != j12 && obj3 != null) {
                                    length = i17;
                                    obj2 = obj3;
                                    j14 = 0;
                                }
                            }
                            boolean z14 = aVar.f23135e;
                            mj.j<U> jVar2 = aVar.f23136f;
                            if (z14 && (jVar2 == null || jVar2.isEmpty())) {
                                o(aVar);
                                if (e()) {
                                    return;
                                }
                                j15++;
                                z13 = true;
                            }
                            if (j13 == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i17) {
                                i15 = 0;
                            }
                            i10 = 1;
                            i16 += i10;
                            length = i17;
                            j14 = 0;
                        }
                        return;
                    }
                    this.f23153z = i15;
                    this.f23152y = aVarArr[i15].f23131a;
                    j11 = j15;
                    j10 = 0;
                } else {
                    j10 = 0;
                    j11 = j15;
                    z10 = false;
                }
                if (j11 != j10 && !this.f23147t) {
                    this.f23150w.i(j11);
                }
                if (z10) {
                    i11 = i12;
                } else {
                    i11 = addAndGet(-i12);
                    if (i11 == 0) {
                        return;
                    }
                }
            }
        }

        mj.j<U> l(a<T, U> aVar) {
            mj.j<U> jVar = aVar.f23136f;
            if (jVar != null) {
                return jVar;
            }
            tj.a aVar2 = new tj.a(this.f23143e);
            aVar.f23136f = aVar2;
            return aVar2;
        }

        mj.j<U> m() {
            mj.i<U> iVar = this.f23144f;
            if (iVar == null) {
                iVar = this.f23142d == Integer.MAX_VALUE ? new tj.b<>(this.f23143e) : new tj.a<>(this.f23142d);
                this.f23144f = iVar;
            }
            return iVar;
        }

        void n(a<T, U> aVar, Throwable th2) {
            if (!this.f23146s.a(th2)) {
                yj.a.q(th2);
                return;
            }
            aVar.f23135e = true;
            if (!this.f23141c) {
                this.f23150w.cancel();
                for (a<?, ?> aVar2 : this.f23148u.getAndSet(D)) {
                    aVar2.dispose();
                }
            }
            j();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void o(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f23148u.get();
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
                    aVarArr2 = C;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!e2.c.a(this.f23148u, aVarArr, aVarArr2));
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23145r) {
                yj.a.q(th2);
            } else if (!this.f23146s.a(th2)) {
                yj.a.q(th2);
            } else {
                this.f23145r = true;
                j();
            }
        }

        void p(U u10, a<T, U> aVar) {
            hj.c cVar;
            if (get() != 0 || !compareAndSet(0, 1)) {
                mj.j jVar = aVar.f23136f;
                if (jVar == null) {
                    jVar = new tj.a(this.f23143e);
                    aVar.f23136f = jVar;
                }
                if (!jVar.offer(u10)) {
                    cVar = new hj.c("Inner queue full?!");
                    onError(cVar);
                    return;
                } else {
                    if (getAndIncrement() != 0) {
                        return;
                    }
                    k();
                }
            }
            long j10 = this.f23149v.get();
            mj.j<U> jVar2 = aVar.f23136f;
            if (j10 == 0 || !(jVar2 == null || jVar2.isEmpty())) {
                if (jVar2 == null) {
                    jVar2 = l(aVar);
                }
                if (!jVar2.offer(u10)) {
                    cVar = new hj.c("Inner queue full?!");
                    onError(cVar);
                    return;
                }
            } else {
                this.f23139a.c(u10);
                if (j10 != Long.MAX_VALUE) {
                    this.f23149v.decrementAndGet();
                }
                aVar.b(1L);
            }
            if (decrementAndGet() == 0) {
                return;
            }
            k();
        }

        void q(U u10) {
            IllegalStateException illegalStateException;
            if (get() != 0 || !compareAndSet(0, 1)) {
                if (!m().offer(u10)) {
                    illegalStateException = new IllegalStateException("Scalar queue full?!");
                    onError(illegalStateException);
                    return;
                } else {
                    if (getAndIncrement() != 0) {
                        return;
                    }
                    k();
                }
            }
            long j10 = this.f23149v.get();
            mj.j<U> jVar = this.f23144f;
            if (j10 == 0 || !(jVar == null || jVar.isEmpty())) {
                if (jVar == null) {
                    jVar = m();
                }
                if (!jVar.offer(u10)) {
                    illegalStateException = new IllegalStateException("Scalar queue full?!");
                    onError(illegalStateException);
                    return;
                }
            } else {
                this.f23139a.c(u10);
                if (j10 != Long.MAX_VALUE) {
                    this.f23149v.decrementAndGet();
                }
                if (this.f23142d != Integer.MAX_VALUE && !this.f23147t) {
                    int i10 = this.A + 1;
                    this.A = i10;
                    int i11 = this.B;
                    if (i10 == i11) {
                        this.A = 0;
                        this.f23150w.i(i11);
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
            k();
        }
    }

    public i(dj.f<T> fVar, jj.e<? super T, ? extends im.a<? extends U>> eVar, boolean z10, int i10, int i11) {
        super(fVar);
        this.f23127c = eVar;
        this.f23128d = z10;
        this.f23129e = i10;
        this.f23130f = i11;
    }

    public static <T, U> dj.i<T> K(im.b<? super U> bVar, jj.e<? super T, ? extends im.a<? extends U>> eVar, boolean z10, int i10, int i11) {
        return new b(bVar, eVar, z10, i10, i11);
    }

    @Override // dj.f
    protected void I(im.b<? super U> bVar) {
        if (x.b(this.f23056b, bVar, this.f23127c)) {
            return;
        }
        this.f23056b.H(K(bVar, this.f23127c, this.f23128d, this.f23129e, this.f23130f));
    }
}
