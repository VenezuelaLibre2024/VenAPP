package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzdxv implements zzdxf {
    private final long zza;
    private final zzdxk zzb;
    private final zzfgd zzc;

    public zzdxv(long j10, Context context, zzdxk zzdxkVar, zzclg zzclgVar, String str) {
        this.zza = j10;
        this.zzb = zzdxkVar;
        zzfgf zzv = zzclgVar.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzb(u4 u4Var) {
        try {
            this.zzc.zzf(u4Var, new zzdxt(this));
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdxu(this));
            this.zzc.zzm(com.google.android.gms.dynamic.d.h2(null));
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
