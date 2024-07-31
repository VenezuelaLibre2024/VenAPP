package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.InterfaceC0977a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes.dex */
class C0962h {

    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a */
        private String f4517a;

        /* renamed from: b */
        private int f4518b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13160a extends Thread {

            /* renamed from: a */
            private final int f4519a;

            C13160a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f4519a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f4519a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f4517a = str;
            this.f4518b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C13160a(runnable, this.f4517a, this.f4518b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: a */
        private Callable<T> f4520a;

        /* renamed from: b */
        private InterfaceC0977a<T> f4521b;

        /* renamed from: c */
        private Handler f4522c;

        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC0977a f4523a;

            /* renamed from: b */
            final /* synthetic */ Object f4524b;

            a(InterfaceC0977a interfaceC0977a, Object obj) {
                this.f4523a = interfaceC0977a;
                this.f4524b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f4523a.accept(this.f4524b);
            }
        }

        b(Handler handler, Callable<T> callable, InterfaceC0977a<T> interfaceC0977a) {
            this.f4520a = callable;
            this.f4521b = interfaceC0977a;
            this.f4522c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f4520a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f4522c.post(new a(this.f4521b, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m4781a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m4782b(Executor executor, Callable<T> callable, InterfaceC0977a<T> interfaceC0977a) {
        executor.execute(new b(C0956b.m4742a(), callable, interfaceC0977a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m4783c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
