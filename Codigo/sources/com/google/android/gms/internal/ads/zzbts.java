package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.c0;

/* loaded from: classes2.dex */
final class zzbts implements i9.e {
    final /* synthetic */ zzbtb zza;
    final /* synthetic */ zzbtv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbts(zzbtv zzbtvVar, zzbtb zzbtbVar) {
        this.zza = zzbtbVar;
        this.zzb = zzbtvVar;
    }

    public final void onFailure(String str) {
        onFailure(new x8.b(0, str, "undefined"));
    }

    @Override // i9.e
    public final void onFailure(x8.b bVar) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcec.zze(obj.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + bVar.a() + ". ErrorMessage = " + bVar.c() + ". ErrorDomain = " + bVar.b());
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
            this.zzb.zzg = (c0) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return new zzbtm(this.zza);
    }
}
