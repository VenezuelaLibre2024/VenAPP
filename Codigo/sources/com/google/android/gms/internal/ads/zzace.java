package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzace {
    public static final zzace zza = new zzace(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzace(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzace zzd(long j10, long j11) {
        return new zzace(-1, j10, j11);
    }

    public static zzace zze(long j10) {
        return new zzace(0, -9223372036854775807L, j10);
    }

    public static zzace zzf(long j10, long j11) {
        return new zzace(-2, j10, j11);
    }
}
