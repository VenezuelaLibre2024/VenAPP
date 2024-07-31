package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzif;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzrf implements zzpz {
    private static final zzif.zza zza = zzif.zza.zzb;
    private final zzqc zzb;

    public zzrf(zzqc zzqcVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzqcVar;
    }
}
