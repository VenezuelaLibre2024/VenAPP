package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzaps {
    private final String zza;
    private final String zzb;

    public zzaps(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaps.class == obj.getClass()) {
            zzaps zzapsVar = (zzaps) obj;
            if (TextUtils.equals(this.zza, zzapsVar.zza) && TextUtils.equals(this.zzb, zzapsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + "]";
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
