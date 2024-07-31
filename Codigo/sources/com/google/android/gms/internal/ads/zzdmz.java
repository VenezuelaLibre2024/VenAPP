package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.v2;

/* loaded from: classes2.dex */
public final class zzdmz extends r2 {
    private final Object zza = new Object();
    private final s2 zzb;
    private final zzbtk zzc;

    public zzdmz(s2 s2Var, zzbtk zzbtkVar) {
        this.zzb = s2Var;
        this.zzc = zzbtkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzf() {
        zzbtk zzbtkVar = this.zzc;
        if (zzbtkVar != null) {
            return zzbtkVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzg() {
        zzbtk zzbtkVar = this.zzc;
        if (zzbtkVar != null) {
            return zzbtkVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final v2 zzi() {
        synchronized (this.zza) {
            s2 s2Var = this.zzb;
            if (s2Var == null) {
                return null;
            }
            return s2Var.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzj(boolean z10) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzm(v2 v2Var) {
        synchronized (this.zza) {
            s2 s2Var = this.zzb;
            if (s2Var != null) {
                s2Var.zzm(v2Var);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final boolean zzq() {
        throw new RemoteException();
    }
}
