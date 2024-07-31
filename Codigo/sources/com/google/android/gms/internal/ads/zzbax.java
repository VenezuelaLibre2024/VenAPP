package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbax {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbat(this);
    private final Object zzc = new Object();
    private zzbba zzd;
    private Context zze;
    private zzbbd zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzbax zzbaxVar) {
        synchronized (zzbaxVar.zzc) {
            zzbba zzbbaVar = zzbaxVar.zzd;
            if (zzbbaVar == null) {
                return;
            }
            if (zzbbaVar.isConnected() || zzbaxVar.zzd.isConnecting()) {
                zzbaxVar.zzd.disconnect();
            }
            zzbaxVar.zzd = null;
            zzbaxVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbba zzd = zzd(new zzbav(this), new zzbaw(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbbb zzbbbVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzbbbVar);
                } catch (RemoteException e10) {
                    zzcec.zzh("Unable to call into cache service.", e10);
                }
            }
            return -2L;
        }
    }

    public final zzbay zzb(zzbbb zzbbbVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbay();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbbbVar);
                }
                return this.zzf.zzf(zzbbbVar);
            } catch (RemoteException e10) {
                zzcec.zzh("Unable to call into cache service.", e10);
                return new zzbay();
            }
        }
    }

    protected final synchronized zzbba zzd(c.a aVar, c.b bVar) {
        return new zzbba(this.zze, t.v().b(), aVar, bVar);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) a0.c().zza(zzbgc.zzef)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) a0.c().zza(zzbgc.zzee)).booleanValue()) {
                    t.d().zzc(new zzbau(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) a0.c().zza(zzbgc.zzeg)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcep.zzd.schedule(this.zzb, ((Long) a0.c().zza(zzbgc.zzeh)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
