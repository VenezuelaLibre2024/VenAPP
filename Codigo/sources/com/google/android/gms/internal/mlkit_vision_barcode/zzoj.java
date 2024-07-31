package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes2.dex */
public final class zzoj {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzoj zza(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzb(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzd(Long l10) {
        this.zze = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zze(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoj zzf(Long l10) {
        this.zzf = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzol zzg() {
        return new zzol(this, null);
    }
}
