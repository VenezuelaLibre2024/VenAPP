package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzbvc implements k9.b {
    final /* synthetic */ zzbuv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvc(zzbve zzbveVar, zzbuv zzbuvVar) {
        this.zza = zzbuvVar;
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    public final void onFailure(x8.b bVar) {
        try {
            this.zza.zzg(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // k9.b
    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }
}
