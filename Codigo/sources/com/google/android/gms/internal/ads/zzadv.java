package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzadv {
    public static final zzadv zza = new zzadv(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadv(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadv.class == obj.getClass()) {
            zzadv zzadvVar = (zzadv) obj;
            if (this.zzb == zzadvVar.zzb && this.zzc == zzadvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
