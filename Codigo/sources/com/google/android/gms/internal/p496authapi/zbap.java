package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5224b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p399v9.C11756a;

/* loaded from: classes2.dex */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbz
    public final void zbb(Status status, C11756a c11756a) {
        if (status.m12972y1()) {
            this.zba.setResult(c11756a);
        } else {
            this.zba.setException(C5224b.m13226a(status));
        }
    }
}
