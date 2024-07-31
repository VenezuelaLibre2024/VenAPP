package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p399v9.C11760c;

/* loaded from: classes2.dex */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbbc(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbac
    public final void zbb(Status status, C11760c c11760c) {
        C5191x.m13203b(status, c11760c, this.zba);
    }
}
