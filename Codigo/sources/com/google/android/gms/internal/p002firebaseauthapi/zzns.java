package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzns {
    private static final zzns zza = new zzns();
    private final Map<String, zzch> zzb = new HashMap();

    zzns() {
    }

    public static zzns zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzch zzchVar) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzchVar);
            return;
        }
        if (this.zzb.get(str).equals(zzchVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzchVar));
    }

    public final synchronized void zza(Map<String, zzch> map) {
        for (Map.Entry<String, zzch> entry : map.entrySet()) {
            zza(entry.getKey(), entry.getValue());
        }
    }
}
