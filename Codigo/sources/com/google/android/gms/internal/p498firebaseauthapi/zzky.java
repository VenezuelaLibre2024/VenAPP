package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
final class zzky implements zzld {
    private final int zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzky(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzld
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzht(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzld
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzld
    public final byte[] zzc() {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzlt.zzi;
        }
        if (i10 == 32) {
            return zzlt.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
