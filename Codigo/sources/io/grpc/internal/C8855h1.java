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
import vi.AbstractC11945s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.h1 */
/* loaded from: classes3.dex */
public final class C8855h1 extends AbstractC8870l0 {

    /* renamed from: c */
    private static final ReferenceQueue<C8855h1> f20630c = new ReferenceQueue<>();

    /* renamed from: d */
    private static final ConcurrentMap<a, a> f20631d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final Logger f20632e = Logger.getLogger(C8855h1.class.getName());

    /* renamed from: b */
    private final a f20633b;

    /* renamed from: io.grpc.internal.h1$a */
    /* loaded from: classes3.dex */
    static final class a extends WeakReference<C8855h1> {

        /* renamed from: f */
        private static final boolean f20634f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        private static final RuntimeException f20635g = m25590c();

        /* renamed from: a */
        private final ReferenceQueue<C8855h1> f20636a;

        /* renamed from: b */
        private final ConcurrentMap<a, a> f20637b;

        /* renamed from: c */
        private final String f20638c;

        /* renamed from: d */
        private final Reference<RuntimeException> f20639d;

        /* renamed from: e */
        private final AtomicBoolean f20640e;

        a(C8855h1 c8855h1, AbstractC11945s0 abstractC11945s0, ReferenceQueue<C8855h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(c8855h1, referenceQueue);
            this.f20640e = new AtomicBoolean();
            this.f20639d = new SoftReference(f20634f ? new RuntimeException("ManagedChannel allocation site") : f20635g);
            this.f20638c = abstractC11945s0.toString();
            this.f20636a = referenceQueue;
            this.f20637b = concurrentMap;
            concurrentMap.put(this, this);
            m25588a(referenceQueue);
        }

        /* renamed from: a */
        static int m25588a(ReferenceQueue<C8855h1> referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = aVar.f20639d.get();
                aVar.m25589b();
                if (!aVar.f20640e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (C8855h1.f20632e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C8855h1.f20632e.getName());
                        logRecord.setParameters(new Object[]{aVar.f20638c});
                        logRecord.setThrown(runtimeException);
                        C8855h1.f20632e.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m25589b() {
            super.clear();
            this.f20637b.remove(this);
            this.f20639d.clear();
        }

        /* renamed from: c */
        private static RuntimeException m25590c() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            m25589b();
            m25588a(this.f20636a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8855h1(AbstractC11945s0 abstractC11945s0) {
        this(abstractC11945s0, f20630c, f20631d);
    }

    C8855h1(AbstractC11945s0 abstractC11945s0, ReferenceQueue<C8855h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(abstractC11945s0);
        this.f20633b = new a(this, abstractC11945s0, referenceQueue, concurrentMap);
    }
}
