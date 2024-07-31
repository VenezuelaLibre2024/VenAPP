package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.b0;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.q4;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.internal.client.z4;
import x8.n;
import x8.o;
import x8.t;
import x8.z;

/* loaded from: classes2.dex */
public final class zzbpz extends y8.c {
    private final Context zza;
    private final y4 zzb;
    private final u0 zzc;
    private final String zzd;
    private final zzbsr zze;
    private y8.e zzf;
    private n zzg;
    private t zzh;

    public zzbpz(Context context, String str) {
        zzbsr zzbsrVar = new zzbsr();
        this.zze = zzbsrVar;
        this.zza = context;
        this.zzd = str;
        this.zzb = y4.f8814a;
        this.zzc = x.a().e(context, new z4(), str, zzbsrVar);
    }

    @Override // h9.a
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // y8.c
    public final y8.e getAppEventListener() {
        return this.zzf;
    }

    @Override // h9.a
    public final n getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // h9.a
    public final t getOnPaidEventListener() {
        return this.zzh;
    }

    @Override // h9.a
    public final z getResponseInfo() {
        p2 p2Var = null;
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                p2Var = u0Var.zzk();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return z.g(p2Var);
    }

    @Override // y8.c
    public final void setAppEventListener(y8.e eVar) {
        try {
            this.zzf = eVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzG(eVar != null ? new zzaze(eVar) : null);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // h9.a
    public final void setFullScreenContentCallback(n nVar) {
        try {
            this.zzg = nVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzJ(new b0(nVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // h9.a
    public final void setImmersiveMode(boolean z10) {
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzL(z10);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // h9.a
    public final void setOnPaidEventListener(t tVar) {
        try {
            this.zzh = tVar;
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzP(new h4(tVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // h9.a
    public final void show(Activity activity) {
        if (activity == null) {
            zzcec.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzW(com.google.android.gms.dynamic.d.h2(activity));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(z2 z2Var, x8.f fVar) {
        try {
            u0 u0Var = this.zzc;
            if (u0Var != null) {
                u0Var.zzy(this.zzb.a(this.zza, z2Var), new q4(fVar, this));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            fVar.onAdFailedToLoad(new o(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
