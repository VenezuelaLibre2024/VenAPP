package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class c2 implements Executor, Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f18664d = Logger.getLogger(c2.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final b f18665e = c();

    /* renamed from: a, reason: collision with root package name */
    private Executor f18666a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<Runnable> f18667b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f18668c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private b() {
        }

        public abstract boolean a(c2 c2Var, int i10, int i11);

        public abstract void b(c2 c2Var, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<c2> f18669a;

        private c(AtomicIntegerFieldUpdater<c2> atomicIntegerFieldUpdater) {
            super();
            this.f18669a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int i10, int i11) {
            return this.f18669a.compareAndSet(c2Var, i10, i11);
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int i10) {
            this.f18669a.set(c2Var, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int i10, int i11) {
            synchronized (c2Var) {
                if (c2Var.f18668c != i10) {
                    return false;
                }
                c2Var.f18668c = i11;
                return true;
            }
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int i10) {
            synchronized (c2Var) {
                c2Var.f18668c = i10;
            }
        }
    }

    public c2(Executor executor) {
        eb.o.p(executor, "'executor' must not be null.");
        this.f18666a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(c2.class, "c"));
        } catch (Throwable th2) {
            f18664d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f18665e.a(this, 0, -1)) {
            try {
                this.f18666a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f18667b.remove(runnable);
                }
                f18665e.b(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f18667b.add((Runnable) eb.o.p(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f18666a;
            while (executor == this.f18666a && (poll = this.f18667b.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e10) {
                    f18664d.log(Level.SEVERE, "Exception while executing runnable " + poll, (Throwable) e10);
                }
            }
            f18665e.b(this, 0);
            if (this.f18667b.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th2) {
            f18665e.b(this, 0);
            throw th2;
        }
    }
}
