package ne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ne.a f21942a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile ne.a f21943b;

    /* renamed from: ne.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0358b implements ne.a {
        private C0358b() {
        }

        @Override // ne.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0358b c0358b = new C0358b();
        f21942a = c0358b;
        f21943b = c0358b;
    }

    public static ne.a a() {
        return f21943b;
    }
}
