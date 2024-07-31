package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgxp implements zzgfs {
    private final zzgmm zza;
    private final byte[] zzb;

    private zzgxp(byte[] bArr, byte[] bArr2) {
        this.zza = new zzgmm(bArr);
        this.zzb = bArr2;
    }

    public static zzgfs zzb(zzgls zzglsVar) {
        return new zzgxp(zzglsVar.zzd().zzd(zzggb.zza()), zzglsVar.zzc().zzc());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzgpm.zzb(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        return zzc(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}