package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.q;
import com.google.android.gms.location.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcq extends zzr {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(r rVar) {
        x.b(rVar.getStatus(), new q(rVar), this.zza);
    }
}
