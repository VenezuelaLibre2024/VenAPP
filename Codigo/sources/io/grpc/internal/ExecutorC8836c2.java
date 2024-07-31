package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;

/* renamed from: io.grpc.internal.c2 */
/* loaded from: classes3.dex */
public final class ExecutorC8836c2 implements Executor, Runnable {

    /* renamed from: d */
    private static final Logger f20360d = Logger.getLogger(ExecutorC8836c2.class.getName());

    /* renamed from: e */
    private static final b f20361e = m25360c();

    /* renamed from: a */
    private Executor f20362a;

    /* renamed from: b */
    private final Queue<Runnable> f20363b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private volatile int f20364c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.c2$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        public abstract boolean mo25362a(ExecutorC8836c2 executorC8836c2, int i10, int i11);

        /* renamed from: b */
        public abstract void mo25363b(ExecutorC8836c2 executorC8836c2, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.c2$c */
    /* loaded from: classes3.dex */
    public static final class c extends b {

        /* renamed from: a */
        private final AtomicIntegerFieldUpdater<ExecutorC8836c2> f20365a;

        private c(AtomicIntegerFieldUpdater<ExecutorC8836c2> atomicIntegerFieldUpdater) {
            super();
            this.f20365a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.ExecutorC8836c2.b
        /* renamed from: a */
        public boolean mo25362a(ExecutorC8836c2 executorC8836c2, int i10, int i11) {
            return this.f20365a.compareAndSet(executorC8836c2, i10, i11);
        }

        @Override // io.grpc.internal.ExecutorC8836c2.b
        /* renamed from: b */
        public void mo25363b(ExecutorC8836c2 executorC8836c2, int i10) {
            this.f20365a.set(executorC8836c2, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.c2$d */
    /* loaded from: classes3.dex */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.ExecutorC8836c2.b
        /* renamed from: a */
        public boolean mo25362a(ExecutorC8836c2 executorC8836c2, int i10, int i11) {
            synchronized (executorC8836c2) {
                if (executorC8836c2.f20364c != i10) {
                    return false;
                }
                executorC8836c2.f20364c = i11;
                return true;
            }
        }

        @Override // io.grpc.internal.ExecutorC8836c2.b
        /* renamed from: b */
        public void mo25363b(ExecutorC8836c2 executorC8836c2, int i10) {
            synchronized (executorC8836c2) {
                executorC8836c2.f20364c = i10;
            }
        }
    }

    public ExecutorC8836c2(Executor executor) {
        C7159o.m21313p(executor, "'executor' must not be null.");
        this.f20362a = executor;
    }

    /* renamed from: c */
    private static b m25360c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(ExecutorC8836c2.class, "c"));
        } catch (Throwable th2) {
            f20360d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th2);
            return new d();
        }
    }

    /* renamed from: d */
    private void m25361d(Runnable runnable) {
        if (f20361e.mo25362a(this, 0, -1)) {
            try {
                this.f20362a.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.f20363b.remove(runnable);
                }
                f20361e.mo25363b(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20363b.add((Runnable) C7159o.m21313p(runnable, "'r' must not be null."));
        m25361d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f20362a;
            while (executor == this.f20362a && (poll = this.f20363b.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e10) {
                    f20360d.log(Level.SEVERE, "Exception while executing runnable " + poll, (Throwable) e10);
                }
            }
            f20361e.mo25363b(this, 0);
            if (this.f20363b.isEmpty()) {
                return;
            }
            m25361d(null);
        } catch (Throwable th2) {
            f20361e.mo25363b(this, 0);
            throw th2;
        }
    }
}
