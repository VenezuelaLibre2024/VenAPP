package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzedq extends zzedw {
    private zzbym zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedq(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                this.zzd.zzp().zze(this.zzh, new zzedv(this));
            } catch (Throwable th2) {
                t.q().zzw(th2, "RemoteAdsServiceProxyClientTask.onConnected");
                this.zza.zzd(th2);
            }
        } catch (RemoteException unused) {
            this.zza.zzd(new zzecf(1));
        }
    }

    public final synchronized com.google.common.util.concurrent.f zza(zzbym zzbymVar, long j10) {
        if (this.zzb) {
            return zzgen.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbymVar;
        zzb();
        com.google.common.util.concurrent.f zzo = zzgen.zzo(this.zza, j10, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // java.lang.Runnable
            public final void run() {
                zzedq.this.zzc();
            }
        }, zzcep.zzf);
        return zzo;
    }
}
