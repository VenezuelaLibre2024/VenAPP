package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.q;

/* loaded from: classes2.dex */
public final class zzbzr extends zzbzt {
    private final String zza;
    private final int zzb;

    public zzbzr(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbzr)) {
            zzbzr zzbzrVar = (zzbzr) obj;
            if (q.b(this.zza, zzbzrVar.zza)) {
                if (q.b(Integer.valueOf(this.zzb), Integer.valueOf(zzbzrVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final String zzc() {
        return this.zza;
    }
}
