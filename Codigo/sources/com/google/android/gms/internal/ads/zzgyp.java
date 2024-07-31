package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgyp extends zzgyt {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyp(Iterable iterable, int i10, boolean z10, zzgyo zzgyoVar) {
        super(null);
        this.zzj = a.e.API_PRIORITY_OTHER;
        this.zzh = i10;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 != 0) {
            zzN();
            return;
        }
        this.zzg = zzhae.zze;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzJ() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzK() {
        if (!this.zzf.hasNext()) {
            throw zzhag.zzj();
        }
        zzN();
    }

    private final void zzL(byte[] bArr, int i10, int i11) {
        if (i11 > zzJ()) {
            if (i11 > 0) {
                throw zzhag.zzj();
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzK();
            }
            int min = Math.min(i12, (int) (this.zzo - this.zzm));
            long j10 = min;
            zzhcz.zzo(this.zzm, bArr, i11 - i12, j10);
            i12 -= min;
            this.zzm += j10;
        }
    }

    private final void zzM() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    private final void zzN() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhcz.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzA(int i10) {
        this.zzj = i10;
        zzM();
    }

    public final void zzB(int i10) {
        if (i10 >= 0) {
            if (i10 <= ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
                while (i10 > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzK();
                    }
                    int min = Math.min(i10, (int) (this.zzo - this.zzm));
                    i10 -= min;
                    this.zzm += min;
                }
                return;
            }
        }
        if (i10 >= 0) {
            throw zzhag.zzj();
        }
        throw zzhag.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzC() {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzE(int i10) {
        int zzm;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (zza() >= 0) {
                    return true;
                }
            }
            throw zzhag.zze();
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
                throw zzhag.zza();
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
        if (this.zzo - this.zzm == 0) {
            zzK();
        }
        long j10 = this.zzm;
        this.zzm = 1 + j10;
        return zzhcz.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzd() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zze(int i10) {
        if (i10 < 0) {
            throw zzhag.zzf();
        }
        int zzd = i10 + zzd();
        int i11 = this.zzj;
        if (zzd > i11) {
            throw zzhag.zzj();
        }
        this.zzj = zzd;
        zzM();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 < 4) {
            int zza = zza() & 255;
            int zza2 = (zza() & 255) << 8;
            return zza | zza2 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
        }
        this.zzm = 4 + j11;
        int zza3 = zzhcz.zza(j11) & 255;
        int zza4 = (zzhcz.zza(1 + j11) & 255) << 8;
        return zza3 | zza4 | ((zzhcz.zza(2 + j11) & 255) << 16) | ((zzhcz.zza(j11 + 3) & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzhcz.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhcz.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhcz.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyp.zzj():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzl() {
        return zzgyt.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzm() {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzhag.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        long j10 = this.zzo;
        long j11 = this.zzm;
        if (j10 - j11 < 8) {
            return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
        }
        this.zzm = 8 + j11;
        long zza = zzhcz.zza(j11) & 255;
        long zza2 = (zzhcz.zza(1 + j11) & 255) << 8;
        long zza3 = (zzhcz.zza(j11 + 2) & 255) << 16;
        long zza4 = (zzhcz.zza(3 + j11) & 255) << 24;
        long zza5 = (zzhcz.zza(j11 + 4) & 255) << 32;
        return zza5 | zza | zza2 | zza3 | zza4 | ((zzhcz.zza(j11 + 5) & 255) << 40) | ((zzhcz.zza(j11 + 6) & 255) << 48) | ((zzhcz.zza(j11 + 7) & 255) << 56);
    }

    public final long zzr() {
        long zza;
        long j10;
        long j11;
        int i10;
        long j12 = this.zzm;
        if (this.zzo != j12) {
            long j13 = j12 + 1;
            byte zza2 = zzhcz.zza(j12);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            }
            if (this.zzo - this.zzm >= 10) {
                long j14 = j13 + 1;
                int zza3 = zza2 ^ (zzhcz.zza(j13) << 7);
                if (zza3 >= 0) {
                    long j15 = j14 + 1;
                    int zza4 = zza3 ^ (zzhcz.zza(j14) << 14);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int zza5 = zza4 ^ (zzhcz.zza(j15) << 21);
                        if (zza5 < 0) {
                            i10 = zza5 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long zza6 = zza5 ^ (zzhcz.zza(j14) << 28);
                            if (zza6 < 0) {
                                long j16 = j15 + 1;
                                long zza7 = zza6 ^ (zzhcz.zza(j15) << 35);
                                if (zza7 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    zza6 = zza7 ^ (zzhcz.zza(j16) << 42);
                                    if (zza6 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        zza7 = zza6 ^ (zzhcz.zza(j15) << 49);
                                        if (zza7 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            zza = (zza7 ^ (zzhcz.zza(j16) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j17 = 1 + j15;
                                                if (zzhcz.zza(j15) >= 0) {
                                                    j14 = j17;
                                                    this.zzm = j14;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j10;
                                j14 = j16;
                                this.zzm = j14;
                                return zza;
                            }
                            j11 = 266354560;
                            zza = zza6 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.zzm = j14;
                    return zza;
                }
                i10 = zza3 ^ (-128);
                zza = i10;
                this.zzm = j14;
                return zza;
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
        throw zzhag.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzu() {
        return zzgyt.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final zzgyl zzw() {
        int zzj = zzj();
        if (zzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzj;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzj];
                zzhcz.zzo(j11, bArr, 0L, j12);
                this.zzm += j12;
                return new zzgyh(bArr);
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return new zzgyh(bArr2);
        }
        if (zzj == 0) {
            return zzgyl.zzb;
        }
        if (zzj < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzj;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[zzj];
                zzhcz.zzo(j11, bArr, 0L, j12);
                String str = new String(bArr, zzhae.zzb);
                this.zzm += j12;
                return str;
            }
        }
        if (zzj > 0 && zzj <= zzJ()) {
            byte[] bArr2 = new byte[zzj];
            zzL(bArr2, 0, zzj);
            return new String(bArr2, zzhae.zzb);
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            long j10 = this.zzo;
            long j11 = this.zzm;
            long j12 = zzj;
            if (j12 <= j10 - j11) {
                String zzg = zzhde.zzg(this.zzg, (int) (j11 - this.zzn), zzj);
                this.zzm += j12;
                return zzg;
            }
        }
        if (zzj >= 0 && zzj <= zzJ()) {
            byte[] bArr = new byte[zzj];
            zzL(bArr, 0, zzj);
            return zzhde.zzh(bArr, 0, zzj);
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzhag.zzf();
        }
        throw zzhag.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzz(int i10) {
        if (this.zzk != i10) {
            throw zzhag.zzb();
        }
    }
}
