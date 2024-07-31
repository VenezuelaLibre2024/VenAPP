package ne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ne.b */
/* loaded from: classes.dex */
public class C9710b {

    /* renamed from: a */
    private static final InterfaceC9709a f23875a;

    /* renamed from: b */
    private static volatile InterfaceC9709a f23876b;

    /* renamed from: ne.b$b */
    /* loaded from: classes.dex */
    private static class b implements InterfaceC9709a {
        private b() {
        }

        @Override // ne.InterfaceC9709a
        /* renamed from: a */
        public ExecutorService mo29101a(ThreadFactory threadFactory, EnumC9711c enumC9711c) {
            return m29103b(1, threadFactory, enumC9711c);
        }

        /* renamed from: b */
        public ExecutorService m29103b(int i10, ThreadFactory threadFactory, EnumC9711c enumC9711c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f23875a = bVar;
        f23876b = bVar;
    }

    /* renamed from: a */
    public static InterfaceC9709a m29102a() {
        return f23876b;
    }
}
