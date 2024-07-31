package pj;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class s<T> extends pj.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f23222c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f23223d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f23224e;

    /* renamed from: f, reason: collision with root package name */
    final jj.a f23225f;

    /* loaded from: classes3.dex */
    static final class a<T> extends wj.a<T> implements dj.i<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23226a;

        /* renamed from: b, reason: collision with root package name */
        final mj.i<T> f23227b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f23228c;

        /* renamed from: d, reason: collision with root package name */
        final jj.a f23229d;

        /* renamed from: e, reason: collision with root package name */
        im.c f23230e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f23231f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f23232r;

        /* renamed from: s, reason: collision with root package name */
        Throwable f23233s;

        /* renamed from: t, reason: collision with root package name */
        final AtomicLong f23234t = new AtomicLong();

        /* renamed from: u, reason: collision with root package name */
        boolean f23235u;

        a(im.b<? super T> bVar, int i10, boolean z10, boolean z11, jj.a aVar) {
            this.f23226a = bVar;
            this.f23229d = aVar;
            this.f23228c = z11;
            this.f23227b = z10 ? new tj.b<>(i10) : new tj.a<>(i10);
        }

        @Override // im.b
        public void a() {
            this.f23232r = true;
            if (this.f23235u) {
                this.f23226a.a();
            } else {
                g();
            }
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23227b.offer(t10)) {
                if (this.f23235u) {
                    this.f23226a.c(null);
                    return;
                } else {
                    g();
                    return;
                }
            }
            this.f23230e.cancel();
            hj.c cVar = new hj.c("Buffer is full");
            try {
                this.f23229d.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                cVar.initCause(th2);
            }
            onError(cVar);
        }

        @Override // im.c
        public void cancel() {
            if (this.f23231f) {
                return;
            }
            this.f23231f = true;
            this.f23230e.cancel();
            if (getAndIncrement() == 0) {
                this.f23227b.clear();
            }
        }

        @Override // mj.j
        public void clear() {
            this.f23227b.clear();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23230e, cVar)) {
                this.f23230e = cVar;
                this.f23226a.d(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        boolean e(boolean z10, boolean z11, im.b<? super T> bVar) {
            if (this.f23231f) {
                this.f23227b.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f23228c) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f23233s;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.a();
                }
                return true;
            }
            Throwable th3 = this.f23233s;
            if (th3 != null) {
                this.f23227b.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.a();
            return true;
        }

        void g() {
            if (getAndIncrement() == 0) {
                mj.i<T> iVar = this.f23227b;
                im.b<? super T> bVar = this.f23226a;
                int i10 = 1;
                while (!e(this.f23232r, iVar.isEmpty(), bVar)) {
                    long j10 = this.f23234t.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f23232r;
                        T poll = iVar.poll();
                        boolean z11 = poll == null;
                        if (e(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.c(poll);
                        j11++;
                    }
                    if (j11 == j10 && e(this.f23232r, iVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f23234t.addAndGet(-j11);
                    }
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // im.c
        public void i(long j10) {
            if (this.f23235u || !wj.g.p(j10)) {
                return;
            }
            xj.d.a(this.f23234t, j10);
            g();
        }

        @Override // mj.j
        public boolean isEmpty() {
            return this.f23227b.isEmpty();
        }

        @Override // mj.f
        public int l(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f23235u = true;
            return 2;
        }

        @Override // im.b
        public void onError(Throwable th2) {
            this.f23233s = th2;
            this.f23232r = true;
            if (this.f23235u) {
                this.f23226a.onError(th2);
            } else {
                g();
            }
        }

        @Override // mj.j
        public T poll() {
            return this.f23227b.poll();
        }
    }

    public s(dj.f<T> fVar, int i10, boolean z10, boolean z11, jj.a aVar) {
        super(fVar);
        this.f23222c = i10;
        this.f23223d = z10;
        this.f23224e = z11;
        this.f23225f = aVar;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23056b.H(new a(bVar, this.f23222c, this.f23223d, this.f23224e, this.f23225f));
    }
}
