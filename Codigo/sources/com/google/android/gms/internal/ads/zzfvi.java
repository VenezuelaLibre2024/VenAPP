package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvi extends zzfvu {
    final /* synthetic */ zzfvc zza;
    final /* synthetic */ zzfvq zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfvl zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvi(zzfvl zzfvlVar, TaskCompletionSource taskCompletionSource, zzfvc zzfvcVar, zzfvq zzfvqVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvcVar;
        this.zzb = zzfvqVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfvlVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfum] */
    @Override // com.google.android.gms.internal.ads.zzfvu
    protected final void zza() {
        zzfvt zzfvtVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfvc zzfvcVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfvcVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfvcVar.zza());
            zze.zze(bundle, new zzfvk(this.zzd, this.zzb));
        } catch (RemoteException e10) {
            zzfvl zzfvlVar = this.zzd;
            zzfvtVar = zzfvl.zzb;
            str = zzfvlVar.zzd;
            zzfvtVar.zzb(e10, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e10));
        }
    }
}
