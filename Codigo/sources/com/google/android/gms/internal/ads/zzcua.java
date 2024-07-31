package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzcua extends zzbai {
    private final zzctz zza;
    private final u0 zzb;
    private final zzfck zzc;
    private boolean zzd = ((Boolean) a0.c().zza(zzbgc.zzaG)).booleanValue();
    private final zzdwf zze;

    public zzcua(zzctz zzctzVar, u0 u0Var, zzfck zzfckVar, zzdwf zzdwfVar) {
        this.zza = zzctzVar;
        this.zzb = u0Var;
        this.zzc = zzfckVar;
        this.zze = zzdwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final u0 zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final p2 zzf() {
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzh(i2 i2Var) {
        s.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!i2Var.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e10) {
                zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzn(i2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaj
    public final void zzi(com.google.android.gms.dynamic.b bVar, zzbaq zzbaqVar) {
        try {
            this.zzc.zzq(zzbaqVar);
            this.zza.zzd((Activity) com.google.android.gms.dynamic.d.g2(bVar), zzbaqVar, this.zzd);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
