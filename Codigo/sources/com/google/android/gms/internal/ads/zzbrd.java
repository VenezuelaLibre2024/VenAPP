package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzbrd extends zzcfb {
    private final Object zza = new Object();
    private final zzbri zzb;
    private boolean zzc;

    public zzbrd(zzbri zzbriVar) {
        this.zzb = zzbriVar;
    }

    public final void zzb() {
        u1.a("release: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("release: Lock acquired");
            if (this.zzc) {
                u1.a("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzi(new zzbra(this), new zzcex());
            zzi(new zzbrb(this), new zzbrc(this));
            u1.a("release: Lock released");
        }
    }
}
