package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzia extends zzib {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzia(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
        this.zze = z10;
    }

    private final void zzaa() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    private final void zzf(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzji.zzh();
        }
        throw zzji.zzf();
    }

    private final byte zzv() {
        int i10 = this.zzh;
        if (i10 == this.zzf) {
            throw zzji.zzh();
        }
        byte[] bArr = this.zzd;
        this.zzh = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw zzji.zzh();
        }
        byte[] bArr = this.zzd;
        this.zzh = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzx() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzh = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzh = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzia.zzx():int");
    }

    private final long zzy() {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw zzji.zzh();
        }
        byte[] bArr = this.zzd;
        this.zzh = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzz() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzia.zzz():long");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zza(int i10) {
        if (i10 < 0) {
            throw zzji.zzf();
        }
        int zzc = i10 + zzc();
        if (zzc < 0) {
            throw zzji.zzg();
        }
        int i11 = this.zzk;
        if (zzc > i11) {
            throw zzji.zzh();
        }
        this.zzk = zzc;
        zzaa();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final void zzb(int i10) {
        if (this.zzj != i10) {
            throw zzji.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final void zzc(int i10) {
        this.zzk = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzd() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean zzd(int i10) {
        int zzi;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zzv() < 0) {
                        i12++;
                    }
                }
                throw zzji.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zzd;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzji.zze();
            return true;
        }
        if (i11 == 1) {
            zzf(8);
            return true;
        }
        if (i11 == 2) {
            zzf(zzx());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzji.zza();
            }
            zzf(4);
            return true;
        }
        do {
            zzi = zzi();
            if (zzi == 0) {
                break;
            }
        } while (zzd(zzi));
        zzb(((i10 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzg() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzh() {
        return zzib.zze(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzi() {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzj = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzji.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzk() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzl() {
        return zzz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzm() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzv() & 128) == 0) {
                return j10;
            }
        }
        throw zzji.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzn() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzo() {
        return zzib.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final long zzp() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final zzhm zzq() {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzx <= i10 - i11) {
                zzhm zza = zzhm.zza(this.zzd, i11, zzx);
                this.zzh += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzhm.zza;
        }
        if (zzx > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (zzx <= i12 - i13) {
                int i14 = zzx + i13;
                this.zzh = i14;
                bArr = Arrays.copyOfRange(this.zzd, i13, i14);
                return zzhm.zza(bArr);
            }
        }
        if (zzx > 0) {
            throw zzji.zzh();
        }
        if (zzx != 0) {
            throw zzji.zzf();
        }
        bArr = zziz.zzb;
        return zzhm.zza(bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final String zzr() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzx <= i10 - i11) {
                String str = new String(this.zzd, i11, zzx, zziz.zza);
                this.zzh += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzji.zzf();
        }
        throw zzji.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final String zzs() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzx <= i10 - i11) {
                String zzb = zzmh.zzb(this.zzd, i11, zzx);
                this.zzh += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzji.zzf();
        }
        throw zzji.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean zzt() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final boolean zzu() {
        return zzz() != 0;
    }
}
