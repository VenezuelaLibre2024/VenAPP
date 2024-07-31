package com.google.mlkit.common.sdkinternal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.mlkit.common.sdkinternal.o */
/* loaded from: classes2.dex */
public class C6533o {

    /* renamed from: b */
    private boolean f14341b;

    /* renamed from: a */
    private final Object f14340a = new Object();

    /* renamed from: c */
    private final Queue f14342c = new ArrayDeque();

    /* renamed from: d */
    private final AtomicReference f14343d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m18341d() {
        synchronized (this.f14340a) {
            if (this.f14342c.isEmpty()) {
                this.f14341b = false;
            } else {
                C6525i0 c6525i0 = (C6525i0) this.f14342c.remove();
                m18342e(c6525i0.f14306a, c6525i0.f14307b);
            }
        }
    }

    /* renamed from: e */
    private final void m18342e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C6533o c6533o = C6533o.this;
                    Runnable runnable2 = runnable;
                    C6529k0 c6529k0 = new C6529k0(c6533o, null);
                    try {
                        runnable2.run();
                        c6529k0.close();
                    } catch (Throwable th2) {
                        try {
                            c6529k0.close();
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
            m18341d();
        }
    }

    /* renamed from: a */
    public void m18343a(Executor executor, Runnable runnable) {
        synchronized (this.f14340a) {
            if (this.f14341b) {
                this.f14342c.add(new C6525i0(executor, runnable, null));
            } else {
                this.f14341b = true;
                m18342e(executor, runnable);
            }
        }
    }
}
