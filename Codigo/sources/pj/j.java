package pj;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j<T, R> extends pj.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final jj.e<? super T, ? extends dj.n<? extends R>> f23154c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23155d;

    /* renamed from: e, reason: collision with root package name */
    final int f23156e;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicInteger implements dj.i<T>, im.c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super R> f23157a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f23158b;

        /* renamed from: c, reason: collision with root package name */
        final int f23159c;

        /* renamed from: s, reason: collision with root package name */
        final jj.e<? super T, ? extends dj.n<? extends R>> f23164s;

        /* renamed from: u, reason: collision with root package name */
        im.c f23166u;

        /* renamed from: v, reason: collision with root package name */
        volatile boolean f23167v;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f23160d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final gj.a f23161e = new gj.a();

        /* renamed from: r, reason: collision with root package name */
        final xj.c f23163r = new xj.c();

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f23162f = new AtomicInteger(1);

        /* renamed from: t, reason: collision with root package name */
        final AtomicReference<tj.b<R>> f23165t = new AtomicReference<>();

        /* renamed from: pj.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0385a extends AtomicReference<gj.b> implements dj.l<R>, gj.b {
            private static final long serialVersionUID = -502562646270949838L;

            C0385a() {
            }

            @Override // dj.l
            public void a() {
                a.this.j(this);
            }

            @Override // dj.l
            public void b(gj.b bVar) {
                kj.b.o(this, bVar);
            }

            @Override // gj.b
            public void dispose() {
                kj.b.b(this);
            }

            @Override // gj.b
            public boolean h() {
                return kj.b.i(get());
            }

            @Override // dj.l
            public void onError(Throwable th2) {
                a.this.k(this, th2);
            }

            @Override // dj.l
            public void onSuccess(R r10) {
                a.this.l(this, r10);
            }
        }

        a(im.b<? super R> bVar, jj.e<? super T, ? extends dj.n<? extends R>> eVar, boolean z10, int i10) {
            this.f23157a = bVar;
            this.f23164s = eVar;
            this.f23158b = z10;
            this.f23159c = i10;
        }

        @Override // im.b
        public void a() {
            this.f23162f.decrementAndGet();
            e();
        }

        void b() {
            tj.b<R> bVar = this.f23165t.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        @Override // im.b
        public void c(T t10) {
            try {
                dj.n nVar = (dj.n) lj.b.d(this.f23164s.apply(t10), "The mapper returned a null MaybeSource");
                this.f23162f.getAndIncrement();
                C0385a c0385a = new C0385a();
                if (this.f23167v || !this.f23161e.b(c0385a)) {
                    return;
                }
                nVar.a(c0385a);
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f23166u.cancel();
                onError(th2);
            }
        }

        @Override // im.c
        public void cancel() {
            this.f23167v = true;
            this.f23166u.cancel();
            this.f23161e.dispose();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23166u, cVar)) {
                this.f23166u = cVar;
                this.f23157a.d(this);
                int i10 = this.f23159c;
                cVar.i(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        void e() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            r2 = r17.f23163r.b();
            b();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r10 != r6) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        
            if (r17.f23167v == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            if (r17.f23158b != false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        
            if (r17.f23163r.get() == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
        
            if (r2.get() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
        
            if (r7 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
        
            if (r7.isEmpty() == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
        
            if (r6 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
        
            if (r13 == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        
            r2 = r17.f23163r.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
        
            if (r2 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
        
            r1.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a7, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x007d, code lost:
        
            b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        
            if (r10 == 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
        
            xj.d.d(r17.f23160d, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
        
            if (r17.f23159c == Integer.MAX_VALUE) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        
            r17.f23166u.i(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.j.a.g():void");
        }

        tj.b<R> h() {
            tj.b<R> bVar;
            do {
                tj.b<R> bVar2 = this.f23165t.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new tj.b<>(dj.f.b());
            } while (!e2.c.a(this.f23165t, null, bVar));
            return bVar;
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this.f23160d, j10);
                e();
            }
        }

        void j(a<T, R>.C0385a c0385a) {
            this.f23161e.c(c0385a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f23162f.decrementAndGet() == 0;
                    tj.b<R> bVar = this.f23165t.get();
                    if (z10 && (bVar == null || bVar.isEmpty())) {
                        Throwable b10 = this.f23163r.b();
                        if (b10 != null) {
                            this.f23157a.onError(b10);
                            return;
                        } else {
                            this.f23157a.a();
                            return;
                        }
                    }
                    if (this.f23159c != Integer.MAX_VALUE) {
                        this.f23166u.i(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    g();
                    return;
                }
            }
            this.f23162f.decrementAndGet();
            if (this.f23159c != Integer.MAX_VALUE) {
                this.f23166u.i(1L);
            }
            e();
        }

        void k(a<T, R>.C0385a c0385a, Throwable th2) {
            this.f23161e.c(c0385a);
            if (!this.f23163r.a(th2)) {
                yj.a.q(th2);
                return;
            }
            if (!this.f23158b) {
                this.f23166u.cancel();
                this.f23161e.dispose();
            } else if (this.f23159c != Integer.MAX_VALUE) {
                this.f23166u.i(1L);
            }
            this.f23162f.decrementAndGet();
            e();
        }

        void l(a<T, R>.C0385a c0385a, R r10) {
            this.f23161e.c(c0385a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f23162f.decrementAndGet() == 0;
                    if (this.f23160d.get() != 0) {
                        this.f23157a.c(r10);
                        tj.b<R> bVar = this.f23165t.get();
                        if (z10 && (bVar == null || bVar.isEmpty())) {
                            Throwable b10 = this.f23163r.b();
                            if (b10 != null) {
                                this.f23157a.onError(b10);
                                return;
                            } else {
                                this.f23157a.a();
                                return;
                            }
                        }
                        xj.d.d(this.f23160d, 1L);
                        if (this.f23159c != Integer.MAX_VALUE) {
                            this.f23166u.i(1L);
                        }
                    } else {
                        tj.b<R> h10 = h();
                        synchronized (h10) {
                            h10.offer(r10);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    g();
                }
            }
            tj.b<R> h11 = h();
            synchronized (h11) {
                h11.offer(r10);
            }
            this.f23162f.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // im.b
        public void onError(Throwable th2) {
            this.f23162f.decrementAndGet();
            if (!this.f23163r.a(th2)) {
                yj.a.q(th2);
                return;
            }
            if (!this.f23158b) {
                this.f23161e.dispose();
            }
            e();
        }
    }

    public j(dj.f<T> fVar, jj.e<? super T, ? extends dj.n<? extends R>> eVar, boolean z10, int i10) {
        super(fVar);
        this.f23154c = eVar;
        this.f23155d = z10;
        this.f23156e = i10;
    }

    @Override // dj.f
    protected void I(im.b<? super R> bVar) {
        this.f23056b.H(new a(bVar, this.f23154c, this.f23155d, this.f23156e));
    }
}
