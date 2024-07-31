package com.google.android.gms.internal.p496authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.common.api.internal.InterfaceC5139h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zbbd extends InterfaceC5139h.a {
    final /* synthetic */ TaskCompletionSource zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zbbd(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5139h
    public final void onResult(Status status) {
        C5191x.m13202a(status, this.zba);
    }
}
