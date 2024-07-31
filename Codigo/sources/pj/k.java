package pj;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k<T, R> extends pj.a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    final jj.e<? super T, ? extends Iterable<? extends R>> f23169c;

    /* renamed from: d, reason: collision with root package name */
    final int f23170d;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends wj.a<R> implements dj.i<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super R> f23171a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends Iterable<? extends R>> f23172b;

        /* renamed from: c, reason: collision with root package name */
        final int f23173c;

        /* renamed from: d, reason: collision with root package name */
        final int f23174d;

        /* renamed from: f, reason: collision with root package name */
        im.c f23176f;

        /* renamed from: r, reason: collision with root package name */
        mj.j<T> f23177r;

        /* renamed from: s, reason: collision with root package name */
        volatile boolean f23178s;

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f23179t;

        /* renamed from: v, reason: collision with root package name */
        Iterator<? extends R> f23181v;

        /* renamed from: w, reason: collision with root package name */
        int f23182w;

        /* renamed from: x, reason: collision with root package name */
        int f23183x;

        /* renamed from: u, reason: collision with root package name */
        final AtomicReference<Throwable> f23180u = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f23175e = new AtomicLong();

        a(im.b<? super R> bVar, jj.e<? super T, ? extends Iterable<? extends R>> eVar, int i10) {
            this.f23171a = bVar;
            this.f23172b = eVar;
            this.f23173c = i10;
            this.f23174d = i10 - (i10 >> 2);
        }

        @Override // im.b
        public void a() {
            if (this.f23178s) {
                return;
            }
            this.f23178s = true;
            h();
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23178s) {
                return;
            }
            if (this.f23183x != 0 || this.f23177r.offer(t10)) {
                h();
            } else {
                onError(new hj.c("Queue is full?!"));
            }
        }

        @Override // im.c
        public void cancel() {
            if (this.f23179t) {
                return;
            }
            this.f23179t = true;
            this.f23176f.cancel();
            if (getAndIncrement() == 0) {
                this.f23177r.clear();
            }
        }

        @Override // mj.j
        public void clear() {
            this.f23181v = null;
            this.f23177r.clear();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23176f, cVar)) {
                this.f23176f = cVar;
                if (cVar instanceof mj.g) {
                    mj.g gVar = (mj.g) cVar;
                    int l10 = gVar.l(3);
                    if (l10 == 1) {
                        this.f23183x = l10;
                        this.f23177r = gVar;
                        this.f23178s = true;
                        this.f23171a.d(this);
                        return;
                    }
                    if (l10 == 2) {
                        this.f23183x = l10;
                        this.f23177r = gVar;
                        this.f23171a.d(this);
                        cVar.i(this.f23173c);
                        return;
                    }
                }
                this.f23177r = new tj.a(this.f23173c);
                this.f23171a.d(this);
                cVar.i(this.f23173c);
            }
        }

        boolean e(boolean z10, boolean z11, im.b<?> bVar, mj.j<?> jVar) {
            if (this.f23179t) {
                this.f23181v = null;
                jVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f23180u.get() == null) {
                if (!z11) {
                    return false;
                }
                bVar.a();
                return true;
            }
            Throwable b10 = xj.g.b(this.f23180u);
            this.f23181v = null;
            jVar.clear();
            bVar.onError(b10);
            return true;
        }

        void g(boolean z10) {
            if (z10) {
                int i10 = this.f23182w + 1;
                if (i10 != this.f23174d) {
                    this.f23182w = i10;
                } else {
                    this.f23182w = 0;
                    this.f23176f.i(i10);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
        
            if (r6 == null) goto L73;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void h() {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.k.a.h():void");
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this.f23175e, j10);
                h();
            }
        }

        @Override // mj.j
        public boolean isEmpty() {
            return this.f23181v == null && this.f23177r.isEmpty();
        }

        @Override // mj.f
        public int l(int i10) {
            return ((i10 & 1) == 0 || this.f23183x != 1) ? 0 : 1;
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23178s || !xj.g.a(this.f23180u, th2)) {
                yj.a.q(th2);
            } else {
                this.f23178s = true;
                h();
            }
        }

        @Override // mj.j
        public R poll() {
            Iterator<? extends R> it = this.f23181v;
            while (true) {
                if (it == null) {
                    T poll = this.f23177r.poll();
                    if (poll != null) {
                        it = this.f23172b.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.f23181v = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R r10 = (R) lj.b.d(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f23181v = null;
            }
            return r10;
        }
    }

    public k(dj.f<T> fVar, jj.e<? super T, ? extends Iterable<? extends R>> eVar, int i10) {
        super(fVar);
        this.f23169c = eVar;
        this.f23170d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dj.f
    public void I(im.b<? super R> bVar) {
        dj.f<T> fVar = this.f23056b;
        if (!(fVar instanceof Callable)) {
            fVar.H(new a(bVar, this.f23169c, this.f23170d));
            return;
        }
        try {
            Object call = ((Callable) fVar).call();
            if (call == null) {
                wj.d.b(bVar);
                return;
            }
            try {
                m.K(bVar, this.f23169c.apply(call).iterator());
            } catch (Throwable th2) {
                hj.b.b(th2);
                wj.d.h(th2, bVar);
            }
        } catch (Throwable th3) {
            hj.b.b(th3);
            wj.d.h(th3, bVar);
        }
    }
}
