package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaeb {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaea zzaeaVar, zzadz zzadzVar) {
        if (this.zzc > 0) {
            zzaeaVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzadzVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaea zzaeaVar, long j10, int i10, int i11, int i12, zzadz zzadzVar) {
        if (this.zzg > i11 + i12) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzaeaVar, zzadzVar);
            }
        }
    }

    public final void zzd(zzacv zzacvVar) {
        if (this.zzb) {
            return;
        }
        zzacvVar.zzh(this.zza, 0, 10);
        zzacvVar.zzj();
        byte[] bArr = this.zza;
        int i10 = zzabv.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
