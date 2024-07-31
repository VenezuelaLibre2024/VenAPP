package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C5276s;
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
import p313qf.C10475a;

/* renamed from: com.google.mlkit.common.sdkinternal.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6528k {

    /* renamed from: b */
    private final AtomicInteger f14311b = new AtomicInteger(0);

    /* renamed from: c */
    private final AtomicBoolean f14312c = new AtomicBoolean(false);

    /* renamed from: a */
    protected final C6533o f14310a = new C6533o();

    /* renamed from: a */
    public <T> Task<T> m18320a(final Executor executor, final Callable<T> callable, final CancellationToken cancellationToken) {
        C5276s.m13328n(this.f14311b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f14310a.m18343a(new Executor() { // from class: com.google.mlkit.common.sdkinternal.z
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
                AbstractC6528k.this.m18326g(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: b */
    public abstract void mo18321b();

    /* renamed from: c */
    public void m18322c() {
        this.f14311b.incrementAndGet();
    }

    /* renamed from: d */
    protected abstract void mo18323d();

    /* renamed from: e */
    public void m18324e(Executor executor) {
        m18325f(executor);
    }

    /* renamed from: f */
    public Task<Void> m18325f(Executor executor) {
        C5276s.m13328n(this.f14311b.get() > 0);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14310a.m18343a(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.y
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6528k.this.m18327h(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m18326g(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f14312c.get()) {
                    mo18321b();
                    this.f14312c.set(true);
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
                throw new C10475a("Internal error has occurred when executing ML Kit tasks", 13, e10);
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
    /* renamed from: h */
    public final /* synthetic */ void m18327h(TaskCompletionSource taskCompletionSource) {
        int decrementAndGet = this.f14311b.decrementAndGet();
        C5276s.m13328n(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo18323d();
            this.f14312c.set(false);
        }
        zzpj.zza();
        taskCompletionSource.setResult(null);
    }
}
