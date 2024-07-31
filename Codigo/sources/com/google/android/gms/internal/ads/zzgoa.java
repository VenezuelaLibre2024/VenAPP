package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgoa {
    private static final zzgoa zza = new zzgoa();
    private final Map zzb = new HashMap();

    zzgoa() {
    }

    public static zzgoa zzb() {
        return zza;
    }

    public final synchronized zzggq zza(String str) {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzggq) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzggq zzggqVar) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzggqVar);
            return;
        }
        if (((zzggq) this.zzb.get(str)).equals(zzggqVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzggqVar));
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzggq) entry.getValue());
        }
    }
}
