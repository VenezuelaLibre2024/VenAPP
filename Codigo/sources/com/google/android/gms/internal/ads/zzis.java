package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzis {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzis(String str, zzam zzamVar, zzam zzamVar2, int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z10 = false;
            }
        }
        zzek.zzd(z10);
        zzek.zzc(str);
        this.zza = str;
        this.zzb = zzamVar;
        zzamVar2.getClass();
        this.zzc = zzamVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzis.class == obj.getClass()) {
            zzis zzisVar = (zzis) obj;
            if (this.zzd == zzisVar.zzd && this.zze == zzisVar.zze && this.zza.equals(zzisVar.zza) && this.zzb.equals(zzisVar.zzb) && this.zzc.equals(zzisVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
