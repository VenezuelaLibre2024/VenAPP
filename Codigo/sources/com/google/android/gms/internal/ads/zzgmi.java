package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class zzgmi {
    int[] zza;
    private final int zzb;

    public zzgmi(byte[] bArr, int i10) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgme.zzd(bArr);
        this.zzb = i10;
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb = zzb(zzgme.zzd(bArr), i10);
        int[] iArr = (int[]) zzb.clone();
        zzgme.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb[i11] = zzb[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int remaining = byteBuffer.remaining();
        int i10 = remaining / 64;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i11 >= i12) {
                return allocate.array();
            }
            ByteBuffer zzc = zzc(bArr, this.zzb + i11);
            if (i11 == i12 - 1) {
                zzgwp.zza(allocate, byteBuffer, zzc, remaining % 64);
            } else {
                zzgwp.zza(allocate, byteBuffer, zzc, 64);
            }
            i11++;
        }
    }
}
