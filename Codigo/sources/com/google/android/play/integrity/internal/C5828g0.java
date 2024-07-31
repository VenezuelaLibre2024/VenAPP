package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.integrity.internal.g0 */
/* loaded from: classes2.dex */
public final class C5828g0 extends AbstractRunnableC5822d0 {

    /* renamed from: r */
    final /* synthetic */ TaskCompletionSource f12229r;

    /* renamed from: s */
    final /* synthetic */ AbstractRunnableC5822d0 f12230s;

    /* renamed from: t */
    final /* synthetic */ C5821d f12231t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5828g0(C5821d c5821d, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC5822d0 abstractRunnableC5822d0) {
        super(taskCompletionSource);
        this.f12231t = c5821d;
        this.f12229r = taskCompletionSource2;
        this.f12230s = abstractRunnableC5822d0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    public final void mo14617b() {
        Object obj;
        AtomicInteger atomicInteger;
        C5820c0 c5820c0;
        obj = this.f12231t.f12216f;
        synchronized (obj) {
            C5821d.m14672o(this.f12231t, this.f12229r);
            atomicInteger = this.f12231t.f12222l;
            if (atomicInteger.getAndIncrement() > 0) {
                c5820c0 = this.f12231t.f12212b;
                c5820c0.m14658c("Already connected to the service.", new Object[0]);
            }
            C5821d.m14674q(this.f12231t, this.f12230s);
        }
    }
}
