package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaom {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzfp zzfpVar, int i10, int i11) {
        zzfpVar.zzK(i10);
        if (zzfpVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzfpVar.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i11 || (zzg & 32) == 0 || zzfpVar.zzm() < 7 || zzfpVar.zzb() < 7 || (zzfpVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfpVar.zzG(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
    }
}
