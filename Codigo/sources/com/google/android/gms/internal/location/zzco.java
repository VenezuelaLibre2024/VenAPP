package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.u0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzco extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ u0 zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(TaskCompletionSource taskCompletionSource, u0 u0Var) {
        this.zza = taskCompletionSource;
        this.zzb = u0Var;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        x.a(zzgVar.getStatus(), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
        this.zzb.zze();
    }
}
