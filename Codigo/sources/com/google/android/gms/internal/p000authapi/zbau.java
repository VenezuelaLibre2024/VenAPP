package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.f;

/* loaded from: classes2.dex */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbau(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaj
    public final void zbb(Status status, f fVar) {
        if (status.y1()) {
            this.zba.setResult(fVar);
        } else {
            this.zba.setException(b.a(status));
        }
    }
}
