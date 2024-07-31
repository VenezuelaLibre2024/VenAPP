package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.h0;

/* loaded from: classes2.dex */
public final class zzeqr {
    private final zzdnl zza;
    private final zzeqe zzb;
    private final zzdba zzc;

    public zzeqr(zzdnl zzdnlVar, zzflw zzflwVar) {
        this.zza = zzdnlVar;
        final zzeqe zzeqeVar = new zzeqe(zzflwVar);
        this.zzb = zzeqeVar;
        final zzbpy zzg = zzdnlVar.zzg();
        this.zzc = new zzdba() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzdba
            public final void zzbK(c3 c3Var) {
                zzeqe.this.zzbK(c3Var);
                zzbpy zzbpyVar = zzg;
                if (zzbpyVar != null) {
                    try {
                        zzbpyVar.zzf(c3Var);
                    } catch (RemoteException e10) {
                        zzcec.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (zzbpyVar != null) {
                    try {
                        zzbpyVar.zze(c3Var.f8626a);
                    } catch (RemoteException e11) {
                        zzcec.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public final zzdba zza() {
        return this.zzc;
    }

    public final zzdcl zzb() {
        return this.zzb;
    }

    public final zzdlf zzc() {
        return new zzdlf(this.zza, this.zzb.zzg());
    }

    public final zzeqe zzd() {
        return this.zzb;
    }

    public final void zze(h0 h0Var) {
        this.zzb.zzj(h0Var);
    }
}
