package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;

/* loaded from: classes2.dex */
public final class zzebw extends zzebq {
    private String zzg;
    private int zzh = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebw(Context context) {
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
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzebp(this));
                    } else if (i10 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzebp(this));
                    } else {
                        this.zza.zzd(new zzecf(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzceuVar = this.zza;
                    zzecfVar = new zzecf(1);
                    zzceuVar.zzd(zzecfVar);
                } catch (Throwable th2) {
                    t.q().zzw(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
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

    public final com.google.common.util.concurrent.f zzb(zzbze zzbzeVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzgen.zzg(new zzecf(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbzeVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebu
                @Override // java.lang.Runnable
                public final void run() {
                    zzebw.this.zza();
                }
            }, zzcep.zzf);
            return this.zza;
        }
    }

    public final com.google.common.util.concurrent.f zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzgen.zzg(new zzecf(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebv
                @Override // java.lang.Runnable
                public final void run() {
                    zzebw.this.zza();
                }
            }, zzcep.zzf);
            return this.zza;
        }
    }
}
