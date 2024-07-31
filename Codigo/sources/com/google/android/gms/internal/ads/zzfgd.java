package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzfgd extends zzcam {
    private final zzffz zza;
    private final zzffp zzb;
    private final String zzc;
    private final zzfgz zzd;
    private final Context zze;
    private final zzcei zzf;
    private final zzavi zzg;
    private final zzdwf zzh;
    private zzdso zzi;
    private boolean zzj = ((Boolean) a0.c().zza(zzbgc.zzaD)).booleanValue();

    public zzfgd(String str, zzffz zzffzVar, Context context, zzffp zzffpVar, zzfgz zzfgzVar, zzcei zzceiVar, zzavi zzaviVar, zzdwf zzdwfVar) {
        this.zzc = str;
        this.zza = zzffzVar;
        this.zzb = zzffpVar;
        this.zzd = zzfgzVar;
        this.zze = context;
        this.zzf = zzceiVar;
        this.zzg = zzaviVar;
        this.zzh = zzdwfVar;
    }

    private final synchronized void zzu(u4 u4Var, zzcau zzcauVar, int i10) {
        boolean z10 = false;
        if (((Boolean) zzbhy.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.zzf.zzc < ((Integer) a0.c().zza(zzbgc.zzkH)).intValue() || !z10) {
            s.e("#008 Must be called on the main UI thread.");
        }
        this.zzb.zzk(zzcauVar);
        t.r();
        if (j2.g(this.zze) && u4Var.D == null) {
            zzcec.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzbK(zzfij.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzffr zzffrVar = new zzffr(null);
        this.zza.zzj(i10);
        this.zza.zzb(u4Var, this.zzc, zzffrVar, new zzfgc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final Bundle zzb() {
        s.e("#008 Must be called on the main UI thread.");
        zzdso zzdsoVar = this.zzi;
        return zzdsoVar != null ? zzdsoVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final p2 zzc() {
        zzdso zzdsoVar;
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue() && (zzdsoVar = this.zzi) != null) {
            return zzdsoVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final zzcak zzd() {
        s.e("#008 Must be called on the main UI thread.");
        zzdso zzdsoVar = this.zzi;
        if (zzdsoVar != null) {
            return zzdsoVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized String zze() {
        zzdso zzdsoVar = this.zzi;
        if (zzdsoVar == null || zzdsoVar.zzl() == null) {
            return null;
        }
        return zzdsoVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzf(u4 u4Var, zzcau zzcauVar) {
        zzu(u4Var, zzcauVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzg(u4 u4Var, zzcau zzcauVar) {
        zzu(u4Var, zzcauVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzh(boolean z10) {
        s.e("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzi(f2 f2Var) {
        if (f2Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgb(this, f2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzj(i2 i2Var) {
        s.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!i2Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzi(i2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzk(zzcaq zzcaqVar) {
        s.e("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzcaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzl(zzcbb zzcbbVar) {
        s.e("#008 Must be called on the main UI thread.");
        zzfgz zzfgzVar = this.zzd;
        zzfgzVar.zza = zzcbbVar.zza;
        zzfgzVar.zzb = zzcbbVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzm(com.google.android.gms.dynamic.b bVar) {
        zzn(bVar, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final synchronized void zzn(com.google.android.gms.dynamic.b bVar, boolean z10) {
        s.e("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzcec.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzp(zzfij.zzd(9, null, null));
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzcz)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z10, (Activity) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final boolean zzo() {
        s.e("#008 Must be called on the main UI thread.");
        zzdso zzdsoVar = this.zzi;
        return (zzdsoVar == null || zzdsoVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zzp(zzcav zzcavVar) {
        s.e("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzcavVar);
    }
}
