package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgcr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zza(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
