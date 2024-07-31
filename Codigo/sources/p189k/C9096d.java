package p189k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k.d */
/* loaded from: classes.dex */
public class C9096d extends AbstractC9098f {

    /* renamed from: a */
    private final Object f21845a = new Object();

    /* renamed from: b */
    private final ExecutorService f21846b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f21847c;

    /* renamed from: k.d$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f21848a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f21848a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k.d$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Handler m26724a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: e */
    private static Handler m26723e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m26724a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: a */
    public void mo26720a(Runnable runnable) {
        this.f21846b.execute(runnable);
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: c */
    public boolean mo26721c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: d */
    public void mo26722d(Runnable runnable) {
        if (this.f21847c == null) {
            synchronized (this.f21845a) {
                if (this.f21847c == null) {
                    this.f21847c = m26723e(Looper.getMainLooper());
                }
            }
        }
        this.f21847c.post(runnable);
    }
}
