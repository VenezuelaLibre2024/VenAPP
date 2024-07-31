package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzlp extends zzne<zzuq, zzuu> {
    private final /* synthetic */ zzln zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlp(zzln zzlnVar, Class cls) {
        super(cls);
        this.zza = zzlnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zzuq zza(zzahp zzahpVar) {
        return zzuq.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ zzuu zza(zzuq zzuqVar) {
        byte[] zza;
        byte[] zza2;
        zzuq zzuqVar2 = zzuqVar;
        zzuo zzc = zzuqVar2.zzc().zzc();
        int i10 = zzlo.zza[zzc.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            zzwo zzc2 = zzlt.zzc(zzuqVar2.zzc().zzc());
            ECParameterSpec zza3 = zzwp.zza(zzc2);
            KeyPairGenerator zza4 = zzwt.zzd.zza("EC");
            zza4.initialize(zza3);
            KeyPair generateKeyPair = zza4.generateKeyPair();
            zzwr zzwrVar = zzwr.UNCOMPRESSED;
            ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
            EllipticCurve curve = zzwp.zza(zzc2).getCurve();
            zzmg.zza(w10, curve);
            int zza5 = zzwp.zza(curve);
            int ordinal = zzwrVar.ordinal();
            if (ordinal == 0) {
                int i11 = (zza5 * 2) + 1;
                byte[] bArr = new byte[i11];
                byte[] zza6 = zzme.zza(w10.getAffineX());
                byte[] zza7 = zzme.zza(w10.getAffineY());
                System.arraycopy(zza7, 0, bArr, i11 - zza7.length, zza7.length);
                System.arraycopy(zza6, 0, bArr, (zza5 + 1) - zza6.length, zza6.length);
                bArr[0] = 4;
                zza2 = bArr;
            } else if (ordinal == 1) {
                int i12 = zza5 + 1;
                zza2 = new byte[i12];
                byte[] zza8 = zzme.zza(w10.getAffineX());
                System.arraycopy(zza8, 0, zza2, i12 - zza8.length, zza8.length);
                zza2[0] = (byte) (w10.getAffineY().testBit(0) ? 3 : 2);
            } else {
                if (ordinal != 2) {
                    throw new GeneralSecurityException("invalid format:" + String.valueOf(zzwrVar));
                }
                int i13 = zza5 * 2;
                zza2 = new byte[i13];
                byte[] zza9 = zzme.zza(w10.getAffineX());
                if (zza9.length > zza5) {
                    zza9 = Arrays.copyOfRange(zza9, zza9.length - zza5, zza9.length);
                }
                byte[] zza10 = zzme.zza(w10.getAffineY());
                if (zza10.length > zza5) {
                    zza10 = Arrays.copyOfRange(zza10, zza10.length - zza5, zza10.length);
                }
                System.arraycopy(zza10, 0, zza2, i13 - zza10.length, zza10.length);
                System.arraycopy(zza9, 0, zza2, zza5 - zza9.length, zza9.length);
            }
            zza = zzme.zza(((ECPrivateKey) generateKeyPair.getPrivate()).getS(), zzlt.zza(zzc));
        } else {
            zza = zzou.zza(32);
            zza[0] = (byte) (zza[0] | 7);
            byte b10 = (byte) (zza[31] & 63);
            zza[31] = b10;
            zza[31] = (byte) (b10 | 128);
            zza2 = zzxr.zza(zza);
        }
        return (zzuu) ((zzajc) zzuu.zzb().zza(0).zza((zzuv) ((zzajc) zzuv.zzc().zza(0).zza(zzuqVar2.zzc()).zza(zzahp.zza(zza2)).zzf())).zza(zzahp.zza(zza)).zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zzuq zzuqVar) {
        zzlt.zza(zzuqVar.zzc());
    }
}
