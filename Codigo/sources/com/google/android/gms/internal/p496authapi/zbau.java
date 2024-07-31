package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5224b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p399v9.C11763f;

/* loaded from: classes2.dex */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbau(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbaj
    public final void zbb(Status status, C11763f c11763f) {
        if (status.m12972y1()) {
            this.zba.setResult(c11763f);
        } else {
            this.zba.setException(C5224b.m13226a(status));
        }
    }
}
