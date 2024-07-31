package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbtt implements i9.e {
    final /* synthetic */ zzbtb zza;
    final /* synthetic */ zzbtv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtt(zzbtv zzbtvVar, zzbtb zzbtbVar) {
        this.zza = zzbtbVar;
        this.zzb = zzbtvVar;
    }

    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            zzcec.zze(obj.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
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
            this.zzb.zzh = (w) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
        return new zzcbd(this.zza);
    }
}