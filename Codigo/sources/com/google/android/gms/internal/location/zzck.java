package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzck implements zzcs {
    final /* synthetic */ k zza;
    final /* synthetic */ TaskCompletionSource zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzck(zzda zzdaVar, k kVar, TaskCompletionSource taskCompletionSource) {
        this.zza = kVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final k zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        this.zzb.trySetResult(null);
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzc(k kVar) {
        throw new IllegalStateException();
    }
}
