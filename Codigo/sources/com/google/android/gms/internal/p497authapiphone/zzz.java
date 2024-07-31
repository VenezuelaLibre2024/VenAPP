package com.google.android.gms.internal.p497authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzz extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p497authapiphone.zzj
    public final void zzb(Status status) {
        C5191x.m13202a(status, this.zza);
    }
}
