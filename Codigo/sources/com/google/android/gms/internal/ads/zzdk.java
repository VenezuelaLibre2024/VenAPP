package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzdk {
    private final zzgaa zzd;
    public static final zzdk zza = new zzdk(zzgaa.zzl());
    private static final String zzc = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = zzdh.zza;

    public zzdk(List list) {
        this.zzd = zzgaa.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdk.class != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzdk) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzgaa zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            zzdj zzdjVar = (zzdj) this.zzd.get(i11);
            if (zzdjVar.zzc() && zzdjVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
