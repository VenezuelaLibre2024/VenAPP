package p387uj;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p123gj.InterfaceC7578b;
import p205kj.InterfaceC9283a;

/* renamed from: uj.h */
/* loaded from: classes3.dex */
public final class RunnableC11570h extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC7578b {

    /* renamed from: b */
    static final Object f30068b = new Object();

    /* renamed from: c */
    static final Object f30069c = new Object();

    /* renamed from: d */
    static final Object f30070d = new Object();

    /* renamed from: e */
    static final Object f30071e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: a */
    final Runnable f30072a;

    public RunnableC11570h(Runnable runnable, InterfaceC9283a interfaceC9283a) {
        super(3);
        this.f30072a = runnable;
        lazySet(0, interfaceC9283a);
    }

    /* renamed from: a */
    public void m36255a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f30071e) {
                return;
            }
            if (obj == f30069c) {
                future.cancel(false);
                return;
            } else if (obj == f30070d) {
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

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f30071e || obj5 == (obj3 = f30069c) || obj5 == (obj4 = f30070d)) {
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
            if (obj == f30071e || obj == (obj2 = f30068b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC9283a) obj).mo23022c(this);
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        Object obj = get(0);
        return obj == f30068b || obj == f30071e;
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
            this.f30072a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f30068b) {
                    ((InterfaceC9283a) obj4).mo23022c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f30069c) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f30071e));
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
        if (obj4 != f30068b && compareAndSet(0, obj4, f30071e) && obj4 != null) {
            ((InterfaceC9283a) obj4).mo23022c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f30069c || obj5 == f30070d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f30071e));
    }
}
