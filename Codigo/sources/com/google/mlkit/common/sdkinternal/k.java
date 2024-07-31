package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.internal.mlkit_common.zzpj;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13037b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13038c = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    protected final o f13036a = new o();

    public <T> Task<T> a(final Executor executor, final Callable<T> callable, final CancellationToken cancellationToken) {
        com.google.android.gms.common.internal.s.n(this.f13037b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f13036a.a(new Executor() { // from class: com.google.mlkit.common.sdkinternal.z
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                CancellationToken cancellationToken2 = cancellationToken;
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e10) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.a0
            @Override // java.lang.Runnable
            public final void run() {
                k.this.g(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public void c() {
        this.f13037b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public Task<Void> f(Executor executor) {
        com.google.android.gms.common.internal.s.n(this.f13037b.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13036a.a(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.y
            @Override // java.lang.Runnable
            public final void run() {
                k.this.h(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f13038c.get()) {
                    b();
                    this.f13038c.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (RuntimeException e10) {
                throw new qf.a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.f13037b.decrementAndGet();
        com.google.android.gms.common.internal.s.n(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f13038c.set(false);
        }
        zzpj.zza();
        taskCompletionSource.setResult(null);
    }
}
