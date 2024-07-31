package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.a;

/* loaded from: classes2.dex */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbz
    public final void zbb(Status status, a aVar) {
        if (status.y1()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(b.a(status));
        }
    }
}
