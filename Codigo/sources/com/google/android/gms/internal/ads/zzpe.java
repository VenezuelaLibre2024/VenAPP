package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpe {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpe zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzpe zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzpe zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzpg zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpg(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
