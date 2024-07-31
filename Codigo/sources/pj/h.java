package pj;

/* loaded from: classes3.dex */
public final class h<T> extends pj.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final jj.g<? super T> f23124c;

    /* loaded from: classes3.dex */
    static final class a<T> extends vj.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final jj.g<? super T> f23125f;

        a(mj.a<? super T> aVar, jj.g<? super T> gVar) {
            super(aVar);
            this.f23125f = gVar;
        }

        @Override // im.b
        public void c(T t10) {
            if (f(t10)) {
                return;
            }
            this.f29291b.i(1L);
        }

        @Override // mj.a
        public boolean f(T t10) {
            if (this.f29293d) {
                return false;
            }
            if (this.f29294e != 0) {
                return this.f29290a.f(null);
            }
            try {
                return this.f23125f.test(t10) && this.f29290a.f(t10);
            } catch (Throwable th2) {
                g(th2);
                return true;
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return h(i10);
        }

        @Override // mj.j
        public T poll() {
            mj.g<T> gVar = this.f29292c;
            jj.g<? super T> gVar2 = this.f23125f;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (gVar2.test(poll)) {
                    return poll;
                }
                if (this.f29294e == 2) {
                    gVar.i(1L);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends vj.b<T, T> implements mj.a<T> {

        /* renamed from: f, reason: collision with root package name */
        final jj.g<? super T> f23126f;

        b(im.b<? super T> bVar, jj.g<? super T> gVar) {
            super(bVar);
            this.f23126f = gVar;
        }

        @Override // im.b
        public void c(T t10) {
            if (f(t10)) {
                return;
            }
            this.f29296b.i(1L);
        }

        @Override // mj.a
        public boolean f(T t10) {
            if (this.f29298d) {
                return false;
            }
            if (this.f29299e != 0) {
                this.f29295a.c(null);
                return true;
            }
            try {
                boolean test = this.f23126f.test(t10);
                if (test) {
                    this.f29295a.c(t10);
                }
                return test;
            } catch (Throwable th2) {
                g(th2);
                return true;
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return h(i10);
        }

        @Override // mj.j
        public T poll() {
            mj.g<T> gVar = this.f29297c;
            jj.g<? super T> gVar2 = this.f23126f;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (gVar2.test(poll)) {
                    return poll;
                }
                if (this.f29299e == 2) {
                    gVar.i(1L);
                }
            }
        }
    }

    public h(dj.f<T> fVar, jj.g<? super T> gVar) {
        super(fVar);
        this.f23124c = gVar;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        dj.f<T> fVar;
        dj.i<? super T> bVar2;
        if (bVar instanceof mj.a) {
            fVar = this.f23056b;
            bVar2 = new a<>((mj.a) bVar, this.f23124c);
        } else {
            fVar = this.f23056b;
            bVar2 = new b<>(bVar, this.f23124c);
        }
        fVar.H(bVar2);
    }
}
