package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzif;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzrc implements zzpz {
    private static final zzif.zza zza = zzif.zza.zza;
    private final zzph zzb;

    public zzrc(zzph zzphVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zzb = zzphVar;
    }
}
