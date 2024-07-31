package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.b0 */
/* loaded from: classes.dex */
public final class C4610b0<T> {

    /* renamed from: a */
    private T f8690a;

    /* renamed from: b */
    private CountDownLatch f8691b;

    public C4610b0(final Callable<T> callable) {
        C9322n.m27781e(callable, "callable");
        this.f8691b = new CountDownLatch(1);
        C7799e0.m23868t().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m11126b;
                m11126b = C4610b0.m11126b(C4610b0.this, callable);
                return m11126b;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final Void m11126b(C4610b0 this$0, Callable callable) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(callable, "$callable");
        try {
            this$0.f8690a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f8691b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
