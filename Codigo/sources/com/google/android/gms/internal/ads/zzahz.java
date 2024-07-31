package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
final class zzahz {
    private final zzfp zza = new zzfp(8);
    private int zzb;

    private final long zzb(zzacv zzacvVar) {
        int i10;
        zzack zzackVar = (zzack) zzacvVar;
        int i11 = 0;
        zzackVar.zzm(this.zza.zzM(), 0, 1, false);
        int i12 = this.zza.zzM()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = RecognitionOptions.ITF;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzackVar.zzm(this.zza.zzM(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (this.zza.zzM()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzacv zzacvVar) {
        long zzd = zzacvVar.zzd();
        long j10 = 1024;
        if (zzd != -1 && zzd <= 1024) {
            j10 = zzd;
        }
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(this.zza.zzM(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzackVar.zzm(this.zza.zzM(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzM()[0] & 255);
        }
        long zzb = zzb(zzacvVar);
        long j11 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j12 = j11 + zzb;
            if (zzd == -1 || j12 < zzd) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzacvVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzacvVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i12 = (int) zzb2;
                            zzackVar.zzl(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
