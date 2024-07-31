package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class zzaf {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzaf zza(int i10) {
        zzek.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzah zzb() {
        zzek.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}
