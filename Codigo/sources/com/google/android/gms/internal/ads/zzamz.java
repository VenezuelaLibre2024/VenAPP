package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzamz {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[RecognitionOptions.ITF];
    private boolean zze;

    public zzamz(int i10) {
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (this.zze) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i13 = this.zza + i12;
            if (length < i13) {
                this.zzc = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.zzc, this.zza, i12);
            this.zza += i12;
        }
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzc(int i10, int i11) {
        if (this.zze) {
            int i12 = this.zza - i11;
            this.zza = i12;
            if (this.zzb != 0 || i10 != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i12;
        } else if (i10 == 179) {
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
