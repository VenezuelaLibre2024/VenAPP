package pj;

import dj.r;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class r<T> extends pj.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final dj.r f23203c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23204d;

    /* renamed from: e, reason: collision with root package name */
    final int f23205e;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends wj.a<T> implements dj.i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: a, reason: collision with root package name */
        final r.b f23206a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f23207b;

        /* renamed from: c, reason: collision with root package name */
        final int f23208c;

        /* renamed from: d, reason: collision with root package name */
        final int f23209d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f23210e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        im.c f23211f;

        /* renamed from: r, reason: collision with root package name */
        mj.j<T> f23212r;

        /* renamed from: s, reason: collision with root package name */
        volatile boolean f23213s;

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f23214t;

        /* renamed from: u, reason: collision with root package name */
        Throwable f23215u;

        /* renamed from: v, reason: collision with root package name */
        int f23216v;

        /* renamed from: w, reason: collision with root package name */
        long f23217w;

        /* renamed from: x, reason: collision with root package name */
        boolean f23218x;

        a(r.b bVar, boolean z10, int i10) {
            this.f23206a = bVar;
            this.f23207b = z10;
            this.f23208c = i10;
            this.f23209d = i10 - (i10 >> 2);
        }

        @Override // im.b
        public final void a() {
            if (this.f23214t) {
                return;
            }
            this.f23214t = true;
            k();
        }

        @Override // im.b
        public final void c(T t10) {
            if (this.f23214t) {
                return;
            }
            if (this.f23216v == 2) {
                k();
                return;
            }
            if (!this.f23212r.offer(t10)) {
                this.f23211f.cancel();
                this.f23215u = new hj.c("Queue is full?!");
                this.f23214t = true;
            }
            k();
        }

        @Override // im.c
        public final void cancel() {
            if (this.f23213s) {
                return;
            }
            this.f23213s = true;
            this.f23211f.cancel();
            this.f23206a.dispose();
            if (getAndIncrement() == 0) {
                this.f23212r.clear();
            }
        }

        @Override // mj.j
        public final void clear() {
            this.f23212r.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        
            if (r3 != null) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean e(boolean r3, boolean r4, im.b<?> r5) {
            /*
                r2 = this;
                boolean r0 = r2.f23213s
                r1 = 1
                if (r0 == 0) goto L9
                r2.clear()
                return r1
            L9:
                if (r3 == 0) goto L2d
                boolean r3 = r2.f23207b
                if (r3 == 0) goto L1c
                if (r4 == 0) goto L2d
                java.lang.Throwable r3 = r2.f23215u
                if (r3 == 0) goto L29
                goto L23
            L16:
                dj.r$b r3 = r2.f23206a
                r3.dispose()
                return r1
            L1c:
                java.lang.Throwable r3 = r2.f23215u
                if (r3 == 0) goto L27
                r2.clear()
            L23:
                r5.onError(r3)
                goto L16
            L27:
                if (r4 == 0) goto L2d
            L29:
                r5.a()
                goto L16
            L2d:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.r.a.e(boolean, boolean, im.b):boolean");
        }

        abstract void g();

        abstract void h();

        @Override // im.c
        public final void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this.f23210e, j10);
                k();
            }
        }

        @Override // mj.j
        public final boolean isEmpty() {
            return this.f23212r.isEmpty();
        }

        abstract void j();

        final void k() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f23206a.b(this);
        }

        @Override // mj.f
        public final int l(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f23218x = true;
            return 2;
        }

        @Override // im.b
        public final void onError(Throwable th2) {
            if (this.f23214t) {
                yj.a.q(th2);
                return;
            }
            this.f23215u = th2;
            this.f23214t = true;
            k();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f23218x) {
                h();
            } else if (this.f23216v == 1) {
                j();
            } else {
                g();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: y, reason: collision with root package name */
        final mj.a<? super T> f23219y;

        /* renamed from: z, reason: collision with root package name */
        long f23220z;

        b(mj.a<? super T> aVar, r.b bVar, boolean z10, int i10) {
            super(bVar, z10, i10);
            this.f23219y = aVar;
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23211f, cVar)) {
                this.f23211f = cVar;
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(7);
                    if (l10 == 1) {
                        this.f23216v = 1;
                        this.f23212r = gVar;
                        this.f23214t = true;
                        this.f23219y.d(this);
                        return;
                    }
                    if (l10 == 2) {
                        this.f23216v = 2;
                        this.f23212r = gVar;
                        this.f23219y.d(this);
                        cVar.i(this.f23208c);
                        return;
                    }
                }
                this.f23212r = new tj.a(this.f23208c);
                this.f23219y.d(this);
                cVar.i(this.f23208c);
            }
        }

        @Override // pj.r.a
        void g() {
            mj.a<? super T> aVar = this.f23219y;
            mj.j<T> jVar = this.f23212r;
            long j10 = this.f23217w;
            long j11 = this.f23220z;
            int i10 = 1;
            while (true) {
                long j12 = this.f23210e.get();
                while (j10 != j12) {
                    boolean z10 = this.f23214t;
                    try {
                        T poll = jVar.poll();
                        boolean z11 = poll == null;
                        if (e(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.f(poll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f23209d) {
                            this.f23211f.i(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        hj.b.b(th2);
                        this.f23211f.cancel();
                        jVar.clear();
                        aVar.onError(th2);
                        this.f23206a.dispose();
                        return;
                    }
                }
                if (j10 == j12 && e(this.f23214t, jVar.isEmpty(), aVar)) {
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.f23217w = j10;
                    this.f23220z = j11;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // pj.r.a
        void h() {
            int i10 = 1;
            while (!this.f23213s) {
                boolean z10 = this.f23214t;
                this.f23219y.c(null);
                if (z10) {
                    Throwable th2 = this.f23215u;
                    if (th2 != null) {
                        this.f23219y.onError(th2);
                    } else {
                        this.f23219y.a();
                    }
                    this.f23206a.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
        
            r0.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
        
            if (r9.f23213s == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        
            if (r1.isEmpty() == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
        
            if (r4 != r5) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            r4 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
        
            r9.f23217w = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
        
            if (r4 != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
        
            return;
         */
        @Override // pj.r.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void j() {
            /*
                r9 = this;
                mj.a<? super T> r0 = r9.f23219y
                mj.j<T> r1 = r9.f23212r
                long r2 = r9.f23217w
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f23210e
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L3c
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2f
                boolean r8 = r9.f23213s
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
            L1c:
                r0.a()
            L1f:
                dj.r$b r0 = r9.f23206a
                r0.dispose()
                return
            L25:
                boolean r7 = r0.f(r7)
                if (r7 == 0) goto Ld
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2f:
                r1 = move-exception
                hj.b.b(r1)
                im.c r2 = r9.f23211f
                r2.cancel()
                r0.onError(r1)
                goto L1f
            L3c:
                boolean r5 = r9.f23213s
                if (r5 == 0) goto L41
                return
            L41:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L48
                goto L1c
            L48:
                int r5 = r9.get()
                if (r4 != r5) goto L58
                r9.f23217w = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L58:
                r4 = r5
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.r.b.j():void");
        }

        @Override // mj.j
        public T poll() {
            T poll = this.f23212r.poll();
            if (poll != null && this.f23216v != 1) {
                long j10 = this.f23220z + 1;
                if (j10 == this.f23209d) {
                    this.f23220z = 0L;
                    this.f23211f.i(j10);
                } else {
                    this.f23220z = j10;
                }
            }
            return poll;
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> extends a<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: y, reason: collision with root package name */
        final im.b<? super T> f23221y;

        c(im.b<? super T> bVar, r.b bVar2, boolean z10, int i10) {
            super(bVar2, z10, i10);
            this.f23221y = bVar;
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23211f, cVar)) {
                this.f23211f = cVar;
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(7);
                    if (l10 == 1) {
                        this.f23216v = 1;
                        this.f23212r = gVar;
                        this.f23214t = true;
                        this.f23221y.d(this);
                        return;
                    }
                    if (l10 == 2) {
                        this.f23216v = 2;
                        this.f23212r = gVar;
                        this.f23221y.d(this);
                        cVar.i(this.f23208c);
                        return;
                    }
                }
                this.f23212r = new tj.a(this.f23208c);
                this.f23221y.d(this);
                cVar.i(this.f23208c);
            }
        }

        @Override // pj.r.a
        void g() {
            im.b<? super T> bVar = this.f23221y;
            mj.j<T> jVar = this.f23212r;
            long j10 = this.f23217w;
            int i10 = 1;
            while (true) {
                long j11 = this.f23210e.get();
                while (j10 != j11) {
                    boolean z10 = this.f23214t;
                    try {
                        T poll = jVar.poll();
                        boolean z11 = poll == null;
                        if (e(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.c(poll);
                        j10++;
                        if (j10 == this.f23209d) {
                            if (j11 != Long.MAX_VALUE) {
                                j11 = this.f23210e.addAndGet(-j10);
                            }
                            this.f23211f.i(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        hj.b.b(th2);
                        this.f23211f.cancel();
                        jVar.clear();
                        bVar.onError(th2);
                        this.f23206a.dispose();
                        return;
                    }
                }
                if (j10 == j11 && e(this.f23214t, jVar.isEmpty(), bVar)) {
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.f23217w = j10;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // pj.r.a
        void h() {
            int i10 = 1;
            while (!this.f23213s) {
                boolean z10 = this.f23214t;
                this.f23221y.c(null);
                if (z10) {
                    Throwable th2 = this.f23215u;
                    if (th2 != null) {
                        this.f23221y.onError(th2);
                    } else {
                        this.f23221y.a();
                    }
                    this.f23206a.dispose();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        
            r0.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        
            if (r9.f23213s == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        
            if (r1.isEmpty() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        
            if (r4 != r5) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            r4 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
        
            r9.f23217w = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
        
            if (r4 != 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x003d, code lost:
        
            return;
         */
        @Override // pj.r.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void j() {
            /*
                r9 = this;
                im.b<? super T> r0 = r9.f23221y
                mj.j<T> r1 = r9.f23212r
                long r2 = r9.f23217w
                r4 = 1
            L7:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f23210e
                long r5 = r5.get()
            Ld:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L39
                java.lang.Object r7 = r1.poll()     // Catch: java.lang.Throwable -> L2c
                boolean r8 = r9.f23213s
                if (r8 == 0) goto L1a
                return
            L1a:
                if (r7 != 0) goto L25
            L1c:
                r0.a()
            L1f:
                dj.r$b r0 = r9.f23206a
                r0.dispose()
                return
            L25:
                r0.c(r7)
                r7 = 1
                long r2 = r2 + r7
                goto Ld
            L2c:
                r1 = move-exception
                hj.b.b(r1)
                im.c r2 = r9.f23211f
                r2.cancel()
                r0.onError(r1)
                goto L1f
            L39:
                boolean r5 = r9.f23213s
                if (r5 == 0) goto L3e
                return
            L3e:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L45
                goto L1c
            L45:
                int r5 = r9.get()
                if (r4 != r5) goto L55
                r9.f23217w = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L7
                return
            L55:
                r4 = r5
                goto L7
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.r.c.j():void");
        }

        @Override // mj.j
        public T poll() {
            T poll = this.f23212r.poll();
            if (poll != null && this.f23216v != 1) {
                long j10 = this.f23217w + 1;
                if (j10 == this.f23209d) {
                    this.f23217w = 0L;
                    this.f23211f.i(j10);
                } else {
                    this.f23217w = j10;
                }
            }
            return poll;
        }
    }

    public r(dj.f<T> fVar, dj.r rVar, boolean z10, int i10) {
        super(fVar);
        this.f23203c = rVar;
        this.f23204d = z10;
        this.f23205e = i10;
    }

    @Override // dj.f
    public void I(im.b<? super T> bVar) {
        dj.f<T> fVar;
        dj.i<? super T> cVar;
        r.b a10 = this.f23203c.a();
        if (bVar instanceof mj.a) {
            fVar = this.f23056b;
            cVar = new b<>((mj.a) bVar, a10, this.f23204d, this.f23205e);
        } else {
            fVar = this.f23056b;
            cVar = new c<>(bVar, a10, this.f23204d, this.f23205e);
        }
        fVar.H(cVar);
    }
}
