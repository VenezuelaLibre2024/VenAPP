package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzebs extends zzebq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebs(Context context) {
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
                    this.zzf.zzp().zzf(this.zze, new zzebp(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzceuVar = this.zza;
                    zzecfVar = new zzecf(1);
                    zzceuVar.zzd(zzecfVar);
                } catch (Throwable th2) {
                    t.q().zzw(th2, "RemoteSignalsClientTask.onConnected");
                    zzceuVar = this.zza;
                    zzecfVar = new zzecf(1);
                    zzceuVar.zzd(zzecfVar);
                }
            }
        }
    }

    public final com.google.common.util.concurrent.f zzb(zzbze zzbzeVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbzeVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebr
                @Override // java.lang.Runnable
                public final void run() {
                    zzebs.this.zza();
                }
            }, zzcep.zzf);
            return this.zza;
        }
    }
}
