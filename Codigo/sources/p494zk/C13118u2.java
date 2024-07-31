package p494zk;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zk.u2 */
/* loaded from: classes3.dex */
public final class C13118u2 {
    /* renamed from: b */
    public static final AbstractC13085m1 m43303b(final int i10, final String str) {
        if (i10 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return C13093o1.m43277b(Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: zk.t2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread m43304c;
                    m43304c = C13118u2.m43304c(i10, str, atomicInteger, runnable);
                    return m43304c;
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i10 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Thread m43304c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: d */
    public static final AbstractC13085m1 m43305d(String str) {
        return m43303b(1, str);
    }
}
