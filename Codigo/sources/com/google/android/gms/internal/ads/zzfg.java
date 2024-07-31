package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfg {
    private int zza;
    private long[] zzb;

    public zzfg() {
        this(32);
    }

    public zzfg(int i10) {
        this.zzb = new long[32];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i10) {
        if (i10 >= 0 && i10 < this.zza) {
            return this.zzb[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.zza);
    }

    public final void zzc(long j10) {
        int i10 = this.zza;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.zzb;
        int i11 = this.zza;
        this.zza = i11 + 1;
        jArr2[i11] = j10;
    }
}
