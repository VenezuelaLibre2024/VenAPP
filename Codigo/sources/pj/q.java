package pj;

/* loaded from: classes3.dex */
public final class q<T, U> extends pj.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final jj.e<? super T, ? extends U> f23200c;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends vj.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final jj.e<? super T, ? extends U> f23201f;

        a(mj.a<? super U> aVar, jj.e<? super T, ? extends U> eVar) {
            super(aVar);
            this.f23201f = eVar;
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
                this.f29290a.c(lj.b.d(this.f23201f.apply(t10), "The mapper function returned a null value."));
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
                return this.f29290a.f(lj.b.d(this.f23201f.apply(t10), "The mapper function returned a null value."));
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
        public U poll() {
            T poll = this.f29292c.poll();
            if (poll != null) {
                return (U) lj.b.d(this.f23201f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U> extends vj.b<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final jj.e<? super T, ? extends U> f23202f;

        b(im.b<? super U> bVar, jj.e<? super T, ? extends U> eVar) {
            super(bVar);
            this.f23202f = eVar;
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
                this.f29295a.c(lj.b.d(this.f23202f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                g(th2);
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return h(i10);
        }

        @Override // mj.j
        public U poll() {
            T poll = this.f29297c.poll();
            if (poll != null) {
                return (U) lj.b.d(this.f23202f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public q(dj.f<T> fVar, jj.e<? super T, ? extends U> eVar) {
        super(fVar);
        this.f23200c = eVar;
    }

    @Override // dj.f
    protected void I(im.b<? super U> bVar) {
        dj.f<T> fVar;
        dj.i<? super T> bVar2;
        if (bVar instanceof mj.a) {
            fVar = this.f23056b;
            bVar2 = new a<>((mj.a) bVar, this.f23200c);
        } else {
            fVar = this.f23056b;
            bVar2 = new b<>(bVar, this.f23200c);
        }
        fVar.H(bVar2);
    }
}
