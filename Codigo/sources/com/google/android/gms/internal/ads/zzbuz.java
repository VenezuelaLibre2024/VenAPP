package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.p;

/* loaded from: classes2.dex */
final class zzbuz implements i9.e {
    final /* synthetic */ zzbuj zza;
    final /* synthetic */ zzbtb zzb;
    final /* synthetic */ zzbve zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuz(zzbve zzbveVar, zzbuj zzbujVar, zzbtb zzbtbVar) {
        this.zza = zzbujVar;
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
        p pVar = (p) obj;
        if (pVar != null) {
            try {
                this.zzc.zzb = pVar;
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
