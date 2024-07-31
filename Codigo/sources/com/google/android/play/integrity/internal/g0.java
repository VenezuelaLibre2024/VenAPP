package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g0 extends d0 {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11014r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ d0 f11015s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ d f11016t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, d0 d0Var) {
        super(taskCompletionSource);
        this.f11016t = dVar;
        this.f11014r = taskCompletionSource2;
        this.f11015s = d0Var;
    }

    @Override // com.google.android.play.integrity.internal.d0
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        c0 c0Var;
        obj = this.f11016t.f11001f;
        synchronized (obj) {
            d.o(this.f11016t, this.f11014r);
            atomicInteger = this.f11016t.f11007l;
            if (atomicInteger.getAndIncrement() > 0) {
                c0Var = this.f11016t.f10997b;
                c0Var.c("Already connected to the service.", new Object[0]);
            }
            d.q(this.f11016t, this.f11015s);
        }
    }
}
