package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpg {
    public static final zzpg zza = new zzpe().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpg(zzpe zzpeVar, zzpf zzpfVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        z10 = zzpeVar.zza;
        this.zzb = z10;
        z11 = zzpeVar.zzb;
        this.zzc = z11;
        z12 = zzpeVar.zzc;
        this.zzd = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpg.class == obj.getClass()) {
            zzpg zzpgVar = (zzpg) obj;
            if (this.zzb == zzpgVar.zzb && this.zzc == zzpgVar.zzc && this.zzd == zzpgVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return ((z10 ? 1 : 0) << 2) + (z11 ? 1 : 0) + (z11 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
