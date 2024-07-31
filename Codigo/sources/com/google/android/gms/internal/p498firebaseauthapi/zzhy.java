package com.google.android.gms.internal.p498firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class zzhy {
    int[] zza;
    private final int zzb;

    public zzhy(byte[] bArr, int i10) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhu.zza(bArr);
        this.zzb = i10;
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int remaining = byteBuffer2.remaining();
        int i10 = (remaining / 64) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer zza = zza(bArr, this.zzb + i11);
            if (i11 == i10 - 1) {
                zzwg.zza(byteBuffer, byteBuffer2, zza, remaining % 64);
            } else {
                zzwg.zza(byteBuffer, byteBuffer2, zza, 64);
            }
        }
    }

    abstract int zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zza(byte[] bArr, int i10) {
        int[] zza = zza(zzhu.zza(bArr), i10);
        int[] iArr = (int[]) zza.clone();
        zzhu.zza(iArr);
        for (int i11 = 0; i11 < zza.length; i11++) {
            zza[i11] = zza[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    abstract int[] zza(int[] iArr, int i10);
}
