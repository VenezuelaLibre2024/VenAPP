package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzwx {
    public final long zza;
    public final long zzb;

    public zzwx(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwx)) {
            return false;
        }
        zzwx zzwxVar = (zzwx) obj;
        return this.zza == zzwxVar.zza && this.zzb == zzwxVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
