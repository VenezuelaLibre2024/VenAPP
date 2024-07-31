package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfq {
    public static final zzfq zza = new zzfq(-1, -1);
    public static final zzfq zzb = new zzfq(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfq(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzek.zzd(z10);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfq) {
            zzfq zzfqVar = (zzfq) obj;
            if (this.zzc == zzfqVar.zzc && this.zzd == zzfqVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzc;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
