package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfh {
    private long[] zza;

    public zzfh() {
        this(16);
    }

    public zzfh(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i11 = highestOneBit + highestOneBit;
        }
        this.zza = new long[i11];
    }
}
