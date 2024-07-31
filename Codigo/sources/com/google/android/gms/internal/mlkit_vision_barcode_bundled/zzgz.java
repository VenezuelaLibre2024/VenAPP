package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgz(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgz zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgz zze(zzgz zzgzVar, zzgz zzgzVar2) {
        int i10 = zzgzVar.zzb + zzgzVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgzVar.zzc, i10);
        System.arraycopy(zzgzVar2.zzc, 0, copyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzVar.zzd, i10);
        System.arraycopy(zzgzVar2.zzd, 0, copyOf2, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgz zzf() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
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
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i10 = this.zzb;
        if (i10 == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
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
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    public final int zza() {
        int zzz;
        int zzy;
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
                    i10 = zzdj.zzy(i15 << 3) + 8;
                } else if (i16 == 2) {
                    zzdb zzdbVar = (zzdb) this.zzd[i13];
                    int i17 = zzdj.zzb;
                    int zzd = zzdbVar.zzd();
                    i10 = zzdj.zzy(i15 << 3) + zzdj.zzy(zzd) + zzd;
                } else if (i16 == 3) {
                    int i18 = i15 << 3;
                    int i19 = zzdj.zzb;
                    zzz = ((zzgz) this.zzd[i13]).zza();
                    int zzy2 = zzdj.zzy(i18);
                    zzy = zzy2 + zzy2;
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(zzeo.zza());
                    }
                    ((Integer) this.zzd[i13]).intValue();
                    i10 = zzdj.zzy(i15 << 3) + 4;
                }
                i12 += i10;
            } else {
                int i20 = i15 << 3;
                zzz = zzdj.zzz(((Long) this.zzd[i13]).longValue());
                zzy = zzdj.zzy(i20);
            }
            i10 = zzy + zzz;
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
            zzdb zzdbVar = (zzdb) this.zzd[i12];
            int i14 = zzdj.zzb;
            int zzd = zzdbVar.zzd();
            int zzy = zzdj.zzy(zzd) + zzd;
            int zzy2 = zzdj.zzy(16);
            int zzy3 = zzdj.zzy(i13);
            int zzy4 = zzdj.zzy(8);
            i11 += zzy4 + zzy4 + zzy2 + zzy3 + zzdj.zzy(24) + zzy;
        }
        this.zze = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgz zzd(zzgz zzgzVar) {
        if (zzgzVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzgzVar.zzb;
        zzm(i10);
        System.arraycopy(zzgzVar.zzc, 0, this.zzc, this.zzb, zzgzVar.zzb);
        System.arraycopy(zzgzVar.zzd, 0, this.zzd, this.zzb, zzgzVar.zzb);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzfq.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(zzhq zzhqVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzhqVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzhq zzhqVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzhqVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzhqVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzhqVar.zzd(i13, (zzdb) obj);
                } else if (i12 == 3) {
                    zzhqVar.zzF(i13);
                    ((zzgz) obj).zzl(zzhqVar);
                    zzhqVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzeo.zza());
                    }
                    zzhqVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
