package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.r0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcp extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ r0 zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcp(TaskCompletionSource taskCompletionSource, r0 r0Var) {
        this.zza = taskCompletionSource;
        this.zzb = r0Var;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        x.a(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.zzb.zzf();
    }
}
