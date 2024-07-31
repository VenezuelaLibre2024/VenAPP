package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzfra implements c.a, c.b {
    protected final zzfry zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfqr zzf;
    private final long zzg;
    private final int zzh;

    public zzfra(Context context, int i10, int i11, String str, String str2, String str3, zzfqr zzfqrVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfqrVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfry zzfryVar = new zzfry(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfryVar;
        this.zzd = new LinkedBlockingQueue();
        zzfryVar.checkAvailabilityAndConnect();
    }

    static zzfsk zza() {
        return new zzfsk(null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        zzfsd zzd = zzd();
        if (zzd != null) {
            try {
                zzfsk zzf = zzd.zzf(new zzfsi(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ca.b bVar) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfsk zzb(int i10) {
        zzfsk zzfskVar;
        try {
            zzfskVar = (zzfsk) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfskVar = null;
        }
        zze(3004, this.zzg, null);
        if (zzfskVar != null) {
            zzfqr.zzg(zzfskVar.zzc == 7 ? 3 : 2);
        }
        return zzfskVar == null ? zza() : zzfskVar;
    }

    public final void zzc() {
        zzfry zzfryVar = this.zza;
        if (zzfryVar != null) {
            if (zzfryVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfsd zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
