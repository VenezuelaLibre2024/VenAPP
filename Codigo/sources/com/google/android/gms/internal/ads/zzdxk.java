package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdxk {
    private final zzboe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxk(zzboe zzboeVar) {
        this.zza = zzboeVar;
    }

    private final void zzs(zzdxj zzdxjVar) {
        String zza = zzdxj.zza(zzdxjVar);
        zzcec.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() {
        zzs(new zzdxj("initialize", null));
    }

    public final void zzb(long j10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdClicked";
        this.zza.zzb(zzdxj.zza(zzdxjVar));
    }

    public final void zzc(long j10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdClosed";
        zzs(zzdxjVar);
    }

    public final void zzd(long j10, int i10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i10);
        zzs(zzdxjVar);
    }

    public final void zze(long j10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdLoaded";
        zzs(zzdxjVar);
    }

    public final void zzf(long j10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzg(long j10) {
        zzdxj zzdxjVar = new zzdxj("interstitial", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdOpened";
        zzs(zzdxjVar);
    }

    public final void zzh(long j10) {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "nativeObjectCreated";
        zzs(zzdxjVar);
    }

    public final void zzi(long j10) {
        zzdxj zzdxjVar = new zzdxj("creation", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "nativeObjectNotCreated";
        zzs(zzdxjVar);
    }

    public final void zzj(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdClicked";
        zzs(zzdxjVar);
    }

    public final void zzk(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onRewardedAdClosed";
        zzs(zzdxjVar);
    }

    public final void zzl(long j10, zzcak zzcakVar) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onUserEarnedReward";
        zzdxjVar.zze = zzcakVar.zzf();
        zzdxjVar.zzf = Integer.valueOf(zzcakVar.zze());
        zzs(zzdxjVar);
    }

    public final void zzm(long j10, int i10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onRewardedAdFailedToLoad";
        zzdxjVar.zzd = Integer.valueOf(i10);
        zzs(zzdxjVar);
    }

    public final void zzn(long j10, int i10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onRewardedAdFailedToShow";
        zzdxjVar.zzd = Integer.valueOf(i10);
        zzs(zzdxjVar);
    }

    public final void zzo(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onAdImpression";
        zzs(zzdxjVar);
    }

    public final void zzp(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onRewardedAdLoaded";
        zzs(zzdxjVar);
    }

    public final void zzq(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxjVar);
    }

    public final void zzr(long j10) {
        zzdxj zzdxjVar = new zzdxj("rewarded", null);
        zzdxjVar.zza = Long.valueOf(j10);
        zzdxjVar.zzc = "onRewardedAdOpened";
        zzs(zzdxjVar);
    }
}
