package qc;

import com.google.android.gms.common.internal.s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f23931f = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f23932a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque<Runnable> f23933b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f23934c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f23935d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f23936e = new b(this, null);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f23937a;

        a(Runnable runnable) {
            this.f23937a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23937a.run();
        }

        public String toString() {
            return this.f23937a.toString();
        }
    }

    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f23939a;

        private b() {
        }

        /* synthetic */ b(m mVar, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        
            r8.f23939a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            qc.m.f23931f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f23939a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            r8.f23939a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                qc.m r2 = qc.m.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = qc.m.a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                qc.m r0 = qc.m.this     // Catch: java.lang.Throwable -> L7f
                qc.m$c r0 = qc.m.b(r0)     // Catch: java.lang.Throwable -> L7f
                qc.m$c r3 = qc.m.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                qc.m r0 = qc.m.this     // Catch: java.lang.Throwable -> L7f
                qc.m.d(r0)     // Catch: java.lang.Throwable -> L7f
                qc.m r0 = qc.m.this     // Catch: java.lang.Throwable -> L7f
                qc.m.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                qc.m r3 = qc.m.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = qc.m.a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f23939a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                qc.m r0 = qc.m.this     // Catch: java.lang.Throwable -> L7f
                qc.m$c r3 = qc.m.c.IDLE     // Catch: java.lang.Throwable -> L7f
                qc.m.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f23939a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f23939a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = qc.m.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f23939a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f23939a = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.m.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (m.this.f23933b) {
                    m.this.f23934c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f23939a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + m.this.f23934c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Executor executor) {
        this.f23932a = (Executor) s.j(executor);
    }

    static /* synthetic */ long d(m mVar) {
        long j10 = mVar.f23935d;
        mVar.f23935d = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        s.j(runnable);
        synchronized (this.f23933b) {
            c cVar2 = this.f23934c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f23935d;
                a aVar = new a(runnable);
                this.f23933b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f23934c = cVar3;
                try {
                    this.f23932a.execute(this.f23936e);
                    if (this.f23934c != cVar3) {
                        return;
                    }
                    synchronized (this.f23933b) {
                        if (this.f23935d == j10 && this.f23934c == cVar3) {
                            this.f23934c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f23933b) {
                        c cVar4 = this.f23934c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f23933b.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f23933b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f23932a + "}";
    }
}
