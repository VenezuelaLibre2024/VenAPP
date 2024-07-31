package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public final class zzop {
    private zzoq zza;
    private Integer zzb;

    public final zzop zza(zzoq zzoqVar) {
        this.zza = zzoqVar;
        return this;
    }

    public final zzop zzb(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final zzos zzd() {
        return new zzos(this, null);
    }
}
