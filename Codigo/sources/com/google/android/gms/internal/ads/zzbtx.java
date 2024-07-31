package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import i9.c0;
import i9.m;
import i9.s;
import i9.v;
import x8.b0;

/* loaded from: classes2.dex */
public final class zzbtx implements m, s, v {
    private final zzbtb zza;
    private c0 zzb;
    private zzbkh zzc;

    public zzbtx(zzbtb zzbtbVar) {
        this.zza = zzbtbVar;
    }

    @Override // i9.m
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        c0 c0Var = this.zzb;
        if (this.zzc == null) {
            if (c0Var == null) {
                zzcec.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!c0Var.l()) {
                zzcec.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcec.zze("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.m
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.s
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i10) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error. " + i10);
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.m
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, x8.b bVar) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.a() + ". ErrorMessage: " + bVar.c() + ". ErrorDomain: " + bVar.b());
        try {
            this.zza.zzh(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.s
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.s
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, x8.b bVar) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.a() + ". ErrorMessage: " + bVar.c() + ". ErrorDomain: " + bVar.b());
        try {
            this.zza.zzh(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i10) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.zza.zzg(i10);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, x8.b bVar) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + bVar.a() + ". ErrorMessage: " + bVar.c() + ". ErrorDomain: " + bVar.b());
        try {
            this.zza.zzh(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        c0 c0Var = this.zzb;
        if (this.zzc == null) {
            if (c0Var == null) {
                zzcec.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!c0Var.m()) {
                zzcec.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcec.zze("Adapter called onAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.m
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.s
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLoaded.");
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, c0 c0Var) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLoaded.");
        this.zzb = c0Var;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            b0 b0Var = new b0();
            b0Var.c(new zzbtl());
            if (c0Var != null && c0Var.r()) {
                c0Var.O(b0Var);
            }
        }
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.m
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.s
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onVideoEnd.");
        try {
            this.zza.zzv();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final c0 zza() {
        return this.zzb;
    }

    @Override // i9.m
    public final void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAppEvent.");
        try {
            this.zza.zzq(str, str2);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final zzbkh zzc() {
        return this.zzc;
    }

    @Override // i9.v
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbkh zzbkhVar) {
        com.google.android.gms.common.internal.s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbkhVar.zzb())));
        this.zzc = zzbkhVar;
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.v
    public final void zze(MediationNativeAdapter mediationNativeAdapter, zzbkh zzbkhVar, String str) {
        try {
            this.zza.zzr(zzbkhVar.zza(), str);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
