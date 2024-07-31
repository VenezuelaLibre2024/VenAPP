package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p313qf.C10475a;

/* renamed from: com.google.mlkit.common.sdkinternal.g */
/* loaded from: classes2.dex */
public class C6520g {

    /* renamed from: b */
    private static final Object f14298b = new Object();

    /* renamed from: c */
    private static C6520g f14299c;

    /* renamed from: a */
    private final Handler f14300a;

    private C6520g(Looper looper) {
        this.f14300a = new zza(looper);
    }

    /* renamed from: a */
    public static C6520g m18307a() {
        C6520g c6520g;
        synchronized (f14298b) {
            if (f14299c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f14299c = new C6520g(handlerThread.getLooper());
            }
            c6520g = f14299c;
        }
        return c6520g;
    }

    /* renamed from: d */
    public static Executor m18308d() {
        return EnumC6539u.zza;
    }

    /* renamed from: b */
    public <ResultT> Task<ResultT> m18310b(final Callable<ResultT> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m18311c(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    taskCompletionSource2.setResult(callable2.call());
                } catch (C10475a e10) {
                    taskCompletionSource2.setException(e10);
                } catch (Exception e11) {
                    taskCompletionSource2.setException(new C10475a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public void m18311c(Runnable runnable) {
        m18308d().execute(runnable);
    }
}
