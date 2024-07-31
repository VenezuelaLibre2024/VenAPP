package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.g4;
import com.google.android.gms.ads.internal.client.h4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import x8.n;
import x8.t;
import x8.u;
import x8.z;

/* loaded from: classes2.dex */
public final class zzcaw extends n9.c {
    private final String zza;
    private final zzcan zzb;
    private final Context zzc;
    private final zzcbf zzd = new zzcbf();
    private n9.a zze;
    private t zzf;
    private n zzg;

    public zzcaw(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = x.a().o(context, str, new zzbsr());
    }

    @Override // n9.c
    public final Bundle getAdMetadata() {
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                return zzcanVar.zzb();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // n9.c
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // n9.c
    public final n getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // n9.c
    public final n9.a getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // n9.c
    public final t getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // n9.c
    public final z getResponseInfo() {
        p2 p2Var = null;
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                p2Var = zzcanVar.zzc();
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return z.g(p2Var);
    }

    @Override // n9.c
    public final n9.b getRewardItem() {
        try {
            zzcan zzcanVar = this.zzb;
            zzcak zzd = zzcanVar != null ? zzcanVar.zzd() : null;
            return zzd == null ? n9.b.f21908a : new zzcax(zzd);
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
            return n9.b.f21908a;
        }
    }

    @Override // n9.c
    public final void setFullScreenContentCallback(n nVar) {
        this.zzg = nVar;
        this.zzd.zzb(nVar);
    }

    @Override // n9.c
    public final void setImmersiveMode(boolean z10) {
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzh(z10);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // n9.c
    public final void setOnAdMetadataChangedListener(n9.a aVar) {
        try {
            this.zze = aVar;
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzi(new g4(aVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // n9.c
    public final void setOnPaidEventListener(t tVar) {
        try {
            this.zzf = tVar;
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzj(new h4(tVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // n9.c
    public final void setServerSideVerificationOptions(n9.e eVar) {
        if (eVar != null) {
            try {
                zzcan zzcanVar = this.zzb;
                if (zzcanVar != null) {
                    zzcanVar.zzl(new zzcbb(eVar));
                }
            } catch (RemoteException e10) {
                zzcec.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // n9.c
    public final void show(Activity activity, u uVar) {
        this.zzd.zzc(uVar);
        if (activity == null) {
            zzcec.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzk(this.zzd);
                this.zzb.zzm(com.google.android.gms.dynamic.d.h2(activity));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(z2 z2Var, n9.d dVar) {
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzf(y4.f8814a.a(this.zzc, z2Var), new zzcba(dVar, this));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
