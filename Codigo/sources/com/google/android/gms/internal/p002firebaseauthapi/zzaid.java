package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaid extends zzaia {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private zzaid(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
        this.zzf = z10;
    }

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzf(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzaji.zzi();
        }
        throw zzaji.zzf();
    }

    private final byte zzv() {
        int i10 = this.zzi;
        if (i10 == this.zzg) {
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 4;
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
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzi = r3
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
            r5.zzi = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaid.zzx():int");
    }

    private final long zzy() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            throw zzaji.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 8;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaid.zzz():long");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzb(int i10) {
        if (i10 < 0) {
            throw zzaji.zzf();
        }
        int zzc = i10 + zzc();
        if (zzc < 0) {
            throw zzaji.zzg();
        }
        int i11 = this.zzl;
        if (zzc > i11) {
            throw zzaji.zzi();
        }
        this.zzl = zzc;
        zzaa();
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzc() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzc(int i10) {
        if (this.zzk != i10) {
            throw zzaji.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzd() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final void zzd(int i10) {
        this.zzl = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final boolean zze(int i10) {
        int zzi;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzv() < 0) {
                        i12++;
                    }
                }
                throw zzaji.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzaji.zze();
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
                throw zzaji.zza();
            }
            zzf(4);
            return true;
        }
        do {
            zzi = zzi();
            if (zzi == 0) {
                break;
            }
        } while (zze(zzi));
        zzc(((i10 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzg() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzh() {
        return zzaia.zza(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzi() {
        if (zzt()) {
            this.zzk = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzk = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzaji.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzk() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzl() {
        return zzz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzm() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzv() & 128) == 0) {
                return j10;
            }
        }
        throw zzaji.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzn() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzo() {
        return zzaia.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final long zzp() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final zzahp zzq() {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                zzahp zza = zzahp.zza(this.zze, i11, zzx);
                this.zzi += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzahp.zza;
        }
        if (zzx > 0) {
            int i12 = this.zzg;
            int i13 = this.zzi;
            if (zzx <= i12 - i13) {
                int i14 = zzx + i13;
                this.zzi = i14;
                bArr = Arrays.copyOfRange(this.zze, i13, i14);
                return zzahp.zzb(bArr);
            }
        }
        if (zzx > 0) {
            throw zzaji.zzi();
        }
        if (zzx != 0) {
            throw zzaji.zzf();
        }
        bArr = zzajf.zzb;
        return zzahp.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final String zzr() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String str = new String(this.zze, i11, zzx, zzajf.zza);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final String zzs() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String zzb = zzaml.zzb(this.zze, i11, zzx);
                this.zzi += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzaji.zzf();
        }
        throw zzaji.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final boolean zzt() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaia
    public final boolean zzu() {
        return zzz() != 0;
    }
}
