package pj;

/* loaded from: classes3.dex */
public final class d<T> extends pj.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final jj.d<? super T> f23095c;

    /* renamed from: d, reason: collision with root package name */
    final jj.d<? super Throwable> f23096d;

    /* renamed from: e, reason: collision with root package name */
    final jj.a f23097e;

    /* renamed from: f, reason: collision with root package name */
    final jj.a f23098f;

    /* loaded from: classes3.dex */
    static final class a<T> extends vj.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final jj.d<? super T> f23099f;

        /* renamed from: r, reason: collision with root package name */
        final jj.d<? super Throwable> f23100r;

        /* renamed from: s, reason: collision with root package name */
        final jj.a f23101s;

        /* renamed from: t, reason: collision with root package name */
        final jj.a f23102t;

        a(mj.a<? super T> aVar, jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar2, jj.a aVar3) {
            super(aVar);
            this.f23099f = dVar;
            this.f23100r = dVar2;
            this.f23101s = aVar2;
            this.f23102t = aVar3;
        }

        @Override // vj.a, im.b
        public void a() {
            if (this.f29293d) {
                return;
            }
            try {
                this.f23101s.run();
                this.f29293d = true;
                this.f29290a.a();
                try {
                    this.f23102t.run();
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    yj.a.q(th2);
                }
            } catch (Throwable th3) {
                g(th3);
            }
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f29293d) {
                return;
            }
            if (this.f29294e != 0) {
                this.f29290a.c(null);
                return;
            }
            try {
                this.f23099f.accept(t10);
                this.f29290a.c(t10);
            } catch (Throwable th2) {
                g(th2);
            }
        }

        @Override // mj.a
        public boolean f(T t10) {
            if (this.f29293d) {
                return false;
            }
            try {
                this.f23099f.accept(t10);
                return this.f29290a.f(t10);
            } catch (Throwable th2) {
                g(th2);
                return false;
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return h(i10);
        }

        @Override // vj.a, im.b
        public void onError(Throwable th2) {
            if (this.f29293d) {
                yj.a.q(th2);
                return;
            }
            boolean z10 = true;
            this.f29293d = true;
            try {
                this.f23100r.accept(th2);
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f29290a.onError(new hj.a(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f29290a.onError(th2);
            }
            try {
                this.f23102t.run();
            } catch (Throwable th4) {
                hj.b.b(th4);
                yj.a.q(th4);
            }
        }

        @Override // mj.j
        public T poll() {
            try {
                T poll = this.f29292c.poll();
                if (poll == null) {
                    if (this.f29294e == 1) {
                        this.f23101s.run();
                    }
                    return poll;
                }
                try {
                    this.f23099f.accept(poll);
                } catch (Throwable th2) {
                    try {
                        hj.b.b(th2);
                        try {
                            this.f23100r.accept(th2);
                            throw xj.g.c(th2);
                        } catch (Throwable th3) {
                            throw new hj.a(th2, th3);
                        }
                    } finally {
                        this.f23102t.run();
                    }
                }
                return poll;
            } catch (Throwable th4) {
                hj.b.b(th4);
                try {
                    this.f23100r.accept(th4);
                    throw xj.g.c(th4);
                } catch (Throwable th5) {
                    throw new hj.a(th4, th5);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends vj.b<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final jj.d<? super T> f23103f;

        /* renamed from: r, reason: collision with root package name */
        final jj.d<? super Throwable> f23104r;

        /* renamed from: s, reason: collision with root package name */
        final jj.a f23105s;

        /* renamed from: t, reason: collision with root package name */
        final jj.a f23106t;

        b(im.b<? super T> bVar, jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.a aVar2) {
            super(bVar);
            this.f23103f = dVar;
            this.f23104r = dVar2;
            this.f23105s = aVar;
            this.f23106t = aVar2;
        }

        @Override // vj.b, im.b
        public void a() {
            if (this.f29298d) {
                return;
            }
            try {
                this.f23105s.run();
                this.f29298d = true;
                this.f29295a.a();
                try {
                    this.f23106t.run();
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    yj.a.q(th2);
                }
            } catch (Throwable th3) {
                g(th3);
            }
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f29298d) {
                return;
            }
            if (this.f29299e != 0) {
                this.f29295a.c(null);
                return;
            }
            try {
                this.f23103f.accept(t10);
                this.f29295a.c(t10);
            } catch (Throwable th2) {
                g(th2);
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return h(i10);
        }

        @Override // vj.b, im.b
        public void onError(Throwable th2) {
            if (this.f29298d) {
                yj.a.q(th2);
                return;
            }
            boolean z10 = true;
            this.f29298d = true;
            try {
                this.f23104r.accept(th2);
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f29295a.onError(new hj.a(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f29295a.onError(th2);
            }
            try {
                this.f23106t.run();
            } catch (Throwable th4) {
                hj.b.b(th4);
                yj.a.q(th4);
            }
        }

        @Override // mj.j
        public T poll() {
            try {
                T poll = this.f29297c.poll();
                if (poll == null) {
                    if (this.f29299e == 1) {
                        this.f23105s.run();
                    }
                    return poll;
                }
                try {
                    this.f23103f.accept(poll);
                } catch (Throwable th2) {
                    try {
                        hj.b.b(th2);
                        try {
                            this.f23104r.accept(th2);
                            throw xj.g.c(th2);
                        } catch (Throwable th3) {
                            throw new hj.a(th2, th3);
                        }
                    } finally {
                        this.f23106t.run();
                    }
                }
                return poll;
            } catch (Throwable th4) {
                hj.b.b(th4);
                try {
                    this.f23104r.accept(th4);
                    throw xj.g.c(th4);
                } catch (Throwable th5) {
                    throw new hj.a(th4, th5);
                }
            }
        }
    }

    public d(dj.f<T> fVar, jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar, jj.a aVar2) {
        super(fVar);
        this.f23095c = dVar;
        this.f23096d = dVar2;
        this.f23097e = aVar;
        this.f23098f = aVar2;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        dj.f<T> fVar;
        dj.i<? super T> bVar2;
        if (bVar instanceof mj.a) {
            fVar = this.f23056b;
            bVar2 = new a<>((mj.a) bVar, this.f23095c, this.f23096d, this.f23097e, this.f23098f);
        } else {
            fVar = this.f23056b;
            bVar2 = new b<>(bVar, this.f23095c, this.f23096d, this.f23097e, this.f23098f);
        }
        fVar.H(bVar2);
    }
}
