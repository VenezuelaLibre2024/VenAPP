package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.o;

/* loaded from: classes2.dex */
final class zzbto implements i9.e {
    final /* synthetic */ zzbtb zza;
    final /* synthetic */ i9.a zzb;
    final /* synthetic */ zzbtv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbto(zzbtv zzbtvVar, zzbtb zzbtbVar, i9.a aVar) {
        this.zza = zzbtbVar;
        this.zzb = aVar;
        this.zzc = zzbtvVar;
    }

    public final void onFailure(String str) {
        onFailure(new x8.b(0, str, "undefined"));
    }

    @Override // i9.e
    public final void onFailure(x8.b bVar) {
        try {
            zzcec.zze(this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + bVar.a() + ". ErrorMessage = " + bVar.c() + ". ErrorDomain = " + bVar.b());
            this.zza.zzh(bVar.d());
            this.zza.zzi(bVar.a(), bVar.c());
            this.zza.zzg(bVar.a());
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // i9.e
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzc.zzi = (o) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return new zzbtm(this.zza);
    }
}
