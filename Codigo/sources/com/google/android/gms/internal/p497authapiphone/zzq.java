package com.google.android.gms.internal.p497authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p497authapiphone.zzg
    public final void zzb(Status status, boolean z10) {
        C5191x.m13203b(status, Boolean.valueOf(z10), this.zza);
    }
}
