package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzbtp implements i9.b {
    final /* synthetic */ zzbph zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtp(zzbtv zzbtvVar, zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    @Override // i9.b
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // i9.b
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }
}
