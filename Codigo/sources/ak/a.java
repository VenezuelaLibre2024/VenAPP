package ak;

import dj.q;
import e2.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xj.a;
import xj.g;
import xj.i;

/* loaded from: classes3.dex */
public final class a<T> extends b<T> {

    /* renamed from: s, reason: collision with root package name */
    private static final Object[] f469s = new Object[0];

    /* renamed from: t, reason: collision with root package name */
    static final C0011a[] f470t = new C0011a[0];

    /* renamed from: u, reason: collision with root package name */
    static final C0011a[] f471u = new C0011a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f472a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C0011a<T>[]> f473b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f474c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f475d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f476e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f477f;

    /* renamed from: r, reason: collision with root package name */
    long f478r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ak.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0011a<T> implements gj.b, a.InterfaceC0526a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f479a;

        /* renamed from: b, reason: collision with root package name */
        final a<T> f480b;

        /* renamed from: c, reason: collision with root package name */
        boolean f481c;

        /* renamed from: d, reason: collision with root package name */
        boolean f482d;

        /* renamed from: e, reason: collision with root package name */
        xj.a<Object> f483e;

        /* renamed from: f, reason: collision with root package name */
        boolean f484f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f485r;

        /* renamed from: s, reason: collision with root package name */
        long f486s;

        C0011a(q<? super T> qVar, a<T> aVar) {
            this.f479a = qVar;
            this.f480b = aVar;
        }

        void a() {
            if (this.f485r) {
                return;
            }
            synchronized (this) {
                if (this.f485r) {
                    return;
                }
                if (this.f481c) {
                    return;
                }
                a<T> aVar = this.f480b;
                Lock lock = aVar.f475d;
                lock.lock();
                this.f486s = aVar.f478r;
                Object obj = aVar.f472a.get();
                lock.unlock();
                this.f482d = obj != null;
                this.f481c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        void b() {
            xj.a<Object> aVar;
            while (!this.f485r) {
                synchronized (this) {
                    aVar = this.f483e;
                    if (aVar == null) {
                        this.f482d = false;
                        return;
                    }
                    this.f483e = null;
                }
                aVar.b(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f485r) {
                return;
            }
            if (!this.f484f) {
                synchronized (this) {
                    if (this.f485r) {
                        return;
                    }
                    if (this.f486s == j10) {
                        return;
                    }
                    if (this.f482d) {
                        xj.a<Object> aVar = this.f483e;
                        if (aVar == null) {
                            aVar = new xj.a<>(4);
                            this.f483e = aVar;
                        }
                        aVar.a(obj);
                        return;
                    }
                    this.f481c = true;
                    this.f484f = true;
                }
            }
            test(obj);
        }

        @Override // gj.b
        public void dispose() {
            if (this.f485r) {
                return;
            }
            this.f485r = true;
            this.f480b.x(this);
        }

        @Override // gj.b
        public boolean h() {
            return this.f485r;
        }

        @Override // xj.a.InterfaceC0526a, jj.g
        public boolean test(Object obj) {
            return this.f485r || i.b(obj, this.f479a);
        }
    }

    a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f474c = reentrantReadWriteLock;
        this.f475d = reentrantReadWriteLock.readLock();
        this.f476e = reentrantReadWriteLock.writeLock();
        this.f473b = new AtomicReference<>(f470t);
        this.f472a = new AtomicReference<>();
        this.f477f = new AtomicReference<>();
    }

    public static <T> a<T> w() {
        return new a<>();
    }

    @Override // dj.q
    public void a() {
        if (c.a(this.f477f, null, g.f31385a)) {
            Object h10 = i.h();
            for (C0011a<T> c0011a : z(h10)) {
                c0011a.c(h10, this.f478r);
            }
        }
    }

    @Override // dj.q
    public void b(gj.b bVar) {
        if (this.f477f.get() != null) {
            bVar.dispose();
        }
    }

    @Override // dj.q
    public void c(T t10) {
        lj.b.d(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f477f.get() != null) {
            return;
        }
        Object o10 = i.o(t10);
        y(o10);
        for (C0011a<T> c0011a : this.f473b.get()) {
            c0011a.c(o10, this.f478r);
        }
    }

    @Override // dj.q
    public void onError(Throwable th2) {
        lj.b.d(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!c.a(this.f477f, null, th2)) {
            yj.a.q(th2);
            return;
        }
        Object i10 = i.i(th2);
        for (C0011a<T> c0011a : z(i10)) {
            c0011a.c(i10, this.f478r);
        }
    }

    @Override // dj.o
    protected void s(q<? super T> qVar) {
        C0011a<T> c0011a = new C0011a<>(qVar, this);
        qVar.b(c0011a);
        if (v(c0011a)) {
            if (c0011a.f485r) {
                x(c0011a);
                return;
            } else {
                c0011a.a();
                return;
            }
        }
        Throwable th2 = this.f477f.get();
        if (th2 == g.f31385a) {
            qVar.a();
        } else {
            qVar.onError(th2);
        }
    }

    boolean v(C0011a<T> c0011a) {
        C0011a<T>[] c0011aArr;
        C0011a[] c0011aArr2;
        do {
            c0011aArr = this.f473b.get();
            if (c0011aArr == f471u) {
                return false;
            }
            int length = c0011aArr.length;
            c0011aArr2 = new C0011a[length + 1];
            System.arraycopy(c0011aArr, 0, c0011aArr2, 0, length);
            c0011aArr2[length] = c0011a;
        } while (!c.a(this.f473b, c0011aArr, c0011aArr2));
        return true;
    }

    void x(C0011a<T> c0011a) {
        C0011a<T>[] c0011aArr;
        C0011a[] c0011aArr2;
        do {
            c0011aArr = this.f473b.get();
            int length = c0011aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0011aArr[i10] == c0011a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0011aArr2 = f470t;
            } else {
                C0011a[] c0011aArr3 = new C0011a[length - 1];
                System.arraycopy(c0011aArr, 0, c0011aArr3, 0, i10);
                System.arraycopy(c0011aArr, i10 + 1, c0011aArr3, i10, (length - i10) - 1);
                c0011aArr2 = c0011aArr3;
            }
        } while (!c.a(this.f473b, c0011aArr, c0011aArr2));
    }

    void y(Object obj) {
        this.f476e.lock();
        this.f478r++;
        this.f472a.lazySet(obj);
        this.f476e.unlock();
    }

    C0011a<T>[] z(Object obj) {
        AtomicReference<C0011a<T>[]> atomicReference = this.f473b;
        C0011a<T>[] c0011aArr = f471u;
        C0011a<T>[] andSet = atomicReference.getAndSet(c0011aArr);
        if (andSet != c0011aArr) {
            y(obj);
        }
        return andSet;
    }
}
