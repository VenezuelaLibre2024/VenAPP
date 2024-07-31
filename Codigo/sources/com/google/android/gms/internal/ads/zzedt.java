package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzedt extends zzedw {
    private zzbyi zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedt(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = t.v().b();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzedw, com.google.android.gms.common.internal.c.a
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zzf(this.zzh, new zzedv(this));
            } catch (Throwable th2) {
                t.q().zzw(th2, "RemoteAdsServiceSignalClientTask.onConnected");
                this.zza.zzd(th2);
            }
        } catch (RemoteException unused) {
            this.zza.zzd(new zzecf(1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedw, com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    public final synchronized com.google.common.util.concurrent.f zza(zzbyi zzbyiVar, long j10) {
        if (this.zzb) {
            return zzgen.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbyiVar;
        zzb();
        com.google.common.util.concurrent.f zzo = zzgen.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // java.lang.Runnable
            public final void run() {
                zzedt.this.zzc();
            }
        }, zzcep.zzf);
        return zzo;
    }
}
