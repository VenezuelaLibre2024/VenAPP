package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcax implements n9.b {
    private final zzcak zza;

    public zzcax(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    @Override // n9.b
    public final int getAmount() {
        zzcak zzcakVar = this.zza;
        if (zzcakVar != null) {
            try {
                return zzcakVar.zze();
            } catch (RemoteException e10) {
                zzcec.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // n9.b
    public final String getType() {
        zzcak zzcakVar = this.zza;
        if (zzcakVar != null) {
            try {
                return zzcakVar.zzf();
            } catch (RemoteException e10) {
                zzcec.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
