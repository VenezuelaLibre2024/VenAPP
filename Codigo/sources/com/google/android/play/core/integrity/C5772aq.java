package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5822d0;
import com.google.android.play.integrity.internal.C5829h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.aq */
/* loaded from: classes2.dex */
public final class C5772aq extends AbstractRunnableC5822d0 {

    /* renamed from: a */
    final /* synthetic */ Context f12142a;

    /* renamed from: b */
    final /* synthetic */ C5779ax f12143b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5772aq(C5779ax c5779ax, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f12143b = c5779ax;
        this.f12142a = context;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: b */
    protected final void mo14617b() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.f12143b.f12160d;
        taskCompletionSource.trySetResult(Boolean.valueOf(C5829h.m14687a(this.f12142a)));
    }
}
