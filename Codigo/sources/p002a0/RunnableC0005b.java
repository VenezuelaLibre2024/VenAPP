package p002a0;

import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a0.b */
/* loaded from: classes.dex */
public class RunnableC0005b<I, O> extends C0007d<O> implements Runnable {

    /* renamed from: c */
    private InterfaceC0004a<? super I, ? extends O> f4c;

    /* renamed from: d */
    private final BlockingQueue<Boolean> f5d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    private final CountDownLatch f6e = new CountDownLatch(1);

    /* renamed from: f */
    private InterfaceFutureC5920f<? extends I> f7f;

    /* renamed from: r */
    volatile InterfaceFutureC5920f<? extends O> f8r;

    /* renamed from: a0.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceFutureC5920f f9a;

        a(InterfaceFutureC5920f interfaceFutureC5920f) {
            this.f9a = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC0005b.this.m10b(C0009f.m19e(this.f9a));
                } catch (CancellationException unused) {
                    RunnableC0005b.this.cancel(false);
                    RunnableC0005b.this.f8r = null;
                    return;
                } catch (ExecutionException e10) {
                    RunnableC0005b.this.m11c(e10.getCause());
                }
                RunnableC0005b.this.f8r = null;
            } catch (Throwable th2) {
                RunnableC0005b.this.f8r = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0005b(InterfaceC0004a<? super I, ? extends O> interfaceC0004a, InterfaceFutureC5920f<? extends I> interfaceFutureC5920f) {
        this.f4c = (InterfaceC0004a) C0984h.m4833k(interfaceC0004a);
        this.f7f = (InterfaceFutureC5920f) C0984h.m4833k(interfaceFutureC5920f);
    }

    /* renamed from: f */
    private void m5f(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    /* renamed from: g */
    private <E> void m6g(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: h */
    private <E> E m7h(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // p002a0.C0007d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        m6g(this.f5d, Boolean.valueOf(z10));
        m5f(this.f7f, z10);
        m5f(this.f8r, z10);
        return true;
    }

    @Override // p002a0.C0007d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            InterfaceFutureC5920f<? extends I> interfaceFutureC5920f = this.f7f;
            if (interfaceFutureC5920f != null) {
                interfaceFutureC5920f.get();
            }
            this.f6e.await();
            InterfaceFutureC5920f<? extends O> interfaceFutureC5920f2 = this.f8r;
            if (interfaceFutureC5920f2 != null) {
                interfaceFutureC5920f2.get();
            }
        }
        return (O) super.get();
    }

    @Override // p002a0.C0007d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC5920f<? extends I> interfaceFutureC5920f = this.f7f;
            if (interfaceFutureC5920f != null) {
                long nanoTime = System.nanoTime();
                interfaceFutureC5920f.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.f6e.await(j10, timeUnit)) {
                throw new TimeoutException();
            }
            j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
            InterfaceFutureC5920f<? extends O> interfaceFutureC5920f2 = this.f8r;
            if (interfaceFutureC5920f2 != null) {
                interfaceFutureC5920f2.get(j10, timeUnit);
            }
        }
        return (O) super.get(j10, timeUnit);
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceFutureC5920f<? extends O> apply;
        try {
            try {
                try {
                    apply = this.f4c.apply(C0009f.m19e(this.f7f));
                    this.f8r = apply;
                } catch (Error e10) {
                    e = e10;
                    m11c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                } catch (UndeclaredThrowableException e11) {
                    e = e11.getCause();
                    m11c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                } catch (Exception e12) {
                    e = e12;
                    m11c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                m11c(e13.getCause());
            }
            if (!isCancelled()) {
                apply.addListener(new a(apply), C12747a.m42280a());
                this.f4c = null;
                this.f7f = null;
                this.f6e.countDown();
                return;
            }
            apply.cancel(((Boolean) m7h(this.f5d)).booleanValue());
            this.f8r = null;
            this.f4c = null;
            this.f7f = null;
            this.f6e.countDown();
        } catch (Throwable th2) {
            this.f4c = null;
            this.f7f = null;
            this.f6e.countDown();
            throw th2;
        }
    }
}
