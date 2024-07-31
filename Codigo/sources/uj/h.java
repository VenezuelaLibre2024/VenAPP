package uj;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class h extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, gj.b {

    /* renamed from: b, reason: collision with root package name */
    static final Object f27745b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final Object f27746c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final Object f27747d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Object f27748e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a, reason: collision with root package name */
    final Runnable f27749a;

    public h(Runnable runnable, kj.a aVar) {
        super(3);
        this.f27749a = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f27748e) {
                return;
            }
            if (obj == f27746c) {
                future.cancel(false);
                return;
            } else if (obj == f27747d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // gj.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f27748e || obj5 == (obj3 = f27746c) || obj5 == (obj4 = f27747d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f27748e || obj == (obj2 = f27745b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((kj.a) obj).c(this);
    }

    @Override // gj.b
    public boolean h() {
        Object obj = get(0);
        return obj == f27745b || obj == f27748e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f27749a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f27745b) {
                    ((kj.a) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f27746c) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f27748e));
            } catch (Throwable th2) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f27745b && compareAndSet(0, obj4, f27748e) && obj4 != null) {
            ((kj.a) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f27746c || obj5 == f27747d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f27748e));
    }
}
