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

/* renamed from: vc.x0 */
/* loaded from: classes.dex */
public final class C11870x0 {

    /* renamed from: a */
    private static final ExecutorService f31371a = C11872z.m37959c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: f */
    public static <T> T m37945f(Task<T> task) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f31371a, new Continuation() { // from class: vc.s0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Object m37948i;
                m37948i = C11870x0.m37948i(countDownLatch, task2);
                return m37948i;
            }
        });
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3L : 4L, TimeUnit.SECONDS);
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

    /* renamed from: g */
    public static boolean m37946g(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
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

    /* renamed from: h */
    public static <T> Task<T> m37947h(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: vc.u0
            @Override // java.lang.Runnable
            public final void run() {
                C11870x0.m37950k(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Object m37948i(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m37949j(TaskCompletionSource taskCompletionSource, Task task) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m37950k(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: vc.v0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Object m37949j;
                    m37949j = C11870x0.m37949j(TaskCompletionSource.this, task);
                    return m37949j;
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Void m37951l(TaskCompletionSource taskCompletionSource, Task task) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Void m37952m(TaskCompletionSource taskCompletionSource, Task task) {
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

    /* renamed from: n */
    public static <T> Task<T> m37953n(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: vc.w0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m37951l;
                m37951l = C11870x0.m37951l(TaskCompletionSource.this, task3);
                return m37951l;
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public static <T> Task<T> m37954o(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: vc.t0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Void m37952m;
                m37952m = C11870x0.m37952m(TaskCompletionSource.this, task3);
                return m37952m;
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
