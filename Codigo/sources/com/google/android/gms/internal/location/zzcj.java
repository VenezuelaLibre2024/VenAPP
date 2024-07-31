package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.m;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcj extends m {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzda zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcj(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzdaVar;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.location.m
    public final void onLocationResult(LocationResult locationResult) {
        this.zza.trySetResult(locationResult.u1());
        try {
            this.zzb.zzB(l.c(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
