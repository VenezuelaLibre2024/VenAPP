package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzebo extends zzebq {
    public zzebo(Context context) {
        this.zzf = new zzbye(context, t.v().b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzebq, com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        zzceu zzceuVar;
        zzecf zzecfVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzebp(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzceuVar = this.zza;
                    zzecfVar = new zzecf(1);
                    zzceuVar.zzd(zzecfVar);
                } catch (Throwable th2) {
                    t.q().zzw(th2, "RemoteAdRequestClientTask.onConnected");
                    zzceuVar = this.zza;
                    zzecfVar = new zzecf(1);
                    zzceuVar.zzd(zzecfVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebq, com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        zzcec.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzecf(1));
    }
}
