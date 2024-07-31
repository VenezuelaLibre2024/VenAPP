package com.google.android.gms.internal.ads;

import g9.w;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcxc implements w {
    private final zzdce zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcxc(zzdce zzdceVar) {
        this.zza = zzdceVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // g9.w
    public final void zzbA() {
        this.zza.zzc();
    }

    @Override // g9.w
    public final void zzbC() {
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        this.zzb.set(true);
        zzh();
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
