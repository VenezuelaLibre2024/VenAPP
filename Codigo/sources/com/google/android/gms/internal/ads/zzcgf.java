package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.j2;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcgf {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) a0.c().zza(zzbgc.zzD)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcfq zzcfqVar) {
        if (zzcfqVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j10 = timestamp - this.zzb;
            if (Math.abs(j10) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
            @Override // java.lang.Runnable
            public final void run() {
                zzcfq.this.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
