package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzcyb implements zzdcl, com.google.android.gms.ads.internal.client.a, zzdds, zzdbr, zzdax, zzdge {
    private final la.f zza;
    private final zzcde zzb;

    public zzcyb(la.f fVar, zzcde zzcdeVar) {
        this.zza = fVar;
        this.zzb = zzcdeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        this.zzb.zzk(this.zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzi(zzbck zzbckVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzj(zzbck zzbckVar) {
    }

    public final void zzk(u4 u4Var) {
        this.zzb.zzj(u4Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzm(zzbck zzbckVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        this.zzb.zzh(true);
    }
}
