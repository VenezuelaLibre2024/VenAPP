package io.flutter.plugins.googlesignin;

import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class BackgroundTaskRunner {
    private final ThreadPoolExecutor executor;

    /* loaded from: classes3.dex */
    public interface Callback<T> {
        void run(Future<T> future);
    }

    public BackgroundTaskRunner(int i10) {
        this.executor = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runInBackground$1(com.google.common.util.concurrent.j jVar, Callable callable) {
        if (jVar.isCancelled()) {
            return;
        }
        try {
            jVar.A(callable.call());
        } catch (Throwable th2) {
            jVar.B(th2);
        }
    }

    public <T> com.google.common.util.concurrent.f<T> runInBackground(final Callable<T> callable) {
        final com.google.common.util.concurrent.j C = com.google.common.util.concurrent.j.C();
        this.executor.execute(new Runnable() { // from class: io.flutter.plugins.googlesignin.b
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundTaskRunner.lambda$runInBackground$1(com.google.common.util.concurrent.j.this, callable);
            }
        });
        return C;
    }

    public <T> void runInBackground(Callable<T> callable, final Callback<T> callback) {
        final com.google.common.util.concurrent.f<T> runInBackground = runInBackground(callable);
        runInBackground.addListener(new Runnable() { // from class: io.flutter.plugins.googlesignin.a
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundTaskRunner.Callback.this.run(runInBackground);
            }
        }, Executors.uiThreadExecutor());
    }
}
