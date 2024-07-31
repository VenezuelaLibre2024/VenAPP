package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfd extends zzff {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfd(InputStream inputStream, int i10, zzfc zzfcVar) {
        super(null);
        this.zzl = a.e.API_PRIORITY_OTHER;
        byte[] bArr = zzgw.zzd;
        this.zze = inputStream;
        this.zzf = new byte[RecognitionOptions.AZTEC];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw zzgy.zzj();
                }
                this.zzk += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzK(int i10) {
        if (zzL(i10)) {
            return;
        }
        if (i10 <= (a.e.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzgy.zzj();
        }
        throw zzgy.zzi();
    }

    private final boolean zzL(int i10) {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.zzk;
        if (i10 > (a.e.API_PRIORITY_OTHER - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (a.e.API_PRIORITY_OTHER - i14) - i13));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzJ();
            if (this.zzg >= i10) {
                return true;
            }
            return zzL(i10);
        } catch (zzgy e10) {
            e10.zzk();
            throw e10;
        }
    }

    private final byte[] zzM(int i10, boolean z10) {
        byte[] zzN = zzN(i10);
        if (zzN != null) {
            return zzN;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i10) {
        if (i10 == 0) {
            return zzgw.zzd;
        }
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw zzgy.zzi();
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzB((i14 - i11) - i12);
            throw zzgy.zzj();
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zze.available()) {
                    return null;
                }
            } catch (zzgy e10) {
                e10.zzk();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int read = this.zze.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw zzgy.zzj();
                }
                this.zzk += read;
                i15 += read;
            } catch (zzgy e11) {
                e11.zzk();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzA(int i10) {
        this.zzl = i10;
        zzJ();
    }

    public final void zzB(int i10) {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzB((i16 - i14) - i12);
            throw zzgy.zzj();
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long skip = this.zze.skip(j10);
                    if (skip < 0 || skip > j10) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i13 += (int) skip;
                    }
                } catch (zzgy e10) {
                    e10.zzk();
                    throw e10;
                }
            } finally {
                this.zzk += i13;
                zzJ();
            }
        }
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        while (true) {
            zzK(1);
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzE(int i10) {
        int zzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw zzgy.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzgy.zze();
            return true;
        }
        if (i11 == 1) {
            zzB(8);
            return true;
        }
        if (i11 == 2) {
            zzB(zzj());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzgy.zza();
            }
            zzB(4);
            return true;
        }
        do {
            zzm = zzm();
            if (zzm == 0) {
                break;
            }
        } while (zzE(zzm));
        zzz(((i10 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zze(int i10) {
        if (i10 < 0) {
            throw zzgy.zzf();
        }
        int i11 = this.zzk + this.zzi;
        int i12 = this.zzl;
        int i13 = i10 + i11;
        if (i13 > i12) {
            throw zzgy.zzj();
        }
        this.zzl = i13;
        zzJ();
        return i12;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzK(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzi = r1
            return r0
        L6d:
            long r0 = r5.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfd.zzj():int");
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzl() {
        return zzff.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzgy.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzK(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = i18 ^ (bArr[i14] << 28);
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.zzi = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzi = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzi = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzi = i14;
                return j11;
            }
        }
        return zzs();
    }

    final long zzs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zza() & 128) == 0) {
                return j10;
            }
        }
        throw zzgy.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzu() {
        return zzff.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final zzez zzw() {
        int zzj = zzj();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzj <= i10 - i11 && zzj > 0) {
            zzez zzm = zzez.zzm(this.zzf, i11, zzj);
            this.zzi += zzj;
            return zzm;
        }
        if (zzj == 0) {
            return zzez.zzb;
        }
        byte[] zzN = zzN(zzj);
        if (zzN != null) {
            return zzez.zzm(zzN, 0, zzN.length);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(zzj - i14);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return new zzew(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzj <= i10 - i11) {
                String str = new String(this.zzf, i11, zzj, zzgw.zzb);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj > this.zzg) {
            return new String(zzM(zzj, false), zzgw.zzb);
        }
        zzK(zzj);
        String str2 = new String(this.zzf, this.zzi, zzj, zzgw.zzb);
        this.zzi += zzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzy() {
        byte[] zzM;
        int zzj = zzj();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzj <= i11 - i10 && zzj > 0) {
            zzM = this.zzf;
            this.zzi = i10 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            i10 = 0;
            if (zzj <= i11) {
                zzK(zzj);
                zzM = this.zzf;
                this.zzi = zzj;
            } else {
                zzM = zzM(zzj, false);
            }
        }
        return zzju.zzd(zzM, i10, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzz(int i10) {
        if (this.zzj != i10) {
            throw zzgy.zzb();
        }
    }
}
