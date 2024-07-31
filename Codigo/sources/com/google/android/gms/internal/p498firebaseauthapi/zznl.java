package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zznl {
    private static final zznl zza = new zznl();
    private final Map<Class<? extends zzch>, zzno<? extends zzch>> zzb = new HashMap();

    public static zznl zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzch> void zza(zzno<ParametersT> zznoVar, Class<ParametersT> cls) {
        zzno<? extends zzch> zznoVar2 = this.zzb.get(cls);
        if (zznoVar2 != null && !zznoVar2.equals(zznoVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zznoVar);
    }
}
