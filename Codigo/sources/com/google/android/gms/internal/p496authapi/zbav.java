package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p399v9.C11765h;

/* loaded from: classes2.dex */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbav(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p496authapi.zbal
    public final void zbb(Status status, C11765h c11765h) {
        C5191x.m13203b(status, c11765h, this.zba);
    }
}
