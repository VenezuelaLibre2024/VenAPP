package com.google.mlkit.common.sdkinternal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private boolean f13067b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f13066a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Queue f13068c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f13069d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f13066a) {
            if (this.f13068c.isEmpty()) {
                this.f13067b = false;
            } else {
                i0 i0Var = (i0) this.f13068c.remove();
                e(i0Var.f13032a, i0Var.f13033b);
            }
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar = o.this;
                    Runnable runnable2 = runnable;
                    k0 k0Var = new k0(oVar, null);
                    try {
                        runnable2.run();
                        k0Var.close();
                    } catch (Throwable th2) {
                        try {
                            k0Var.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f13066a) {
            if (this.f13067b) {
                this.f13068c.add(new i0(executor, runnable, null));
            } else {
                this.f13067b = true;
                e(executor, runnable);
            }
        }
    }
}
