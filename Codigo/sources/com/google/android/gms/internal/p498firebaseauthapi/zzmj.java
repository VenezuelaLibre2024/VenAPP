package com.google.android.gms.internal.p498firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes2.dex */
final class zzmj {
    static final zzmj zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmj(bigInteger, bigInteger, BigInteger.ZERO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmj(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
