package p310qc;

import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qc.m */
/* loaded from: classes.dex */
public final class ExecutorC10431m implements Executor {

    /* renamed from: f */
    private static final Logger f25973f = Logger.getLogger(ExecutorC10431m.class.getName());

    /* renamed from: a */
    private final Executor f25974a;

    /* renamed from: b */
    private final Deque<Runnable> f25975b = new ArrayDeque();

    /* renamed from: c */
    private c f25976c = c.IDLE;

    /* renamed from: d */
    private long f25977d = 0;

    /* renamed from: e */
    private final b f25978e = new b(this, null);

    /* renamed from: qc.m$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f25979a;

        a(Runnable runnable) {
            this.f25979a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25979a.run();
        }

        public String toString() {
            return this.f25979a.toString();
        }
    }

    /* renamed from: qc.m$b */
    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a */
        Runnable f25981a;

        private b() {
        }

        /* synthetic */ b(ExecutorC10431m executorC10431m, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        
            r8.f25981a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            p310qc.ExecutorC10431m.f25973f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f25981a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            r8.f25981a = null;
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
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m31240a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                qc.m r2 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = p310qc.ExecutorC10431m.m31235a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                qc.m r0 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L7f
                qc.m$c r0 = p310qc.ExecutorC10431m.m31236b(r0)     // Catch: java.lang.Throwable -> L7f
                qc.m$c r3 = p310qc.ExecutorC10431m.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                qc.m r0 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L7f
                p310qc.ExecutorC10431m.m31238d(r0)     // Catch: java.lang.Throwable -> L7f
                qc.m r0 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L7f
                p310qc.ExecutorC10431m.m31237c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                qc.m r3 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = p310qc.ExecutorC10431m.m31235a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f25981a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                qc.m r0 = p310qc.ExecutorC10431m.this     // Catch: java.lang.Throwable -> L7f
                qc.m$c r3 = p310qc.ExecutorC10431m.c.IDLE     // Catch: java.lang.Throwable -> L7f
                p310qc.ExecutorC10431m.m31237c(r0, r3)     // Catch: java.lang.Throwable -> L7f
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
                java.lang.Runnable r3 = r8.f25981a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f25981a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = p310qc.ExecutorC10431m.m31239e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f25981a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f25981a = r2     // Catch: java.lang.Throwable -> L82
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
            throw new UnsupportedOperationException("Method not decompiled: p310qc.ExecutorC10431m.b.m31240a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m31240a();
            } catch (Error e10) {
                synchronized (ExecutorC10431m.this.f25975b) {
                    ExecutorC10431m.this.f25976c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f25981a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC10431m.this.f25976c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qc.m$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC10431m(Executor executor) {
        this.f25974a = (Executor) C5276s.m13324j(executor);
    }

    /* renamed from: d */
    static /* synthetic */ long m31238d(ExecutorC10431m executorC10431m) {
        long j10 = executorC10431m.f25977d;
        executorC10431m.f25977d = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        C5276s.m13324j(runnable);
        synchronized (this.f25975b) {
            c cVar2 = this.f25976c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f25977d;
                a aVar = new a(runnable);
                this.f25975b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f25976c = cVar3;
                try {
                    this.f25974a.execute(this.f25978e);
                    if (this.f25976c != cVar3) {
                        return;
                    }
                    synchronized (this.f25975b) {
                        if (this.f25977d == j10 && this.f25976c == cVar3) {
                            this.f25976c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f25975b) {
                        c cVar4 = this.f25976c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f25975b.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f25975b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f25974a + "}";
    }
}
