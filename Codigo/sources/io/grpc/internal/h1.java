package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h1 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue<h1> f18887c = new ReferenceQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<a, a> f18888d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f18889e = Logger.getLogger(h1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final a f18890b;

    /* loaded from: classes3.dex */
    static final class a extends WeakReference<h1> {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f18891f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g, reason: collision with root package name */
        private static final RuntimeException f18892g = c();

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue<h1> f18893a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<a, a> f18894b;

        /* renamed from: c, reason: collision with root package name */
        private final String f18895c;

        /* renamed from: d, reason: collision with root package name */
        private final Reference<RuntimeException> f18896d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f18897e;

        a(h1 h1Var, vi.s0 s0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(h1Var, referenceQueue);
            this.f18897e = new AtomicBoolean();
            this.f18896d = new SoftReference(f18891f ? new RuntimeException("ManagedChannel allocation site") : f18892g);
            this.f18895c = s0Var.toString();
            this.f18893a = referenceQueue;
            this.f18894b = concurrentMap;
            concurrentMap.put(this, this);
            a(referenceQueue);
        }

        static int a(ReferenceQueue<h1> referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = aVar.f18896d.get();
                aVar.b();
                if (!aVar.f18897e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (h1.f18889e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(h1.f18889e.getName());
                        logRecord.setParameters(new Object[]{aVar.f18895c});
                        logRecord.setThrown(runtimeException);
                        h1.f18889e.log(logRecord);
                    }
                }
            }
        }

        private void b() {
            super.clear();
            this.f18894b.remove(this);
            this.f18896d.clear();
        }

        private static RuntimeException c() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            b();
            a(this.f18893a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(vi.s0 s0Var) {
        this(s0Var, f18887c, f18888d);
    }

    h1(vi.s0 s0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(s0Var);
        this.f18890b = new a(this, s0Var, referenceQueue, concurrentMap);
    }
}
