package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzanb {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[RecognitionOptions.ITF];
    private boolean zze;
    private int zzf;

    public zzanb(int i10) {
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
        this.zzf = 0;
    }

    public final boolean zzc(int i10, int i11) {
        int i12 = this.zzf;
        if (i12 != 0) {
            if (i12 == 1) {
                if (i10 == 181) {
                    this.zzf = 2;
                }
                zzff.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i12 == 2) {
                if (i10 <= 31) {
                    this.zzf = 3;
                }
                zzff.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i12 == 3) {
                if ((i10 & 240) == 32) {
                    this.zzb = this.zza;
                    this.zzf = 4;
                }
                zzff.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i10 == 179 || i10 == 181) {
                this.zza -= i11;
                this.zze = false;
                return true;
            }
        } else if (i10 == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
