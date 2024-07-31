package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzcs {
    private static final zzcs zza = new zzcs();

    private zzcs() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcs zza() {
        return zza;
    }

    public static zzcs zza(zzcs zzcsVar) {
        if (zzcsVar != null) {
            return zzcsVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
