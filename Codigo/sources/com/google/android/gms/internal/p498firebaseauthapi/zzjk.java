package com.google.android.gms.internal.p498firebaseauthapi;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* loaded from: classes2.dex */
final class zzjk extends zzne<zztn, zztr> {
    private final /* synthetic */ zzji zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjk(zzji zzjiVar, Class cls) {
        super(cls);
        this.zza = zzjiVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zztn zza(zzahp zzahpVar) {
        return zztn.zza(zzahpVar, zzaio.zza());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ zztr zza(zztn zztnVar) {
        zztn zztnVar2 = zztnVar;
        ECParameterSpec zza = zzwp.zza(zzkx.zza(zztnVar2.zzc().zzf().zzd()));
        KeyPairGenerator zza2 = zzwt.zzd.zza("EC");
        zza2.initialize(zza);
        KeyPair generateKeyPair = zza2.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        return (zztr) ((zzajc) zztr.zzb().zza(0).zza((zztu) ((zzajc) zztu.zzc().zza(0).zza(zztnVar2.zzc()).zza(zzahp.zza(w10.getAffineX().toByteArray())).zzb(zzahp.zza(w10.getAffineY().toByteArray())).zzf())).zza(zzahp.zza(eCPrivateKey.getS().toByteArray())).zzf());
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzne
    public final /* synthetic */ void zzb(zztn zztnVar) {
        zzkx.zza(zztnVar.zzc());
    }
}
