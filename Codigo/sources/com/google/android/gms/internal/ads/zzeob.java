package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public class zzeob extends zzbta {
    private final zzdav zza;
    private final zzdis zzb;
    private final zzdbp zzc;
    private final zzdce zzd;
    private final zzdcj zze;
    private final zzdfr zzf;
    private final zzddd zzg;
    private final zzdjk zzh;
    private final zzdfn zzi;
    private final zzdbk zzj;

    public zzeob(zzdav zzdavVar, zzdis zzdisVar, zzdbp zzdbpVar, zzdce zzdceVar, zzdcj zzdcjVar, zzdfr zzdfrVar, zzddd zzdddVar, zzdjk zzdjkVar, zzdfn zzdfnVar, zzdbk zzdbkVar) {
        this.zza = zzdavVar;
        this.zzb = zzdisVar;
        this.zzc = zzdbpVar;
        this.zzd = zzdceVar;
        this.zze = zzdcjVar;
        this.zzf = zzdfrVar;
        this.zzg = zzdddVar;
        this.zzh = zzdjkVar;
        this.zzi = zzdfnVar;
        this.zzj = zzdbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzf() {
        this.zzg.zzbD(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzh(c3 c3Var) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    @Deprecated
    public final void zzj(int i10) {
        zzk(new c3(i10, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzk(c3 c3Var) {
        this.zzj.zza(zzfij.zzc(8, c3Var));
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzl(String str) {
        zzk(new c3(0, str, "undefined", null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzo() {
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzp() {
        this.zzg.zzbA();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzr(zzbkg zzbkgVar, String str) {
    }

    public void zzs(zzcag zzcagVar) {
    }

    public void zzt(zzcak zzcakVar) {
    }

    public void zzu() {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzx() {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
