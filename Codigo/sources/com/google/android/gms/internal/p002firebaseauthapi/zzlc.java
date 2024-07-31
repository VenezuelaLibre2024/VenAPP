package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzlc {
    private static final byte[] zza = new byte[0];
    private final zzld zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzlc(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzld zzldVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzldVar;
    }

    public static zzlc zza(byte[] bArr, zzll zzllVar, zzlj zzljVar, zzlg zzlgVar, zzld zzldVar, byte[] bArr2) {
        byte[] zza2 = zzljVar.zza(bArr, zzllVar);
        byte[] bArr3 = zzlt.zza;
        byte[] zza3 = zzlt.zza(zzljVar.zza(), zzlgVar.zzb(), zzldVar.zzc());
        byte[] bArr4 = zzlt.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzwg.zza(bArr3, zzlgVar.zza(bArr4, bArr5, "psk_id_hash", zza3), zzlgVar.zza(bArr4, bArr2, "info_hash", zza3));
        byte[] zza5 = zzlgVar.zza(zza2, bArr5, Constants.SECRET, zza3);
        byte[] zza6 = zzlgVar.zza(zza5, zza4, io.flutter.plugins.firebase.crashlytics.Constants.KEY, zza3, zzldVar.zza());
        byte[] zza7 = zzlgVar.zza(zza5, zza4, "base_nonce", zza3, zzldVar.zzb());
        zzldVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzlc(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzldVar);
    }

    private final synchronized byte[] zza() {
        byte[] zza2;
        zza2 = zzwg.zza(this.zze, zzme.zza(this.zzg, this.zzb.zzb()));
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return zza2;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return this.zzb.zza(this.zzd, zza(), bArr, bArr2);
    }
}
