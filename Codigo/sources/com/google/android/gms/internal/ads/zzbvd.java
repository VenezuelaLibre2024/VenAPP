package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.w;

/* loaded from: classes2.dex */
final class zzbvd implements i9.e {
    final /* synthetic */ zzbup zza;
    final /* synthetic */ zzbtb zzb;
    final /* synthetic */ zzbve zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvd(zzbve zzbveVar, zzbup zzbupVar, zzbtb zzbtbVar) {
        this.zza = zzbupVar;
        this.zzb = zzbtbVar;
        this.zzc = zzbveVar;
    }

    public final void onFailure(String str) {
        onFailure(new x8.b(0, str, "undefined"));
    }

    @Override // i9.e
    public final void onFailure(x8.b bVar) {
        try {
            this.zza.zzf(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // i9.e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        w wVar = (w) obj;
        if (wVar != null) {
            try {
                this.zzc.zzc = wVar;
                this.zza.zzg();
            } catch (RemoteException e10) {
                zzcec.zzh("", e10);
            }
            return new zzbvf(this.zzb);
        }
        zzcec.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e11) {
            zzcec.zzh("", e11);
            return null;
        }
    }
}
