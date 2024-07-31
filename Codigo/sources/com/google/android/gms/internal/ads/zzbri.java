package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.f0;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzbri extends zzcfb {
    private final f0 zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbri(f0 f0Var) {
        this.zzb = f0Var;
    }

    public final zzbrd zza() {
        zzbrd zzbrdVar = new zzbrd(this);
        u1.a("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("createNewReference: Lock acquired");
            zzi(new zzbre(this, zzbrdVar), new zzbrf(this, zzbrdVar));
            s.n(this.zzd >= 0);
            this.zzd++;
        }
        u1.a("createNewReference: Lock released");
        return zzbrdVar;
    }

    public final void zzb() {
        u1.a("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("markAsDestroyable: Lock acquired");
            s.n(this.zzd >= 0);
            u1.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        u1.a("markAsDestroyable: Lock released");
    }

    protected final void zzc() {
        u1.a("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("maybeDestroy: Lock acquired");
            s.n(this.zzd >= 0);
            if (this.zzc && this.zzd == 0) {
                u1.a("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbrh(this), new zzcex());
            } else {
                u1.a("There are still references to the engine. Not destroying.");
            }
        }
        u1.a("maybeDestroy: Lock released");
    }

    public final void zzd() {
        u1.a("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            u1.a("releaseOneReference: Lock acquired");
            s.n(this.zzd > 0);
            u1.a("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        u1.a("releaseOneReference: Lock released");
    }
}
