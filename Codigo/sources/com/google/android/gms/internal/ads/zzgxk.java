package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgxk implements zzgse {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgxk(byte[] bArr) {
        zzgxo.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzgrl.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgrl.zza(zza);
    }

    private static Cipher zzb() {
        if (zzgmv.zza(1)) {
            return (Cipher) zzgwz.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final byte[] zza(byte[] bArr, int i10) {
        byte[] zzc;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher zzb = zzb();
        zzb.init(1, secretKey);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i11 = max - 1;
        int i12 = i11 * 16;
        if (max * 16 == length) {
            zzc = zzgwp.zzd(bArr, i12, this.zzb, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            zzc = zzgwp.zzc(copyOf, this.zzc);
        }
        byte[] bArr2 = new byte[16];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2 = zzb.doFinal(zzgwp.zzd(bArr2, 0, bArr, i13 * 16, 16));
        }
        return Arrays.copyOf(zzb.doFinal(zzgwp.zzc(zzc, bArr2)), i10);
    }
}
