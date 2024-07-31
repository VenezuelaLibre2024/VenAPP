package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzci extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzci(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i10, String[] strArr) {
        x.a(new Status(i.b(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i10, PendingIntent pendingIntent) {
        x.a(new Status(i.b(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i10, String[] strArr) {
        x.a(new Status(i.b(i10)), this.zza);
    }
}
