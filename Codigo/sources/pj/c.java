package pj;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> extends dj.f<T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.h<T> f23082b;

    /* renamed from: c, reason: collision with root package name */
    final dj.a f23083c;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23084a;

        static {
            int[] iArr = new int[dj.a.values().length];
            f23084a = iArr;
            try {
                iArr[dj.a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23084a[dj.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23084a[dj.a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23084a[dj.a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b<T> extends AtomicLong implements dj.g<T>, im.c {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23085a;

        /* renamed from: b, reason: collision with root package name */
        final kj.e f23086b = new kj.e();

        b(im.b<? super T> bVar) {
            this.f23085a = bVar;
        }

        protected void a() {
            if (d()) {
                return;
            }
            try {
                this.f23085a.a();
            } finally {
                this.f23086b.dispose();
            }
        }

        protected boolean b(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (d()) {
                return false;
            }
            try {
                this.f23085a.onError(th2);
                this.f23086b.dispose();
                return true;
            } catch (Throwable th3) {
                this.f23086b.dispose();
                throw th3;
            }
        }

        @Override // im.c
        public final void cancel() {
            this.f23086b.dispose();
            g();
        }

        public final boolean d() {
            return this.f23086b.h();
        }

        public final void e(Throwable th2) {
            if (h(th2)) {
                return;
            }
            yj.a.q(th2);
        }

        void f() {
        }

        void g() {
        }

        public boolean h(Throwable th2) {
            return b(th2);
        }

        @Override // im.c
        public final void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this, j10);
                f();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: pj.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0384c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c, reason: collision with root package name */
        final tj.b<T> f23087c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f23088d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f23089e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f23090f;

        C0384c(im.b<? super T> bVar, int i10) {
            super(bVar);
            this.f23087c = new tj.b<>(i10);
            this.f23090f = new AtomicInteger();
        }

        @Override // dj.e
        public void c(T t10) {
            if (this.f23089e || d()) {
                return;
            }
            if (t10 == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f23087c.offer(t10);
                j();
            }
        }

        @Override // pj.c.b
        void f() {
            j();
        }

        @Override // pj.c.b
        void g() {
            if (this.f23090f.getAndIncrement() == 0) {
                this.f23087c.clear();
            }
        }

        @Override // pj.c.b
        public boolean h(Throwable th2) {
            if (this.f23089e || d()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f23088d = th2;
            this.f23089e = true;
            j();
            return true;
        }

        void j() {
            if (this.f23090f.getAndIncrement() != 0) {
                return;
            }
            im.b<? super T> bVar = this.f23085a;
            tj.b<T> bVar2 = this.f23087c;
            int i10 = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (d()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z10 = this.f23089e;
                    T poll = bVar2.poll();
                    boolean z11 = poll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f23088d;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(poll);
                    j11++;
                }
                if (j11 == j10) {
                    if (d()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z12 = this.f23089e;
                    boolean isEmpty = bVar2.isEmpty();
                    if (z12 && isEmpty) {
                        Throwable th3 = this.f23088d;
                        if (th3 != null) {
                            b(th3);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    xj.d.d(this, j11);
                }
                i10 = this.f23090f.addAndGet(-i10);
            } while (i10 != 0);
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        d(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // pj.c.h
        void j() {
        }
    }

    /* loaded from: classes3.dex */
    static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        e(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // pj.c.h
        void j() {
            e(new hj.c("create: could not emit value due to lack of requests"));
        }
    }

    /* loaded from: classes3.dex */
    static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<T> f23091c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f23092d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f23093e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f23094f;

        f(im.b<? super T> bVar) {
            super(bVar);
            this.f23091c = new AtomicReference<>();
            this.f23094f = new AtomicInteger();
        }

        @Override // dj.e
        public void c(T t10) {
            if (this.f23093e || d()) {
                return;
            }
            if (t10 == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f23091c.set(t10);
                j();
            }
        }

        @Override // pj.c.b
        void f() {
            j();
        }

        @Override // pj.c.b
        void g() {
            if (this.f23094f.getAndIncrement() == 0) {
                this.f23091c.lazySet(null);
            }
        }

        @Override // pj.c.b
        public boolean h(Throwable th2) {
            if (this.f23093e || d()) {
                return false;
            }
            if (th2 == null) {
                e(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f23092d = th2;
            this.f23093e = true;
            j();
            return true;
        }

        void j() {
            if (this.f23094f.getAndIncrement() != 0) {
                return;
            }
            im.b<? super T> bVar = this.f23085a;
            AtomicReference<T> atomicReference = this.f23091c;
            int i10 = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f23093e;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f23092d;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f23093e;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f23092d;
                        if (th3 != null) {
                            b(th3);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    xj.d.d(this, j11);
                }
                i10 = this.f23094f.addAndGet(-i10);
            } while (i10 != 0);
        }
    }

    /* loaded from: classes3.dex */
    static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        g(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // dj.e
        public void c(T t10) {
            long j10;
            if (d()) {
                return;
            }
            if (t10 == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f23085a.c(t10);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    /* loaded from: classes3.dex */
    static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        h(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // dj.e
        public final void c(T t10) {
            if (d()) {
                return;
            }
            if (t10 == null) {
                e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                j();
            } else {
                this.f23085a.c(t10);
                xj.d.d(this, 1L);
            }
        }

        abstract void j();
    }

    public c(dj.h<T> hVar, dj.a aVar) {
        this.f23082b = hVar;
        this.f23083c = aVar;
    }

    @Override // dj.f
    public void I(im.b<? super T> bVar) {
        int i10 = a.f23084a[this.f23083c.ordinal()];
        b c0384c = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new C0384c(bVar, dj.f.b()) : new f(bVar) : new d(bVar) : new e(bVar) : new g(bVar);
        bVar.d(c0384c);
        try {
            this.f23082b.a(c0384c);
        } catch (Throwable th2) {
            hj.b.b(th2);
            c0384c.e(th2);
        }
    }
}
