package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i9.q;
import i9.t;
import i9.x;

/* loaded from: classes2.dex */
final class zzbvf implements i9.k, q, x, t, i9.c {
    final zzbtb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvf(zzbtb zzbtbVar) {
        this.zza = zzbtbVar;
    }

    @Override // i9.c
    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            zzcec.zzj("Mediated ad failed to show: " + str);
            this.zza.zzl(str);
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.q
    public final void onAdFailedToShow(x8.b bVar) {
        try {
            zzcec.zzj("Mediated ad failed to show: Error Code = " + bVar.a() + ". Error Message = " + bVar.c() + " Error Domain = " + bVar.b());
            this.zza.zzk(bVar.d());
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.k, i9.q, i9.t
    public final void onAdLeftApplication() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.c
    public final void onAdOpened() {
        try {
            this.zza.zzp();
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.x
    public final void onUserEarnedReward(n9.b bVar) {
        try {
            this.zza.zzt(new zzcbe(bVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.x, i9.t
    public final void onVideoComplete() {
        try {
            this.zza.zzv();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzw();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzx();
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.x
    public final void onVideoStart() {
        try {
            this.zza.zzy();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    @Override // i9.c
    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    @Override // i9.c
    public final void reportAdImpression() {
        try {
            this.zza.zzm();
        } catch (RemoteException unused) {
        }
    }
}
