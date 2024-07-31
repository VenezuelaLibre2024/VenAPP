package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class zzacy {
    public static int zza(zzacv zzacvVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzacvVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) {
        if (!z10) {
            throw zzcc.zza(str, null);
        }
    }

    public static boolean zzc(zzacv zzacvVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return zzacvVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzacv zzacvVar, byte[] bArr, int i10, int i11) {
        try {
            ((zzack) zzacvVar).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacv zzacvVar, int i10) {
        try {
            ((zzack) zzacvVar).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
