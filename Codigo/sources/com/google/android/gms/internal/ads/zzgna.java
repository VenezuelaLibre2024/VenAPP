package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgna {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgna(Map map, Map map2, zzgmz zzgmzVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgmy zza() {
        return new zzgmy(null);
    }

    public final Enum zzb(Object obj) {
        Enum r02 = (Enum) this.zzb.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) {
        Object obj = this.zza.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}