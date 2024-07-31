package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzrl implements zzce {
    private static final byte[] zza = {0};
    private final zzce zzb;
    private final zzvs zzc;
    private final byte[] zzd;

    private zzrl(zzce zzceVar, zzvs zzvsVar, byte[] bArr) {
        this.zzb = zzceVar;
        this.zzc = zzvsVar;
        this.zzd = bArr;
    }

    public static zzce zza(zznd zzndVar) {
        byte[] bArr;
        ByteBuffer put;
        zzos zza2 = zzndVar.zza(zzbq.zza());
        zzce zzceVar = (zzce) zzow.zza().zza((zzuy) ((zzajc) zzuy.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zzf()), zzce.class);
        zzvs zzc = zza2.zzc();
        int i10 = zzrk.zza[zzc.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                put = ByteBuffer.allocate(5).put((byte) 0);
            } else {
                if (i10 != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                put = ByteBuffer.allocate(5).put((byte) 1);
            }
            bArr = put.putInt(zzndVar.zza().intValue()).array();
        } else {
            bArr = new byte[0];
        }
        return new zzrl(zzceVar, zzc, bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzvs.LEGACY)) {
            bArr2 = zzwg.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzvs.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzvs.LEGACY)) {
            bArr = zzwg.zza(bArr, zza);
        }
        return zzwg.zza(this.zzd, this.zzb.zza(bArr));
    }
}
