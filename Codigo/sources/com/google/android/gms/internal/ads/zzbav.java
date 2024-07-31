package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbav implements c.a {
    final /* synthetic */ zzbax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbav(zzbax zzbaxVar) {
        this.zza = zzbaxVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbba zzbbaVar;
        zzbba zzbbaVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbax zzbaxVar = this.zza;
                zzbbaVar = zzbaxVar.zzd;
                if (zzbbaVar != null) {
                    zzbbaVar2 = zzbaxVar.zzd;
                    zzbaxVar.zzf = zzbbaVar2.zzq();
                }
            } catch (DeadObjectException e10) {
                zzcec.zzh("Unable to obtain a cache service instance.", e10);
                zzbax.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
