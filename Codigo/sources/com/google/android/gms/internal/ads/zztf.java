package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class zztf {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztf(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztf.class) {
            zztf zztfVar = (zztf) obj;
            if (TextUtils.equals(this.zza, zztfVar.zza) && this.zzb == zztfVar.zzb && this.zzc == zztfVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
