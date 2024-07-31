package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgyw extends zzgza {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyw(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzH() {
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzI(byte b10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzJ(int i10, boolean z10) {
        zzs(i10 << 3);
        zzI(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzK(int i10, zzgyl zzgylVar) {
        zzs((i10 << 3) | 2);
        zzs(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgza, com.google.android.gms.internal.ads.zzgya
    public final void zza(byte[] bArr, int i10, int i11) {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzh(int i10, int i11) {
        zzs((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzi(int i10) {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzj(int i10, long j10) {
        zzs((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzk(long j10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzl(int i10, int i11) {
        zzs(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzn(int i10, zzhbe zzhbeVar, zzhby zzhbyVar) {
        zzs((i10 << 3) | 2);
        zzs(((zzgxt) zzhbeVar).zzat(zzhbyVar));
        zzhbyVar.zzm(zzhbeVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzo(int i10, String str) {
        zzs((i10 << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) {
        int i10 = this.zzc;
        try {
            int zzz = zzgza.zzz(str.length() * 3);
            int zzz2 = zzgza.zzz(str.length());
            if (zzz2 != zzz) {
                zzs(zzhde.zze(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzhde.zzd(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + zzz2;
            this.zzc = i12;
            int zzd = zzhde.zzd(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzs((zzd - i10) - zzz2);
            this.zzc = zzd;
        } catch (zzhdd e10) {
            this.zzc = i10;
            zzD(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgyx(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzq(int i10, int i11) {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzr(int i10, int i11) {
        zzs(i10 << 3);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzs(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) ((i10 | RecognitionOptions.ITF) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzt(int i10, long j10) {
        zzs(i10 << 3);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzu(long j10) {
        boolean z10;
        z10 = zzgza.zzb;
        if (!z10 || this.zzb - this.zzc < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | RecognitionOptions.ITF) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
                }
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzhcz.zzq(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzhcz.zzq(bArr4, i14, (byte) ((i12 | RecognitionOptions.ITF) & 255));
            j10 >>>= 7;
        }
    }
}
