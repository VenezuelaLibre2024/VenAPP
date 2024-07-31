package pj;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class b<T, R> extends pj.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final jj.e<? super T, ? extends im.a<? extends R>> f23057c;

    /* renamed from: d, reason: collision with root package name */
    final int f23058d;

    /* renamed from: e, reason: collision with root package name */
    final xj.f f23059e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23060a;

        static {
            int[] iArr = new int[xj.f.values().length];
            f23060a = iArr;
            try {
                iArr[xj.f.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23060a[xj.f.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0383b<T, R> extends AtomicInteger implements dj.i<T>, f<R>, im.c {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends im.a<? extends R>> f23062b;

        /* renamed from: c, reason: collision with root package name */
        final int f23063c;

        /* renamed from: d, reason: collision with root package name */
        final int f23064d;

        /* renamed from: e, reason: collision with root package name */
        im.c f23065e;

        /* renamed from: f, reason: collision with root package name */
        int f23066f;

        /* renamed from: r, reason: collision with root package name */
        mj.j<T> f23067r;

        /* renamed from: s, reason: collision with root package name */
        volatile boolean f23068s;

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f23069t;

        /* renamed from: v, reason: collision with root package name */
        volatile boolean f23071v;

        /* renamed from: w, reason: collision with root package name */
        int f23072w;

        /* renamed from: a, reason: collision with root package name */
        final e<R> f23061a = new e<>(this);

        /* renamed from: u, reason: collision with root package name */
        final xj.c f23070u = new xj.c();

        AbstractC0383b(jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10) {
            this.f23062b = eVar;
            this.f23063c = i10;
            this.f23064d = i10 - (i10 >> 2);
        }

        @Override // im.b
        public final void a() {
            this.f23068s = true;
            h();
        }

        @Override // pj.b.f
        public final void b() {
            this.f23071v = false;
            h();
        }

        @Override // im.b
        public final void c(T t10) {
            if (this.f23072w == 2 || this.f23067r.offer(t10)) {
                h();
            } else {
                this.f23065e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // dj.i, im.b
        public final void d(im.c cVar) {
            if (wj.g.q(this.f23065e, cVar)) {
                this.f23065e = cVar;
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(3);
                    if (l10 == 1) {
                        this.f23072w = l10;
                        this.f23067r = gVar;
                        this.f23068s = true;
                        j();
                        h();
                        return;
                    }
                    if (l10 == 2) {
                        this.f23072w = l10;
                        this.f23067r = gVar;
                        j();
                        cVar.i(this.f23063c);
                        return;
                    }
                }
                this.f23067r = new tj.a(this.f23063c);
                j();
                cVar.i(this.f23063c);
            }
        }

        abstract void h();

        abstract void j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends AbstractC0383b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* renamed from: x, reason: collision with root package name */
        final im.b<? super R> f23073x;

        /* renamed from: y, reason: collision with root package name */
        final boolean f23074y;

        c(im.b<? super R> bVar, jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10, boolean z10) {
            super(eVar, i10);
            this.f23073x = bVar;
            this.f23074y = z10;
        }

        @Override // im.c
        public void cancel() {
            if (this.f23069t) {
                return;
            }
            this.f23069t = true;
            this.f23061a.cancel();
            this.f23065e.cancel();
        }

        @Override // pj.b.f
        public void e(Throwable th2) {
            if (!this.f23070u.a(th2)) {
                yj.a.q(th2);
                return;
            }
            if (!this.f23074y) {
                this.f23065e.cancel();
                this.f23068s = true;
            }
            this.f23071v = false;
            h();
        }

        @Override // pj.b.f
        public void g(R r10) {
            this.f23073x.c(r10);
        }

        @Override // pj.b.AbstractC0383b
        void h() {
            if (getAndIncrement() == 0) {
                while (!this.f23069t) {
                    if (!this.f23071v) {
                        boolean z10 = this.f23068s;
                        if (!z10 || this.f23074y || this.f23070u.get() == null) {
                            try {
                                T poll = this.f23067r.poll();
                                boolean z11 = poll == null;
                                if (z10 && z11) {
                                    Throwable b10 = this.f23070u.b();
                                    if (b10 != null) {
                                        this.f23073x.onError(b10);
                                        return;
                                    } else {
                                        this.f23073x.a();
                                        return;
                                    }
                                }
                                if (!z11) {
                                    im.a aVar = (im.a) lj.b.d(this.f23062b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f23072w != 1) {
                                        int i10 = this.f23066f + 1;
                                        if (i10 == this.f23064d) {
                                            this.f23066f = 0;
                                            this.f23065e.i(i10);
                                        } else {
                                            this.f23066f = i10;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        Object call = ((Callable) aVar).call();
                                        if (call == null) {
                                            continue;
                                        } else if (this.f23061a.g()) {
                                            this.f23073x.c(call);
                                        } else {
                                            this.f23071v = true;
                                            e<R> eVar = this.f23061a;
                                            eVar.j(new g(call, eVar));
                                        }
                                    } else {
                                        this.f23071v = true;
                                        aVar.a(this.f23061a);
                                    }
                                }
                            } catch (Throwable th2) {
                                hj.b.b(th2);
                                this.f23065e.cancel();
                                this.f23070u.a(th2);
                            }
                        }
                        this.f23073x.onError(this.f23070u.b());
                        return;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.c
        public void i(long j10) {
            this.f23061a.i(j10);
        }

        @Override // pj.b.AbstractC0383b
        void j() {
            this.f23073x.d(this);
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (!this.f23070u.a(th2)) {
                yj.a.q(th2);
            } else {
                this.f23068s = true;
                h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<T, R> extends AbstractC0383b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* renamed from: x, reason: collision with root package name */
        final im.b<? super R> f23075x;

        /* renamed from: y, reason: collision with root package name */
        final AtomicInteger f23076y;

        d(im.b<? super R> bVar, jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10) {
            super(eVar, i10);
            this.f23075x = bVar;
            this.f23076y = new AtomicInteger();
        }

        @Override // im.c
        public void cancel() {
            if (this.f23069t) {
                return;
            }
            this.f23069t = true;
            this.f23061a.cancel();
            this.f23065e.cancel();
        }

        @Override // pj.b.f
        public void e(Throwable th2) {
            if (!this.f23070u.a(th2)) {
                yj.a.q(th2);
                return;
            }
            this.f23065e.cancel();
            if (getAndIncrement() == 0) {
                this.f23075x.onError(this.f23070u.b());
            }
        }

        @Override // pj.b.f
        public void g(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f23075x.c(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f23075x.onError(this.f23070u.b());
            }
        }

        @Override // pj.b.AbstractC0383b
        void h() {
            if (this.f23076y.getAndIncrement() == 0) {
                while (!this.f23069t) {
                    if (!this.f23071v) {
                        boolean z10 = this.f23068s;
                        try {
                            T poll = this.f23067r.poll();
                            boolean z11 = poll == null;
                            if (z10 && z11) {
                                this.f23075x.a();
                                return;
                            }
                            if (!z11) {
                                try {
                                    im.a aVar = (im.a) lj.b.d(this.f23062b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f23072w != 1) {
                                        int i10 = this.f23066f + 1;
                                        if (i10 == this.f23064d) {
                                            this.f23066f = 0;
                                            this.f23065e.i(i10);
                                        } else {
                                            this.f23066f = i10;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) aVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f23061a.g()) {
                                                this.f23071v = true;
                                                e<R> eVar = this.f23061a;
                                                eVar.j(new g(call, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f23075x.c(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f23075x.onError(this.f23070u.b());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            hj.b.b(th2);
                                            this.f23065e.cancel();
                                            this.f23070u.a(th2);
                                            this.f23075x.onError(this.f23070u.b());
                                            return;
                                        }
                                    } else {
                                        this.f23071v = true;
                                        aVar.a(this.f23061a);
                                    }
                                } catch (Throwable th3) {
                                    hj.b.b(th3);
                                    this.f23065e.cancel();
                                    this.f23070u.a(th3);
                                    this.f23075x.onError(this.f23070u.b());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            hj.b.b(th4);
                            this.f23065e.cancel();
                            this.f23070u.a(th4);
                            this.f23075x.onError(this.f23070u.b());
                            return;
                        }
                    }
                    if (this.f23076y.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.c
        public void i(long j10) {
            this.f23061a.i(j10);
        }

        @Override // pj.b.AbstractC0383b
        void j() {
            this.f23075x.d(this);
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (!this.f23070u.a(th2)) {
                yj.a.q(th2);
                return;
            }
            this.f23061a.cancel();
            if (getAndIncrement() == 0) {
                this.f23075x.onError(this.f23070u.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e<R> extends wj.f implements dj.i<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* renamed from: s, reason: collision with root package name */
        final f<R> f23077s;

        /* renamed from: t, reason: collision with root package name */
        long f23078t;

        e(f<R> fVar) {
            this.f23077s = fVar;
        }

        @Override // im.b
        public void a() {
            long j10 = this.f23078t;
            if (j10 != 0) {
                this.f23078t = 0L;
                h(j10);
            }
            this.f23077s.b();
        }

        @Override // im.b
        public void c(R r10) {
            this.f23078t++;
            this.f23077s.g(r10);
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            j(cVar);
        }

        @Override // im.b
        public void onError(Throwable th2) {
            long j10 = this.f23078t;
            if (j10 != 0) {
                this.f23078t = 0L;
                h(j10);
            }
            this.f23077s.e(th2);
        }
    }

    /* loaded from: classes3.dex */
    interface f<T> {
        void b();

        void e(Throwable th2);

        void g(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class g<T> implements im.c {

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23079a;

        /* renamed from: b, reason: collision with root package name */
        final T f23080b;

        /* renamed from: c, reason: collision with root package name */
        boolean f23081c;

        g(T t10, im.b<? super T> bVar) {
            this.f23080b = t10;
            this.f23079a = bVar;
        }

        @Override // im.c
        public void cancel() {
        }

        @Override // im.c
        public void i(long j10) {
            if (j10 <= 0 || this.f23081c) {
                return;
            }
            this.f23081c = true;
            im.b<? super T> bVar = this.f23079a;
            bVar.c(this.f23080b);
            bVar.a();
        }
    }

    public b(dj.f<T> fVar, jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10, xj.f fVar2) {
        super(fVar);
        this.f23057c = eVar;
        this.f23058d = i10;
        this.f23059e = fVar2;
    }

    public static <T, R> im.b<T> K(im.b<? super R> bVar, jj.e<? super T, ? extends im.a<? extends R>> eVar, int i10, xj.f fVar) {
        int i11 = a.f23060a[fVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? new d(bVar, eVar, i10) : new c(bVar, eVar, i10, true) : new c(bVar, eVar, i10, false);
    }

    @Override // dj.f
    protected void I(im.b<? super R> bVar) {
        if (x.b(this.f23056b, bVar, this.f23057c)) {
            return;
        }
        this.f23056b.a(K(bVar, this.f23057c, this.f23058d, this.f23059e));
    }
}
