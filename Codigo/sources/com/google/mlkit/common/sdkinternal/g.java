package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f13024b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static g f13025c;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13026a;

    private g(Looper looper) {
        this.f13026a = new zza(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f13024b) {
            if (f13025c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f13025c = new g(handlerThread.getLooper());
            }
            gVar = f13025c;
        }
        return gVar;
    }

    public static Executor d() {
        return u.zza;
    }

    public <ResultT> Task<ResultT> b(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (qf.a e10) {
                    taskCompletionSource2.setException(e10);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(new qf.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
