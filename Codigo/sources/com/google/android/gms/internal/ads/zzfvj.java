package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvj extends zzfvu {
    final /* synthetic */ zzfvs zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfvq zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfvl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvj(zzfvl zzfvlVar, TaskCompletionSource taskCompletionSource, zzfvs zzfvsVar, int i10, zzfvq zzfvqVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfvsVar;
        this.zzb = i10;
        this.zzc = zzfvqVar;
        this.zzd = taskCompletionSource2;
        this.zze = zzfvlVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfum] */
    @Override // com.google.android.gms.internal.ads.zzfvu
    protected final void zza() {
        zzfvt zzfvtVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            if (zze == 0) {
                return;
            }
            zzfvs zzfvsVar = this.zza;
            str2 = this.zze.zzd;
            int i10 = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfvsVar.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfvsVar.zza());
            zze.zzg(bundle, new zzfvk(this.zze, this.zzc));
        } catch (RemoteException e10) {
            int i11 = this.zzb;
            zzfvtVar = zzfvl.zzb;
            str = this.zze.zzd;
            zzfvtVar.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i11), str);
            this.zzd.trySetException(new RuntimeException(e10));
        }
    }
}
