package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzggf {
    public static final zzggq zza(zzggq zzggqVar) {
        return zzggqVar != null ? zzggqVar : zzghe.zza(zzb(null).zzax());
    }

    static final zzguy zzb(zzggq zzggqVar) {
        try {
            return ((zzgoy) zzgoe.zzd().zzf(null, zzgoy.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzgpl("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }
}
