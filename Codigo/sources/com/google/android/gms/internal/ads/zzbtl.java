package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.v2;

/* loaded from: classes2.dex */
public final class zzbtl extends r2 {
    private final Object zza = new Object();
    private volatile v2 zzb;

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzf() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final float zzg() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.s2
    public final v2 zzi() {
        v2 v2Var;
        synchronized (this.zza) {
            v2Var = this.zzb;
        }
        return v2Var;
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
            this.zzb = v2Var;
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
