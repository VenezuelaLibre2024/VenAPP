package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcn extends zzj {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcn(Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zzd(zzg zzgVar) {
        x.b(zzgVar.getStatus(), this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.location.zzk
    public final void zze() {
    }
}
