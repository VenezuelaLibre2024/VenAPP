package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5822d0;
import com.google.android.play.integrity.internal.C5823e;

/* renamed from: com.google.android.play.core.integrity.aw */
/* loaded from: classes2.dex */
abstract class AbstractC5778aw extends AbstractRunnableC5822d0 {

    /* renamed from: f */
    final /* synthetic */ C5779ax f12156f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5778aw(C5779ax c5779ax, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f12156f = c5779ax;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5822d0
    /* renamed from: a */
    public final void mo14616a(Exception exc) {
        if (exc instanceof C5823e) {
            super.mo14616a(C5779ax.m14635g(this.f12156f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.mo14616a(exc);
        }
    }
}
