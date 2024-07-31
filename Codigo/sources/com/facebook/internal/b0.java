package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f7715a;

    /* renamed from: b, reason: collision with root package name */
    private CountDownLatch f7716b;

    public b0(final Callable<T> callable) {
        kotlin.jvm.internal.n.e(callable, "callable");
        this.f7716b = new CountDownLatch(1);
        i4.e0.t().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b10;
                b10 = b0.b(b0.this, callable);
                return b10;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(b0 this$0, Callable callable) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(callable, "$callable");
        try {
            this$0.f7715a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f7716b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
