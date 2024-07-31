package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzamd {
    private static final zzamd zza = new zzamd(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamd() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamd(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzamd zza(zzamd zzamdVar, zzamd zzamdVar2) {
        int i10 = zzamdVar.zzb + zzamdVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzamdVar.zzc, i10);
        System.arraycopy(zzamdVar2.zzc, 0, copyOf, zzamdVar.zzb, zzamdVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamdVar.zzd, i10);
        System.arraycopy(zzamdVar2.zzd, 0, copyOf2, zzamdVar.zzb, zzamdVar2.zzb);
        return new zzamd(i10, copyOf, copyOf2, true);
    }

    private final void zza(int i10) {
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

    private static void zza(int i10, Object obj, zzana zzanaVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanaVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzanaVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzanaVar.zza(i11, (zzahp) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzaji.zza());
            }
            zzanaVar.zzb(i11, ((Integer) obj).intValue());
        } else if (zzanaVar.zza() == zzand.zza) {
            zzanaVar.zzb(i11);
            ((zzamd) obj).zzb(zzanaVar);
            zzanaVar.zza(i11);
        } else {
            zzanaVar.zza(i11);
            ((zzamd) obj).zzb(zzanaVar);
            zzanaVar.zzb(i11);
        }
    }

    public static zzamd zzc() {
        return zza;
    }

    public static zzamd zzd() {
        return new zzamd();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamd)) {
            return false;
        }
        zzamd zzamdVar = (zzamd) obj;
        int i10 = this.zzb;
        if (i10 == zzamdVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamdVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                }
                if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzamdVar.zzd;
                int i12 = this.zzb;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    }
                    if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    }
                    i13++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                zze = zzaik.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zze = zzaik.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zze = zzaik.zza(i14, (zzahp) this.zzd[i12]);
            } else if (i15 == 3) {
                zze = (zzaik.zzi(i14) << 1) + ((zzamd) this.zzd[i12]).zza();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzaji.zza());
                }
                zze = zzaik.zzc(i14, ((Integer) this.zzd[i12]).intValue());
            }
            i11 += zze;
        }
        this.zze = i11;
        return i11;
    }

    public final zzamd zza(zzamd zzamdVar) {
        if (zzamdVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzamdVar.zzb;
        zza(i10);
        System.arraycopy(zzamdVar.zzc, 0, this.zzc, this.zzb, zzamdVar.zzb);
        System.arraycopy(zzamdVar.zzd, 0, this.zzd, this.zzb, zzamdVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zza(zzana zzanaVar) {
        if (zzanaVar.zza() == zzand.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanaVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanaVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzako.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzaik.zzb(this.zzc[i12] >>> 3, (zzahp) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zzb(zzana zzanaVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanaVar.zza() == zzand.zza) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzanaVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzanaVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
