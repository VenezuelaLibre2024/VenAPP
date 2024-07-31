package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.e0;

/* loaded from: classes2.dex */
public final class zzeqi implements com.google.android.gms.ads.internal.client.a, zzdiu {
    private e0 zza;

    @Override // com.google.android.gms.ads.internal.client.a
    public final synchronized void onAdClicked() {
        e0 e0Var = this.zza;
        if (e0Var != null) {
            try {
                e0Var.zzb();
            } catch (RemoteException e10) {
                zzcec.zzk("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(e0 e0Var) {
        this.zza = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final synchronized void zzbo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final synchronized void zzs() {
        e0 e0Var = this.zza;
        if (e0Var != null) {
            try {
                e0Var.zzb();
            } catch (RemoteException e10) {
                zzcec.zzk("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}
