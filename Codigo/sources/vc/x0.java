package vc;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    private static final ExecutorService f28937a = z.c("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T f(Task<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f28937a, new Continuation() { // from class: vc.s0

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f28909a;

            public /* synthetic */ s0(CountDownLatch countDownLatch2) {
                r1 = countDownLatch2;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Object i10;
                i10 = x0.i(r1, task2);
                return i10;
            }
        });
        countDownLatch2.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> Task<T> h(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: vc.u0

            /* renamed from: a */
            public final /* synthetic */ Callable f28919a;

            /* renamed from: b */
            public final /* synthetic */ Executor f28920b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f28921c;

            public /* synthetic */ u0(Callable callable2, Executor executor2, TaskCompletionSource taskCompletionSource2) {
                r1 = callable2;
                r2 = executor2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x0.k(r1, r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    public static /* synthetic */ Object i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Object j(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public static /* synthetic */ void k(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: vc.v0
                public /* synthetic */ v0() {
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Object j10;
                    j10 = x0.j(TaskCompletionSource.this, task);
                    return j10;
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ Void l(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static /* synthetic */ Void m(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static <T> Task<T> n(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w0 w0Var = new Continuation() { // from class: vc.w0
            public /* synthetic */ w0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void l10;
                l10 = x0.l(TaskCompletionSource.this, task3);
                return l10;
            }
        };
        task.continueWith(w0Var);
        task2.continueWith(w0Var);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> o(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        t0 t0Var = new Continuation() { // from class: vc.t0
            public /* synthetic */ t0() {
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m10;
                m10 = x0.m(TaskCompletionSource.this, task3);
                return m10;
            }
        };
        task.continueWith(executor, t0Var);
        task2.continueWith(executor, t0Var);
        return taskCompletionSource.getTask();
    }
}
