package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzazy {
    final long zza;
    final String zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazy(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzazy)) {
            zzazy zzazyVar = (zzazy) obj;
            if (zzazyVar.zza == this.zza && zzazyVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
