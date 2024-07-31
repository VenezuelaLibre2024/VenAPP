package p474z;

import androidx.core.util.C0984h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.g */
/* loaded from: classes.dex */
public final class ExecutorC12753g implements Executor {

    /* renamed from: b */
    private final Executor f34783b;

    /* renamed from: a */
    final Deque<Runnable> f34782a = new ArrayDeque();

    /* renamed from: c */
    private final b f34784c = new b();

    /* renamed from: d */
    c f34785d = c.IDLE;

    /* renamed from: e */
    long f34786e = 0;

    /* renamed from: z.g$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f34787a;

        a(Runnable runnable) {
            this.f34787a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34787a.run();
        }
    }

    /* renamed from: z.g$b */
    /* loaded from: classes.dex */
    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            p407w.C12029o0.m38641d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m42294a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                z.g r2 = p474z.ExecutorC12753g.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.f34782a     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r0 != 0) goto L26
                z.g r0 = p474z.ExecutorC12753g.this     // Catch: java.lang.Throwable -> L65
                z.g$c r3 = r0.f34785d     // Catch: java.lang.Throwable -> L65
                z.g$c r4 = p474z.ExecutorC12753g.c.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.f34786e     // Catch: java.lang.Throwable -> L65
                r7 = 1
                long r5 = r5 + r7
                r0.f34786e = r5     // Catch: java.lang.Throwable -> L65
                r0.f34785d = r4     // Catch: java.lang.Throwable -> L65
                r0 = 1
            L26:
                z.g r3 = p474z.ExecutorC12753g.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.f34782a     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                z.g r0 = p474z.ExecutorC12753g.this     // Catch: java.lang.Throwable -> L65
                z.g$c r3 = p474z.ExecutorC12753g.c.IDLE     // Catch: java.lang.Throwable -> L65
                r0.f34785d = r3     // Catch: java.lang.Throwable -> L65
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L68
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L4d java.lang.Throwable -> L68
                goto L2
            L4d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r5.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L68
                r5.append(r3)     // Catch: java.lang.Throwable -> L68
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L68
                p407w.C12029o0.m38641d(r4, r3, r2)     // Catch: java.lang.Throwable -> L68
                goto L2
            L65:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                throw r0     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                if (r1 == 0) goto L72
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L72:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p474z.ExecutorC12753g.b.m42294a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m42294a();
            } catch (Error e10) {
                synchronized (ExecutorC12753g.this.f34782a) {
                    ExecutorC12753g.this.f34785d = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z.g$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC12753g(Executor executor) {
        this.f34783b = (Executor) C0984h.m4833k(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        C0984h.m4833k(runnable);
        synchronized (this.f34782a) {
            c cVar2 = this.f34785d;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f34786e;
                a aVar = new a(runnable);
                this.f34782a.add(aVar);
                c cVar3 = c.QUEUING;
                this.f34785d = cVar3;
                try {
                    this.f34783b.execute(this.f34784c);
                    if (this.f34785d != cVar3) {
                        return;
                    }
                    synchronized (this.f34782a) {
                        if (this.f34786e == j10 && this.f34785d == cVar3) {
                            this.f34785d = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f34782a) {
                        c cVar4 = this.f34785d;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f34782a.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f34782a.add(runnable);
        }
    }
}
