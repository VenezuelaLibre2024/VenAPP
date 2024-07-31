package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import x8.n;
import x8.t;
import x8.z;

/* loaded from: classes2.dex */
public final class zzbaf extends z8.a {
    n zza;
    private final zzbaj zzb;
    private final String zzc;
    private final zzbag zzd = new zzbag();
    private t zze;

    public zzbaf(zzbaj zzbajVar, String str) {
        this.zzb = zzbajVar;
        this.zzc = str;
    }

    @Override // z8.a
    public final String getAdUnitId() {
        return this.zzc;
    }

    @Override // z8.a
    public final n getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // z8.a
    public final t getOnPaidEventListener() {
        return this.zze;
    }

    @Override // z8.a
    public final z getResponseInfo() {
        p2 p2Var;
        try {
            p2Var = this.zzb.zzf();
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            p2Var = null;
        }
        return z.g(p2Var);
    }

    @Override // z8.a
    public final void setFullScreenContentCallback(n nVar) {
        this.zza = nVar;
        this.zzd.zzg(nVar);
    }

    @Override // z8.a
    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzg(z10);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // z8.a
    public final void setOnPaidEventListener(t tVar) {
        this.zze = tVar;
        try {
            this.zzb.zzh(new h4(tVar));
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // z8.a
    public final void show(Activity activity) {
        try {
            this.zzb.zzi(com.google.android.gms.dynamic.d.h2(activity), this.zzd);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
