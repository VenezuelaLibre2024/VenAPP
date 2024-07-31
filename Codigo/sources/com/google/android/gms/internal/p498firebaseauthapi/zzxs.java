package com.google.android.gms.internal.p498firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class zzxs {
    private final BigInteger zza;

    private zzxs(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzxs zza(BigInteger bigInteger, zzcs zzcsVar) {
        if (zzcsVar != null) {
            return new zzxs(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcs zzcsVar) {
        if (zzcsVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
