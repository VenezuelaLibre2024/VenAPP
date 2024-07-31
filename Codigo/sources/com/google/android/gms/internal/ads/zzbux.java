package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzbux implements i9.e {
    final /* synthetic */ zzbug zza;
    final /* synthetic */ zzbtb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbux(zzbve zzbveVar, zzbug zzbugVar, zzbtb zzbtbVar) {
        this.zza = zzbugVar;
        this.zzb = zzbtbVar;
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
        i9.j jVar = (i9.j) obj;
        if (jVar != null) {
            try {
                this.zza.zzg(com.google.android.gms.dynamic.d.h2(jVar.getView()));
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
