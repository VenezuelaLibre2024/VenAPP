package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdrj extends zzbli {
    private final String zza;
    private final zzdmv zzb;
    private final zzdna zzc;
    private final zzdwf zzd;

    public zzdrj(String str, zzdmv zzdmvVar, zzdna zzdnaVar, zzdwf zzdwfVar) {
        this.zza = str;
        this.zzb = zzdmvVar;
        this.zzc = zzdnaVar;
        this.zzd = zzdwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzA() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzB(Bundle bundle) {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzC() {
        this.zzb.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzD(t1 t1Var) {
        this.zzb.zzN(t1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzE(i2 i2Var) {
        try {
            if (!i2Var.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzO(i2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzF(zzblg zzblgVar) {
        this.zzb.zzP(zzblgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzG() {
        return this.zzb.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzH() {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzI(Bundle bundle) {
        return this.zzb.zzX(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final double zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final Bundle zzf() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final p2 zzg() {
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final s2 zzh() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjf zzi() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjj zzj() {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbjm zzk() {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final com.google.android.gms.dynamic.b zzl() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final com.google.android.gms.dynamic.b zzm() {
        return com.google.android.gms.dynamic.d.h2(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzn() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzo() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzp() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzq() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzr() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzs() {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzt() {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final List zzu() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final List zzv() {
        return zzH() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzw() {
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzx() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzy(x1 x1Var) {
        this.zzb.zzB(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzz(Bundle bundle) {
        this.zzb.zzF(bundle);
    }
}
