package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgnu {
    private static final zzgnu zza = new zzgnu();
    private final Map zzb = new HashMap();

    public static zzgnu zzb() {
        return zza;
    }

    private final synchronized zzggc zzd(zzggq zzggqVar, Integer num) {
        zzgnt zzgntVar;
        zzgntVar = (zzgnt) this.zzb.get(zzggqVar.getClass());
        if (zzgntVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(zzggqVar) + ": no key creator for this class was registered.");
        }
        return zzgntVar.zza(zzggqVar, null);
    }

    public final zzggc zza(zzggq zzggqVar, Integer num) {
        return zzd(zzggqVar, null);
    }

    public final synchronized void zzc(zzgnt zzgntVar, Class cls) {
        zzgnt zzgntVar2 = (zzgnt) this.zzb.get(cls);
        if (zzgntVar2 != null && !zzgntVar2.equals(zzgntVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
        }
        this.zzb.put(cls, zzgntVar);
    }
}
