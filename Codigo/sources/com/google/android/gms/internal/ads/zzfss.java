package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final class zzfss {
    final /* synthetic */ zzfst zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfss(zzfst zzfstVar, byte[] bArr, zzfsr zzfsrVar) {
        this.zza = zzfstVar;
        this.zzb = bArr;
    }

    public final zzfss zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfss zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfst zzfstVar = this.zza;
            if (zzfstVar.zzb) {
                zzfstVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
