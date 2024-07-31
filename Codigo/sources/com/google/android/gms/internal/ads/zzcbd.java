package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import i9.x;

/* loaded from: classes2.dex */
public final class zzcbd implements x {
    private final zzbtb zza;

    public zzcbd(zzbtb zzbtbVar) {
        this.zza = zzbtbVar;
    }

    @Override // i9.c
    public final void onAdClosed() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onAdFailedToShow(String str) {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToShow.");
        zzcec.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.x
    public final void onAdFailedToShow(x8.b bVar) {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdFailedToShow.");
        zzcec.zzj("Mediation ad failed to show: Error Code = " + bVar.a() + ". Error Message = " + bVar.c() + " Error Domain = " + bVar.b());
        try {
            this.zza.zzk(bVar.d());
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.c
    public final void onAdOpened() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.x
    public final void onUserEarnedReward(n9.b bVar) {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzcbe(bVar));
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.x, i9.t
    public final void onVideoComplete() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.x
    public final void onVideoStart() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called onVideoStart.");
        try {
            this.zza.zzy();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.c
    public final void reportAdClicked() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // i9.c
    public final void reportAdImpression() {
        s.e("#008 Must be called on the main UI thread.");
        zzcec.zze("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
