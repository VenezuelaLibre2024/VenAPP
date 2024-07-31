package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgct {
    public static char zza(long j10) {
        char c10 = (char) j10;
        zzfxe.zzg(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static char zzb(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
