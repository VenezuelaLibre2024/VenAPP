package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public final class zzfs {
    private zzfv zza;
    private Integer zzb;
    private zzol zzc;

    public final zzfs zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final zzfs zzb(zzol zzolVar) {
        this.zzc = zzolVar;
        return this;
    }

    public final zzfs zzc(zzfv zzfvVar) {
        this.zza = zzfvVar;
        return this;
    }

    public final zzfx zze() {
        return new zzfx(this, null);
    }
}
