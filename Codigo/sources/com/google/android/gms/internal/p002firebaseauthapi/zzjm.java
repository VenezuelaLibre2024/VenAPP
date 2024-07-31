package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes2.dex */
final class zzjm extends zzoh<zzbr, zztu> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoh
    public final /* synthetic */ zzbr zza(zztu zztuVar) {
        zztu zztuVar2 = zztuVar;
        zztq zzb = zztuVar2.zzb();
        zztv zzf = zzb.zzf();
        zzwo zza = zzkx.zza(zzf.zzd());
        byte[] zzg = zztuVar2.zzf().zzg();
        byte[] zzg2 = zztuVar2.zzg().zzg();
        ECParameterSpec zza2 = zzwp.zza(zza);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzg), new BigInteger(1, zzg2));
        zzmg.zza(eCPoint, zza2.getCurve());
        return new zzwk((ECPublicKey) zzwt.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza2)), zzf.zzf().zzg(), zzkx.zza(zzf.zze()), zzkx.zza(zzb.zza()), new zzkz(zzb.zzb().zzd()));
    }
}
