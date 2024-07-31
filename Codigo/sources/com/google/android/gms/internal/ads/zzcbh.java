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
public final class zzcbh extends o9.a {
    private final String zza;
    private final zzcan zzb;
    private final Context zzc;
    private final zzcbf zzd = new zzcbf();
    private n zze;
    private n9.a zzf;
    private t zzg;

    public zzcbh(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = x.a().o(context, str, new zzbsr());
    }

    @Override // o9.a
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

    @Override // o9.a
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // o9.a
    public final n getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // o9.a
    public final n9.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // o9.a
    public final t getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // o9.a
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

    @Override // o9.a
    public final n9.b getRewardItem() {
        try {
            zzcan zzcanVar = this.zzb;
            zzcak zzd = zzcanVar != null ? zzcanVar.zzd() : null;
            if (zzd != null) {
                return new zzcax(zzd);
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
        return n9.b.f21908a;
    }

    @Override // o9.a
    public final void setFullScreenContentCallback(n nVar) {
        this.zze = nVar;
        this.zzd.zzb(nVar);
    }

    @Override // o9.a
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

    @Override // o9.a
    public final void setOnAdMetadataChangedListener(n9.a aVar) {
        this.zzf = aVar;
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzi(new g4(aVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // o9.a
    public final void setOnPaidEventListener(t tVar) {
        this.zzg = tVar;
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzj(new h4(tVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // o9.a
    public final void setServerSideVerificationOptions(n9.e eVar) {
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzl(new zzcbb(eVar));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // o9.a
    public final void show(Activity activity, u uVar) {
        this.zzd.zzc(uVar);
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

    public final void zza(z2 z2Var, o9.b bVar) {
        try {
            zzcan zzcanVar = this.zzb;
            if (zzcanVar != null) {
                zzcanVar.zzg(y4.f8814a.a(this.zzc, z2Var), new zzcbg(bVar, this));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
