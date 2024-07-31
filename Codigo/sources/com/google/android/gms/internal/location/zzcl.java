package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcl extends h.a {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(zzda zzdaVar, Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void onResult(Status status) {
        x.b(status, this.zza, this.zzb);
    }
}
