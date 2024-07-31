package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhcq {
    private static final zzhcq zza = new zzhcq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhcq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhcq(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzhcq zzc() {
        return zza;
    }

    public static zzhcq zze(zzhcq zzhcqVar, zzhcq zzhcqVar2) {
        int i10 = zzhcqVar.zzb + zzhcqVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhcqVar.zzc, i10);
        System.arraycopy(zzhcqVar2.zzc, 0, copyOf, zzhcqVar.zzb, zzhcqVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhcqVar.zzd, i10);
        System.arraycopy(zzhcqVar2.zzd, 0, copyOf2, zzhcqVar.zzb, zzhcqVar2.zzb);
        return new zzhcq(i10, copyOf, copyOf2, true);
    }

    public static zzhcq zzf() {
        return new zzhcq(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhcq)) {
            return false;
        }
        zzhcq zzhcqVar = (zzhcq) obj;
        int i10 = this.zzb;
        if (i10 == zzhcqVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhcqVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhcqVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zzz;
        int zzA;
        int i10;
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.zzd[i13]).longValue();
                    i10 = zzgza.zzz(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zzgyl zzgylVar = (zzgyl) this.zzd[i13];
                    int zzz2 = zzgza.zzz(i17);
                    int zzd = zzgylVar.zzd();
                    i10 = zzz2 + zzgza.zzz(zzd) + zzd;
                } else if (i16 == 3) {
                    int zzz3 = zzgza.zzz(i15 << 3);
                    zzz = zzz3 + zzz3;
                    zzA = ((zzhcq) this.zzd[i13]).zza();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(zzhag.zza());
                    }
                    ((Integer) this.zzd[i13]).intValue();
                    i10 = zzgza.zzz(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i18 = i15 << 3;
                long longValue = ((Long) this.zzd[i13]).longValue();
                zzz = zzgza.zzz(i18);
                zzA = zzgza.zzA(longValue);
            }
            i10 = zzz + zzA;
            i12 += i10;
        }
        this.zze = i12;
        return i12;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12] >>> 3;
            zzgyl zzgylVar = (zzgyl) this.zzd[i12];
            int zzz = zzgza.zzz(8);
            int zzz2 = zzgza.zzz(16) + zzgza.zzz(i13);
            int zzz3 = zzgza.zzz(24);
            int zzd = zzgylVar.zzd();
            i11 += zzz + zzz + zzz2 + zzz3 + zzgza.zzz(zzd) + zzd;
        }
        this.zze = i11;
        return i11;
    }

    public final zzhcq zzd(zzhcq zzhcqVar) {
        if (zzhcqVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzhcqVar.zzb;
        zzl(i10);
        System.arraycopy(zzhcqVar.zzc, 0, this.zzc, this.zzb, zzhcqVar.zzb);
        System.arraycopy(zzhcqVar.zzd, 0, this.zzd, this.zzb, zzhcqVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhbg.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final void zzj(int i10, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzgzb zzgzbVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzgzbVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzgzbVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzgzbVar.zzd(i13, (zzgyl) obj);
                } else if (i12 == 3) {
                    zzgzbVar.zzE(i13);
                    ((zzhcq) obj).zzk(zzgzbVar);
                    zzgzbVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzhag.zza());
                    }
                    zzgzbVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
